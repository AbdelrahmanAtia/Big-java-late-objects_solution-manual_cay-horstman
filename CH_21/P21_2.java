package CH_21;
/* 
 • P21.2 Modify the WebGet program to print only the title of the returned HTML page. An
HTML page has the structure
<html><head><title> . . . </title></head><body> . . . </body></html>
For example, if you run the program by typing at the command line
java WebGet horstmann.com /
the output should be the title of the root web page at horstmann.com, such as Cay
Horstmann’s Home Page. 
 */
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class P21_2
{
	public static void main(String[] args) throws IOException
	{
		// Get command-line arguments
		String host;
		String resource;
		
		if (args.length == 2)
		{
			host = args[0];
			resource = args[1];
		}
		else
		{
			host = "horstmann.com";
			resource = "/";
		}
		
		// Open socket
		final int HTTP_PORT = 80;
		Socket s = new Socket(host, HTTP_PORT);
		
		// Get streams
		InputStream instream = s.getInputStream();
		OutputStream outstream = s.getOutputStream();
		
		// Turn streams into scanners and writers
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);
		
		// Send command
		String command = "GET " + resource + " HTTP/1.1\n" + "Host: " + host + "\n\n";
		out.print(command);
		out.flush();
		
		// Read server response
		while (in.hasNextLine())
		{
			String input = in.nextLine();

			if(input.contains("<title>") && input.contains("</title>"))
			{
				input = input.replace("<title>" , "" );
				input = input.replace("</title>" , "");
				input = input.trim();
				System.out.println(input);
				return;
			}
		}
		
		// Always close the socket at the end
		s.close();
	}
}