package Encapsulation;

 class Student {
     private String name;
     private int number;

     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }

     public void setName(String newName){
         name=newName;
     }
     public String getName(){
         return name;
     }
     public static void main(String[] args) {
         Student s1=new Student();
         s1.setName("ashwani");
         s1.setNumber(23);
         System.out.println("Number is: "+s1.getNumber());
         System.out.println("Name is: "+s1.getName());
     }
}
