using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero para realizar la tabla de multiplicar: ");

			int num = int.Parse(Console.ReadLine());

			int result;

			for(int i=0; i<=10; i++)
			{
				result=num*i;
				Console.WriteLine(num+"x"+i+"="+result);
			}
        }
    }
}
