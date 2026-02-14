package Inheritance;

public class Car extends Vehicle {
Car(String name,int wheelsCount,String colour){
    super(name, wheelsCount, colour);
}
public static void main(String[] args) {
   Car c1=new Car("Verna",4,"Black");
   Car c2=new Car("Slavia",4,"Red");

}
}
