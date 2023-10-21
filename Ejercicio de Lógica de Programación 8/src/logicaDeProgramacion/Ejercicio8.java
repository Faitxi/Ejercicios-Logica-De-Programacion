package logicaDeProgramacion;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int primoCount = 0;
        int noPrimoCount = 0;

        // Solicitar al usuario 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Identificar números primos y no primos
        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i])) {
                primos[primoCount] = numeros[i];
                primoCount++;
            } else {
                noPrimos[noPrimoCount] = numeros[i];
                noPrimoCount++;
            }
        }

        // Mostrar los números primos
        System.out.println("Números primos al inicio:");
        for (int i = 0; i < primoCount; i++) {
            System.out.println("pos[" + i + "] = " + primos[i]);
        }

        // Mostrar los números no primos
        System.out.println("Números no primos:");
        for (int i = 0; i < noPrimoCount; i++) {
            System.out.println("pos[" + (i + primoCount) + "] = " + noPrimos[i]);
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

