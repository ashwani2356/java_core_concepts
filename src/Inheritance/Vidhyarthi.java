package Inheritance;

 class Vidhyarthi {
    String name;
    Vidhyarthi(String name){
        this.name=name;
    }

    void display(){
        System.out.println("name: "+name);
    }
}
class Marksheet extends Vidhyarthi{
int math, science,hindi;
 Marksheet(String name,int math,int science,int hindi){
     super(name);
     this.math=math;
     this.science=science;
     this.hindi=hindi;
 }
 void display(){
     int total=math+science+hindi;
     System.out.println("Name: "+name);
     System.out.println("Total marks: "+total);
 }
 public static void main(String[] args) {
     Marksheet m1=new Marksheet("ashwani",78,90,78);
     m1.display();
 }
         }
