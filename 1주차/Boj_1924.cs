using System;

class Program
{
    static void Boj_1924(string[] args)
    {
        string[] z = Console.ReadLine().Split(' ');
        int x = int.Parse(z[0]);
        int y = int.Parse(z[1]);
        string[] yoil = new string[7];
        yoil[1] = "MON";
        yoil[2] = "TUE";
        yoil[3] = "WED";
        yoil[4] = "THU";
        yoil[5] = "FRI";
        yoil[6] = "SAT";
        yoil[0] = "SUN";
        int h = y % 7;
        int k = 0;
        int i;
        if (x == 1)
            k = h;
        else if (x == 2)
            k = (h + 3) % 7;
        else if (x == 3)
            k = (h + 3) % 7;
        else if (x == 4)
            k = (h + 6) % 7;
        else if (x == 5)
            k = (h + 1) % 7;
        else if (x == 6)
            k = (h + 4) % 7;
        else if (x == 7)
            k = (h + 6) % 7;
        else if (x == 8)
            k = (h + 2) % 7;
        else if (x == 9)
            k = (h + 5) % 7;
        else if (x == 10)
            k = h;
        else if (x == 11)
            k = (h + 3) % 7;
        else if (x == 12)
            k = (h + 5) % 7;

        if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12)
        {

            for (i = 1; i <= 31; i++)
            {
                if (i == y && i % 7 == h)
                    Console.WriteLine(yoil[k]);
            }
        }
        else if (x == 4 || x == 6 || x == 9 || x == 11)
        {
            for (i = 1; i <= 30; i++)
            {
                if (i == y && i % 7 == h)
                    Console.WriteLine(yoil[k]);
            }
        }
        else if (x == 2)
        {
            for (i = 1; i <= 28; i++)
            {
                if (i == y && i % 7 == h)
                    Console.WriteLine(yoil[k]);
            }
        }
    }
}
