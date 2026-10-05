import java.util.Scanner;

public class NumeroDentroDeUnRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();

        if (numero >= 20 && numero <= 50) {
            System.out.println("El número está dentro del rango.");
        }

        sc.close();
    }
}