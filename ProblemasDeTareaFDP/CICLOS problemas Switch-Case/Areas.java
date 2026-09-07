import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double lado, largo, ancho, base, altura, radio, area;

        for (int i = 1; i <= 4; i++) {

            System.out.println("===== MENÚ DE ÁREAS =====");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa el lado del cuadrado: ");
                    lado = entrada.nextDouble();

                    area = lado * lado;

                    System.out.println("El área del cuadrado es: " + area);
                    break;

                case 2:
                    System.out.print("Ingresa el largo del rectángulo: ");
                    largo = entrada.nextDouble();

                    System.out.print("Ingresa el ancho del rectángulo: ");
                    ancho = entrada.nextDouble();

                    area = largo * ancho;

                    System.out.println("El área del rectángulo es: " + area);
                    break;

                case 3:
                    System.out.print("Ingresa la base del triángulo: ");
                    base = entrada.nextDouble();

                    System.out.print("Ingresa la altura del triángulo: ");
                    altura = entrada.nextDouble();

                    area = (base * altura) / 2;

                    System.out.println("El área del triángulo es: " + area);
                    break;

                case 4:
                    System.out.print("Ingresa el radio del círculo: ");
                    radio = entrada.nextDouble();

                    area = Math.PI * radio * radio;

                    System.out.println("El área del círculo es: " + area);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        entrada.close();
    }
}