using System;
namespace DepartmentClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Sales salesDepartment = new Sales();
            salesDepartment.GetSalesEmployee();
            HumanResource hrDepartment = new HumanResource();
            hrDepartment.GetHREmployee();
            salesDepartment.Print();
            hrDepartment.Print();

            Console.ReadLine();  // Keeps the console window open until you press Enter
        }
    }

    class Department
    {
        protected string head; // Declare as an instance variable
        public void GetDepartmentHead()
        {
            Console.WriteLine("Enter The Department Head");
            head = Console.ReadLine();
        }
    }

    class Sales : Department
    {
        private int employees;
        public void GetSalesEmployee()
        {
            Console.WriteLine("Enter number of Employees in the Sales Department ::");
            employees = int.Parse(Console.ReadLine());
            GetDepartmentHead();
        }
        public void Print()
        {
            Console.WriteLine("Details of Sales Department :: ");
            Console.WriteLine(" Head of Sales Department :: {0}", head);
            Console.WriteLine(" Total Employees in the Sales Department:: {0} \n\n", employees);
        }
    }

    class HumanResource : Department
    {
        private int employees;
        public void GetHREmployee()
        {
            Console.WriteLine("Enter number of Employees in the Human Resource Department ::");
            employees = int.Parse(Console.ReadLine());
            GetDepartmentHead();
        }
        public void Print()
        {
            Console.WriteLine("Details of HR Department :: \n\n");
            Console.WriteLine(" Head of HR Department :: {0}", head);
            Console.WriteLine(" Total Employees in the HR Department:: {0} \n\n", employees);
        }
    }
}
