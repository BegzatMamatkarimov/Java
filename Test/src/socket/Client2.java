package socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Socket socket = new Socket("localhost", 12348);
            System.out.println("Connected to server.");

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while (true) {
                System.out.println("PRESS 1 TO LIST BOOKS");
                System.out.println("PRESS 2 TO ADD BOOKS");
                System.out.println("PRESS 0 TO DISCONNECT FROM SERVER");
                System.out.print("Your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (choice == 1) {
                    PackageData requestData = new PackageData("GET_BOOKS");
                    outputStream.writeObject(requestData);

                    PackageData responseData = (PackageData) inputStream.readObject();
                    ArrayList<Book> books = responseData.getBooks();
                    for (Book book : books) {
                        System.out.println(book);
                    }
                } else if (choice == 2) {
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(id, name, author);
                    PackageData requestData = new PackageData("ADD_BOOK");
                    requestData.setBook(newBook);
                    outputStream.writeObject(requestData);
                } else if (choice == 0) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

            socket.close();
            scanner.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

