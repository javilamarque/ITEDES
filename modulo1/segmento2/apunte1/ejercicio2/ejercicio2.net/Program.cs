using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
	
		Console.WriteLine("Cual es tu nombre: ");
		string name = Console.ReadLine();

		Console.WriteLine("Cual es tu apellido: ");
		string LastName = Console.ReadLine();

		Console.WriteLine("Cual es tu dni: ");
		string dni = Console.ReadLine();
		
		Console.WriteLine("Cual es tu direccion: ");
		string address = Console.ReadLine();

	
		Console.WriteLine("Cual es tu numero telefonico: ");
		string tel = Console.ReadLine();
		
		Console.WriteLine("Tu nombre es: " + name + " " + LastName + " Tu documento es: " +  dni + " Tu direccion es: " + address + " Y tu numero de telefono es: " + tel);

			
        }
    }
}
