function saludar(){
	const barrio = prompt('Cual es el barrio de la comisaria mas cercana');
		alert(`El barrio de la comisaria esta en:  ${barrio}`);
	
	const direccion = prompt ('Cual es la direccion');
		alert(`En la calle:  ${direccion}`);

	const calle1 = prompt ('Esta entre la calle:');
		alert(`Entre la calle:  ${calle1}`);

	const calle2 = prompt ('Y la calle ');
		alert(`Y la calle: ${calle2}`);

		alert('la comisaria esta en la calle: ' + direccion + ' entre la calle: ' + calle1 + ' y la calle: ' + calle2 + ' en el barrio de: ' + barrio);
}
