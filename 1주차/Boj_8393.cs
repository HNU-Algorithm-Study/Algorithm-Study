using System;

class Program
{
    static void Boj_8393 (string[] args)
    {
        int n = int.Parse(Console.ReadLine());

        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += i;
        }

        Console.WriteLine(sum);
    }
}
