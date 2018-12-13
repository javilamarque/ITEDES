seguir = 'si'

while seguir == 'si':
    num = int(input('Introdusca un numero para comenzar la operacion: '))
    operacion = input('Que operacion desea realizar? (+ SUMA, - RESTA, * MULTIPLICASION, / DIVISION, ^ POTENCIA): ')
    num2 = int(input('Introduzca otro numero para realizar la operacion seleccionada: '))
    potencia = num ** num2
    

    if operacion == '+':
        print(num + num2, ( 'Es el total de la suma'))
        
    elif operacion == '-':
        print(num - num2, ( 'Es el total de la resta'))
        
    elif operacion == '*':
        print(num * num2, ( 'Es el total de la multiplicacion'))
        
    elif operacion == '/':
            print(num / num2, ( 'Es el total de la division'))
        
    elif operacion == '^':
        print(potencia, (' Es el total de la potencia'))
        
    else:
        print('operacion no valida')
    seguir = input('Desea realizar otra operacion?, (si/no): ')

