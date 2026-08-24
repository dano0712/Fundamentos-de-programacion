import java.util.Scanner;

public class Consultorio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroCita;
        double pagoCita;
        double totalTratamiento;

        System.out.print("Ingresa el número de cita: ");
        numeroCita = entrada.nextInt();

        if (numeroCita <= 3) {

            pagoCita = 900;
            totalTratamiento = numeroCita * 900;

        } else if (numeroCita <= 5) {

            pagoCita = 800;
            totalTratamiento = (3 * 900) + ((numeroCita - 3) * 800);

        } else if (numeroCita <= 8) {

            pagoCita = 600;
            totalTratamiento = (3 * 900) + (2 * 800)
                    + ((numeroCita - 5) * 600);

        } else {

            pagoCita = 500;
            totalTratamiento = (3 * 900) + (2 * 800) + (3 * 600)
                    + ((numeroCita - 8) * 500);
        }

        System.out.println("El paciente pagará por esta cita: $" + pagoCita);
        System.out.println("El total pagado por el tratamiento es: $" + totalTratamiento);

        entrada.close();
    }
}