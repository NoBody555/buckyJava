package swing;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Browser extends JFrame {
   private JTextField addressbar;
   private JEditorPane display;
   //34 intermediate
     public Browser() {
    	 //name of the browser
    	 super("bu Browser");
    	 addressbar = new JTextField("enter your url");
    	 addressbar.addActionListener(
    			 
    			new ActionListener() {
    				
    				public void actionPerformed(ActionEvent event) {
    					//getAction comment get the String url from addressbar
    					loadCrap(event.getActionCommand());
    					
    				}
    			}
    			 
    			 );
    	 add(addressbar, BorderLayout.NORTH);
    	 
    	 display = new JEditorPane();
    	 //only can view cannot edit the website for example cannot edite title or logo etc
    	    display.setEditable(false);
    	    display.addHyperlinkListener(
    			 
    			 new HyperlinkListener() {
    				 
    				 public void hyperlinkUpdate(HyperlinkEvent event) {
    					 //if user click on the link
    					 if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED) {
    						 //getUrl is an object converting into a string sinc loadCrap isString
    						 loadCrap(event.getURL().toString());
    					 }
    					 
    				 }
    			 }
    			 );
    	          add(new JScrollPane(display),BorderLayout.CENTER);
    	          setSize(500,300);
    	          setVisible(true);
    	 
    	 
     }
             //loadcrap to display on the screen
		     private void loadCrap(String userInput) {
		    	    try {
		    	    	display.setPage(userInput);
		    	    	addressbar.setText(userInput);
		    	    }catch(Exception e) {
		    	    	System.out.println("notFound not a valid url");
		    	    	
		    	    }
		     }
}
