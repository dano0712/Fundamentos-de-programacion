import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes;

        System.out.print("Ingresa el dia de nacimiento: ");
        dia = entrada.nextInt();

        System.out.print("Ingresa el mes de nacimiento (1-12): ");
        mes = entrada.nextInt();

        switch (mes) {

            case 1:
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Capricornio");
                } else if (dia >= 20 && dia <= 31) {
                    System.out.println("Acuario");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 2:
                if (dia >= 1 && dia <= 18) {
                    System.out.println("Acuario");
                } else if (dia >= 19 && dia <= 29) {
                    System.out.println("Piscis");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 3:
                if (dia >= 1 && dia <= 20) {
                    System.out.println("Piscis");
                } else if (dia >= 21 && dia <= 31) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 4:
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Aries");
                } else if (dia >= 20 && dia <= 30) {
                    System.out.println("Tauro");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 5:
                if (dia >= 1 && dia <= 20) {
                    System.out.println("Tauro");
                } else if (dia >= 21 && dia <= 31) {
                    System.out.println("Geminis");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 6:
                if (dia >= 1 && dia <= 20) {
                    System.out.println("Geminis");
                } else if (dia >= 21 && dia <= 30) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 7:
                if (dia >= 1 && dia <= 22) {
                    System.out.println("Cancer");
                } else if (dia >= 23 && dia <= 31) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 8:
                if (dia >= 1 && dia <= 22) {
                    System.out.println("Leo");
                } else if (dia >= 23 && dia <= 31) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 9:
                if (dia >= 1 && dia <= 22) {
                    System.out.println("Virgo");
                } else if (dia >= 23 && dia <= 30) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 10:
                if (dia >= 1 && dia <= 22) {
                    System.out.println("Libra");
                } else if (dia >= 23 && dia <= 31) {
                    System.out.println("Escorpio");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 11:
                if (dia >= 1 && dia <= 21) {
                    System.out.println("Escorpio");
                } else if (dia >= 22 && dia <= 30) {
                    System.out.println("Sagitario");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            case 12:
                if (dia >= 1 && dia <= 21) {
                    System.out.println("Sagitario");
                } else if (dia >= 22 && dia <= 31) {
                    System.out.println("Capricornio");
                } else {
                    System.out.println("Dia no valido.");
                }
                break;

            default:
                System.out.println("Mes no valido.");
                break;
        }

        entrada.close();
    }
}