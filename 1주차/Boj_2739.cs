using System;

class Program
{
    static void Boj_2739(string[] args)
    {
        // N을 입력 받음
        int N = int.Parse(Console.ReadLine());

        if (N >= 1 && N <= 9)
        {
            for (int i = 1; i <= 9; i++)
            {
                int result = N * i;
                Console.WriteLine($"{N} * {i} = {result}");
            }
        }
    }
}
