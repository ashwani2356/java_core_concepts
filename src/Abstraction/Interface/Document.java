package Abstraction.Interface;
interface printable{
    void print();
}

 class Document implements printable{
    public void print(){
        System.out.println("Document printed");
    }

}
class Image implements printable{
    public void print(){
        System.out.println("Image printed");
    }
    public static void main(String[] args) {

        printable d=new Document();
        d.print();
        printable i=new Image();
        i.print();
    }
}
