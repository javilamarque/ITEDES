using System;

namespace ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el primer numero para ordenarlos de manera inversa: ");
				int num1 = Convert.ToInt32(Console.ReadLine());

			Console.WriteLine("Ingrese el segundo numero para ordenarlos de manera inversa: ");
				int num2 = Convert.ToInt32(Console.ReadLine());

			Console.WriteLine("Ingrese el tercer numero para ordenarlos de manera inversa: ");
				int num3 = Convert.ToInt32(Console.ReadLine());

			Console.WriteLine("Ingrese el cuarto numero para ordenarlo de manera inversa: ");
				int num4 = Convert.ToInt32(Console.ReadLine());

			Console.WriteLine("Ingrese el quinto numero para ordenarlo de manera inversa: ");
				int num5 = Convert.ToInt32(Console.ReadLine());	

			Console.WriteLine("Los numeros ingresados de manera inversa quedan de la siguiente forma: " + num5 + " " + num4 + " " + num3 + " " + num2 + " " + num1);
        }
    }
}
