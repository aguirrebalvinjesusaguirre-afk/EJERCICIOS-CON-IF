import java.util.Scanner;

public class TemperaturaExtrema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 35) {
            System.out.println("Temperatura extrema.");
        }

        sc.close();
    }
}