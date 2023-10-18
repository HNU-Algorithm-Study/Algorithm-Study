using System;

class Program
{
    static void Boj_11721(string[] args)
    {
        string word = Console.ReadLine();

        int length = word.Length;

        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < 10 && (i + j) < length; j++)
            {
                Console.Write(word[i + j]);
            }
            Console.WriteLine();

            // 다음 10개 출력을 위해 i를 10 증가
            i += 9;
        }
    }
}