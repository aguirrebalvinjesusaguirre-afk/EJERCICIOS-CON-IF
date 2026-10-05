import java.util.Scanner;

public class SueldoAlto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el sueldo: S/ ");
        double sueldo = sc.nextDouble();

        if (sueldo > 3500) {
            System.out.println("Pertenece al grupo de ingresos altos.");
        }

        sc.close();
    }
}