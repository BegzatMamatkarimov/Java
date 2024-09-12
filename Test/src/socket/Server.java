package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for client...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");

                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

                MessageData receivedMessage = (MessageData) inputStream.readObject();
                System.out.println("Received message: " + receivedMessage);
                socket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
//                    socket.close();
//
    }
    }
}
