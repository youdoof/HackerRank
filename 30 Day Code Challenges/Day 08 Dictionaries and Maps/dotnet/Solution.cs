using System;
using System.Collections.Generic;
using System.IO;

namespace dotnet
{
    class Solution
    {
/*
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
*/
        static void Main(string[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            Dictionary<string, int> phoneBook = new Dictionary<string, int>(n);
            for (int i = 0; i < n; i++) {
                string[] input = Console.ReadLine().Split(' ');
                phoneBook.Add(input[0], Convert.ToInt32(input[1]));
            }
            string s;
            while ((s = Console.ReadLine()) != null && s != "") {
                int outNumber;
                if (phoneBook.TryGetValue(s, out outNumber)) {
                    Console.WriteLine($"{s}={outNumber}");
                } else {
                    Console.WriteLine("Not found");
                }
            }
        }
    }
}
