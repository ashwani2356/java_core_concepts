package Polymorphism;

 class Animal1 {
    void makeSound(){
        System.out.println("Animal make sound");
    }
}
class Dog1  extends Animal1{
     void makeSound(){
         System.out.println("Dog barks");
     }
}
class Cat1  extends Animal1{
     void makeSound(){
         System.out.println("Cat meows");
     }
     public static void main(String[] args) {
         Animal1 animal1 = new Animal1();
         animal1.makeSound();
         Dog1 dog1 = new Dog1();
         dog1.makeSound();
         Cat1 cat1 = new Cat1();
         cat1.makeSound();
     }
}