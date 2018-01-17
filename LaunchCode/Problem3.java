import java.io.*;
import java.util.*;

public class Problem3 {

    static int numberOfBarsRemoved(int n) {
        int adder = 1;
        int total = 0;
        for (int i = 0; i <= n; i++) {
            adder = (i / 2) + 1;
            total += adder;
            System.out.println("Adder: " + adder + " i: " + i + " Total: " + total);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        System.out.println(numberOfBarsRemoved(t));
        sc.close();
    }
}
