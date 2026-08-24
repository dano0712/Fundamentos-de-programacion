import java.util.Scanner;

public class Paqueteria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int peso;
        int zona;
        double costoGramo = 0;
        double total;

        System.out.print("Ingresa el peso del paquete en gramos: ");
        peso = entrada.nextInt();

        System.out.println("Selecciona la zona de destino:");
        System.out.println("1 - América del Norte");
        System.out.println("2 - América Central");
        System.out.println("3 - América del Sur");
        System.out.println("4 - Europa");
        System.out.println("5 - Asia");

        System.out.print("Ingresa la zona: ");
        zona = entrada.nextInt();

        if (peso > 5000) {

            System.out.println("El paquete no puede ser transportado.");
            System.out.println("Peso superior a 5 kg.");

        } else {

            if (zona == 1) {

                costoGramo = 11;
                System.out.println("Zona: América del Norte");

            } else if (zona == 2) {

                costoGramo = 10;
                System.out.println("Zona: América Central");

            } else if (zona == 3) {

                costoGramo = 12;
                System.out.println("Zona: América del Sur");

            } else if (zona == 4) {

                costoGramo = 25;
                System.out.println("Zona: Europa");

            } else if (zona == 5) {

                costoGramo = 30;
                System.out.println("Zona: Asia");

            } else {

                System.out.println("Zona no válida.");
            }

            if (costoGramo > 0) {

                total = peso * costoGramo;

                System.out.println("Costo por gramo: $" + costoGramo);
                System.out.println("El costo de la entrega es: $" + total);
            }
        }

        entrada.close();
    }
}