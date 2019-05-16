using System;

namespace ejercicio1.net
{
    class Program
    {
        public static int dividible(int num)
        {
			int quantity=0;

			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				{
					quantity+=1;
				}
			}
			return quantity;	
		}
		static void Main(String[] args)
		{
			int quantyDivido;

            		Console.WriteLine("Ingrese un numero para saber cuantas veces se puede dividir: ");
					int number=int.Parse(Console.ReadLine());

					quantyDivido=dividible(number);

					Console.WriteLine("La cantidad de veces que se puede dividir es: " + quantyDivido);
        }
    }
}
