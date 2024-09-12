package files;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class FileRead {
    String name;
    String lname;
    String sperator = File.separator;
    String pass = sperator + "C:" + sperator + "Users" + sperator + "User" + sperator + "Desktop" + sperator + "Java" + sperator + "Test" + sperator + "src" + sperator + "text.txt";
    File file = new File(pass);
    Scanner scanner = new Scanner(file);

    String[] bases = new String[(int) file.length()];


    public boolean hasData(){
        if(scanner.hasNextLine()) {
            int i = 0;
            do{
                bases[i++] = scanner.nextLine();
            }
            while (scanner.hasNextLine());
            return true;
        }
        else return false;
    }


    public boolean chakc(String log, int pin){
        for(String bases : bases){
            String[] parts = bases.split(" ");
            if (Objects.equals(parts[0], log) && Objects.equals(parts[1], Integer.toString(pin))) {
                name = parts[2];
                lname = parts[3];
                return true;
            }
        }
        return false;
    }

    public FileRead() throws IOException {
    }
}
