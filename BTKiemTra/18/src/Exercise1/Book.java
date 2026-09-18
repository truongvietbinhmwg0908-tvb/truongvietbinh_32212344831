package Exercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Book implements IBook {

    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private int quantity;

    public Book() {
    }

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, int quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book id:");
        String bookId = scanner.nextLine();
        setBookId(bookId);

        System.out.println("Enter publisher:");
        setPublisher(scanner.nextLine());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter date (dd/mm/yyyy)");
        String dateString = scanner.nextLine();
        try {
            setEntryDate(sdf.parse(dateString));//cover string to date anh set
        } catch (ParseException ex) {
            System.out.println("Wrong format");
        }
        System.out.print("Enter unit price: ");
        setUnitPrice(scanner.nextDouble());

        System.out.print("Enter quantity: ");
        setQuantity(scanner.nextInt());
    }
    
    @Override
    public void uppDateBook() {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter date (dd/mm/yyyy)");
        String dateString = scanner.nextLine();
        try {
            setEntryDate(sdf.parse(dateString));//cover string to date anh set
        } catch (ParseException ex) {
            System.out.println("Wrong format");
        }
        System.out.print("Enter unit price: ");
        setUnitPrice(scanner.nextDouble());

        System.out.print("Enter quantity: ");
        setQuantity(scanner.nextInt());
    }
}
