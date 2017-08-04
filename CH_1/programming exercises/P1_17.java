import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class P1_17 {

	public static void main(String[] args) throws Exception 
	{
		URL imageLocation = new URL("https://s3.amazonaws.com/classconnection/211/flashcards/7171211/jpg/pharaoh_pic-14A9A2E8B62127CCF2E.jpg");
		JOptionPane.showMessageDialog(null, "Hello", "Title",
		JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}
