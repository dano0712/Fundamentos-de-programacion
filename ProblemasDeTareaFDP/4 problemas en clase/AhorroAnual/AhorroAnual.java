import java.util.Scanner;

public class AhorroAnual {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double deposito;
        double ahorro = 0;

        for (int mes = 1; mes <= 12; mes++) {

            System.out.print("Ingresa la cantidad depositada en el mes " + mes + ": ");
            deposito = entrada.nextDouble();

            ahorro = ahorro + deposito;

            System.out.println("Ahorro acumulado hasta el mes "
                    + mes + ": $" + ahorro);
        }

        System.out.println("El ahorro total al finalizar el año es: $" + ahorro);

        entrada.close();
    }
}