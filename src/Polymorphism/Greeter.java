package Polymorphism;

public class Greeter {
    void greet(){
        System.out.println("Hello!");
    }
    void greet(String name){
        System.out.println("Hello, "+name+"!");
    }
    void greet(String time,String name){
        System.out.println(time+", "+name+"!");
    }
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet();
        g.greet("Riya");
        g.greet("Good Morning","Riya");
    }
}
