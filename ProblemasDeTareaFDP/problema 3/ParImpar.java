import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingresa un número: ");
        numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("El número es neutro");
        } else if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        entrada.close();
    }
}