package truongvietbinh_4831.Lec07_string;

public class StringImmutability {

    public static String concatenaWithPlus(String first, String second) {
        return first + " " + second;

    }

    public static String concatenaWithConcat(String first, String second) {
        return first.concat(" ").concat(second);
    }

    public static void main(String[] args) {
        String first = "Duy tan ";
        String second = "University";
        System.out.println("Using:" + concatenaWithPlus(first, second));
        System.out.println("using concat: " + concatenaWithConcat(first, second));
        first.concat("University");
        System.out.println("First after concat without reassigment: " + first);
    }
}
