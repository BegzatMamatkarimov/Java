package files;

import java.io.*;
import java.util.Scanner;

public class data {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sperator = File.separator;
        String pass = sperator + "C:" + sperator + "Users" + sperator + "User" + sperator + "Desktop" + sperator + "Java" + sperator + "Test" + sperator + "src" + sperator + "text.txt";
        File file = new File(pass);
        FileWriter fw = new FileWriter(file, true);
        Scanner scanner = new Scanner(file);

        String log = sc.next();
        String pin = sc.next();
        fw.write( log + " " + pin + "\n");
        fw.close();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
        sc.close();
    }


}
