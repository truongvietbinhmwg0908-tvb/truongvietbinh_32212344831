# 📦 HỆ THỐNG QUẢN LÝ SẢN PHẨM (PRODUCT MANAGEMENT SYSTEM)

Báo cáo Đồ án môn học: FUNDAMENTALS OF COMPUTING 1  
Khoa Công nghệ Thông tin - Năm 2026

---

## 👨‍💻 Thông Tin Sinh Viên
- **Họ và tên:** Trương Việt Bình
- **MSSV:** Trương Viết Bình
- **Lớp sinh hoạt:** CMU-CS 303 GIS1
- **Giảng viên hướng dẫn:** Trần Văn Trình

---

## 📖 Giới Thiệu Đề Tài
Đồ án xây dựng ứng dụng quản lý kho hàng hóa trên nền tảng Console, áp dụng chặt chẽ 4 nguyên lý cốt lõi của Lập trình Hướng đối tượng (**Đóng gói, Kế thừa, Đa hình, Trừu tượng**). 

Hệ thống quản lý 2 nhóm sản phẩm chính:
- **Điện Tử (`DienTu`):** Quản lý tháng bảo hành, công suất (W) và mức thuế VAT 10%.
- **Thực Phẩm (`ThucPham`):** Quản lý hạn sử dụng, nhà cung ứng và mức thuế VAT ưu đãi 5%.

---

## 🛠️ Cấu Trúc Dự Án & Sơ Đồ Lớp (Class Diagram)

```text
productmanagement/
├── ISanPham.java           # Interface chuẩn hóa các hành vi bắt buộc
├── SanPham.java            # Abstract class định nghĩa khung dữ liệu chung
├── DienTu.java             # Lớp con kế thừa từ SanPham
├── ThucPham.java           # Lớp con kế thừa từ SanPham
├── DanhSachSanPham.java    # Lớp quản lý danh mục và logic nghiệp vụ (CRUD)
└── Processor.java          # Lớp điều phối luồng thực thi chính (Main menu)
