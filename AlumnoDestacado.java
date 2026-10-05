import java.util.Scanner;

public class AlumnoDestacado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una nota: ");
        double nota = sc.nextDouble();

        if (nota >= 17) {
            System.out.println("Alumno destacado.");
        }

        sc.close();
    }
}