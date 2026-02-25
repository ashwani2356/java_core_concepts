package Abstraction.Interface;

interface A {
    void run();

}

interface B{
    void sleep();

}
class c implements A,B{
   public void run(){
       System.out.println("man is running");
    }
   public void sleep(){
       System.out.println("man is sleeping");
    }
    public static void main(String[] args) {
        A a=new c();
        a.run();
        B b=new c();
        b.sleep();
    }
}