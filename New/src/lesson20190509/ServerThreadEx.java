package lesson20190509;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThreadEx extends Thread{
	

	public Socket socket;

	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;

	String message = null;
	String clientMessage = null;

	public ServerThreadEx(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			ServerSocketEx.list.add(socket);
			ois = new ObjectInputStream(socket.getInputStream());
			message = (String) ois.readObject();
			System.out.println("Message Received: " + message);
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			// write object to Socket
						
			oos.writeObject("Hi Client " + message);
//			oos.writeObject(clientMessage);
			clientMessage = message;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
