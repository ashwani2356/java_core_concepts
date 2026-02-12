package oops;

public class MobilePhone {

    // Attributes
    String brand;
    String model;
    int batteryLevel;   // 0 to 100
    boolean isOn;

    // Constructor
    MobilePhone(String brand, String model, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;
        this.isOn = false;  // phone initially off
    }

    // Method 1: turnOn
    void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(brand + " " + model + " is now ON.");
        } else {
            System.out.println("Phone is already ON.");
        }
    }

    // Method 2: usePhone
    void usePhone(int minutes) {
        if (!isOn) {
            System.out.println("Turn on the phone first!");
            return;
        }

        int batteryUsed = minutes / 2; // simple logic (every 2 min = 1% battery)

        if (batteryLevel > 0) {
            batteryLevel -= batteryUsed;

            if (batteryLevel < 0) {
                batteryLevel = 0;
            }

            System.out.println("Phone used for " + minutes + " minutes.");
            System.out.println("Remaining battery: " + batteryLevel + "%");
        } else {
            System.out.println("Battery is dead. Please charge.");
        }
    }

    // Method 3: chargePhone
    void chargePhone(int amount) {
        if (amount > 0) {
            batteryLevel += amount;

            if (batteryLevel > 100) {
                batteryLevel = 100;
            }

            System.out.println("Phone charged. Current battery: " + batteryLevel + "%");
        } else {
            System.out.println("Invalid charging amount!");
        }
    }

    // Main method to test
    public static void main(String[] args) {

        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 50);

        phone1.turnOn();
        phone1.usePhone(20);
        phone1.chargePhone(30);
        phone1.usePhone(60);
    }
}
