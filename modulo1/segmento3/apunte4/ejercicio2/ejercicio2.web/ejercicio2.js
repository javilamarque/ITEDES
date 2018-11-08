function validar(){
	const caracter = prompt('Ingrese un caracter para determinar si es vocal, consonante o un numero: ');
				
		switch (caracter){
			case'1':
			case'2':
			case'3':
			case'4':
			case'5':
			case'6':
			case'7':
			case'8':
			case'9':
			case'0':

				alert ('Es Numero');
			 	break;

			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				alert('Es una Vocal');
				break;

			case'b':
			case'c':
			case'd':
			case'f':
			case'g':
			case'h':
			case'j':
			case'k':
			case'l':
			case'm':
			case'n':
			case'p':
			case'q':
			case'r':
			case's':
			case't':
			case'v':
			case'w':
			case'x':
			case'y':
			case'z':
				alert('Es una Consonante');
				break;
			
			default:
				alert('Error, UD ingreso un symbolo');
				break;
		}
			
			
}




