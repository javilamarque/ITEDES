function datos(){

		const nombre = prompt ('Ingrese su nombre: ');
		alert(`Hola: ${nombre}`);

		const apellido = prompt ('Ingrese su apellido: ');
		alert(`Tu apellido es: ${apellido}`);

		const dni = prompt ('Ingrese su numero de documento: ');
		alert(`Su numero de documento es: ${dni}`);

		const direccion = prompt ('Ingrese su domicilio: ');
		alert(`Su direccion es:  ${direccion}`);

		const telefono = prompt ('Ingrese su numero telefonico');
		alert(`Su numero de telefono es: ${telefono}`);

		alert('Su nombre y apellido es: ' + nombre + ' ' + apellido + ' Su numero de documento es: ' + dni + ' Su direccion es: ' + direccion + ' Y su numero telefonico es: ' + telefono); 

}
