package Inheritance;

 class A {
     void property(){
         System.out.println("parents have lots of properties");
     }
}
class B extends A {
     void car(){
         System.out.println("i have 2 cars");
     }
     public static void main(String[] args) {
         B b=new B();
         b.car();
         b.property();
     }
}
