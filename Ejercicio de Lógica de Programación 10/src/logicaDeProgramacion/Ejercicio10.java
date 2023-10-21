package logicaDeProgramacion;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("sol", "sun");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        // Agrega aquí más palabras y traducciones

        // Escoger al azar 5 palabras en español
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        String[] palabrasSeleccionadas = seleccionarPalabrasAleatorias(palabrasEspanol, 5);

        // Inicializar el contador de respuestas correctas
        int respuestasCorrectas = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Juego de traducción Español-Inglés!");
        System.out.println("Ingresa la traducción al inglés de las siguientes palabras:");

        for (String palabra : palabrasSeleccionadas) {
            String traduccionCorrecta = diccionario.get(palabra);
            System.out.print("Traducción de '" + palabra + "': ");
            String traduccionUsuario = scanner.nextLine();

            if (traduccionUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta);
            }
        }

        // Mostrar resultados
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + (5 - respuestasCorrectas));
    }

    // Función para seleccionar palabras aleatorias del diccionario
    public static String[] seleccionarPalabrasAleatorias(String[] palabras, int cantidad) {
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            int indice = random.nextInt(palabras.length);
            palabrasSeleccionadas[i] = palabras[indice];
        }
        return palabrasSeleccionadas;
    }
}
