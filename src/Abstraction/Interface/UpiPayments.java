package Abstraction.Interface;

import java.util.Scanner;

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
    System.out.println("pay using NetBanking");
   }
}
class Checkout{
 void processPayment(payments payment){
  payment.pay();
 }
 public static void main(String[] args) {
  UpiPayments upiPayments=new UpiPayments();
  NetBanking netBanking=new NetBanking();
  Checkout checkout=new Checkout();
     System.out.println("1 pay using Upi");
     System.out.println("2 pay using NetBanking");
     Scanner sc=new Scanner(System.in);
     int user_input=sc.nextInt();
     switch (user_input){
         case 1:
             checkout.processPayment(upiPayments);
             break;
             case 2:
                 checkout.processPayment(netBanking);
                 break;
                 default:
                     System.out.println("Invalid input");
     }

 }
}