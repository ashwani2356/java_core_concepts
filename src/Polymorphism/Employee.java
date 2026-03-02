package Polymorphism;

public class Employee {

    int getBonus(int i){
        System.out.println("Employee Bonus: "+i);
        return i;
    }
}
class manager extends Employee{
    int getBonus(int i){
        System.out.println("manager Bonus: "+i);
        return i;
    }
}
class developer extends Employee{
    int getBonus(int i){
        System.out.println("developer Bonus: "+i);
        return i;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getBonus(1000);
        manager m = new manager();
        m.getBonus(3000);
        developer d = new developer();
        d.getBonus(2000);

    }
}