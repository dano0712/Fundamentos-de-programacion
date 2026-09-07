import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        char operacion;

        System.out.print("Ingresa el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.print("Ingresa la operacion (+, -, *, /): ");
        operacion = entrada.next().charAt(0);

        switch (operacion) {

            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: division por cero");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Operacion no valida");
                break;
        }

        entrada.close();
    }
}