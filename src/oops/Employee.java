package oops;

public class Employee {
    String name;
    int employeeId;
    double salary;
    String department;

    Employee(String name, int employeeId, double salary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }
    void work(int hours) {
        System.out.println("--------------");
        System.out.println(name+" worked for " +hours+" hours");
    }
    void updateSalary(double increment){
        this.salary+= increment;
        System.out.println("increment in salary of: "+increment);
    }
    void showDetails(){
        System.out.println("employee details");
        System.out.println("-----------------");
        System.out.println("name: "+name);
        System.out.println("employeeId: "+employeeId);
        System.out.println("new salary: "+salary);
        System.out.println("department: "+department);
    }
    public static void main(String[] args) {
        Employee e1=new Employee("ashwani",101,30000,"It");
        e1.showDetails();
        e1.work(8);
        e1.updateSalary(20000);
        e1.showDetails();
    }
}