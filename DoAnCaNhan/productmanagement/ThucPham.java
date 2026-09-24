    package productmanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThucPham extends SanPham {

    private Date expiryDate;
    private String supplier;

    public ThucPham() {
    }

    public ThucPham(String id, String name, double unitPrice, int quantity, Date importDate, Date expiryDate, String supplier) {
        super(id, name, unitPrice, quantity, importDate);
        this.expiryDate = expiryDate;
        this.supplier = supplier;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public double tinhThueVAT() {
        return getUnitPrice() * 0.05; 
    }

    @Override
    public void addSanPham() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        setId(sc.nextLine());
        System.out.print("Nhap ten san pham: ");
        setName(sc.nextLine());
        System.out.print("Nhap don gia: ");
        setUnitPrice(Double.parseDouble(sc.nextLine()));
        System.out.print("Nhap so luong: ");
        setQuantity(Integer.parseInt(sc.nextLine()));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Nhap ngay nhap kho (dd/MM/yyyy): ");
        try {
            setImportDate(sdf.parse(sc.nextLine()));
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le.");
        }
        System.out.print("Nhap han su dung (dd/MM/yyyy): ");
        try {
            this.expiryDate = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le.");
        }
        System.out.print("Nhap nha cung cap: ");
        this.supplier = sc.nextLine();
    }

    @Override
    public void updateSanPham(String id) {
        if (this.getId().equals(id)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ten moi: ");
            setName(sc.nextLine());
            System.out.print("Nhap don gia moi: ");
            setUnitPrice(Double.parseDouble(sc.nextLine()));
            System.out.print("Nhap so luong moi: ");
            setQuantity(Integer.parseInt(sc.nextLine()));
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Nhap ngay nhap kho moi (dd/MM/yyyy): ");
            try {
                setImportDate(sdf.parse(sc.nextLine()));
            } catch (ParseException e) {
                System.out.println("Dinh dang ngay khong hop le.");
            }
            System.out.print("Nhap han su dung moi (dd/MM/yyyy): ");
            try {
                this.expiryDate = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Dinh dang ngay khong hop le.");
            }
            System.out.print("Nhap nha cung cap moi: ");
            this.supplier = sc.nextLine();
            System.out.println("Cap nhat san pham Thuc Pham thanh cong.");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String importStr = getImportDate() != null ? sdf.format(getImportDate()) : "N/A";
        String expStr = expiryDate != null ? sdf.format(expiryDate) : "N/A";
        System.out.println("Thuc Pham [Ma: " + getId() + ", Ten: " + getName()
                + ", Don gia: " + getUnitPrice() + ", SL: " + getQuantity()
                + ", Ngay nhap: " + importStr + ", HSD: " + expStr + ", NCC: " + supplier
                + ", VAT: " + tinhThueVAT() + ", Sap het hang: " + (isLowStock() ? "Co" : "Khong") + "]");
    }
}