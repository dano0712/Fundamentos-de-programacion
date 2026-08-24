import java.util.Scanner;

public class LlamadaTelefonica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int minutos;
        String domingo;
        String turno;

        double costo;
        double porcentaje;
        double impuesto;
        double total;

        System.out.print("Ingresa la duración de la llamada en minutos: ");
        minutos = entrada.nextInt();

        System.out.print("¿Es domingo? (S/N): ");
        domingo = entrada.next();

        if (domingo.equalsIgnoreCase("S")) {

            porcentaje = 0.03;

        } else {

            System.out.print("¿El turno es matutino o vespertino? (M/V): ");
            turno = entrada.next();

            if (turno.equalsIgnoreCase("M")) {

                porcentaje = 0.15;

            } else {

                porcentaje = 0.10;
            }
        }

        if (minutos <= 5) {

            costo = minutos * 1.00;

        } else if (minutos <= 8) {

            costo = (5 * 1.00) + ((minutos - 5) * 0.80);

        } else if (minutos <= 10) {

            costo = (5 * 1.00)
                    + (3 * 0.80)
                    + ((minutos - 8) * 0.70);

        } else {

            costo = (5 * 1.00)
                    + (3 * 0.80)
                    + (2 * 0.70)
                    + ((minutos - 10) * 0.50);
        }

        impuesto = costo * porcentaje;
        total = costo + impuesto;

        System.out.println("Costo de la llamada: $" + costo);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total a pagar: $" + total);

        entrada.close();
    }
}