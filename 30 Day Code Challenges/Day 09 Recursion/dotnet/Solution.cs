using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace dotnet
{
    class Solution
    {
        static int factorial(int n) {
            if (n <= 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int result = factorial(n);
            Console.WriteLine(result);
        }
    }
}
