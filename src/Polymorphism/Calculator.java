package Polymorphism;

import java.util.Scanner;

class Calculator {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calculator = new Calculator();
        //Two numbers addition
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();

        System.out.println("Enter second number: ");
       int num2= sc.nextInt();

       int sum1=calculator.add(num1,num2);
       System.out.println("sum of "+num1+" and "+num2+" is "+ sum1);
        System.out.println("Enter first number: ");
        int num3=sc.nextInt();
        System.out.println("Enter second number: ");
        int num4=sc.nextInt();
        System.out.println("Enter third number: ");
        int num5=sc.nextInt();
        int sum2=calculator.add(num3,num4,num5);
        System.out.println("sum of "+num3+", "+num4+", and "+num5+" is: "+ sum2);


    }
}
