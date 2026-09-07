import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int i;
        int j;

        System.out.print("Ingresa el numero de lineas: ");
        n = entrada.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        entrada.close();
    }
}
