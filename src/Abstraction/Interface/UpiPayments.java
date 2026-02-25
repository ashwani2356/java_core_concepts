package Abstraction.Interface;
interface payments{
    void pay();
}

 class UpiPayments implements payments{
   public void pay(){
   System.out.println("pay using Upi");
  }
}
class NetBanking implements payments{
   public void pay(){
    System.out.println("pay using Netbanking");
   }
}
class Checkout{
 void processPayment(payments payment){
  payment.pay();
 }
 public static void main(String[] args) {
  payments p1=new UpiPayments();
  payments p2=new NetBanking();
  p1.pay();
  p2.pay();
 }
}