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
            int num = 100;           // Integer data type
            string str = num.ToString();  // Integer to String conversion
            Console.WriteLine("Integer to String: " + str);

            string strNum = "200";
            int convertedNum = int.Parse(strNum);  // String to Integer conversion
            Console.WriteLine("String to Integer: " + convertedNum);
            Console.ReadLine();
        }
    }
}
