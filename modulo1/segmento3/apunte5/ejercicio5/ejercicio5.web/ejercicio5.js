function validar(){
	let text='';
	for(let i=0; i<8;i++){
		for(let j=0; j<i-1;j++){
		text += 'x';
		}
		text += `<br>`;
	}
		document.getElementById('parrafo').innerHTML=text;
}
