import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int hora;

        do {
            System.out.print("Ingresa la hora (0 a 23): ");
            hora = entrada.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Hora no válida. Intenta nuevamente.");
            }

        } while (hora < 0 || hora > 23);

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

        entrada.close();
    }
}