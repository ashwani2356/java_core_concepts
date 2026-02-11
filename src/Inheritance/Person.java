package Inheritance;

 class Person {
    void showDetails(){
        System.out.println("person details");
    }
}
class Student extends Person{
     void showDetails(){
         System.out.println("Students details");
     }
     public static void main(String[] args) {
         Student sd=new Student();
         sd.showDetails();
     }
}