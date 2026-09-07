import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int sabor;
        int chocolate;
        int snacks;
        double total = 0;
        char nombre;

        System.out.println("PASTELERIA");
        System.out.println("1. Manzana - $200");
        System.out.println("2. Fresa - $250");
        System.out.println("3. Chocolate");

        System.out.print("Elige el sabor de la tarta: ");
        sabor = entrada.nextInt();

        switch (sabor) {

            case 1:
                total = 200;
                System.out.println("Elegiste tarta de manzana.");
                break;

            case 2:
                total = 250;
                System.out.println("Elegiste tarta de fresa.");
                break;

            case 3:
                System.out.println("Elige el tipo de chocolate:");
                System.out.println("1. Chocolate negro - $280");
                System.out.println("2. Chocolate blanco - $300");

                System.out.print("Elige una opcion: ");
                chocolate = entrada.nextInt();

                switch (chocolate) {

                    case 1:
                        total = 280;
                        System.out.println("Elegiste chocolate negro.");
                        break;

                    case 2:
                        total = 300;
                        System.out.println("Elegiste chocolate blanco.");
                        break;

                    default:
                        System.out.println("Opcion de chocolate no valida.");
                        entrada.close();
                        return;
                }
                break;

            default:
                System.out.println("Sabor no valido.");
                entrada.close();
                return;
        }

        System.out.print("¿Cuantos snacks deseas agregar?: ");
        snacks = entrada.nextInt();

        total = total + (snacks * 25);

        System.out.print("¿Deseas personalizar la tarta con un nombre? (S/N): ");
        nombre = entrada.next().charAt(0);

        if (nombre == 'S' || nombre == 's') {
            total = total + 30;
        }

        System.out.println("El precio total de la tarta es: $" + total);

        entrada.close();
    }
}