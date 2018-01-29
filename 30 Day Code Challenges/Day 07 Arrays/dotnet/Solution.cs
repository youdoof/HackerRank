using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace dotnet
{
    class Solution
    {
        static void Main(String[] args) {
            int n = Convert.ToInt32(Console.ReadLine());
            string[] arr_temp = Console.ReadLine().Split(' ');
            int[] arr = Array.ConvertAll(arr_temp,Int32.Parse);

            n--;
            while (n >= 0) {
                if (n == 0) {
                    Console.Write($"{arr[n]}");
                } else {
                    Console.Write($"{arr[n]} ");
                }
                n--;
            }
        }
    }
}
