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


		System.out.println("Waiting for the client request");
		// creating socket and waiting for client connection
		
		// keep listens indefinitely until receives 'exit' call or program terminates
		while (true) {
			System.out.println("2 socket " + socket);
			System.out.println("2 list " + list);
			
			socket = server.accept(); // 대기 중...
			
			System.out.println("3 socket " + socket);
			System.out.println("3 list " + list);
			
			list.add(socket);

			// TODO list에 있는 모든 socket한테 메시지를 전달!!!!!

			System.out.println("4 socket " + socket);
			System.out.println("4 list " + list);
			
			for(int i = 0; i < list.size(); i++){
				System.out.println("5 socket " + socket);
				System.out.println("5 list " + list);
				System.out.println(list.get(i));	
				System.out.println("6 socket " + socket);
				System.out.println("6 list " + list);
				// read from socket to ObjectInputStream object
//				ois = new ObjectInputStream(socket.getInputStream());
				ois = new ObjectInputStream(list.get(i).getInputStream());
				System.out.println("7 socket " + socket);
				System.out.println("7 list " + list);
				// convert ObjectInputStream object t o String
				String message = (String) ois.readObject();
				System.out.println("8 socket " + socket);
				System.out.println("8 list " + list);
				System.out.println("Message Received: " + message);
				System.out.println("9 socket " + socket);
				System.out.println("9 list " + list);
				// create ObjectOutputStream object
//				oos = new ObjectOutputStream(socket.getOutputStream());
				oos = new ObjectOutputStream(list.get(i).getOutputStream());
				// write object to Socket
				System.out.println("10 socket " + socket);
				System.out.println("10 list " + list);
				oos.writeObject("Hi Client " + message); // 클라이언트로 보내는 메시지
				// close resources
				
				System.out.println("11 socket " + socket);
				System.out.println("11 list " + list);

				// terminate the server if client sends exit request
				if (message.equalsIgnoreCase("exit")) {
					System.out.println("12 socket " + socket);
					System.out.println("12 list " + list);
					ois.close();
					oos.close();
					socket.close();
					System.out.println("13 socket " + socket);
					System.out.println("13 list " + list);
					System.out.println("Shutting down Socket server!!");
					// close the ServerSocket object
					server.close();
					System.out.println("14 socket " + socket);
					System.out.println("14 list " + list);
				}
			}
		}
	}
}
