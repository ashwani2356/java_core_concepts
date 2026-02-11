package Inheritance;

class HieA {
     void property(){
         System.out.println("parents have lots have properties");
     }
}
class HieB extends HieA{
    void car(){
        System.out.println("b have his own car");
    }
}
class HieC extends HieA{
    void house(){
        System.out.println("c have his own house");
    }
}
class HieD extends HieA{
    void jawa(){
        System.out.println("d have his own jawa");
    }
    public static void main(String[] args) {
       HieD d=new HieD();
       d.jawa();
       d.property();
        System.out.println(">>>>>>>>>>>>>");
       HieC hc=new HieC();
       hc.house();
       hc.property();
        System.out.println(">>>>>>>>>>>>");
       HieB hb=new HieB();
       hb.car();
       hb.property();
        System.out.println(">>>>>>>>>>>");
       HieA ha=new HieA();
       ha.property();
    }
}