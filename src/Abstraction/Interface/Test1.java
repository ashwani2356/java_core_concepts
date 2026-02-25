package Abstraction.Interface;

abstract class Test1 {
    void m1(){//concrete method
        System.out.println("m1 method is class test1");
    }
   abstract void m2();//abstract method
}
interface I1 {
    public static final int a=15;
    void pay();
    void m2();
}
class UpiPayment implements I1{

    @Override
    public void pay(){
        System.out.println("pay using upiPayment method");
    }

    public void m2(){
        System.out.println("m2 using upiPayment method");
    }
    public static void main(String[] args) {
        I1 i1=new UpiPayment();
        i1.pay();
        i1.m2();
    }
}