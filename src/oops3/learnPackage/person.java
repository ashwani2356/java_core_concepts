package oops3.learnPackage;

public class person {

 private int age;

private String name;
boolean canBeChanged=true;

     public void setAge(int age){
         if(canBeChanged){
             this.age=age;
         }

     }
     public int getAge(){
         return age;
     }
}
