package oops;

class Car {

    // 🔹 Attributes
    String brand;
    String model;
    int year;
    double fuel;

    // 🔹 Constructor
    Car(String brand, String model, int year, double fuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
    }

    // 🔹 Method to drive the car
    void drive(double distance) {

        double fuelNeeded = distance * 0.1;   // 0.1 liter per km

        if (fuel >= fuelNeeded) {
            fuel -= fuelNeeded;
            System.out.println("Car drove " + distance + " km.");
            System.out.println("Remaining fuel: " + fuel + " liters");
        } else {
            System.out.println("Not enough fuel to drive!");
        }
    }

    // 🔹 Method to refuel
    void refuel(double liters) {
        fuel += liters;
        System.out.println("Refueled " + liters + " liters.");
        System.out.println("Current fuel: " + fuel + " liters");
    }

    // 🔹 Method to display car details
    void displayInfo() {
        System.out.println("----- Car Details -----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel + " liters");
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Fortuner", 2022, 20);

        myCar.displayInfo();

        System.out.println("-----------------------");

        myCar.drive(500);

        System.out.println("-----------------------");

        myCar.refuel(30);

        System.out.println("-----------------------");

        myCar.displayInfo();
    }
}
