using System;
using System.Collections.Generic;
using System.IO;


namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 4;
            double d = 4.0;
            string s = "HackerRank ";

            int eye;
            double dub;
            string str;

            eye = int.Parse(Console.ReadLine());
            dub = double.Parse(Console.ReadLine());
            str = Console.ReadLine();

            Console.WriteLine("{0:0}", i + eye);
            Console.WriteLine("{0:0.0}", d + dub);
            Console.WriteLine($"{s + str}");
        }
    }
}
