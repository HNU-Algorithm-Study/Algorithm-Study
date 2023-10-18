using System;

class Program
{
    static void Boj_11720(string[] args)
    {
        int N = int.Parse(Console.ReadLine());        //N 입력받음
        string input = Console.ReadLine();            //입력받은 것 문자열로 나타냄
        int sum = 0;

        for (int i = N; i >= 1; i--)
        {
            int digit = int.Parse(input[i].ToString());      //자릿수를 정수로 변환하고 변수에 저장
            sum += digit;                                    //for 반복문이 해당하는 동안 반복함
        }

        Console.WriteLine(sum);
    }
}
