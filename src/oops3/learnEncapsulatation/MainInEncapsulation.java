package oops3.learnEncapsulatation;

import oops3.learnPackage.person;

public class MainInEncapsulation {
    public static void main(String[] args) {
        person p1=new person();
        p1.setAge(12);
        System.out.println(p1.getAge());
    }
}
