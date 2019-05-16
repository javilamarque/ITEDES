using System;

namespace ejercicio6.net
{
    class Program
    {
        public static int sumar(int num1, int num2){
            int resultado = 0;
            resultado = num1 + num2;
            return resultado;
        }

        public static int restar(int n1, int n2){
            int resultado = 0;
            resultado = n1 - n2;
            return resultado;
        }

        public static int multiplicar(int m1, int m2){
            int resultado = 0;
            resultado = m1 * m2;
            return resultado;
        }

        public static int dividir(int d1, int d2){
            int resultado = 0;
            resultado = d1 / d2;
            return resultado;
        }

        public static int pow(int b1, int e1){
            int resultado = b1;
            
            for(int i = 1; i < e1; i++)
            resultado*=b1;
            
            return resultado;
        }


        static void Main(string[] args)
        {
            int resultado;
            string opcion;
            bool op = true;
            
            while(op){
                Console.WriteLine();
                Console.WriteLine("1- Sumar");
                Console.WriteLine("2- Restar");
                Console.WriteLine("3- Multiplicar");
                Console.WriteLine("4- Dividir");
                Console.WriteLine("5- Potenciar");
                Console.WriteLine("6- Salir");
                Console.WriteLine();
                Console.WriteLine("Ingrese la opcion deseada");
                opcion = Console.ReadLine();
               

            if(opcion=="6")
            {
                Console.WriteLine("finalizo....................");
                break;
            }else{
                switch (opcion)
                {
                    case "1":
                        Console.Write("Ingrese un numero para la suma: ");
                        int num1 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        Console.Write("Ingrese otro numero para la suma: ");
                        int num2 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        resultado = sumar(num1, num2);
                        Console.WriteLine("El resultado de la suma es: " + resultado);
                        break;

                    case "2":
                        Console.Write("Ingrese un numero para la resta: ");
                        int n1 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        Console.Write("Ingrese otro numero para la resta: ");
                        int n2 = int.Parse(Console.ReadLine());
                        Console.WriteLine();
                        resultado = restar(n1, n2);
                        Console.WriteLine("El resultado de la resta es: " + resultado);
                        break;

                    case "3":
                        Console.Write("Ingrese un numero para la multiplicacion: ");
                        int m1 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        Console.Write("Ingrese otro numero para la multiplicacion: ");
                        int m2 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        resultado = multiplicar(m1, m2);
                        Console.WriteLine("El resultado de la multiplicacion es: " + resultado);
                        break;
                    
                    case "4":
                        Console.Write("Ingrese un numero para la division: ");
                        int d1 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        Console.Write("Ingrese otro numero para la division: ");
                        int d2 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        resultado = dividir(d1, d2);
                        Console.WriteLine("El resultado de la division es: " + resultado);
                        break;

                    case "5":
                        Console.Write("Ingrese la base de la potencia: ");
                        int b1 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        Console.Write("Ingrese el exponente de la potencia: ");
                        int e1 = int.Parse(Console.ReadLine());
                        Console.WriteLine();

                        resultado = pow(b1, e1);
                        Console.WriteLine("El resultado de la potencia es: " + resultado);
                        break;
                }
                           
                
            }
        }
    }    
}
}

