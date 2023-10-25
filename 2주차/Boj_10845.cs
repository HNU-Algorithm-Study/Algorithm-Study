using System;

class Program
{
    static void Boj_10845(string[] args)
    {
        int N = int.Parse(Console.ReadLine());
        int[] queue = new int[10000];
        int front = 0; // 큐의 앞부분 인덱스
        int rear = -1; // 큐의 뒷부분 인덱스

        for (int i = 0; i < N; i++)
        {
            string[] command = Console.ReadLine().Split();

            switch (command[0])
            {
                case "push":
                    int X = int.Parse(command[1]);
                    Enqueue(queue, ref rear, X);
                    break;

                case "pop":
                    if (front <= rear)
                    {
                        Console.WriteLine(Dequeue(queue, ref front));
                    }
                    else
                    {
                        Console.WriteLine(-1);
                    }
                    break;

                case "size":
                    Console.WriteLine(rear - front + 1);
                    break;

                case "empty":
                    if (front > rear)
                    {
                        Console.WriteLine(1);
                    }
                    else
                    {
                        Console.WriteLine(0);
                    }
                    break;

                case "front":
                    if (front <= rear)
                    {
                        Console.WriteLine(queue[front]);
                    }
                    else
                    {
                        Console.WriteLine(-1);
                    }
                    break;

                case "back":
                    if (front <= rear)
                    {
                        Console.WriteLine(queue[rear]);
                    }
                    else
                    {
                        Console.WriteLine(-1);
                    }
                    break;
            }
        }
    }

    static void Enqueue(int[] queue, ref int rear, int value)
    {
        queue[++rear] = value;
    }

    static int Dequeue(int[] queue, ref int front)
    {
        return queue[front++];
    }
}
