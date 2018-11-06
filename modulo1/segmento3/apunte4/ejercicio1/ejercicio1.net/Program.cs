using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero para ver que dia es: ");
			int dia = int.Parse(Console.ReadLine());

			string resultado;

			switch (dia)
			{
				case 1:
					resultado="Lunes";
					break;

				case 2:
					resultado="Martes";
					break;

				case 3:
					resultado="Miercoles";
					break;

				case 4:
					resultado="Jueves";
					break;

				case 5:
					resultado="Viernes";
					break;

				case 6:
					resultado="Sabado";
					break;

				case 7:
					resultado="Domingo";
					break;

				default:
					resultado="Error";
					break;
				}

				Console.WriteLine("El dia es: " + resultado);


        }
    }
}
