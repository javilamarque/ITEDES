using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero: ");
				int numero1 = int.Parse(Console.ReadLine());

			Console.WriteLine("Ingrese otro numero: ");
				int numero2 = int.Parse(Console.ReadLine());

			Console.WriteLine("Ingrese otro numero: ");
				int numero3 = int.Parse(Console.ReadLine());

			if(numero1>=numero2 && numero2>=numero3)
			{
				Console.WriteLine(numero1 + "-" + numero2 + "-" + numero3);
			}
			else if(numero2>=numero3 && numero3>=numero1)
			{
				Console.WriteLine(numero2 + "-" + numero3 + "-" + numero1);
			}
			else if(numero3>=numero1 && numero1>=numero2)
			{
				Console.WriteLine(numero3 + "-" + numero1 + "-" + numero2);
			}
			else if(numero1>=numero3 && numero3>=numero2)
			{
				Console.WriteLine(numero1 + "-" + numero3 + "-" + numero2);
			}
			else if(numero2>=numero1 && numero1>=numero3)
			{
				Console.WriteLine(numero2 + "-" + numero1 + "-" + numero3);
			}
			else
			{
				Console.WriteLine(numero3 + "-" + numero2 + "-" + numero1);
			}
        }
    }
}
