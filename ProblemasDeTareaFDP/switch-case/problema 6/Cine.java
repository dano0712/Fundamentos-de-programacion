import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int personas, dia;
        double total;
        char membresia;

        System.out.print("Ingresa el numero de personas: ");
        personas = entrada.nextInt();

        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");

        System.out.print("Ingresa el dia de la semana: ");
        dia = entrada.nextInt();

        System.out.print("¿Cuentas con membresia? (S/N): ");
        membresia = entrada.next().charAt(0);

        switch (dia) {

            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
                total = personas * 50;
                break;

            case 3:
                total = personas * 30;
                break;

            case 4:
                int parejas = personas / 2;
                int individual = personas % 2;

                total = (parejas * 75) + (individual * 50);
                break;

            default:
                System.out.println("Dia no valido.");
                entrada.close();
                return;
        }

        if (membresia == 'S' || membresia == 's') {
            total = total * 0.90;
        }

        System.out.println("El precio total es: $" + total);

        entrada.close();
    }
}