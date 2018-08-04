package swing;
import javax.swing.JFrame;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client sam;
		sam = new Client("127.0.0.1");
		sam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sam.startRunning();
		/*Client3 bam;
		bam = new Client3("127.0.0.1");
		bam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bam.startRunning();*/
		

	}

}
