package logicaDeProgramacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int minutosTotales = 0;
		final int TOTAL_MIN_DIA = 1440;
		final int TOTAL_MIN_VIERNES = 900;

		List<String> diasSemana = new ArrayList<>(); // Instanciacion polimorfica
		// List = interface / las interfaces no se pueden instanciar
		// ArrayList = clase
		diasSemana.add("Lunes");
		diasSemana.add("Martes");
		diasSemana.add("Miercoles");
		diasSemana.add("Jueves");
		diasSemana.add("Viernes");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un día de la semana (Lunes - Viernes)");
		String dia = scanner.nextLine();

		System.out.println("Ingrese la hora con minutos");
		String horaMinuto = scanner.nextLine();

		System.out.println("Input: " + dia + ", " + horaMinuto + " hrs");

		// 15:30
		// ["15", "30]
		int horas = Integer.parseInt(horaMinuto.split(":")[0]);// Regex es un patron para un string.
		int horasAMinutos = horas * 60;
		int minutos = Integer.parseInt(horaMinuto.split(":")[1]);

		// Para saber el tamaño de un array es con .lenght y para saber el tamaño de una
		// lista es con .size()
		for (int i = diasSemana.indexOf(dia); i < diasSemana.size(); i++) {
			if (diasSemana.get(i).equals(dia)) {
				minutosTotales += TOTAL_MIN_DIA - horasAMinutos - minutos;
			} else if (diasSemana.get(i).equals("Viernes")) {
				minutosTotales += TOTAL_MIN_VIERNES;
			} else {
				minutosTotales += TOTAL_MIN_DIA;

			}

		} // Cierre For
		System.out.println("Faltan " + minutosTotales + " minutos para el fin de semana.");

	}// Cierre main

}// Cierre class Ejercicio7

/*
 * ## Instrucciones
 * 
 * - Crear un programa en `Java` que realice lo siguiente: - Input - Solicitar
 * al usuario un dia de la semana (Lunes - Viernes) - Solicitar al usuario una
 * hora (horas y minutos) - Calcular cuántos minutos faltan para el fin de
 * semana. - Considerando el inicio para el fin de semana **Viernes a las 15:00
 * hrs** - Output - Mostrar el resultado por un mensaje en consola.
 * 
 * ---
 * 
 * Input: Lunes, 14:30 hrs ``` Java lunes 14 30 ```
 * 
 * Output: ```Java "Faltan 5730 minutos para el fin de semana" ``` -> El resultado correcto de los minutos restantes es 5790.
 */
