package Polymorphism;

public class Transport {

    void travelMode(){
        System.out.println("Travel Mode");
    }
}
class Bus extends Transport{
    void travelMode(){
        System.out.println("Traveling by bus");
    }
}
class Train extends Transport{
    void travelMode(){
        System.out.println("Traveling by train");
    }
}
class Flight extends Transport{
    void travelMode(){
        System.out.println("Traveling by flight");
    }
    public static void main(String[] args) {
        Transport t = new Bus();
        t.travelMode();
        Transport t1 = new Train();
        t1.travelMode();
        Transport t2 = new Flight();
        t2.travelMode();

    }
}