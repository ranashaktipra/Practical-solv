using System;

public class ArraySumCalculator
{
    public static void Main()
    {
        int[] a = new int[100];
        int i, n, sum = 0;

        Console.WriteLine("\nFind sum of all elements of array:");
        Console.Write("Input the number of elements to be stored in the array: ");
        n = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Input {0} elements in the array:", n);
        for (i = 0; i < n; i++)
        {
            Console.Write("element - {0}: ", i);
            a[i] = Convert.ToInt32(Console.ReadLine());
        }

        for (i = 0; i < n; i++)
        {
            sum += a[i];
        }

        Console.WriteLine("Sum of all elements stored in the array is: {0}\n", sum);
        Console.ReadLine();
    }
}