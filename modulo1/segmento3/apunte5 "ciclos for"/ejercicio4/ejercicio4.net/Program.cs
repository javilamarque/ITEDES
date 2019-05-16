using System;

namespace ejercicio4.net
{
    class Program
	    {
		        static void Main(string[] args)
				        {
						    int bas;
								int altura;
								string linea;

								Console.WriteLine("Ingrese la base");
								bas= int.Parse(Console.ReadLine());

								Console.WriteLine("Ingrese la altura");
								altura= int.Parse(Console.ReadLine());

								for (int i=0;i<altura;i++)
								{
										linea="";
										for(int j=0;j<bas;j++)
										{
											linea+="x";
										}
										Console.WriteLine(linea);
								}
				        }
    }
}
