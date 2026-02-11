package oops;
class Complex{
    int a,b;

    void print(){
        System.out.println(a+" + "+b+"i");
    }
}
class Dog {
    String name;
    int age;
    String colour;
    void bark(){
        System.out.println( name+" is barking"+" which colour is "+colour);
    }
    void walk(){
        System.out.println(name+" is walking"+" which colour is "+colour);
    }
}
public class ClassObject{
public static void main(String[] args) {
//    Dog d1=new Dog();
//    d1.name="tommy";
//    d1.colour="black";
//    d1.bark();
//    Dog d2=new Dog();
//    d2.name="manoj";
//    d2.colour="white";
//    d2.walk();
    Complex num1=new Complex();
    num1.a=3;
    num1.b=5;
    num1.print();
}

}

