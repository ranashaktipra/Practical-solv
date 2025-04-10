using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter rows of first matrix: ");
            int r1 = int.Parse(Console.ReadLine());
            Console.Write("Enter columns of first matrix / rows of second matrix: ");
            int c1 = int.Parse(Console.ReadLine());
            Console.Write("Enter columns of second matrix: ");
            int c2 = int.Parse(Console.ReadLine());

            int[,] A = new int[r1, c1];
            int[,] B = new int[c1, c2];
            int[,] C = new int[r1, c2];

            Console.WriteLine("Enter elements of first matrix:");
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c1; j++)
                    A[i, j] = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter elements of second matrix:");
            for (int i = 0; i < c1; i++)
                for (int j = 0; j < c2; j++)
                    B[i, j] = int.Parse(Console.ReadLine());

            // Matrix Multiplication
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c2; j++)
                    for (int k = 0; k < c1; k++)
                        C[i, j] += A[i, k] * B[k, j];

            Console.WriteLine("Resultant Matrix:");
            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c2; j++)
                    Console.Write(C[i, j] + " ");
                Console.WriteLine();
            }
            Console.ReadLine();
        }
    }
}