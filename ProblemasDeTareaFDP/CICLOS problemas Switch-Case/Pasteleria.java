import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char sabor, chocolate, personalizar, continuar = 'S';
        int snacks;
        double precio, total;

        do {
            System.out.println("===== PRESUPUESTO DE TARTA =====");

            System.out.println("¿Qué sabor de tarta quieres?");
            System.out.println("1. Manzana");
            System.out.println("2. Fresa");
            System.out.println("3. Chocolate");
            sabor = entrada.next().charAt(0);

            switch (sabor) {
                case '1':
                    precio = 200;
                    System.out.println("Tarta de manzana: $200");
                    break;

                case '2':
                    precio = 250;
                    System.out.println("Tarta de fresa: $250");
                    break;

                case '3':
                    System.out.println("¿Qué tipo de chocolate quieres?");
                    System.out.println("1. Chocolate negro");
                    System.out.println("2. Chocolate blanco");
                    chocolate = entrada.next().charAt(0);

                    switch (chocolate) {
                        case '1':
                            precio = 280;
                            System.out.println("Tarta de chocolate negro: $280");
                            break;

                        case '2':
                            precio = 300;
                            System.out.println("Tarta de chocolate blanco: $300");
                            break;

                        default:
                            precio = 0;
                            System.out.println("Tipo de chocolate no válido.");
                    }
                    break;

                default:
                    precio = 0;
                    System.out.println("Sabor no válido.");
            }

            if (precio > 0) {
                System.out.print("¿Cuántos snacks deseas agregar?: ");
                snacks = entrada.nextInt();

                total = precio + (snacks * 25);

                System.out.print("¿Deseas personalizar la tarta con un nombre? (S/N): ");
                personalizar = entrada.next().charAt(0);

                if (personalizar == 'S' || personalizar == 's') {
                    total = total + 30;
                }

                System.out.println("El precio total de la tarta es: $" + total);
            }

            System.out.print("¿Deseas realizar otro presupuesto? (S/N): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        entrada.close();
    }
}