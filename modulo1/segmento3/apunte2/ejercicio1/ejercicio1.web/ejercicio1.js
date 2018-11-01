function validar(){
	numero1 = document.getElementById("numero1").value;
	
	resto = numero1%2;

	if(resto != 0){
		alert(`${numero1} no es multiplo de 2`);
	
	}else{
		alert(`${numero1} es multiplo de 2`);

	}
}


