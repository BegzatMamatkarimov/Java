package socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server2 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book 1", "Author 1"));
        books.add(new Book(2, "Book 2", "Author 2"));
        books.add(new Book(3, "Book 3", "Author 3"));

        try {
            ServerSocket serverSocket = new ServerSocket(12348);
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");

                ClientHandler clientHandler = new ClientHandler(socket, books);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


