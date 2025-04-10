using System;

public class DisplayVowels
{
    public static void Main()
    {
        string str;
        int len;
        string vowelsInString = "";

        Console.WriteLine("\n\nDisplay vowels from a given string:");
        Console.Write("Input the string: ");
        str = Console.ReadLine();

        len = str.Length;

        for (int i = 0; i < len; i++)
        {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||
                str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U')
            {
                vowelsInString += str[i];
            }
        }

        if (vowelsInString.Length > 0)
        {
            Console.WriteLine("\nThe vowels in the string are: {0}", vowelsInString);
        }
        else
        {
            Console.WriteLine("\nNo vowels found in the string.");
        }

        Console.ReadLine();
    }
}
