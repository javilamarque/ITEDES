using System;

namespace ejercicio4.net
{
    class Program
    {
        public static bool tf(int num1 ){
			if((num1 % 2) == 0)
			{
			return true;
			
			}else
			{
			return false;
			}

		}
			
		
		
		
		static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero para saber si es par o impar: ");
			int num1 = int.Parse(Console.ReadLine());

			Console.WriteLine(tf(num1));
        }
    }
}
