import java.util.Scanner;

class Elecciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de candidatos: ");
        int numCandidatos = entrada.nextInt();
        
        if (numCandidatos <= 0) {
            System.out.println("Error: Debe haber al menos un candidato.");
            System.exit(0);
        }
        
        int votosTotales = 0;
        int[] conteoVotos = new int[numCandidatos];
        
        System.out.println("Ingrese el número del candidato (0 para finalizar):");
        
        int voto;
        do {
            voto = entrada.nextInt();
            
            if (voto > 0 && voto <= numCandidatos) {
                conteoVotos[voto - 1]++;
                votosTotales++;
            } else if (voto != 0) {
                System.out.println("Número inválido. Introduzca un número entre 1 y " + numCandidatos + ".");
            }
        } while (voto != 0);

        if (votosTotales == 0) {
            System.out.println("No se registraron votos.");
        } else {
            System.out.println("\nResultados de la votación:");
            for (int i = 0; i < numCandidatos; i++) {
                double porcentaje = ((double) conteoVotos[i] / votosTotales) * 100;
                System.out.println("Candidato " + (i + 1) + ": " + conteoVotos[i] + " votos (" + String.format("%.2f", porcentaje) + "%)");
            }
            System.out.println("\nTotal de votos registrados: " + votosTotales);
        }

        entrada.close();
    }
}
