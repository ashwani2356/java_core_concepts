package Polymorphism;

public class Example {

    void display(){
        System.out.println("method with no arguments");
    }
void display(String name,int age){
    System.out.println("method with double arguments:"+name+" ,age:"+age);
}

     public static void main(String[] args) {
Example e=new Example();
e.display();
e.display("ashwani",20);

     }
}
