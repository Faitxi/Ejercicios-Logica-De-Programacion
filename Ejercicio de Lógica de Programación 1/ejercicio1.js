/* Input
Solicitar por prompt tres datos y guardarlos en sus respectivas variables. */
 

//Utilizamos parseFloat para analizar los elementos que ingresen en el prompt
let num1 = parseFloat(prompt("Ingrese el primer número:"));
let num2 = parseFloat(prompt("Ingrese el segundo número:"));
let num3 = parseFloat(prompt("Ingrese el tercer número:"));

//Comprobación si los números son iguales
if(num1 === num2 && num2 === num3){
    console.log("Los números son iguales: " + num1 + ", " + num2 + ", " + num3);
} else {
    //Se crea un array con los números
    let numeros = [num1, num2, num3];

    //Ordenamos los números de mayor a menor
    //Con el metodo sort, ordenamos los elementos del array
    let mayorAMenor = numeros.slice().sort(function (a, b){
        return b - a;
    });

//Ordenamos los números de menor a mayor
let menorAMayor = numeros.slice().sort(function (a, b){
    return a - b;
});


//Se muestran los resultados en la consola
console.log("Números de mayor a menor: " + mayorAMenor.join(", ")); //Utilizamos el metodo join para convertir todos los elementos del arrat en una cadena.
console.log("Números de menor a mayor: " + menorAMayor.join(", "));
}