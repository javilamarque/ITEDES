function validar(){
	let base=0;
	let altura=0;
	let area=0;

	while(base<=0 || altura<=0){
		
		altura = parseInt(prompt('Ingrese la base superior a 0: '));
		base = parseInt(prompt('Ingrese la altura superior a 0: '));

	}

	area = base * altura;
	alert(`${area}`);
}
