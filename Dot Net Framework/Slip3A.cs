using System;
public class funcexer3
{
    public static int Sum(int num1, int num2)
    {
        int total;
        total = num1 + num2;
        return total;
    }

    public static void Main()
    {
        Console.Write("\n\nFunction to calculate the sum of two numbers :\n");
        Console.Write("\n");
        Console.Write("Enter a number: ");
        int n1 = Convert.ToInt32(Console.ReadLine());
        Console.Write("Enter another number: ");
        int n2 = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("\nThe sum of two numbers is : {0} \n", Sum(n1, n2));

        Console.ReadLine();  // Keeps the console window open until you press Enter
    }
}
