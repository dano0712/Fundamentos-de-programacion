import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        char operacion, continuar = 'S';
        double resultado;

        while (continuar == 'S' || continuar == 's') {

            System.out.print("Ingresa el primer número: ");
            num1 = entrada.nextInt();

            System.out.print("Ingresa el segundo número: ");
            num2 = entrada.nextInt();

            System.out.print("Ingresa la operación (+, -, *, /): ");
            operacion = entrada.next().charAt(0);

            switch (operacion) {

                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '/':
                    if (num2 != 0) {
                        resultado = (double) num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: división por cero.");
                    }
                    break;

                default:
                    System.out.println("Operación no válida.");
                    break;
            }

            System.out.print("¿Deseas realizar otra operación? (S/N): ");
            continuar = entrada.next().charAt(0);
        }

        System.out.println("Calculadora finalizada.");

        entrada.close();
    }
}