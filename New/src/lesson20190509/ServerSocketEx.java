package lesson20190509;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerSocketEx {

	// static ServerSocket variable
	private static ServerSocket server;
	// socket server port on which it will listen
	private static int port = 8080;

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		// create the socket server object
		server = new ServerSocket(port);
		

		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		ArrayList<Socket> list = new ArrayList<>();
		
		// keep listens indefinitely until receives 'exit' call or program terminates
		while (true) {
			System.out.println("Waiting for the client request");
			// creating socket and waiting for client connection
			socket = server.accept(); // 대기 중...
			list.add(socket);

			// TODO list에 있는 모든 socket한테 메시지를 전달!!!!!
			
			System.out.println(list);
			
			
			// read from socket to ObjectInputStream object
			ois = new ObjectInputStream(socket.getInputStream());
			// convert ObjectInputStream object to String
			String message = (String) ois.readObject();
			System.out.println("Message Received: " + message);
			// create ObjectOutputStream object
			oos = new ObjectOutputStream(socket.getOutputStream());
			// write object to Socket
			oos.writeObject("Hi Client " + message);
			// close resources
			
			// terminate the server if client sends exit request
			if (message.equalsIgnoreCase("exit"))
				break;
		}
		ois.close();
		oos.close();
		socket.close();
		System.out.println("Shutting down Socket server!!");
		// close the ServerSocket object
		server.close();
	}
}
