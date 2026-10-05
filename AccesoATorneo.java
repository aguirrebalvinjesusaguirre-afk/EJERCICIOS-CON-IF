import java.util.Scanner;

public class AccesoATorneo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad del participante: ");
        int edad = sc.nextInt();

        if (edad >= 15 && edad <= 18) {
            System.out.println("Puede participar en el torneo.");
        }

        sc.close();
    }
}