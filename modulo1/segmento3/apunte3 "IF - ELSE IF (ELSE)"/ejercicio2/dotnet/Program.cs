using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero del 1 al 7 para descubrir el dia correspondiente: ");
			int numero = Int32.Parse(Console.ReadLine());

			switch(numero)
			{
				case 1:
					Console.WriteLine("Lunes");
					break;

				case 2:
					Console.WriteLine("Martes");
					break;

				case 3:
					Console.WriteLine("Miercoles");
					break;

				case 4:
					Console.WriteLine("Jueves");
					break;

				case 5:
					Console.WriteLine("Viernes");
					break;

				case 6:
					Console.WriteLine("Sabado");
					break;

				case 7:
					Console.WriteLine("Domingo");
					break;

			default:
					Console.WriteLine("Usted Ingreso un numero incorrecto del 1 al 7");
					break;
			}
        }
    }
}
