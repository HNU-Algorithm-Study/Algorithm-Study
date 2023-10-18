using System;

class Program
{
    static void Boj_1152(string[] args)
    {
        string input = Console.ReadLine();
        string[] words = input.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
        int wordCount = words.Length;
        Console.WriteLine(wordCount);
    }
}

