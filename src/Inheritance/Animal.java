package Inheritance;

 class Animal {
    void makeSound(){
        System.out.println("Animal sounds");
    }
}
class Dog extends Animal{
     void makeSound(){
         System.out.println("Dod barks");
     }
     public static void main(String[] args) {
         Dog d=new Dog();
         d.makeSound();

     }
}