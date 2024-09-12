package socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class ClientHandler implements Runnable {
    private Socket socket;
    private ArrayList<Book> books;

    public ClientHandler(Socket socket, ArrayList<Book> books) {
        this.socket = socket;
        this.books = books;
    }

    @Override
    public void run() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while (true) {
                PackageData requestData = (PackageData) inputStream.readObject();

                if (requestData.getOperationType().equals("GET_BOOKS")) {
                    PackageData responseData = new PackageData("BOOKS_LIST");
                    responseData.setBooks(books);
                    outputStream.writeObject(responseData);
                } else if (requestData.getOperationType().equals("ADD_BOOK")) {
                    Book newBook = requestData.getBook();
                    books.add(newBook);
                    System.out.println("New book added: " + newBook);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

