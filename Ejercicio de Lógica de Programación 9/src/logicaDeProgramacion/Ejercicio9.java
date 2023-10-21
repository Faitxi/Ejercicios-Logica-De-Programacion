package logicaDeProgramacion;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("sol", "sun");
        // Agrega aquí más palabras y traducciones

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español: ");
        String palabraEspañol = scanner.nextLine();

        // Buscar la traducción en el diccionario
        if (diccionario.containsKey(palabraEspañol)) {
            String traduccion = diccionario.get(palabraEspañol);
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }
    }
}
