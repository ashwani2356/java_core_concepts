package Inheritance;

class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.area();

    }
}
