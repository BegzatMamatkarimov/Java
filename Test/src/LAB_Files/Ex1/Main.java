package LAB_Files.Ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "memory.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = getUsersList();
        int choice;

        do {
            System.out.println("PRESS [1] TO ADD USERS");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO DELETE USERS");
            System.out.println("PRESS [4] TO EXIT");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addUser(users, scanner);
                    break;
                case 2:
                    listUsers(users);
                    break;
                case 3:
                    deleteUser(users, scanner);
                    break;
                case 4:
                    saveUsersList(users);
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    static ArrayList<User> getUsersList() {
        ArrayList<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                User user = new User(Integer.parseInt(parts[0]), parts[1], parts[2]);
                users.add(user);
            }
        } catch (IOException e) {
        }
        return users;
    }

    static void saveUsersList(ArrayList<User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (User user : users) {
                writer.write(user.getId() + "," + user.getLogin() + "," + user.getPassword() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void addUser(ArrayList<User> users, Scanner scanner) {
        User user = new User();
        System.out.println("Enter user ID:");
        user.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter user login:");
        user.setLogin(scanner.nextLine());
        System.out.println("Enter user password:");
        user.setPassword(scanner.nextLine());
        users.add(user);
    }

    static void listUsers(ArrayList<User> users) {
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    static void deleteUser(ArrayList<User> users, Scanner scanner) {
        if (users.isEmpty()) {
            System.out.println("No users to delete.");
        } else {
            System.out.println("Enter user ID to delete:");
            int userId = scanner.nextInt();
            boolean found = false;
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId() == userId) {
                    users.remove(i);
                    found = true;
                    System.out.println("User deleted successfully.");
                    break;
                }
            }
            if (!found) {
                System.out.println("User with ID " + userId + " not found.");
            }
        }
    }
}
