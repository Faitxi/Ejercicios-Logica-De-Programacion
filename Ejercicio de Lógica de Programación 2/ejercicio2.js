//Prompt para solicitar la temperatura en grados Celsius
let temperaturaC = parseFloat(prompt("Favor de ingresar la temperatura en grados Celsius: "));

//Convertir la temperatura a grados Fahrenheit
let temperaturaF = (temperaturaC * 9/5) + 32;

//Convertir la temperatura a grados Kelvin
let temperaturaK = temperaturaC + 273.15;


//Mostrar las conversiones en consola
console.log("Grados Fahrenheit: " + temperaturaF);
console.log("Grados Kelvin: " + temperaturaK);
