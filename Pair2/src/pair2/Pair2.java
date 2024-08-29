package pair2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pipevelasquezj
 * @param <T>
 * @param <U>
 */
public class Pair2<T, U> {

    private final T first;
    private final U second;

   
    public Pair2(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pair2<String, Integer>> personas = new ArrayList<>();
        ArrayList<Pair2<String, String>> datosExtras = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar nuevo usuario");
            System.out.println("2. Ver registros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                   
                    System.out.println("Digite su nombre:");
                    String nombre = scanner.nextLine();

                    System.out.println("Digite su edad:");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.println("Digite su Eps:");
                    String eps = scanner.nextLine();

                    System.out.println("Digite su fecha de nacimiento (formato: dd/mm/aaaa):");
                    String fecha = scanner.nextLine();

                   
                    Pair2<String, Integer> persona = new Pair2<>(nombre, edad);
                    personas.add(persona);

                    Pair2<String, String> datos = new Pair2<>(eps, fecha);
                    datosExtras.add(datos);

                    System.out.println("Usuario ingresado con éxito.");
                    break;

                case 2:
                    
                    System.out.println("\nRegistros ingresados:");
                    if (personas.isEmpty()) {
                        System.out.println("No hay registros disponibles.");
                    } else {
                        for (int i = 0; i < personas.size(); i++) {
                            Pair2<String, Integer> personaReg = personas.get(i);
                            Pair2<String, String> datosReg = datosExtras.get(i);

                            System.out.println("\nRegistro " + (i + 1) + ":");
                            System.out.println("Nombre: " + personaReg.getFirst());
                            System.out.println("Edad: " + personaReg.getSecond());
                            System.out.println("Eps: " + datosReg.getFirst());
                            System.out.println("Fecha de nacimiento: " + datosReg.getSecond());
                        }
                    }
                    break;

                case 3:
                   
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }
}





