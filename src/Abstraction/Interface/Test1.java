package Abstraction.Interface;

abstract class Test1 {
    void m1(){//concrete method
        System.out.println("m1 method is class test1");
    }
   abstract void m2();//abstract method
}
interface I1 {
    void pay();
    void m2();
}
class UpiPayment implements I1{
    @Override
    public void pay() {
        System.out.println("pay using upiPayment method");
    }
    public void m2(){

    }
}