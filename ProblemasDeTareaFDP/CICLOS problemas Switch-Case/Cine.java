import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int personas, dia;
        int parejas, sobrantes;
        double total;
        char membresia;

        for (int i = 1; i <= 3; i++) {

            System.out.println("===== ENTRADAS DE CINE =====");

            System.out.print("Ingresa el número de personas: ");
            personas = entrada.nextInt();

            System.out.println("Ingresa el día de la semana:");
            System.out.println("1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miércoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Sábado");
            System.out.println("7. Domingo");
            dia = entrada.nextInt();

            System.out.print("¿Cuentas con membresía? (S/N): ");
            membresia = entrada.next().charAt(0);

            if (dia == 3) {
                total = personas * 30;

            } else if (dia == 4) {
                parejas = personas / 2;
                sobrantes = personas - (parejas * 2);

                total = (parejas * 75) + (sobrantes * 50);

            } else {
                total = personas * 50;
            }

            if (membresia == 'S' || membresia == 's') {
                total = total * 0.90;
            }

            System.out.println("El precio total es: $" + total);
            System.out.println();
        }

        entrada.close();
    }
}