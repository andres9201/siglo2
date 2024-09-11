package siglo;

import java.util.Scanner;

public class siglo2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int anho = solicitarAnho(sc);
            int siglo = obtenerSiglo(anho);
            int primerAnhoSiglo = calcularPrimerAnho(siglo);
            
            System.out.printf("El año %d pertenece al siglo %d.%n", anho, siglo);
            System.out.printf("El primer año del siglo %d es %d.%n", siglo, primerAnhoSiglo);
        }
    }

    // Método para solicitar un año positivo al usuario
    private static int solicitarAnho(Scanner sc) {
        int anho;
        do {
            System.out.print("Ingrese un número de año (debe ser un valor positivo): ");
            anho = sc.nextInt();
            if (anho <= 0) {
                System.out.println("Error: Ingrese un valor positivo.");
            }
        } while (anho <= 0);
        return anho;
    }

    // Método para calcular el siglo
    private static int obtenerSiglo(int anho) {
        return (anho + 99) / 100;  // Fórmula simplificada
    }

    // Método para calcular el primer año de un siglo
    private static int calcularPrimerAnho(int siglo) {
        return (siglo - 1) * 100 + 1;
    }
}

