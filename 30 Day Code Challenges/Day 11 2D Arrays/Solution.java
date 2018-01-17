import java.io.*;
import java.util.*;

/**
* 2D Array
* a b c
*   d
* e f g
* Finding the hourglass sum of each hourglass value. then print the maximum
* hourglass sum.
*
Test input:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
*/
public class Solution {

    static int findHourglassSum(int[][] arr) {
        // Set result to lowest possible value: 9 cases of -9.
        // If any sum is larger than that, the result is updated.
        int result = -9 * 9;
        int sum;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] +   arr[i][j+1] +   arr[i][j+2] +
                                    arr[i+1][j+1] +
                      arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                result = sum > result ? sum : result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findHourglassSum(arr));
        sc.close();
    }
}
