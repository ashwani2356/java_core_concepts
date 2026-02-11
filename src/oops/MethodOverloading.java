package oops;
class Greet{
    void greetings(){
        System.out.println("hello,Good morning");
    }
    void greetings(String name,int count){
        for(int i=0;i<count;i++){
        System.out.println("hello "+name+", Good morning");}
    }
}

public class MethodOverloading {
public static void main(String[] args) {
    Greet gt=new Greet();
    gt.greetings();
    gt.greetings("ashwani", 2);
    Greet gt1=new Greet();
    gt1.greetings("shubham", 1);
}

  }
