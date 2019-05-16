function validar(){
	
	usuario = document.getElementById("usuario").value;
	contrasena = document.getElementById("pass").value;

	if((usuario=="Juan" && contrasena=="1234") || (usuario=="Pedro" && contrasena=="5678")){
		alert(`Bienvenido ${usuario}`);
	}else{
		alert(`Usted no es un usuario registrado`);
		}
	}

