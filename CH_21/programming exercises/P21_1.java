package CH_21;

/*
• P21.1 Modify the WebGet program to print only the HTTP header of the returned HTML
page. The HTTP header is the beginning of the response data. It consists of several
lines, such as
HTTP/1.1 200 OK
Date: Tue, 15 Jan 2013 16:10:34 GMT
Server: Apache/1.3.19 (Unix)
Cache-Control: max-age=86400
Expires: Wed, 16 Jan 2013 16:10:34 GMT
Connection: close
Content-Type: text/html
followed by a blank line
*/
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class P21_1
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
			System.out.println("Getting header from horstmann.com");
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
		String command = "HEAD " + resource + " HTTP/1.1\n" + "Host: " + host + "\n\n";
		out.print(command);
		out.flush();
		
		// Read server response
		while (in.hasNextLine())
		{
			String input = in.nextLine();
			System.out.println(input);
		}
		
		// Always close the socket at the end
		s.close();
	}
}
