package logicaDeProgramacion;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		
		String saludo = "Hola Generation";
		 System.out.println(saludo);
		 
		 StringBuffer resultado =  new StringBuffer(saludo); //La clase StringBuffer representa una secuencia mutable de caracteres. Se utiliza para crear cadenas mutables(modificables). La clase StringBuffer es la misma que la clase String excepto que es mutable, es decir, se puede cambiar.
		 
		 saludo = resultado.reverse().toString();//El metodo reverse retorna la cadena de caracteres invertida.
		 
		 System.out.println(saludo);
		
		
		
		
	} //Cierre main

} // Cierre class Ejercicio6




/* ## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:

- Input
  - Solicitar por consola una palabra o frase

- Output
  - Mostrar por consola el texto ingresado de forma invertida.

--- 

Input:
```
Hola Generation
```
Output:
``` 
noitareneG aloH
  */
 