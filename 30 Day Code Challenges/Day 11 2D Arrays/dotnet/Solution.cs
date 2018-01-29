using System;

namespace dotnet
{
    class Solution
    {
        static int findHourglassSum(int[][] arr) {
            int result = -9 * 9;
            int sum;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                          arr[i+1][j+1] +
                          arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                    result = sum > result ? sum : result;
                }
            }
            return result;
        }

        static void Main(string[] args)
        {
            int[][] arr = new int[6][];
            for (int arr_i = 0; arr_i < 6; arr_i++) {
                string[] arr_temp = Console.ReadLine().Split(' ');
                arr[arr_i] = Array.ConvertAll(arr_temp,Int32.Parse);
            }
            Console.WriteLine(findHourglassSum(arr));
        }
    }
}
