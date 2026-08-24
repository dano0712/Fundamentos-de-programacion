import java.util.Scanner;

public class VentasDelDia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;
        double venta;

        int cantidadMayor1000 = 0;
        int cantidadMayor500 = 0;
        int cantidadMenor500 = 0;

        double montoMayor1000 = 0;
        double montoMayor500 = 0;
        double montoMenor500 = 0;
        double montoTotal = 0;

        System.out.print("Ingresa el número de ventas realizadas: ");
        N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {

            System.out.print("Ingresa el monto de la venta " + i + ": ");
            venta = entrada.nextDouble();

            if (venta > 1000) {

                cantidadMayor1000++;
                montoMayor1000 = montoMayor1000 + venta;

            } else if (venta > 500) {

                cantidadMayor500++;
                montoMayor500 = montoMayor500 + venta;

            } else {

                cantidadMenor500++;
                montoMenor500 = montoMenor500 + venta;
            }

            montoTotal = montoTotal + venta;
        }

        System.out.println();
        System.out.println("===== RESULTADOS DE LAS VENTAS =====");

        System.out.println("Cantidad de ventas mayores a $1000: "
                + cantidadMayor1000);

        System.out.println("Monto total de las ventas mayores a $1000: $"
                + montoMayor1000);

        System.out.println();

        System.out.println("Cantidad de ventas mayores a $500 y menores o iguales a $1000: "
                + cantidadMayor500);

        System.out.println("Monto total de las ventas mayores a $500 y menores o iguales a $1000: $"
                + montoMayor500);

        System.out.println();

        System.out.println("Cantidad de ventas menores o iguales a $500: "
                + cantidadMenor500);

        System.out.println("Monto total de las ventas menores o iguales a $500: $"
                + montoMenor500);

        System.out.println();

        System.out.println("Monto total de todas las ventas del día: $"
                + montoTotal);

        entrada.close();
    }
}