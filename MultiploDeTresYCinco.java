import java.util.Scanner;

public class MultiploDeTresYCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Es múltiplo de 3 y de 5 al mismo tiempo.");
        }

        sc.close();
    }
}