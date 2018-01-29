using System;
using System.Collections.Generic;
using System.IO;

namespace dotnet
{
    class Solution
    {
        static String oddEvenParser(String str) {
            String even = "";
            String odd = "";
            for (int i = 0; i < str.Length; i++) {
                if (i % 2 == 0) {
                    even += str[i];
                } else {
                    odd += str[i];
                }
            }
            return even + " " + odd;
        }
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < n; i++) {
                Console.WriteLine(oddEvenParser(Console.ReadLine()));
            }
        }
    }
}
