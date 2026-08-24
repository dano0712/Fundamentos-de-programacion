import java.util.Scanner;

public class Becas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;
        double promedio;

        System.out.print("Ingresa la edad del estudiante: ");
        edad = entrada.nextInt();

        System.out.print("Ingresa el promedio del estudiante: ");
        promedio = entrada.nextDouble();

        if (edad > 18) {

            if (promedio >= 9) {

                System.out.println("Beca asignada: $10,000");

            } else if (promedio >= 7.5) {

                System.out.println("Beca asignada: $8,000");

            } else if (promedio >= 6) {

                System.out.println("Beca asignada: $5,000");

            } else {

                System.out.println("Se enviará una carta de invitación para estudiar más.");
            }

        } else {

            if (promedio >= 9) {

                System.out.println("Beca asignada: $8,000");

            } else if (promedio >= 8) {

                System.out.println("Beca asignada: $6,000");

            } else if (promedio >= 6) {

                System.out.println("Beca asignada: $4,000");

            } else {

                System.out.println("Se enviará una carta de invitación para estudiar más.");
            }
        }

        entrada.close();
    }
}