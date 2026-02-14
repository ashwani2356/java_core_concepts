package Inheritance;

class Vehicle {
    int wheelsCount;
    String colour;
    String name;
    Vehicle(String name,int wheelsCount,String colour){
        this.wheelsCount=wheelsCount;
        this.name=name;
        this.colour=colour;
        System.out.println("name: "+name+" ,wheelsCount: "+wheelsCount+" ,colour: "+colour);
    }
    void start(){
        System.out.println("vehicle is starting");
    }

}
