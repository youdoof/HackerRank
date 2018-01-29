using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace dotnet
{
    class Solution
    {
        static void multiplyTenTimes(int n) {
            for (int i = 1; i <= 10; i++) {
                Console.WriteLine($"{n} x {i} = {n*i}");
            }
        }
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            multiplyTenTimes(n);
        }
    }
}
