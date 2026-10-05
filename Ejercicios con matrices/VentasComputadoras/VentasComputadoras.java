import java.util.Scanner;

public class VentasComputadoras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir cantidad de vendedores y zonas
        System.out.print("Ingresa la cantidad de vendedores: ");
        int n = entrada.nextInt();

        System.out.print("Ingresa la cantidad de zonas: ");
        int m = entrada.nextInt();

        // Crear arreglo bidimensional
        int[][] ventas = new int[n][m];

        // Llenar el arreglo
        for (int i = 0; i < n; i++) {
            System.out.println("\nVendedor " + (i + 1));

            for (int j = 0; j < m; j++) {
                System.out.print("Computadoras vendidas en la zona "
                        + (j + 1) + ": ");
                ventas[i][j] = entrada.nextInt();
            }
        }

        // ------------------------------------------------
        // 1. ZONA QUE MÁS COMPUTADORAS VENDIÓ
        // ------------------------------------------------

        int mayorZona = 0;
        int zonaMayor = 0;

        for (int j = 0; j < m; j++) {

            int totalZona = 0;

            for (int i = 0; i < n; i++) {
                totalZona += ventas[i][j];
            }

            if (totalZona > mayorZona) {
                mayorZona = totalZona;
                zonaMayor = j;
            }
        }

        // ------------------------------------------------
        // 2. VENDEDOR QUE MENOS COMPUTADORAS VENDIÓ
        // ------------------------------------------------

        int menorVenta = Integer.MAX_VALUE;
        int vendedorMenor = 0;
        int zonaMenor = 0;

        for (int i = 0; i < n; i++) {

            int totalVendedor = 0;

            for (int j = 0; j < m; j++) {
                totalVendedor += ventas[i][j];

                if (ventas[i][j] < menorVenta) {
                    menorVenta = ventas[i][j];
                    vendedorMenor = i;
                    zonaMenor = j;
                }
            }
        }

        // ------------------------------------------------
        // 3. VENDEDOR QUE MÁS COMPUTADORAS VENDIÓ
        // ------------------------------------------------

        int mayorVenta = 0;
        int vendedorMayor = 0;
        int zonaMayorVenta = 0;

        for (int i = 0; i < n; i++) {

            int totalVendedor = 0;

            for (int j = 0; j < m; j++) {
                totalVendedor += ventas[i][j];

                if (ventas[i][j] > mayorVenta) {
                    mayorVenta = ventas[i][j];
                    vendedorMayor = i;
                    zonaMayorVenta = j;
                }
            }
        }

        // ------------------------------------------------
        // 4. TOTAL DE COMPUTADORAS VENDIDAS
        // ------------------------------------------------

        int totalGeneral = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalGeneral += ventas[i][j];
            }
        }

        // ------------------------------------------------
        // MOSTRAR RESULTADOS
        // ------------------------------------------------

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("La zona que más computadoras vendió fue la zona "
                + (zonaMayor + 1) + " con " + mayorZona + " computadoras.");

        System.out.println("El vendedor que menos computadoras vendió fue el vendedor "
                + (vendedorMenor + 1) + ", con " + menorVenta
                + " computadoras en la zona " + (zonaMenor + 1) + ".");

        System.out.println("El vendedor que más computadoras vendió fue el vendedor "
                + (vendedorMayor + 1) + ", con " + mayorVenta
                + " computadoras en la zona " + (zonaMayorVenta + 1) + ".");

        System.out.println("La cantidad total de computadoras vendidas fue: "
                + totalGeneral);

        entrada.close();
    }
}