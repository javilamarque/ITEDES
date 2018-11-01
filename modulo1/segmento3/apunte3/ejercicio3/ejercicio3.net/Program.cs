using System;

namespace ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un caracter cualquiera:");
			string caracter = Console.ReadLine();

			string opcion;

			if(caracter == "a" || caracter =="e" || caracter=="i" || caracter=="o" || caracter=="u")
			{
				opcion = "vocal";
			}else if (caracter=="b" ||caracter=="c" ||caracter=="d" ||caracter=="f" ||caracter=="g" ||caracter=="h" ||caracter=="j" ||caracter=="k" ||caracter=="l" ||caracter=="m" ||caracter=="n" ||caracter=="p" ||caracter=="q" ||caracter=="r" ||caracter=="s" ||caracter=="t" ||caracter=="v" ||caracter=="w" ||caracter=="x" ||caracter=="y" ||caracter=="z" ){
			opcion="consonante";

			}else if(caracter=="1" || caracter=="2" ||caracter=="3" ||caracter=="4" ||caracter=="5" ||caracter=="6" ||caracter=="7" ||caracter=="8" ||caracter=="9" ||caracter=="0" ){
			opcion="numero";

			}else{
				opcion="error";
			}
			Console.WriteLine(opcion);
        }
    }
}
