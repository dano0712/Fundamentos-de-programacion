import java.util.Scanner;

public class PatronesAsteriscos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int i;
        int j;
        int cantidad;

        System.out.print("Ingresa el numero de lineas: ");
        n = entrada.nextInt();

        // Primera figura
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // Segunda figura
        for (i = 1; i <= n; i++) {

            cantidad = 2 * (n - i) + 1;

            for (j = 1; j <= cantidad; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        // Tercera figura
        for (i = 1; i <= n; i++) {

            cantidad = 2 * i - 1;

            for (j = 1; j <= cantidad; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        entrada.close();
    }
}
