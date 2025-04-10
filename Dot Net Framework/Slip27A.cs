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
            String str;
            Console.Write("Enter a string ");
            str = Console.ReadLine();
            int n = str.Length;
            Console.Write("Length of string: {0}", n);
            Console.ReadLine();
        }
    }
}
