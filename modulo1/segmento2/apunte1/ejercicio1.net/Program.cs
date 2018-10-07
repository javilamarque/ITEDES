using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("¿Cual es el barrio de tu comisaria?: ");
			string location = Console.ReadLine();

			Console.Write("Cual es la direccion de la comisaria?: ");
			string address = Console.ReadLine();

			Console.Write("Cual es la primer entre calle?: ");
			string street1 = Console.ReadLine();

			Console.Write("Cual es el nombre de la segunda calle?: ");
			string street2 = Console.ReadLine();

			Console.WriteLine("La comisaria mas cercana esta en la calle: " + address + " Entre la calle: " + street1 + " Y la calle: " + street2 + " Ubicado en el barrio de: " + location);
        }
    }
}
