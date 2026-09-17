import java.util.Scanner;

public class ControlConsumoElectrico {

    // Calcula el consumo mensual
    static double calcularConsumo(double lecturaAnterior, double lecturaActual) {
        return lecturaActual - lecturaAnterior;
    }

    // Calcula el costo del consumo mediante bloques acumulativos
    static double calcularCostoConsumo(double consumo) {
        double costo;

        if (consumo <= 150) {
            costo = consumo * 1.20;
        } else if (consumo <= 400) {
            costo = (150 * 1.20) + ((consumo - 150) * 1.80);
        } else {
            costo = (150 * 1.20)
                    + (250 * 1.80)
                    + ((consumo - 400) * 2.75);
        }

        return costo;
    }

    // Calcula el descuento del programa de apoyo
    static double calcularDescuentoApoyo(double consumo, double costoAntesImpuesto, boolean tieneApoyo) {
        if (tieneApoyo && consumo <= 250) {
            return costoAntesImpuesto * 0.30;
        }

        return 0;
    }

    // Calcula el impuesto del 16%
    static double calcularImpuesto(double baseImponible) {
        return baseImponible * 0.16;
    }

    // Calcula el total a pagar
    static double calcularTotal(double costoConsumo, double cargoFijo,
                                double descuento, double impuesto) {
        return costoConsumo + cargoFijo - descuento + impuesto;
    }

    // Muestra el recibo
    static void mostrarRecibo(double consumo, double costoConsumo,
                              double descuento, double impuesto,
                              double total) {

        System.out.println();
        System.out.println("===== RECIBO DE ELECTRICIDAD =====");
        System.out.println("Consumo: " + consumo + " kWh");
        System.out.println("Costo por consumo: $" + costoConsumo);
        System.out.println("Cargo fijo: $95.00");
        System.out.println("Descuento: $" + descuento);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total a pagar: $" + total);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lecturaAnterior;
        double lecturaActual;
        double consumo;
        double costoConsumo;
        double cargoFijo = 95;
        double costoAntesImpuesto;
        double descuento;
        double impuesto;
        double total;
        boolean tieneApoyo;

        // Validar lectura anterior
        do {
            System.out.print("Ingrese la lectura anterior: ");
            lecturaAnterior = entrada.nextDouble();

            if (lecturaAnterior < 0) {
                System.out.println("La lectura no puede ser negativa.");
            }

        } while (lecturaAnterior < 0);

        // Validar lectura actual
        do {
            System.out.print("Ingrese la lectura actual: ");
            lecturaActual = entrada.nextDouble();

            if (lecturaActual < lecturaAnterior) {
                System.out.println(
                    "La lectura actual debe ser mayor o igual a la anterior."
                );
            }

        } while (lecturaActual < lecturaAnterior);

        // Calcular consumo
        consumo = calcularConsumo(lecturaAnterior, lecturaActual);

        // Validar consumo máximo
        while (consumo > 10000) {

            System.out.println("El consumo no puede superar los 10000 kWh.");
            System.out.println("Ingrese nuevamente las lecturas.");

            do {
                System.out.print("Ingrese la lectura anterior: ");
                lecturaAnterior = entrada.nextDouble();

                if (lecturaAnterior < 0) {
                    System.out.println("La lectura no puede ser negativa.");
                }

            } while (lecturaAnterior < 0);

            do {
                System.out.print("Ingrese la lectura actual: ");
                lecturaActual = entrada.nextDouble();

                if (lecturaActual < lecturaAnterior) {
                    System.out.println(
                        "La lectura actual debe ser mayor o igual a la anterior."
                    );
                }

            } while (lecturaActual < lecturaAnterior);

            consumo = calcularConsumo(lecturaAnterior, lecturaActual);
        }

        // Calcular costo del consumo
        costoConsumo = calcularCostoConsumo(consumo);

        // Preguntar si pertenece al programa de apoyo
        System.out.print("¿La vivienda pertenece al programa de apoyo? (true/false): ");
        tieneApoyo = entrada.nextBoolean();

        // Costo antes del impuesto
        costoAntesImpuesto = costoConsumo + cargoFijo;

        // Calcular descuento
        descuento = calcularDescuentoApoyo(
            consumo,
            costoAntesImpuesto,
            tieneApoyo
        );

        // Calcular impuesto
        impuesto = calcularImpuesto(costoAntesImpuesto - descuento);

        // Calcular total
        total = calcularTotal(
            costoConsumo,
            cargoFijo,
            descuento,
            impuesto
        );

        // Mostrar recibo
        mostrarRecibo(
            consumo,
            costoConsumo,
            descuento,
            impuesto,
            total
        );

        entrada.close();
    }
}