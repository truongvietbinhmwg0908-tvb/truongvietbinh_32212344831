package productmanagement;

import java.util.Date;

public abstract class SanPham implements ISanPham {

    private String id;
    private String name;
    private double unitPrice;
    private int quantity;
    private Date importDate;

    public SanPham() {
    }

    public SanPham(String id, String name, double unitPrice, int quantity, Date importDate) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.importDate = importDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public boolean isLowStock() {
        return this.quantity < 5;
    }

    public abstract double tinhThueVAT();

    @Override
    public abstract void addSanPham();

    @Override
    public abstract void updateSanPham(String id);

    @Override
    public abstract void displayInfo();
}
