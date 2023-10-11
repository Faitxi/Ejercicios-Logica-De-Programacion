//Solicitar un numero por medio de un prompt
let numero = parseFloat(prompt("Ingrese un número para generar la secuencia:"));

//Secuencia de Fibonacci (sucesión infinita de números naturales cuyo dos primeros términos son 1 y 1 y tal que, cualquier otro término se obtiene sumando los dos numeros inmediatamente anteriores.)


//Funcion para generar la secuencia 
function generarFibonacci(n) {
    let fibonacci = [];
    if (n >= 1) {
        fibonacci.push(0);
    }
    if (n >= 2) {
        fibonacci.push(1);
    }

    for (let i = 2; i < n; i++) {
        let numSiguiente = fibonacci[i - 1] + fibonacci[i - 2];
        fibonacci.push(numSiguiente);
    }
    return fibonacci;
}

//Gererar la secuencia
let secuenciaFibonacci = generarFibonacci(numero);


//Imprimir el resultado
console.log(secuenciaFibonacci.join(", "));