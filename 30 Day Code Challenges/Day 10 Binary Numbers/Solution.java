import java.io.*;
import java.util.*;

public class Solution {

    static int binaryCounter(int n) {
        int maxConsecutiveCount = 0;
        int tempCounter = 0;
        while (n >= 1) {
            if (n % 2 == 1) {
                tempCounter++;
                maxConsecutiveCount = (tempCounter > maxConsecutiveCount) ? tempCounter : maxConsecutiveCount;
            } else {
                tempCounter = 0;
            }
            n /= 2;
        }
        return maxConsecutiveCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binaryCounter(n));
        sc.close();
    }
}
