import java.util.Scanner;

public class SistemaDeAdmision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota de Matemática: ");
        double matematica = sc.nextDouble();

        System.out.print("Ingrese la nota de Comunicación: ");
        double comunicacion = sc.nextDouble();

        if (matematica >= 11 && comunicacion >= 11) {
            System.out.println("Postulante apto.");
        }

        sc.close();
    }
}