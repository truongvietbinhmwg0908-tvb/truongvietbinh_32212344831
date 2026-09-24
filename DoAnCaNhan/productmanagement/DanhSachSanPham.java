package productmanagement;

import java.util.ArrayList;

public class DanhSachSanPham {

    private ArrayList<SanPham> danhSachSanPham;

    public DanhSachSanPham() {
        this.danhSachSanPham = new ArrayList<>();
    }

    public void addSanPham(SanPham sp) {
        danhSachSanPham.add(sp);
        System.out.println("them san pham thanh cong.");
    }

    public void updateSanPham(String id) {
        SanPham sp = findSanPhamById(id);
        if (sp != null) {
            sp.updateSanPham(id);
        } else {
            System.out.println("khong tim thay: " + id);
        }
    }

    public void deleteSanPhamById(String id) {
        SanPham sp = findSanPhamById(id);
        if (sp != null) {
            danhSachSanPham.remove(sp);
            System.out.println("xoa san pham thanh cong.");
        } else {
            System.out.println("khong tim thay : " + id);
        }
    }

    public SanPham findSanPhamById(String id) {
        for (SanPham sp : danhSachSanPham) {
            if (sp.getId().equalsIgnoreCase(id)) {
                return sp;
            }
        }
        return null;
    }

    public void displayEveryone() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("danh sach san pham dang trong.");
        } else {
            for (SanPham sp : danhSachSanPham) {
                sp.displayInfo();
            }
        }
    }

   
    public void checkInventory() {
        boolean hasLowStock = false;
        System.out.println("--- danh sach san pham sap het hang (SL < 5) ---");
        for (SanPham sp : danhSachSanPham) {
            if (sp.isLowStock()) {
                sp.displayInfo();
                hasLowStock = true;
            }
        }
        if (!hasLowStock) {
            System.out.println("khong co san pham nao het hang.");
        }
    }
}
