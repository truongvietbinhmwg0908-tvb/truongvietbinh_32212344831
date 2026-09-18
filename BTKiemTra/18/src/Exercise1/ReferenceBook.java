/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;


import java.util.*;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook() {
    }
    
    public ReferenceBook(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, int quantity) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }
    
    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.println("enter tax: ");
        setTax(scanner.nextDouble());
    }
    
    @Override
    public void updateBook() {
        Scanner scanner = new Scanner(System.in);
    }

    @Override
    public void displayBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
