package lesson;

public class City {
    String name;
    int countOfFlat;
    Flat[] flat;

    public City(String name, int countOfFlat, Flat[] flat) {
        this.name = name;
        this.countOfFlat = countOfFlat;
        this.flat = flat;
    }

    void getCityData(){
        System.out.println(name + " " + countOfFlat);
        for (int i = 0; i < flat.length; i++) {
            flat[i].getData();
        }

    }


    String exactlyFlat(){
        int min = Integer.MAX_VALUE;
        String result = null;
            for (int i = 0; i < flat.length; i++) {
                if(flat[i].room == 3){
                    if(flat[i].price < min){
                        min = flat[i].price;
                        result = flat[i].name;
                    }
                }
            }
            return result;
    }
}
