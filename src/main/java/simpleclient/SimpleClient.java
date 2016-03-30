package simpleclient;

import java.net.*;
import java.io.*;

public class SimpleClient {
	public static void main(String args[]) {
		try {
			Socket s = new Socket("localhost", 2016);
			OutputStream os = s.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			SimplePair sp = new SimplePair("Hello", 42);
			
			oos.writeObject(sp);

			oos.close();
			os.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}