using System;

class Program
{
    static void Boj_10818(string[] args)
    {
        int N = int.Parse(Console.ReadLine());
        string[] input = Console.ReadLine().Split();

        int min = int.MaxValue; // 최솟값 초기값 설정
        int max = int.MinValue; // 최댓값 초기값 설정

        for (int i = 0; i < N; i++)
        {
            int num = int.Parse(input[i]);

            if (num < min)
            {
                min = num; // 현재 숫자가 최솟값보다 작으면 갱신
            }

            if (num > max)
            {
                max = num; // 현재 숫자가 최댓값보다 크면 갱신
            }
        }

        Console.WriteLine($"{min} {max}");
    }
}
