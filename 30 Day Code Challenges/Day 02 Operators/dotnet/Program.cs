using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            double mealCost = double.Parse(Console.ReadLine());
            int tipPercent = int.Parse(Console.ReadLine());
            int taxPercent = int.Parse(Console.ReadLine());

            double tip = mealCost * (tipPercent / 100.0);
            double tax = mealCost * (taxPercent / 100.0);
            double totalCost = Math.Round(mealCost + tip + tax, 0);

            Console.WriteLine($"The total meal cost is {totalCost} dollars.");
        }
    }
}
