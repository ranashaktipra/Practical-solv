using System;

public class SimpleCalculator
{
    public static void Main()
    {
        int num1, num2, opt;

        Console.WriteLine("A menu-driven program for a simple calculator:");

        Console.Write("Enter first integer: ");
        num1 = Convert.ToInt32(Console.ReadLine());

        Console.Write("Enter second integer: ");
        num2 = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("\nHere are the options:");
        Console.WriteLine("1 - Addition");
        Console.WriteLine("2 - Subtraction");
        Console.WriteLine("3 - Multiplication");
        Console.WriteLine("4 - Division");
        Console.WriteLine("5 - Exit");

        Console.Write("\nInput your choice: ");
        opt = Convert.ToInt32(Console.ReadLine());

        switch (opt)
        {
            case 1:
                Console.WriteLine("The addition of {0} and {1} is: {2}", num1, num2, num1 + num2);
                break;
            case 2:
                Console.WriteLine("The subtraction of {0} and {1} is: {2}", num1, num2, num1 - num2);
                break;
            case 3:
                Console.WriteLine("The multiplication of {0} and {1} is: {2}", num1, num2, num1 * num2);
                break;
            case 4:
                if (num2 == 0)
                {
                    Console.WriteLine("Error: Division by zero is not allowed.");
                }
                else
                {
                    Console.WriteLine("The division of {0} and {1} is: {2}", num1, num2, (double)num1 / num2);
                }
                break;
            case 5:
                Console.WriteLine("Exiting the program.");
                break;
            default:
                Console.WriteLine("Invalid input! Please enter a valid option.");
                break;
        }
        Console.ReadLine();
    }
}