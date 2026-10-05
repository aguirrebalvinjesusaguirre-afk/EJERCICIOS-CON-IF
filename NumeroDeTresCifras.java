import java.util.Scanner;

public class NumeroDeTresCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if ((numero >= 100 && numero <= 999) ||
            (numero >= -999 && numero <= -100)) {
            System.out.println("El número tiene tres cifras.");
        }

        sc.close();
    }
}
