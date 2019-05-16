using System;
using System.Collections;
using System.Collections.Generic;
namespace ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            List <int> lista1 = new List <int> ();
            
            for(int i=0;i<5;i++)
            {
                int num;
                Console.WriteLine("Ingrese 5 numeros para multiplicar por 2: ");
                num = int.Parse(Console.ReadLine()); 
                lista1.Add(num);
                
            }
            Console.WriteLine(lista1);
            ArrayList lista2 = new ArrayList();

           for(int i=0;i<5;i++)
            {
                lista2.Add((int) lista1[i]*2);
            }
            Console.WriteLine(lista2);
            
        }
    }
}
