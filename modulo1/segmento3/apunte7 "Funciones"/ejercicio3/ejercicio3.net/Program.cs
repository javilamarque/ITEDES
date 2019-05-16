using System;

namespace ejercicio3.net
{
    class Program
    {
		public static string mayor(int num1, int num2, int num3){
				string resultado ="";

				if (num1==num2 && num1==num3){
					resultado="Los tres numero son iguales: ";
				}
				else if (num1>num2 && num1>num3)
				{
					resultado=num1 + " Es el mayor";
				}
				else if (num2>num1 && num2>num3)
				{
					resultado=num2 + " Es el mayor";
				}
				else
				{
					resultado=num3 + " Es el mayor";
				}
				return resultado;
		}


        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero: ");
			int num1 = int.Parse(Console.ReadLine());

			Console.WriteLine("Ingrese otro numero: ");
			int num2 = int.Parse(Console.ReadLine());

			Console.WriteLine("Ingrese otro numero: ");
			int num3 = int.Parse(Console.ReadLine());

			Console.WriteLine(mayor(num1, num2, num3));
        }
    }
}
