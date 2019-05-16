function validar(){
	const romano = prompt('Ingrese una letra para saber el valor en romano: ');

		switch(romano){
			case'I':
				alert ('1');
				break;

			case'V':
				alert ('5');
				break;

			case'X':
				alert ('10');
				break;

			case'L':
				alert ('50');
				break;

			case'C':
				alert ('100');
				break;

			case'M':
				alert ('1000');
				break;

			default:
				alert ('Error usted no ingreso un numero romano correcto');
				break;


		}
}
