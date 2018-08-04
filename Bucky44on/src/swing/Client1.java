package swing;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;

public class Client1 extends JFrame{
	private JTextField userInput;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;

	//tut 50, contstructor 
         public Client1(String host) {
        	 super("Client Messenger ");
        	 serverIP = host;
        	 userInput = new JTextField();
        	 userInput.setEditable(false);
        	 userInput.addActionListener(
        	      new ActionListener() {
        	    	  public void actionPerformed(ActionEvent event) {
        	    		  sendMessage(event.getActionCommand());
        	    		  userInput.setText("");
        	    	  }
        	      }
        	 );
        	 add(userInput,BorderLayout.NORTH);
        	 chatWindow = new JTextArea();
        	 add(new JScrollPane(chatWindow),BorderLayout.CENTER);
        	 setSize(300,150);
        	 setVisible(true);
         }
         //tut 51, connect to server
         public void startRunning() {
        	 try {
        		  connectToServer();
        		  setupStreams();
        		  whileChatting();
        		 
        	 }catch(EOFException eofException) {
        		 showMessage("\n Client terminated connection");
        	 }catch(IOException ioException) {
        		 ioException.printStackTrace();
        	 }finally {
        		 closeCrap();
        	 }
         }
         private void connectToServer() throws IOException {
        	 showMessage("Attempting to Connect");
        	 connection = new Socket(InetAddress.getByName(serverIP),6789);
        	   showMessage("connected now"+connection.getInetAddress().getHostName());
         }//set up streams to send and receive messages
         private void setupStreams() throws IOException {
        	 output = new ObjectOutputStream(connection.getOutputStream());
        	 output.flush();
        	 input = new ObjectInputStream(connection.getInputStream());
        	 showMessage("Streams are now good to go!");
        	 
         }
         //while chatting with server
         private void whileChatting() throws IOException{
        	 ableToType(true);
        	 do {
        		 try {
        			 message = (String) input.readObject();
        			 showMessage("\n"+ message);
        			 
        		 }catch(ClassNotFoundException classNotfoundException) {
        			 showMessage("\n I don't know that object Type");
        		 }
        		 
        		 
        	 }while(!message.equals("SERVER - END"));
         }
         //close the stream and sockets
         public void closeCrap() {
        	 showMessage("\nclosing the crap down");
        	 ableToType(false);
        	 try {
        		 output.close();
        		 input.close();
        		 connection.close();
        		 
        	 }catch(IOException ioException) {
        		 ioException.printStackTrace();
        	 }
         }//sending messages to server
         public void sendMessage(String message) {
        	 try {
        		 //hey,you there? iam here
        		 output.writeObject("CLIENT - "+message);
        		 output.flush();
        		 //display the message on the GUI
        		 showMessage("\nCLIENT - "+ message);
        	 }catch(IOException ioException) {
        		  chatWindow.append("\n something messed up sending a message");
        	 }
         }
         //change or update chat window
         public void showMessage(final String m ) {
        	 SwingUtilities.invokeLater(
        			 new Runnable(){
        				 
        				 public void run() {
        					 chatWindow.append(m);
        				 }
        			 }
         
        			 );
         }
         
         
         //give user permission to type inthe text box
         private void ableToType(final boolean tof) {
        	 SwingUtilities.invokeLater(
        			 new Runnable(){
        				 
        				 public void run() {
        					 userInput.setEditable(tof);
        				 }
                     }
        	);
      }
  }
