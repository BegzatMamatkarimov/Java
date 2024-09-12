package lesson;

public class V1_2Pharmacy {
    String name;
    int countOfDrugs;
    V1_2Drug[] drug;

    public V1_2Pharmacy(String name, int countOfDrugs, V1_2Drug[] drug) {
        this.name = name;
        this.countOfDrugs = countOfDrugs;
        this.drug = drug;
    }


    int avePharmacy(){
        int sum = 0;
        for (V1_2Drug v12Drug : drug) {
            sum += v12Drug.price;
        }
        return sum / drug.length;
    }
    int expesiveDrug(){
        int max = Integer.MIN_VALUE;
        for (V1_2Drug v12Drug : drug) {
            if(v12Drug.price > max){
                max = v12Drug.price;
            }
        }
        return max;
    }

    String nameDrug(){
        int max = Integer.MIN_VALUE;
        String namePrise = null;
        for (V1_2Drug v12Drug : drug) {
            if(v12Drug.price > max){
                max = v12Drug.price;
                namePrise = v12Drug.name;
            }
        }
        return namePrise;
    }

}
