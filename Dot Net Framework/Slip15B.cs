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
            Console.WriteLine("Enter the number of customers :");
            int n = Convert.ToInt32(Console.ReadLine());
            for (int i = 1; i <= n; i++)
            {
                Console.WriteLine("\nEnter details for Customer : ");

                Console.WriteLine("Enter Customer Number:");
                int customerNo = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Enter Customer Name:");
                string name = Console.ReadLine();

                Console.WriteLine("Enter Customer Address:");
                string address = Console.ReadLine();

                Console.WriteLine("Enter Item Number:");

                int itemNo = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Enter Quantity:");
                int quantity = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Enter Price per Item:");
                float price = Convert.ToInt32(Console.ReadLine());

                float totalPrice = quantity * price;

                Console.WriteLine("\nCustomer Details:");
                Console.WriteLine("Customer No:" + customerNo);
                Console.WriteLine("Name:" + name);
                Console.WriteLine("Address:" + address);
                Console.WriteLine("Item No:" + itemNo);
                Console.WriteLine("Quantity:" + quantity);
                Console.WriteLine("Price per Item:" + price);
                Console.WriteLine("Total Price for this Item:" + totalPrice);

                Console.WriteLine("\nTotal Price of All Items for Customer " + customerNo);
                Console.WriteLine("is " + totalPrice);
            }
            Console.ReadLine();
        }
    }
}