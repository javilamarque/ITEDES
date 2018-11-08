using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            int result;

			int i;

			for(i=100; i>0; i--){
				result=i%2;
				if(result==0)
				{
					Console.WriteLine(i);
				}
			}
        }
    }
}
