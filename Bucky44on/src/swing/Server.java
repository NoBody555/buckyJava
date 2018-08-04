package swing;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame {

	//chatApplication
	private JTextField userInput;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	//hi asl, is using outputStream
	//my asl, ur asl? using inputStream
	private ObjectInputStream input;
	private ServerSocket server;
	//setup connection between two computers to interact
	private Socket connection;
	
	
	public Server() {
		
		//
		super("Instant Messanger YO!");
		userInput = new JTextField();
		userInput.setEditable(false);
		userInput.addActionListener(
				
				new ActionListener() {
					
					public void actionPerformed(ActionEvent event) {
						
						sendMessage(event.getActionCommand());
						// clearing the input after sending the text into the room 
						userInput.setText("");
					}
				}
				
				);
		        add(userInput,BorderLayout.NORTH);
		        chatWindow = new JTextArea();
		        //adding scroll to chatWindow
		        add (new JScrollPane(chatWindow));
		        setSize(300,150);
		        setVisible(true);
		
	}
	//set up and run the server
	   public void startRunning() {
		   try {
			   server = new ServerSocket(6789,100);
			   while(true) {
				   try {
				    waitForConnection();
				    //now set up stream,in andout
				    setupStreams();
				    //able to send msg back and forth
				      whileChatting();
			   }catch(EOFException eofException) {
				   showMessage("\n connection terminated");
			   }finally{
				   closeCrap();
			     }
			  }	   
		   }catch(IOException ioException) {
			   ioException.printStackTrace();
		   }
	   }//tut 41
	   private void waitForConnection()throws IOException {
		   
		   showMessage(" Waiting for someone to Connect");
		   //while(noconnection) keep trying store into a socket i.e connection
		   //variable IF connected else don't
		   connection = server.accept();
		   // once connected get ip address
		    showMessage("Now connected to "+connection.getInetAddress().getHostName());   
	   
	   }
	   //tut 42 get stream to send and receiveData
	   private void setupStreams()throws IOException {
		   output =  new ObjectOutputStream(connection.getOutputStream());
		         output.flush();
		         input = new ObjectInputStream(connection.getInputStream());
		         showMessage("\n Now Streams are all set\n");
	   }
	   
	
	   
	   
	   //tut 43 during the chat convo
	   private void whileChatting() throws IOException {
		   String message= " you are now connected to interact ";
		   sendMessage(message);
		   ableToType(true);
		   do {
			   //have a conversation while USERS please to
			   try {
				  message = (String) input.readObject();
				  showMessage("\n" + message);
			   }catch(ClassNotFoundException classNotFoundException){
				   showMessage(" donno what users send is not a string");
				   
			   }
			  
		   }while(!message.equals("CLIENT - END"));
		   
		   
	   }
	   
	   
	   
	   
	   
	  //tut 44, close streams once done chatting
	   private void closeCrap() {
		   showMessage("\n closing the connection \n");
		   ableToType(false);
		   try {
			   output.close();
			   input.close();
			   connection.close();
			   
		   }catch(IOException ioException) {
			   ioException.printStackTrace();
		   }
		   
	   }
	   //TUT 45, send a message to client
	   private void sendMessage(String m) {
		   try {
			   output.writeObject("SERVER - "+m);
			   output.flush();
			   showMessage("\nSERVER - "+ m);
		   }catch(IOException ioException) {
			   
			   chatWindow.append("\n Error, unable to send message");
		   }
		   
	   }
	   //TUT 46 updates chatWindow
	   //in orderto update only the parts or part of GUI 
	   // we use SwingUtilities
	   
	    private void showMessage(final String text) {
	    	SwingUtilities.invokeLater(
	    			new Runnable() {
	    		   public void run() {
	    			   chatWindow.append(text);
	    	       }
	    	}
	      );
	    	
	    }
	   
	   
	
		
	//tut 47 users shouldnt allow to type when they're not connected
	    private void ableToType(final boolean tof) {
	    	
	    	SwingUtilities.invokeLater(
	    			new Runnable() {
	    		   public void run() {
	    			  userInput.setEditable(tof);
	    	       }
	    	}
	      );
	    	
	    }
}
