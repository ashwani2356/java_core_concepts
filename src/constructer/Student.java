package constructer;

 class Student {
 Student(String name,int id){
    System.out.println("name-"+name+", id-"+id);
}
public static void main(String[] args) {
    Student s1=new Student("ashwani",101);
    Student s2=new Student("ayush",102);
    Student s3=new Student("gaurav",103);
    Student s4=new Student("sumit",104);
    Student s5=new Student("rohit",105);
    Student s6=new Student("manish",106);

}
}
