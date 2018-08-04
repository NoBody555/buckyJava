package swing;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Client extends JFrame{
	private JTextField userInput;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;
	//tut 50, contstructor 
         public Client(String host) {
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
        		 showMessage("\n Client terminated the connection");
        	 }catch(IOException ioException) {
        		 ioException.printStackTrace();
        	 }finally {
        		 closeCrap();
        	 }
         }
         //tut 52 connect to server
         private void connectToServer() throws IOException {
        	 showMessage("trying to connect...\n");
        	 connection = new Socket(InetAddress.getByName(serverIP),6789);
        	 showMessage("Connected to "+connection.getInetAddress().getHostName());
         }
         
         // tut 53 setup Streams to send and recieve messages
         private void setupStreams() throws IOException{
        	 //data going from cleint to server
        	 output = new ObjectOutputStream(connection.getOutputStream());
        	    output.flush();
        	    input = new ObjectInputStream(connection.getInputStream());
        	    showMessage("Connected, dude your streams good to go!");
         }
         
         //tut 54 chatting with server
         private void whileChatting()throws IOException {
        	 
        	    ableToType(true);
        	 do {
        		 try {
        			 message = (String) input.readObject();
        			 showMessage("\n" + message);
        		 }catch(ClassNotFoundException classNotFoundexception) {
        			 showMessage("\nunknown object Type");
        		 }
        	 }while(!message.equals("SERVER - END"));
         }
           //tut 55 close the stream and sockets
         private void closeCrap() {
        	 showMessage("\n closing crap down");
        	 ableToType(false);
        	 try {
        		 output.close();
        		 input.close();
        		 connection.close();
        	 }catch(IOException ioException) {
        		 ioException.printStackTrace();
        	 }
         }
         //56 tut, send messages to server
         private void sendMessage(String text) {
        	 try {
        		 //create string object  send a message
        		 output.writeObject("CLIENT - " + text);
        		 output.flush();
        		 showMessage("\nCLIENT - " + text);
        	 }catch(IOException ioException) {
        		 chatWindow.append("\n something went wrng in sendingtext");
        	 }
         }
         //57 tut, display the message  change upadte chattWindow
        /* public void showMessage(final String msg) {
        	 SwingUtilities.invokeLater(
        			 
        			 new Runnable() {
        				 public void run() {
        					 //add msg to end of the string
        					 chatWindow.append(msg);
        				 }
        			 }
        			 );
         }*/
         private void showMessage(final String text) {
 	    	SwingUtilities.invokeLater(
 	    			new Runnable(){
 	    		   public void run(){
 	    			   chatWindow.append(text);
 	    		//System.out.println(text);
 	    	       }
 	    	}
 	      );
 	    	
 	    }
         //57 tut, give user permission to type
         private void ableToType(final boolean tof) {
        	 
                    SwingUtilities.invokeLater(
        			 
        			 new Runnable(){
        				 public void run(){
        					 userInput.setEditable(tof);
        				
        				 }
        			 }
        			 );
         }
}
