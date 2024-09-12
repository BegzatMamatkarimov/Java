package Lab3;

public class CPU {
    String name; // Intel
    int RAM; // 4096 MB
    double frequency; // 2.7 GHZ

    public CPU() {}

    public CPU(String name, int RAM, double frequency) {
        this.name = name;
        this.RAM = RAM;
        this.frequency = frequency;
    }

    String getCPUData(){
        return ("Name: " + name + ", RAM " + RAM + ", Frequency " + frequency);
    }
}

class Laptop {
    String name;
    int HDDMemory;
    CPU processor;

    public Laptop() {
    }

    public Laptop(String name, int HDDMemory, CPU processor) {
        this.name = name;
        this.HDDMemory = HDDMemory;
        this.processor = processor;
    }

    void printLaptopData(){
        System.out.println("Name: " + name + ", HDD memory: " + HDDMemory + "\nCPU: \n" + processor.getCPUData());
    }

    void execute(){
        if(processor.RAM > 4096 && processor.frequency > 2.5){
            System.out.println("Laptop: " + name + " is started and executing");
        }

        else{
            System.out.println("Laptop: " + name + " cannot start");
        }
    }
}

class CPUTest{
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel Core i7", 8192, 3.2);
        Laptop laptop = new Laptop("Dell Inspiron", 512, cpu);

        laptop.printLaptopData();
        System.out.println("--------------");
        laptop.execute();

    }

    static void ef(){
        System.out.println("dsed");
    }
}