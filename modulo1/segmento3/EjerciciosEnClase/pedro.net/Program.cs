using System;

namespace pedro.net
{
    class Program
    {
        static void Main(string[] args)
        {
			Console.WriteLine("Cual es tu nombre: ");
			String name = Console.ReadLine();
			 
			if (name == "pedro")
			{
            Console.WriteLine("Hola Pedro");
			}
        }
    }
}
