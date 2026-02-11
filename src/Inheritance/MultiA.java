package Inheritance;

public class MultiA {
    void run(){
        System.out.println("man is running");
    }
}
class MultiB extends MultiA{
    void eat(){
        System.out.println("man is eating");
    }
}
class MultiC extends MultiB{
    void walk(){
        System.out.println("man is walking");
    }
    public static void main(String[] args) {
        MultiC c=new MultiC();
        c.walk();
        c.run();
        c.eat();

    }
}
