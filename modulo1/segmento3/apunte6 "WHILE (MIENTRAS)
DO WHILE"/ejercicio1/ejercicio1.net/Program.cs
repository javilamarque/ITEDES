using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
		int seguir = 100;

		while (seguir <= 100)
			{
            Console.Write("Seguir hasta que presione 100 o mas: ");
			seguir = Int32.Parse(Console.ReadLine());
			}
        }
    }
}
