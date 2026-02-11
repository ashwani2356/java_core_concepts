package Inheritance;

 class Parent {
    Parent(){
        System.out.println("Parents constructor called");
    }
}
class Child extends Parent{
    void child(){
        System.out.println("Child constructor called");
    }
    public static void main(String[] args) {
        Child cd=new Child();
        cd.child();
    }
}