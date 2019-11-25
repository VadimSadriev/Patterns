using Singleton.models;
using System;

namespace Singleton
{
    class Program
    {
        static void Main(string[] args)
        {
            var computer = new Computer();

            computer.Launch("windows 10");

            Console.WriteLine(computer.OS.Name);

            computer.Launch("debian");

            Console.WriteLine(computer.OS.Name);

            Console.ReadLine();
        }
    }
}
