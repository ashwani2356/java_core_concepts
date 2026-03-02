package Polymorphism;

import java.util.Scanner;

class Student {
    void printDetails(String name,int age){
        System.out.println(name+","+age);
    }
    void printDetails(String name,int age,String course){
        System.out.println(name+","+age+","+course);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student=new Student();
        System.out.println("enter name and age");
        String name1=sc.next();
        int age2=sc.nextInt();
        System.out.println("name: "+name1+" and age: "+age2);

        System.out.println("enter name,age and course");
        String name2=sc.next();
        int age3=sc.nextInt();
        String course2=sc.next();
        System.out.println("name: "+name2+", age: "+age3+" and course: "+course2);

    }
}
