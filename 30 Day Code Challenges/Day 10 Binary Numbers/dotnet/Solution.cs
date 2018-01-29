using System;

namespace dotnet
{
    class Solution
    {
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

        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(binaryCounter(n));
        }
    }
}
