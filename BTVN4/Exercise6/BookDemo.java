package truongvietbinh_4831.Lec08_ObjectAndClass.Exercise6;

public class BookDemo {

    public static void main(String[] args) {
        System.out.println("--- Enter Book 1 ---");
        Book book1 = new Book();
        book1.enterBookInfo();

        System.out.println("\n--- Enter Book 2 ---");
        Book book2 = new Book();
        book2.enterBookInfo();

        System.out.println("\n--- Book List ---");
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
