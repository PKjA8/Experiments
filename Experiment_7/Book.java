class Book_itap {
    int bookId;
    String title;
    String author;
    double price;

    Book_itap(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    void modifyPrice(double newPrice) {
        this.price = newPrice;
    }
}

class Periodical extends Book_itap {
    String period;

    Periodical(int bookId, String title, String author, double price, String period) {
        super(bookId, title, author, price);  
        this.period = period;
    }

    @Override
    void displayDetails() {
        super.displayDetails();  
        System.out.println("Period: " + period);
    }

    void modifyPeriod(String newPeriod) {
        this.period = newPeriod;
    }
}

public class Book {
    public static void main(String[] args) {
        Periodical periodical = new Periodical(101, "Tech Weekly", "John Doe", 12.99, "Weekly");

        System.out.println("Original Periodical Details:");
        periodical.displayDetails();
        
        // Modify the price and period of the periodical
        periodical.modifyPrice(14.99); 
        periodical.modifyPeriod("Monthly");  

        System.out.println("\nUpdated Periodical Details:");
        periodical.displayDetails();
    }
}

