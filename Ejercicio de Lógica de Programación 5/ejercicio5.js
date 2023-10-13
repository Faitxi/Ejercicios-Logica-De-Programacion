//Generar un número secreto aleatorio entre 1 y 100.
let numeroSecreto = 26;
let intentos = [];


function adivinaNumero() {
    //Solicitar un numero por medio de un prompt
    let numeroIngresado = parseFloat(prompt("Ingrese un numero del 1 al 100 para adivinar el numero secreto:"));

    //Convertir el input del usuario a un número 
    let numeroUsuario = parseInt(numeroIngresado);

    //Verificar si el numero es válido
    if (isNaN(numeroUsuario) || numeroUsuario < 1 || numeroUsuario > 100) {
        alert("Por favor, ingresa un número válido del 1 al 100");
    } else {
        //Agregar el número ingresado a la lista de intentos
        intentos.push(numeroUsuario);

        //Comprobar si el numero es el numero secreto
        if (numeroUsuario === numeroSecreto) {
            alert("¡Felicidades, adivinaste el número secreto!");
            console.log("Intentos realizados: " + intentos.join(", "));
        } else {
            alert("Ups, el número secreto es incorrecto, vuelve a interntarlo.");
            adivinaNumero(); //Volver a solicitar número
        }


    }

}


adivinaNumero();