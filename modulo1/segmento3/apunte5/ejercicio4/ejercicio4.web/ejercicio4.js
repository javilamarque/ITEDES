function validar(){
	
	let base = parseInt(prompt('Ingrese la base: '));
	let altura = parseInt(prompt('Ingrese la altura: '));
	let text='';
	for(let i=0; i<altura; i++){
		text +=	`<br>`;
		for(let j=0; j<base; j++){
		text += `x`;

		}
	}

	document.getElementById('parrafo').innerHTML=text;



}
