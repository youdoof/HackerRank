import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int x;
        double y;
        String z;

        x = scan.nextInt();
        y = scan.nextDouble();
        z = scan.next();
        if (scan.hasNextLine()) {
            z += scan.nextLine();
        }
        System.out.println(i + x);
        NumberFormat formatter = new DecimalFormat("#0.0");
        System.out.println(formatter.format(d + y));
        System.out.println(s + z);
        scan.close();
    }
}
