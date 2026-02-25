package Abstraction;

abstract class Animal {


abstract void makeSound();

void sleep(){
	System.out.println("I'm a sleep");
}
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Barks...");
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeSound();
        d.sleep();
    }
}