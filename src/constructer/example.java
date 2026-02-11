package constructer;
class Complex{
    int a,b;

    void print(){
        System.out.println(a+" + "+b+"i");
    }

}
public class example {
    public static void main(String[] args) {


        Complex num1=new Complex();
        num1.print();
        
    }
}
