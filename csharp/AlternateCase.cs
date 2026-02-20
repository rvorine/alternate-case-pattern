using System;
using System.Text;

class AlternateCase
{
    static string ToAlternateCase(string input)
    {
        bool makeUpper = true;
        StringBuilder result = new StringBuilder();
        foreach (char ch in input)
        {
            if (char.IsLetter(ch))
            {
                result.Append(makeUpper ? char.ToUpper(ch) : char.ToLower(ch));
                makeUpper = !makeUpper;
            }
            else
            {
                result.Append(ch);
            }
        }
        return result.ToString();
    }

    static void Main()
    {
        Console.WriteLine(ToAlternateCase("instagram"));   // InStAgRaM
        Console.WriteLine(ToAlternateCase("hello world")); // HeLlO wOrLd
        Console.WriteLine(ToAlternateCase("abc123def"));   // AbC123DeF
    }
}
