function validar(){

	let result=0;
	let text='';

	for(let i=0; i<=100; i++){
		result=result+i;
		text += `${result.toString()}<br>`;
	
	}
		document.getElementById('caracter').innerHTML=text;
}

