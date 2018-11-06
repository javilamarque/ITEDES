using System;

namespace ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero romano: ");
				string number = Console.ReadLine();
				string respuesta = "";

				if (number.ToUpper() == "I")
				{
					respuesta = "1";
				}
				else if (number.ToUpper() == "V")
				{
					respuesta = "5";
				}
				else if (number.ToUpper() == "X")
				{
					respuesta = "10";
				}
				else if (number.ToUpper() == "L")
				{
					respuesta = "50";
				}
				else if (number.ToUpper() == "C")
				{
					respuesta = "100";
				}
				else if (number.ToUpper() == "D")
				{
					respuesta = "500";
				}
				else if (number.ToUpper() == "M")
				{
					respuesta = "1000";
				}
				else
				{
					respuesta = "Error numero romano no valido";
				}	
					Console.WriteLine(respuesta);
        }
    }
}
