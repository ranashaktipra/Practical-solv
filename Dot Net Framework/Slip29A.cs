using System;

public class Exercise3
{
    public static void Main()
    {
        string str;
        int l = 0;

        Console.Write("\n\nSeparate the individual characters from a string :\n");
        Console.Write("\n");
        Console.Write("Input the string: ");

        str = Console.ReadLine();
        Console.Write("The characters of the string are: ");

        while (l < str.Length)
        {
            Console.Write("{0} ", str[l]);
            l++;
        }
        Console.Write("\n\n");
        Console.ReadLine();
    }

}
