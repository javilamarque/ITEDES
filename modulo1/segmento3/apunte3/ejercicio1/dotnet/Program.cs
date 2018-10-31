using System;

namespace ejercicio1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese un numero del 1 al 7 para ver su correspondiente dia: ");
					int numero = Int32.Parse(Console.ReadLine());
			
					if(numero == 1)
			{
				Console.WriteLine("Lunes");
			}
			else if(numero == 2)
			{
				Console.WriteLine("Martes");
			}	
			else if(numero == 3)
			{
				Console.WriteLine("Miercoles");
			}
			else if(numero == 4)
			{
				Console.WriteLine("Jueves");
			}
			else if(numero == 5)
			{
				Console.WriteLine("viernes");
			}
			else if(numero == 6)
			{
				Console.WriteLine("Sabado");
			}
			else if(numero == 7)
			{
				Console.WriteLine("Domingo");
			}
			else
			{
				Console.WriteLine("Usted no ingreso una opcion del 1 al 7 ");
			}
        }
    }
}
