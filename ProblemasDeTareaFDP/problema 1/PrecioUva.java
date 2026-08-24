import java.util.Scanner;

public class PrecioUva {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precioInicial;
        double kilos;
        double precioFinal;
        double ganancia;

        String tipo;
        int tamano;

        System.out.print("Ingresa el precio inicial por kilo: ");
        precioInicial = entrada.nextDouble();

        System.out.print("Ingresa la cantidad de kilos: ");
        kilos = entrada.nextDouble();

        System.out.print("Ingresa el tipo de uva (A o B): ");
        tipo = entrada.next();

        System.out.print("Ingresa el tamaño de la uva (1 o 2): ");
        tamano = entrada.nextInt();

        if (tipo.equals("A")) {

            if (tamano == 1) {
                precioFinal = precioInicial + 0.20;
            } else {
                precioFinal = precioInicial + 0.30;
            }

        } else {

            if (tamano == 1) {
                precioFinal = precioInicial - 0.30;
            } else {
                precioFinal = precioInicial - 0.50;
            }
        }

        ganancia = precioFinal * kilos;

        System.out.println("El productor recibirá: $" + ganancia);

        entrada.close();
    }
}