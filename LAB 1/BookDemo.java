class Book{
    int id;
    String title, author;
    boolean avail;

    void setID(int id){
        this.id = id;
    }
    void setTitle(String title){
        this.title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setAvail(boolean avail){
        this.avail = avail;
    }

    int getId(){
        return id;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }

    boolean getAvail(){

        return avail;
    }
    
}

public class BookDemo {

    public static void main(String[] args) {

        Book b1 = new Book();
        b1.setID(123);
        b1.setTitle("Harry Potter");
        b1.setAuthor("JK Rowling");
        b1.setAvail(true);


        Book b2 = new Book();
        b2.setID(789);
        b2.setTitle("Percy Jackson");
        b2.setAuthor("Rick Riordan");
        b1.setAvail(false);


        System.out.println("---BOOK DETAILS---");

        System.out.println("BOOK 1:");
        System.out.println("ID: " + b1.getId());
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Availability: " +b1.getAvail() + "\n");

        System.out.println("----------------------------------------\n");

        System.out.println("BOOK 2:");
        System.out.println("ID: " + b2.getId());
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("Availability: " +b2.getAvail());
    }
    
}
