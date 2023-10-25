using System;
using System.Collections.Generic;

class Program
{
    static void Boj_10866(string[] args)
    {
        int N = int.Parse(Console.ReadLine());
        Deque<int> deque = new Deque<int>();

        for (int i = 0; i < N; i++)
        {
            string[] command = Console.ReadLine().Split();

            if (command[0] == "push_front")
            {
                int X = int.Parse(command[1]);
                deque.PushFront(X);
            }
            else if (command[0] == "push_back")
            {
                int Y = int.Parse(command[1]);
                deque.PushBack(Y);
            }
            else if (command[0] == "pop_front")
            {
                if (!deque.IsEmpty())
                {
                    Console.WriteLine(deque.PopFront());
                }
                else
                {
                    Console.WriteLine(-1);
                }
            }
            else if (command[0] == "pop_back")
            {
                if (!deque.IsEmpty())
                {
                    Console.WriteLine(deque.PopBack());
                }
                else
                {
                    Console.WriteLine(-1);
                }
            }
            else if (command[0] == "size")
            {
                Console.WriteLine(deque.Size());
            }
            else if (command[0] == "empty")
            {
                Console.WriteLine(deque.IsEmpty() ? 1 : 0);
            }
            else if (command[0] == "front")
            {
                if (!deque.IsEmpty())
                {
                    Console.WriteLine(deque.Front());
                }
                else
                {
                    Console.WriteLine(-1);
                }
            }
            else if (command[0] == "back")
            {
                if (!deque.IsEmpty())
                {
                    Console.WriteLine(deque.Back());
                }
                else
                {
                    Console.WriteLine(-1);
                }
            }
        }
    }
}

class Deque<T>
{
    private LinkedList<T> list = new LinkedList<T>();

    public void PushFront(T item)
    {
        list.AddFirst(item);
    }

    public void PushBack(T item)
    {
        list.AddLast(item);
    }

    public T PopFront()
    {
        T item = list.First.Value;
        list.RemoveFirst();
        return item;
    }

    public T PopBack()
    {
        T item = list.Last.Value;
        list.RemoveLast();
        return item;
    }

    public int Size()
    {
        return list.Count;
    }

    public bool IsEmpty()
    {
        return list.Count == 0;
    }

    public T Front()
    {
        return list.First.Value;
    }

    public T Back()
    {
        return list.Last.Value;
    }
}
