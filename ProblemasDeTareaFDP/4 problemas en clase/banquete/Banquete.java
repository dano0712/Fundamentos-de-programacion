import java.util.Scanner;

public class Banquete {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int personas;
        double costoPersona;
        double presupuesto;

        System.out.print("Ingresa el número de personas: ");
        personas = entrada.nextInt();

        if (personas <= 200) {

            costoPersona = 95;

        } else if (personas <= 300) {

            costoPersona = 85;

        } else {

            costoPersona = 75;
        }

        presupuesto = personas * costoPersona;

        System.out.println("Costo por persona: $" + costoPersona);
        System.out.println("Presupuesto total: $" + presupuesto);

        entrada.close();
    }
}