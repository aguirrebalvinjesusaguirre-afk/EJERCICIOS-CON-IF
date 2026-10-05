import java.util.Scanner;

public class DescuentoPorCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: S/ ");
        double monto = sc.nextDouble();

        if (monto >= 300) {
            System.out.println("Aplica descuento del 10%.");
        }

        sc.close();
    }
}