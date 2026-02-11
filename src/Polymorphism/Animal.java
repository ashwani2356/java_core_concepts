package Polymorphism;

public class Animal {
    void sound(){
        System.out.println("Animal sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dod is barking");
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        Animal a=new Animal();
        a.sound();
    }
}