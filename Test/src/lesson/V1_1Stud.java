package lesson;

public class V1_1Stud {
    String name;
    double avg;
    double scholarship;

    public V1_1Stud(String name, double avg, double scholarship) {
        this.name = name;
        this.avg = avg;
        this.scholarship = scholarship;
    }

    void analis(){
        if(avg >= 2){
            if(avg > 4.5){
                System.out.println(name + " will tak " + (scholarship * 1.3) + "(" + avg + ")") ;
            }
            else {
                System.out.println(name + " will tak " + (scholarship * 1.1) + "(" + avg + ")") ;

            }
        }
    }
}
