import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir cantidad de estudiantes y examenes
        System.out.print("Ingresa la cantidad de estudiantes: ");
        int n = entrada.nextInt();

        System.out.print("Ingresa la cantidad de examenes: ");
        int m = entrada.nextInt();

        // Matriz de calificaciones
        double[][] calificaciones = new double[n][m];

        // Arreglo para guardar los promedios
        double[] promedios = new double[n];

        // ==========================================
        // LLENAR LA MATRIZ
        // ==========================================

        for (int i = 0; i < n; i++) {

            System.out.println("\nEstudiante " + (i + 1));

            for (int j = 0; j < m; j++) {

                do {

                    System.out.print("Calificacion del examen "
                            + (j + 1) + ": ");

                    calificaciones[i][j] = entrada.nextDouble();

                    if (calificaciones[i][j] < 0 ||
                        calificaciones[i][j] > 10) {

                        System.out.println(
                            "La calificacion debe estar entre 0 y 10.");
                    }

                } while (calificaciones[i][j] < 0 ||
                         calificaciones[i][j] > 10);
            }
        }

        // ==========================================
        // MOSTRAR MATRIZ ORIGINAL
        // ==========================================

        System.out.println("\n========== CALIFICACIONES ==========");

        for (int i = 0; i < n; i++) {

            System.out.print("Estudiante " + (i + 1) + ": ");

            for (int j = 0; j < m; j++) {

                System.out.print(calificaciones[i][j] + "\t");
            }

            System.out.println();
        }

        // ==========================================
        // 1. PROMEDIO DE CADA ESTUDIANTE
        // ==========================================

        for (int i = 0; i < n; i++) {

            double suma = 0;

            for (int j = 0; j < m; j++) {

                suma += calificaciones[i][j];
            }

            promedios[i] = suma / m;
        }

        System.out.println("\n========== PROMEDIOS ==========");

        for (int i = 0; i < n; i++) {

            System.out.printf(
                "Estudiante %d: %.2f%n",
                (i + 1),
                promedios[i]
            );
        }

        // ==========================================
        // BUSCAR EL MEJOR PROMEDIO
        // ==========================================

        double mejorPromedio = promedios[0];

        for (int i = 1; i < n; i++) {

            if (promedios[i] > mejorPromedio) {

                mejorPromedio = promedios[i];
            }
        }

        // ==========================================
        // 2. ESTUDIANTES CON MEJOR PROMEDIO
        // ==========================================

        System.out.println("\n========== MEJOR PROMEDIO ==========");

        System.out.printf(
            "Mejor promedio: %.2f%n",
            mejorPromedio
        );

        System.out.println("Estudiante(s) con el mejor promedio:");

        for (int i = 0; i < n; i++) {

            if (promedios[i] == mejorPromedio) {

                System.out.println(
                    "Estudiante " + (i + 1)
                );
            }
        }

        // ==========================================
        // MATRIZ NUEVA: PROMEDIOS ENTRE 9 Y 10
        // ==========================================

        int cantidadMejores = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] >= 9 && promedios[i] <= 10) {

                cantidadMejores++;
            }
        }

        double[][] alumnos9a10 = new double[cantidadMejores][2];

        int posicion = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] >= 9 && promedios[i] <= 10) {

                alumnos9a10[posicion][0] = i + 1;
                alumnos9a10[posicion][1] = promedios[i];

                posicion++;
            }
        }

        System.out.println("\n========== ALUMNOS CON PROMEDIO 9 A 10 ==========");

        if (cantidadMejores == 0) {

            System.out.println("No hay estudiantes con promedio entre 9 y 10.");

        } else {

            for (int i = 0; i < alumnos9a10.length; i++) {

                System.out.printf(
                    "Estudiante %.0f - Promedio: %.2f%n",
                    alumnos9a10[i][0],
                    alumnos9a10[i][1]
                );
            }
        }

        // ==========================================
        // 3. ESTUDIANTES CON PROMEDIO MENOR A 7
        // ==========================================

        int cantidadBajos = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] < 7) {

                cantidadBajos++;
            }
        }

        double[][] alumnosMenor7 = new double[cantidadBajos][2];

        posicion = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] < 7) {

                alumnosMenor7[posicion][0] = i + 1;
                alumnosMenor7[posicion][1] = promedios[i];

                posicion++;
            }
        }

        System.out.println("\n========== ALUMNOS CON PROMEDIO MENOR A 7 ==========");

        if (cantidadBajos == 0) {

            System.out.println("No hay estudiantes con promedio menor a 7.");

        } else {

            for (int i = 0; i < alumnosMenor7.length; i++) {

                System.out.printf(
                    "Estudiante %.0f - Promedio: %.2f%n",
                    alumnosMenor7[i][0],
                    alumnosMenor7[i][1]
                );
            }
        }

        // ==========================================
        // 4. EXAMEN CON MAYOR PROMEDIO
        // ==========================================

        double mayorPromedioExamen = 0;
        int examenMayor = 0;

        for (int j = 0; j < m; j++) {

            double suma = 0;

            for (int i = 0; i < n; i++) {

                suma += calificaciones[i][j];
            }

            double promedioExamen = suma / n;

            if (j == 0 || promedioExamen > mayorPromedioExamen) {

                mayorPromedioExamen = promedioExamen;
                examenMayor = j;
            }
        }

        System.out.printf(
            "\nEl examen con mayor promedio fue el examen %d con %.2f%n",
            (examenMayor + 1),
            mayorPromedioExamen
        );

        // ==========================================
        // 5. EXAMEN CON MENOR PROMEDIO
        // ==========================================

        double menorPromedioExamen = 0;
        int examenMenor = 0;

        for (int j = 0; j < m; j++) {

            double suma = 0;

            for (int i = 0; i < n; i++) {

                suma += calificaciones[i][j];
            }

            double promedioExamen = suma / n;

            if (j == 0 || promedioExamen < menorPromedioExamen) {

                menorPromedioExamen = promedioExamen;
                examenMenor = j;
            }
        }

        System.out.printf(
            "El examen con menor promedio fue el examen %d con %.2f%n",
            (examenMenor + 1),
            menorPromedioExamen
        );

        entrada.close();
    }
}