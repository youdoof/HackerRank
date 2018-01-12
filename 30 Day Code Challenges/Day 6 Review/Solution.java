import java.io.*;
import java.util.*;

public class Solution {

    static String oddEvenParser(char[] arr) {
        String even = "";
        String odd = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 || i == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        return even + " " + odd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            System.out.println(oddEvenParser(sc.nextLine().toCharArray()));
        }

        sc.close();
    }
}
