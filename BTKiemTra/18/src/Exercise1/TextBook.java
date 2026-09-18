/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.util.*;

public class TextBook extends Book {

    private String status;

    public TextBook() {
    }

    public TextBook(String status) {
        this.status = status;
    }

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, int quantity) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.println("enter status: ");
        setStatus(scanner.nextLine());
    }

}
