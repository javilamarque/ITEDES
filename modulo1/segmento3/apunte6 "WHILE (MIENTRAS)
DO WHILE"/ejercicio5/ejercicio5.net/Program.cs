using System;

namespace ejercicio5.net
{
    class Program
    {
        static void Main(string[] args)
        {
			int num=1;
			int maximo=0;
			while(num!=0)
			{
            Console.WriteLine("Ingrese numeros, se mostrara en pantalla el numero mas grande, ingrese 0 para finalizar: ");
			num = int.Parse(Console.ReadLine());
			if (num>=maximo)
			{
				maximo=num;
			}
        	}
            
		}
    }
}
