//Solicitar un numero por medio de un prompt
let num = parseFloat(prompt("Ingrese un número:"));


// Funcion para calcular Factorial del numero recibido 
function calcularFactorial(num){
    if (num === 0  || num ===1){
        return 1;
    } else {
        return num * calcularFactorial(num -1);
    }
}


//Calcular el factorial
let factorial = calcularFactorial(num);

//Mostrar el resultado en consola

console.log("El factorial de " + num + " es: " + factorial);