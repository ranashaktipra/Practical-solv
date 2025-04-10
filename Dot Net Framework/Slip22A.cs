using System;

public class ValueSwapper
{
    public static void Interchange(ref int num1, ref int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void Main()
    {
        int n1, n2;

        Console.WriteLine("\nFunction: To swap the values of two integer numbers:");

        Console.Write("Enter a number: ");
        n1 = Convert.ToInt32(Console.ReadLine());

        Console.Write("Enter another number: ");
        n2 = Convert.ToInt32(Console.ReadLine());

        Interchange(ref n1, ref n2);

        Console.WriteLine("Now the 1st number is: {0}, and the 2nd number is: {1}\n", n1, n2);
        Console.ReadLine();
    }
}