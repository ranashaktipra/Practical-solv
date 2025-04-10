using System;

class Supplier
{

    int Sid;
    string Name;
    string Address;
    int Pincode;

    public Supplier(int sid, string name, string address, int pincode)
    {
        Sid = sid;
        Name = name;
        Address = address;
        Pincode = pincode;
    }

    public void DisplaySupplierDetails()
    {
        Console.WriteLine("\nSupplier Details:");
        Console.WriteLine("Supplier ID:" + Sid);
        Console.WriteLine("Name:" + Name);
        Console.WriteLine("Address:" + Address);
        Console.WriteLine("Pincode:" + Pincode);
    }
}

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter the number of suppliers:");
        int n = Convert.ToInt32(Console.ReadLine());

        Supplier[] suppliers = new Supplier[n];

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("\nEnter details for Supplier {i + 1}:");

            Console.WriteLine("Enter Supplier ID:");
            int sid = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter Supplier Name:");
            string name = Console.ReadLine();

            Console.WriteLine("Enter Supplier Address:");
            string address = Console.ReadLine();

            Console.WriteLine("Enter Supplier Pincode:");
            int pincode = Convert.ToInt32(Console.ReadLine());

            suppliers[i] = new Supplier(sid, name, address, pincode);
        }

        Console.WriteLine("\nDisplaying Supplier Details:");
        for (int i = 0; i < n; i++)
        {
            suppliers[i].DisplaySupplierDetails();
        }

        Console.ReadLine();
    }
}