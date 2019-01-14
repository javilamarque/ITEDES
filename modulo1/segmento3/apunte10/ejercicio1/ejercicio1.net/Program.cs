using System;
using Newtonsoft.Json;
using System.Collections.Generic;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> persona = new Dictionary<string, string>();
                persona.Add("Nombre", "Javier");
                persona.Add("Apellido", "Lamarque");
                persona.Add("DNI", "35997982");

                var personaJSON = JsonConvert.SerializeObject(persona);
                Console.WriteLine(personaJSON);
                List<string> frutas= new List<string>();
                frutas.Add("Uvas");
                frutas.Add("Manzana");
                frutas.Add("Peras");
                frutas.Add("Naranja");

                var frutasJSON = JsonConvert.SerializeObject(frutas);

                Console.WriteLine(frutasJSON);

        }
    }
}
