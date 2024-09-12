package LAB_Files.Ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private ArrayList<GoodItem> goodItems;
    private ArrayList<BuyHistory> buyHistory;

    public Client() {
        this.goodItems = getGoodItemList();
        this.buyHistory = getBuyHistory();
    }

    public void listGoods() {
        for (int i = 0; i < goodItems.size(); i++) {
            System.out.println("[" + i + "] " + goodItems.get(i));
        }
    }

    public void buyGood(int index) {
        if (index >= 0 && index < goodItems.size()) {
            GoodItem selectedGood = goodItems.get(index);
            buyHistory.add(new BuyHistory(selectedGood.getName(), selectedGood.getPrice()));
            saveBuyHistory(buyHistory);
            System.out.println("Purchase successful: " + selectedGood);
        } else {
            System.out.println("Invalid selection.");
        }
    }

    public void listBuyHistory() {
        for (BuyHistory history : buyHistory) {
            System.out.println(history);
        }
    }

    public ArrayList<GoodItem> getGoodItemList() {
        ArrayList<GoodItem> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("goodItems.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                items.add(new GoodItem(parts[0], Integer.parseInt(parts[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    public ArrayList<BuyHistory> getBuyHistory() {
        ArrayList<BuyHistory> history = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("buyHistory.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                history.add(new BuyHistory(parts[0], Integer.parseInt(parts[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return history;
    }

    public void saveBuyHistory(ArrayList<BuyHistory> buyHistory) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("buyHistory.txt"))) {
            for (BuyHistory history : buyHistory) {
                writer.println(history.getGoodName() + "," + history.getGoodPrice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("PRESS [1] LIST GOODS");
            System.out.println("PRESS [2] BUY GOOD");
            System.out.println("PRESS [3] LIST BUY HISTORY");
            System.out.println("PRESS [0] TO EXIT");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    client.listGoods();
                    break;
                case 2:
                    System.out.println("Enter index of the good to buy:");
                    int index = scanner.nextInt();
                    client.buyGood(index);
                    break;
                case 3:
                    client.listBuyHistory();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
