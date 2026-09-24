package productmanagement;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        DanhSachSanPham qlsp = new DanhSachSanPham();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- HE THONG QUAN LI SAN PHAM ---");
            System.out.println("1. them san pham dien tu moi");
            System.out.println("2. them san pham thuc pham moi");
            System.out.println("3. cap nhat thong tin san pham theo ma");
            System.out.println("4. xoa san pham theo ma");
            System.out.println("5. tim kiem san pham theo ma");
            System.out.println("6. hien thi toan bo danh sach san pham");
            System.out.println("7. kiem tra canh bao ton kho (SL < 5)");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    DienTu dienTu = new DienTu();
                    System.out.println("\n--- nhap thong tin san pham dien tu ---");
                    dienTu.addSanPham();
                    qlsp.addSanPham(dienTu);
                    break;
                case 2:
                    ThucPham thucPham = new ThucPham();
                    System.out.println("\n--- nhap thong tin san pham thuc pham ---");
                    thucPham.addSanPham();
                    qlsp.addSanPham(thucPham);
                    break;
                case 3:
                    System.out.print("nhap ma san xuat can sua: ");
                    String updateId = scanner.nextLine();
                    qlsp.updateSanPham(updateId);
                    break;
                case 4:
                    System.out.print("nhap ma san xuat can xoa: ");
                    String deleteId = scanner.nextLine();
                    qlsp.deleteSanPhamById(deleteId);
                    break;
                case 5:
                    System.out.print("nhap ma san pham can tim: ");
                    String findId = scanner.nextLine();
                    SanPham found = qlsp.findSanPhamById(findId);
                    if (found != null) {
                        System.out.println("ket qua can kiem:");
                        found.displayInfo();
                    } else {
                        System.out.println("khong tim thay san pham: " + findId);
                    }
                    break;
                case 6:
                    System.out.println("\n--- DANH SACH TAT CA SAN PHAM ---");
                    qlsp.displayEveryone();
                    break;
                case 7:
                    qlsp.checkInventory();
                    break;
                case 0:
                    System.out.println("Dang thoa chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai tu 0 den 7.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
