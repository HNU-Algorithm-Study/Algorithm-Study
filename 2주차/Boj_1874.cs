using System;
using System.Collections.Generic;

class Program
{
    static void Boj_1874(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++)
        {
            sequence[i] = int.Parse(Console.ReadLine());
        }

        List<string> operations = FindOperations(sequence);

        if (operations == null)
        {
            Console.WriteLine("NO");
        }
        else
        {
            foreach (string operation in operations)
            {
                Console.WriteLine(operation);
            }
        }
    }

    static List<string> FindOperations(int[] sequence)
    {
        List<string> operations = new List<string>();
        Stack<int> stack = new Stack<int>();
        int currentNumber = 1;

        foreach (int num in sequence)
        {
            while (currentNumber <= num)
            {
                stack.Push(currentNumber);
                operations.Add("+");
                currentNumber++;
            }

            if (stack.Peek() == num)
            {
                stack.Pop();
                operations.Add("-");
            }
            else
            {
                return null; // 수열을 만들 수 없는 경우
            }
        }

        return operations;
    }
}
