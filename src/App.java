import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number = pedirDatos(entrada, "Ingrese un número: ");
        int counter = 0;
        while (number < 0) {
            number = pedirDatos(entrada, "Ingrese un número: ");
            counter++;
        }
        System.out.printf("La cantidad de números digitados es: %d.\n", counter);

    }

    public static int pedirDatos(Scanner entrada, String mensaje) {

        int number = 0;
        boolean validator = false;
        do {
            System.out.print(mensaje);
            if (entrada.hasNextInt()) {
                number = entrada.nextInt();
                validator = true;
            } else {
                System.out.println("Entrada inválida. Intente nuevamente.");
                entrada.next();
            }
        } while (!validator);

        return number;
    }
}
