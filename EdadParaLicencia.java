import java.util.Scanner;

public class EdadParaLicencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Puede obtener licencia de conducir.");
        }

        sc.close();
    }
}