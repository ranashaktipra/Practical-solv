using System;
class funcexer11
{
    static void Main()
    {
        decimal f;
        Console.Write("\n\nRecursive Function : To find the factorial of a given number :\n");
        Console.Write("\n");
        Console.Write("Input a number : ");
        int num = Convert.ToInt32(Console.ReadLine());
        f = Factorial(num);
        Console.WriteLine("The factorial of {0}! is {1}", num, f);

        Console.ReadLine();  // Keeps the console window open until you press Enter
    }

    static decimal Factorial(int n1)
    {
        // The bottom of the recursion
        if (n1 == 0)
        {
            return 1;
        }
        // Recursive call: the method calls itself
        else
        {
            return n1 * Factorial(n1 - 1);
        }
    }
}
