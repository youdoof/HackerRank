import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    // Below Here
    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int max = 0;
        int min = 100;
        for (int i = 0; i < elements.length; i++) {
            max = (elements[i] > max) ? elements[i] : max;
            min = (elements[i] < min) ? elements[i] : min;
        }
        maximumDifference = max - min;
    }
    // Above Here
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
