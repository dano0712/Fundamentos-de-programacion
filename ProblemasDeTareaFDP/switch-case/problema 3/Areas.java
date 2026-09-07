
import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double lado, largo, ancho, base, altura, radio, area;

        System.out.println("MENU DE AREAS");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");

        System.out.print("Elige una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                System.out.print("Ingresa el lado del cuadrado: ");
                lado = entrada.nextDouble();

                area = lado * lado;

                System.out.println("El area del cuadrado es: " + area);
                break;

            case 2:
                System.out.print("Ingresa el largo del rectangulo: ");
                largo = entrada.nextDouble();

                System.out.print("Ingresa el ancho del rectangulo: ");
                ancho = entrada.nextDouble();

                area = largo * ancho;

                System.out.println("El area del rectangulo es: " + area);
                break;

            case 3:
                System.out.print("Ingresa la base del triangulo: ");
                base = entrada.nextDouble();

                System.out.print("Ingresa la altura del triangulo: ");
                altura = entrada.nextDouble();

                area = (base * altura) / 2;

                System.out.println("El area del triangulo es: " + area);
                break;

            case 4:
                System.out.print("Ingresa el radio del circulo: ");
                radio = entrada.nextDouble();

                area = Math.PI * radio * radio;

                System.out.println("El area del circulo es: " + area);
                break;

            default:
                System.out.println("Opcion no valida.");
                break;
        }

        entrada.close();
    }
}