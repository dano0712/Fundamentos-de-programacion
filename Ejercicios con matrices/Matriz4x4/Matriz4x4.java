import java.util.Scanner;

public class Matriz4x4 {

    static Scanner entrada = new Scanner(System.in);
    static int[][] matriz = new int[4][4];
    static boolean matrizRellena = false;

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Suma de cada fila y columna");
            System.out.println("3. Suma de una fila");
            System.out.println("4. Suma de una columna");
            System.out.println("5. Mayor y menor con su posicion");
            System.out.println("6. Contar numeros pares");
            System.out.println("7. Contar numeros impares");
            System.out.println("8. Generar matriz con cuadrados");
            System.out.println("9. Sumar diagonal principal");
            System.out.println("10. Sumar diagonal inversa");
            System.out.println("11. Media de todos los valores");
            System.out.println("12. Salir");
            System.out.print("Elige una opcion: ");

            opcion = entrada.nextInt();

            // La opcion 1 siempre se puede ejecutar
            if (opcion == 1) {

                rellenarMatriz();

            } else if (opcion == 12) {

                System.out.println("Programa finalizado.");

            } else {

                // Si todavía no se ha rellenado la matriz
                if (!matrizRellena) {

                    System.out.println("\nPrimero debes rellenar la matriz.");

                } else {

                    // En las demas opciones mostramos la matriz original
                    System.out.println("\nMATRIZ ORIGINAL:");
                    mostrarMatriz();

                    switch (opcion) {

                        case 2:
                            sumaFilasColumnas();
                            break;

                        case 3:
                            sumaFila();
                            break;

                        case 4:
                            sumaColumna();
                            break;

                        case 5:
                            mayorMenor();
                            break;

                        case 6:
                            contarPares();
                            break;

                        case 7:
                            contarImpares();
                            break;

                        case 8:
                            matrizCuadrados();
                            break;

                        case 9:
                            diagonalPrincipal();
                            break;

                        case 10:
                            diagonalInversa();
                            break;

                        case 11:
                            media();
                            break;

                        default:
                            System.out.println("Opcion no valida.");
                    }
                }
            }

        } while (opcion != 12);

        entrada.close();
    }


    // =====================================================
    // 1. RELLENAR MATRIZ
    // =====================================================

    public static void rellenarMatriz() {

        System.out.println("\n========== RELLENAR MATRIZ ==========");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                int numero;

                do {

                    System.out.print("Introduce un numero para ["
                            + i + "][" + j + "]: ");

                    numero = entrada.nextInt();

                    if (numeroRepetido(numero)) {
                        System.out.println("Ese numero ya existe en la matriz.");
                        System.out.println("Introduce otro numero.");
                    }

                } while (numeroRepetido(numero));

                matriz[i][j] = numero;
            }
        }

        matrizRellena = true;

        System.out.println("\nMatriz rellenada correctamente.");
        mostrarMatriz();
    }


    // =====================================================
    // COMPROBAR SI UN NUMERO YA EXISTE
    // =====================================================

    public static boolean numeroRepetido(int numero) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }

        return false;
    }


    // =====================================================
    // MOSTRAR MATRIZ
    // =====================================================

    public static void mostrarMatriz() {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }


    // =====================================================
    // 2. SUMA DE CADA FILA Y COLUMNA
    // =====================================================

    public static void sumaFilasColumnas() {

        System.out.println("\n========== SUMA DE FILAS ==========");

        for (int i = 0; i < 4; i++) {

            int suma = 0;

            for (int j = 0; j < 4; j++) {
                suma += matriz[i][j];
            }

            System.out.println("Fila " + (i + 1) + ": " + suma);
        }

        System.out.println("\n========== SUMA DE COLUMNAS ==========");

        for (int j = 0; j < 4; j++) {

            int suma = 0;

            for (int i = 0; i < 4; i++) {
                suma += matriz[i][j];
            }

            System.out.println("Columna " + (j + 1) + ": " + suma);
        }
    }


    // =====================================================
    // 3. SUMA DE UNA FILA
    // =====================================================

    public static void sumaFila() {

        int fila;

        do {

            System.out.print("\nIndica la fila que quieres sumar (1-4): ");
            fila = entrada.nextInt();

            if (fila < 1 || fila > 4) {
                System.out.println("Fila incorrecta. Debe ser entre 1 y 4.");
            }

        } while (fila < 1 || fila > 4);

        int suma = 0;

        for (int j = 0; j < 4; j++) {
            suma += matriz[fila - 1][j];
        }

        System.out.println("La suma de la fila " + fila + " es: " + suma);
    }


    // =====================================================
    // 4. SUMA DE UNA COLUMNA
    // =====================================================

    public static void sumaColumna() {

        int columna;

        do {

            System.out.print("\nIndica la columna que quieres sumar (1-4): ");
            columna = entrada.nextInt();

            if (columna < 1 || columna > 4) {
                System.out.println("Columna incorrecta. Debe ser entre 1 y 4.");
            }

        } while (columna < 1 || columna > 4);

        int suma = 0;

        for (int i = 0; i < 4; i++) {
            suma += matriz[i][columna - 1];
        }

        System.out.println("La suma de la columna "
                + columna + " es: " + suma);
    }


    // =====================================================
    // 5. MAYOR Y MENOR
    // =====================================================

    public static void mayorMenor() {

        int mayor = matriz[0][0];
        int menor = matriz[0][0];

        int filaMayor = 0;
        int columnaMayor = 0;

        int filaMenor = 0;
        int columnaMenor = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                if (matriz[i][j] > mayor) {

                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }

                if (matriz[i][j] < menor) {

                    menor = matriz[i][j];
                    filaMenor = i;
                    columnaMenor = j;
                }
            }
        }

        System.out.println("\nMayor: " + mayor);
        System.out.println("Posicion: fila " + (filaMayor + 1)
                + ", columna " + (columnaMayor + 1));

        System.out.println("\nMenor: " + menor);
        System.out.println("Posicion: fila " + (filaMenor + 1)
                + ", columna " + (columnaMenor + 1));
    }


    // =====================================================
    // 6. CONTAR PARES
    // =====================================================

    public static void contarPares() {

        int contador = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }

        System.out.println("\nCantidad de numeros pares: " + contador);
    }


    // =====================================================
    // 7. CONTAR IMPARES
    // =====================================================

    public static void contarImpares() {

        int contador = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                if (matriz[i][j] % 2 != 0) {
                    contador++;
                }
            }
        }

        System.out.println("\nCantidad de numeros impares: " + contador);
    }


    // =====================================================
    // 8. MATRIZ CON LOS CUADRADOS
    // =====================================================

    public static void matrizCuadrados() {

        int[][] cuadrados = new int[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                cuadrados[i][j] = matriz[i][j] * matriz[i][j];
            }
        }

        System.out.println("\n========== MATRIZ DE CUADRADOS ==========");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(cuadrados[i][j] + "\t");
            }

            System.out.println();
        }
    }


    // =====================================================
    // 9. DIAGONAL PRINCIPAL
    // =====================================================

    public static void diagonalPrincipal() {

        int suma = 0;

        for (int i = 0; i < 4; i++) {

            suma += matriz[i][i];
        }

        System.out.println("\nLa suma de la diagonal principal es: " + suma);
    }


    // =====================================================
    // 10. DIAGONAL INVERSA
    // =====================================================

    public static void diagonalInversa() {

        int suma = 0;

        for (int i = 0; i < 4; i++) {

            suma += matriz[i][3 - i];
        }

        System.out.println("\nLa suma de la diagonal inversa es: " + suma);
    }


    // =====================================================
    // 11. MEDIA DE TODOS LOS VALORES
    // =====================================================

    public static void media() {

        int suma = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                suma += matriz[i][j];
            }
        }

        double media = (double) suma / 16;

        System.out.println("\nLa media de todos los valores es: " + media);
    }
}