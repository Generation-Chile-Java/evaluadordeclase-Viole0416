package EjercicioClase;

import java.util.Scanner;

import java.util.Scanner;

    public class EvaluadorDeClases {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            double notaMatematicas, notaCiencias, notaHistoria, notaLengua;

            // Pedimos al usuario que ingrese las notas
            System.out.println("Por favor ingresa tus notas en las siguientes materias:");

            System.out.print("Matemáticas: ");
            notaMatematicas = sc.nextDouble();

            System.out.print("Ciencias: ");
            notaCiencias = sc.nextDouble();

            System.out.print("Historia: ");
            notaHistoria = sc.nextDouble();

            System.out.print("Lengua: ");
            notaLengua = sc.nextDouble();

            // Evaluar cada nota
            evaluarNota(notaMatematicas, "Matemáticas");
            evaluarNota(notaCiencias, "Ciencias");
            evaluarNota(notaHistoria, "Historia");
            evaluarNota(notaLengua, "Lengua");

            sc.close();
        }

        // nuevo metodo para evaluar las notas
        public static void evaluarNota(double nota, String materia) {
            System.out.println( materia + ":");

            if (nota >= 1.0 && nota <= 3.0) {
                System.out.println("No aprobaste");
            } else if (nota > 3.0 && nota <= 5.0) {
                System.out.println("No aprobaste, la nota es muy baja");
            } else if (nota > 5.0 && nota <= 8.0) {
                System.out.println("Tu nota es Aceptable, aprobaste.");
            } else if (nota > 8.0 && nota <= 10.0) {
                System.out.println("¡Felicidades! Aprobaste");
            } else {
                System.out.println("El valor ingresado no es válido");
            }
        }
    }