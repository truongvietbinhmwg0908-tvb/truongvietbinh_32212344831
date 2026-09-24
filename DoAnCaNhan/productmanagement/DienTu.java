package productmanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DienTu extends SanPham {

    private int warrantyMonths;
    private double powerWatts;

    public DienTu() {
    }

    public DienTu(String id, String name, double unitPrice, int quantity, Date importDate, int warrantyMonths, double powerWatts) {
        super(id, name, unitPrice, quantity, importDate);
        this.warrantyMonths = warrantyMonths;
        this.powerWatts = powerWatts;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public double getPowerWatts() {
        return powerWatts;
    }

    public void setPowerWatts(double powerWatts) {
        this.powerWatts = powerWatts;
    }

    @Override
    public double tinhThueVAT() {
        return getUnitPrice() * 0.10; 
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
        System.out.print("Nhap ngay nhap kho (dd/MM/yyyy): ");
        String dateStr = sc.nextLine();
        try {
            setImportDate(new SimpleDateFormat("dd/MM/yyyy").parse(dateStr));
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le.");
        }
        System.out.print("Nhap so thang bao hanh: ");
        this.warrantyMonths = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap cong suat (W): ");
        this.powerWatts = Double.parseDouble(sc.nextLine());
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
            System.out.print("Nhap ngay nhap kho moi (dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            try {
                setImportDate(new SimpleDateFormat("dd/MM/yyyy").parse(dateStr));
            } catch (ParseException e) {
                System.out.println("Dinh dang ngay khong hop le.");
            }
            System.out.print("Nhap so thang bao hanh moi: ");
            this.warrantyMonths = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap cong suat moi (W): ");
            this.powerWatts = Double.parseDouble(sc.nextLine());
            System.out.println("Cap nhat san pham Dien Tu thanh cong.");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = getImportDate() != null ? sdf.format(getImportDate()) : "N/A";
        System.out.println("Dien Tu [Ma: " + getId() + ", Ten: " + getName()
                + ", Don gia: " + getUnitPrice() + ", SL: " + getQuantity()
                + ", Ngay nhap: " + dateStr + ", BH: " + warrantyMonths + " thang, CS: " + powerWatts
                + "W, VAT: " + tinhThueVAT() + ", Sap het hang: " + (isLowStock() ? "Co" : "Khong") + "]");
    }
}