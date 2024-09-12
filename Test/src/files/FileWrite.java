package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    String sperator = File.separator;
    String pass = sperator + "C:" + sperator + "Users" + sperator + "User" + sperator + "Desktop" + sperator + "Java" + sperator + "Test" + sperator + "src" + sperator + "text.txt";
    File file = new File(pass);
    FileWriter fw = new FileWriter(file, true);


    public void writeData(String log, int pin, String name, String lname) throws IOException {
        fw.write( log + " " + Integer.toString(pin) + " " + name + " " + lname + "\n");
        fw.close();
    }
    public FileWrite() throws IOException {
    }
}
