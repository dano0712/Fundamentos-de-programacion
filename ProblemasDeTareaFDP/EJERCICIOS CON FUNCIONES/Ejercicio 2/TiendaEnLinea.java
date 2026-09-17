import java.util.Scanner;

public class TiendaEnLinea {

    static double calcularSubtotalProducto(double precio, int cantidad) {
        return precio * cantidad;
    }

    static double calcularSubtotalGeneral(double subtotal1, double subtotal2,
                                          double subtotal3) {
        return subtotal1 + subtotal2 + subtotal3;
    }

    static double acumularSubtotal(double subtotalGeneral, double subtotalProducto) {
        return subtotalGeneral + subtotalProducto;
    }

    static double calcularDescuento(double subtotal, int tipoCliente) {
        if (tipoCliente == 1) {
            return 0;
        } else {
            return subtotal * 0.10;
        }
    }

    static double calcularEnvio(double subtotal, String codigoPostal) {
        if (subtotal < 1000) {
            return 150;
        } else if (subtotal < 3000) {
            return 80;
        } else {
            return 0;
        }
    }

    static double calcularImpuesto(double subtotalConDescuento) {
        return subtotalConDescuento * 0.16;
    }

    static double calcularTotal(double subtotal, double descuento,
                                double impuesto, double envio) {
        return subtotal - descuento + impuesto + envio;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadProductos;
        int tipoCliente;
        String codigoPostal;

        double precio;
        int cantidad;
        double subtotalProducto;
        double subtotalGeneral = 0;

        // Cantidad de productos
        do {
            System.out.print("¿Cuántos productos desea comprar? ");
            cantidadProductos = entrada.nextInt();

            if (cantidadProductos <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }

        } while (cantidadProductos <= 0);

        // Capturar productos
        for (int i = 1; i <= cantidadProductos; i++) {

            do {
                System.out.print("Ingrese el precio del producto " + i + ": ");
                precio = entrada.nextDouble();

                if (precio <= 0) {
                    System.out.println("El precio debe ser mayor que cero.");
                }

            } while (precio <= 0);

            do {
                System.out.print("Ingrese la cantidad del producto " + i + ": ");
                cantidad = entrada.nextInt();

                if (cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor que cero.");
                }

            } while (cantidad <= 0);

            subtotalProducto = calcularSubtotalProducto(precio, cantidad);

            subtotalGeneral = acumularSubtotal(
                    subtotalGeneral, subtotalProducto
            );

            System.out.println("Subtotal del producto " + i +
                               ": $" + subtotalProducto);
        }

        // Tipo de cliente
        do {
            System.out.println("\nTipo de cliente:");
            System.out.println("1. Cliente regular");
            System.out.println("2. Cliente frecuente");
            System.out.print("Seleccione una opción: ");
            tipoCliente = entrada.nextInt();

            if (tipoCliente != 1 && tipoCliente != 2) {
                System.out.println("El tipo de cliente debe ser 1 o 2.");
            }

        } while (tipoCliente != 1 && tipoCliente != 2);

        // Calcular descuento
        double descuento = calcularDescuento(
                subtotalGeneral, tipoCliente
        );

        // Código postal
        do {
            System.out.print("\nIngrese el código postal: ");
            codigoPostal = entrada.next();

            if (codigoPostal.length() != 5) {
                System.out.println(
                    "El código postal debe contener exactamente 5 dígitos."
                );
            }

        } while (codigoPostal.length() != 5);

        // Calcular envío
        double envio = calcularEnvio(subtotalGeneral, codigoPostal);

        // Subtotal después del descuento
        double subtotalConDescuento = subtotalGeneral - descuento;

        // Calcular impuesto
        double impuesto = calcularImpuesto(subtotalConDescuento);

        // Calcular total
        double total = calcularTotal(
                subtotalGeneral,
                descuento,
                impuesto,
                envio
        );

        // Mostrar resultados
        System.out.println("\n===== RESUMEN DE COMPRA =====");
        System.out.println("Subtotal general: $" + subtotalGeneral);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Envío: $" + envio);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total a pagar: $" + total);

        entrada.close();
    }
}