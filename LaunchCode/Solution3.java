import java.io.*;
import java.util.*;

public class Solution3 {

    static int func(int n) {
        int adder = 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += adder;
            adder = (i / 2) + 1;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        System.out.println(func(t));
        sc.close();
    }
}
