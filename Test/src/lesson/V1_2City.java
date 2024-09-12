package lesson;

public class V1_2City {
    String name;
    int countOfPharmacy;
    V1_2Pharmacy[] pharmacy;

    public V1_2City(String name, int countOfPharmacy, V1_2Pharmacy[] pharmacy) {
        this.name = name;
        this.countOfPharmacy = countOfPharmacy;
        this.pharmacy = pharmacy;
    }

    int aveCity(){
        int sum = 0;
        for (V1_2Pharmacy v12Pharmacy : pharmacy) {
            sum += v12Pharmacy.avePharmacy();
        }
        return sum / pharmacy.length;
    }


    void getDataOut(){
        System.out.println("City: " + name);
        for (V1_2Pharmacy v12Pharmacy : pharmacy) {
            System.out.println("Average of " + v12Pharmacy.name + " is " + v12Pharmacy.avePharmacy());
        }
        System.out.println("AVERAGE OF PRICE OF " + name + ": " + aveCity());
        System.out.println();
    }

    String namePharmacy(){
        int max = Integer.MIN_VALUE;
        String nameCity = null;
        for (V1_2Pharmacy v12Pharmacy : pharmacy) {
            if(v12Pharmacy.expesiveDrug() > max){
                max = v12Pharmacy.expesiveDrug();
                nameCity = v12Pharmacy.nameDrug();

            }
        }
        return nameCity;
    }

    void getDataOut2(){
        System.out.println("City: " + name);
        for (V1_2Pharmacy v12Pharmacy : pharmacy) {
            System.out.println("The most expensive drug in " + v12Pharmacy.name + " is " + v12Pharmacy.nameDrug());
        }
        System.out.println("AVERAGE OF PRICE OF " + name + ": " + namePharmacy());
        System.out.println();
    }

}
