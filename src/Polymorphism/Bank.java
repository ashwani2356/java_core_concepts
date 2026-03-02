package Polymorphism;

public class Bank {

    int getInterestRate(int i){
        System.out.println("0");
        return 0;
    }
}
class SBI extends Bank{
    int getInterestRate(int i){
        System.out.println("SBI Interest Rate: "+i+"%");
        return i;
    }
}
class HDFC extends Bank{
    int getInterestRate(int i){
        System.out.println("HDFC Interest Rate: "+i+"%");
        return i;
    }
}
class ICICI extends Bank{
    int getInterestRate(int i){
        System.out.println("ICIC Interest Rate: "+i+"%");
        return i;
    }
    public static void main(String[] args) {
        SBI s = new SBI();
        s.getInterestRate(5);
        HDFC h = new HDFC();
        h.getInterestRate(6);
        ICICI i = new ICICI();
        i.getInterestRate(7);
    }


}