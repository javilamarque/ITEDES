using System;

namespace ejercicio5.net
{
    class Program
    {
        public static int cubo(int num){
            int resultado = num*num*num;
            return resultado;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero para elevarlo al cubo: ");
            int num = int.Parse(Console.ReadLine());

            Console.WriteLine(cubo(num));
        }
    }
}
