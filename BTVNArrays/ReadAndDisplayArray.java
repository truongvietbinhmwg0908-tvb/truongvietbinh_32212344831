package truongvietbinh_4831.BTVNArrays;

import java.util.*;

public class ReadAndDisplayArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }
        System.out.print("array:[");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }
}
