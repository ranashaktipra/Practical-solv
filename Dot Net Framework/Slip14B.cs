using System;
class Person
{

    protected string Name;
    protected string Address;

    public Person(string name, string address)
    {
        Name = name;
        Address = address;
    }

    public void DisplayPersonDetails()
    {
        Console.WriteLine("Name: " + Name);
        Console.WriteLine("Address: " + Address);
    }
}

class Employee : Person
{
    private int Staffed;
    private double Salary;

    public Employee(string name, string address, int staffed, double salary)
        : base(name, address)
    {
        Staffed = staffed;
        Salary = salary;
    }

    public void DisplayEmployeeDetails()
    {
        DisplayPersonDetails();
        Console.WriteLine("Staffed: " + Staffed);
        Console.WriteLine("Salary: " + Salary);
    }
}

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter the number of employees:");
        int n = Convert.ToInt32(Console.ReadLine());

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("\nEnter details for Employee {i + 1}:");

            Console.WriteLine("Enter Name:");
            string name = Console.ReadLine();

            Console.WriteLine("Enter Address:");
            string address = Console.ReadLine();

            Console.WriteLine("Enter Number of Staffed (employees under this employee):");
            int staffed = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter Salary:");
            double salary = Convert.ToDouble(Console.ReadLine());

            employees[i] = new Employee(name, address, staffed, salary);
        }

        Console.WriteLine("\nDisplaying Employee Details:");
        for (int i = 0; i < n; i++)
        {
            employees[i].DisplayEmployeeDetails();
        }

        Console.ReadLine();
    }
}