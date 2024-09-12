package LAB_Files.Ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private final ArrayList<GoodItem> goodItems;

    public Admin() {
        this.goodItems = new ArrayList<>();
    }

    public void addGood(GoodItem good) {
        goodItems.add(good);
    }

    public void listGoods() {
        for (GoodItem item : goodItems) {
            System.out.println(item);
        }
    }

    public void deleteGood(int index) {
        goodItems.remove(index);
    }

    public ArrayList<GoodItem> getGoodItemList() {
        return goodItems;
    }

    public void saveGoodItems(ArrayList<GoodItem> goodItems) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("goodItems.txt"))) {
            for (GoodItem item : goodItems) {
                writer.println(item.getName() + "," + item.getPrice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("PRESS [1] ADD GOOD");
            System.out.println("PRESS [2] LIST GOODS");
            System.out.println("PRESS [3] DELETE GOOD");
            System.out.println("PRESS [0] TO EXIT");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter price:");
                    int price = scanner.nextInt();
                    admin.addGood(new GoodItem(name, price));
                    break;
                case 2:
                    admin.listGoods();
                    break;
                case 3:
                    System.out.println("Enter index to delete:");
                    int index = scanner.nextInt();
                    admin.deleteGood(index);
                    break;
                case 0:
                    admin.saveGoodItems(admin.getGoodItemList());
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
