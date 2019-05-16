using System;

namespace ejercicio2.net
{
    class Program
    {
		
		public static string multiplo(int num1, int num2){
			string resultado="";

			if (num1%num2==0){
				resultado=num1 + " Es multiplo de: " + num2;
			}

			else if (num2%num1==0)
			{
				resultado=num2 + " Es multiplo de: " + num1;
			}
			else
			{
				resultado="No son multiplos";
			}
			return resultado;
		}






        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero: ");
			int num1 = int.Parse(Console.ReadLine());

			Console.WriteLine("Ingrese otro numero: ");
			int num2 = int.Parse(Console.ReadLine());

			Console.WriteLine(multiplo(num1,num2));
        }
    }
}
