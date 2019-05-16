function validar(){
	
	num1 = parseInt(prompt("Ingrese un numero: "));
	num2 = parseInt(prompt("Ingrese un numero: "));
	num3 = parseInt(prompt("Ingrese un numero: "));
					
	if(num1>=num2 && num2>=num3){
		alert(`${num1} - ${num2} - ${num3}`);
		console.log("as");
	}else if(num2>=num3 && num3>=num1){
		alert(`${num2} - ${num3} - ${num1}`);
		console.log("asd2");
	}else if(num3>=num1 && num1>=num2){
		alert(`${num3} - ${num1} - ${num2}`);

	}else if(num1>=num3 && num3>=num2){
		alert(`${num1} - ${num3} - ${num2}`);
		console.log("asd");
	}else if(num2>=num1 && num1>=num3){
		alert(`${num2} - ${num1} - ${num3}`);
	}else{
		alert(`${num3} - ${num2} - ${num1}`);
	}
}
