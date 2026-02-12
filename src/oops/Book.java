package oops;

public class Book {
    String title;
    String author;
    double price;
    int pages;
    Book(String title, String author, double price, int pages){
        this.title=title;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }
    void readPages(int count){
        if(count<=pages){
            System.out.println("you have read "+count+" pages");
        }
        else{
            System.out.println("Book has only "+pages+" pages");
        }
    }
    void updatePrice(double newPrice){
        this.price= newPrice;
        System.out.println("price updated successfully: ");
    }
    void displayBookInfo(){
        System.out.println("----- Book Details -----");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Pages: " + pages);
    }
    public static void main(String[] args) {
        Book book1=new Book("java","java author",450,250);
        book1.displayBookInfo();
        book1.readPages(20);
        book1.updatePrice(500);
        book1.displayBookInfo();
    }
}
