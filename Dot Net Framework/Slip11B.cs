using System;

class Fruit
{
    protected int totalFruits;

    // Constructor to initialize the total number of fruits
    public Fruit(int total)
    {
        totalFruits = total;
    }

    // Method to display the total number of fruits
    public void DisplayTotalFruits()
    {
        Console.WriteLine("Total Fruits in the Basket: " + totalFruits);
    }
}

class Apples : Fruit
{
    // Constructor to initialize the number of apples
    public Apples(int apples)
        : base(apples)
    {
    }

    // Method to display the number of apples
    public void DisplayApples()
    {
        Console.WriteLine("Number of Apples in the Basket: " + totalFruits);
    }
}

class Mangoes : Fruit
{
    // Constructor to initialize the number of mangoes
    public Mangoes(int mangoes)
        : base(mangoes)
    {
    }

    // Method to display the number of mangoes
    public void DisplayMangoes()
    {
        Console.WriteLine("Number of Mangoes in the Basket: " + totalFruits);
    }
}

class Program
{
    static void Main(string[] args)
    {
        // Accept the number of apples and mangoes
        Console.Write("Enter the number of Apples in the Basket: ");
        int applesCount = Convert.ToInt32(Console.ReadLine());

        Console.Write("Enter the number of Mangoes in the Basket: ");
        int mangoesCount = Convert.ToInt32(Console.ReadLine());

        // Create objects of Apples and Mangoes classes
        Apples apples = new Apples(applesCount);
        Mangoes mangoes = new Mangoes(mangoesCount);

        // Display the number of apples and mangoes
        apples.DisplayApples();
        mangoes.DisplayMangoes();

        // Calculate the total number of fruits in the basket
        int totalFruits = applesCount + mangoesCount;

        Console.WriteLine("\nTotal Number of Fruits in the Basket: " + totalFruits);

        Console.ReadLine();
    }
}
