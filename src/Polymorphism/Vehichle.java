package Polymorphism;

 class Vehicle {
    void displayInfo(){
        System.out.println("Genric Vehicle");
    }
}
class Car extends Vehicle{
     void displayInfo(){
         System.out.println("Car: 4 wheels");
     }
}
class Bike extends Vehicle{
     void displayInfo(){
         System.out.println("Bike: 2 wheels");
     }
     public static void main(String[] args) {
         Vehicle vehicle = new Vehicle();
         vehicle.displayInfo();
         Car car = new Car();
         car.displayInfo();
         Bike bike = new Bike();
         bike.displayInfo();
     }
}