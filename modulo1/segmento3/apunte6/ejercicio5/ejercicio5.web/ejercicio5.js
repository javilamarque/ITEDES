function validar(){
	let num=1;
	let maximo=0;

	while(num!=0){

		num=parseInt(prompt('Ingrese numero para determinar cual es el mas grande, Ingrese 0 para detener: '));
		if(num>=maximo){
			maximo=num;
		}
	}

	alert(`El numero mas grande ingresado es: ${maximo}`);


}
