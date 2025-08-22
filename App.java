import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputReader inputReader = new InputReader();
        Scanner scanner = new Scanner(System.in);

        int num1 = inputReader.readNumber();
        int num2 = inputReader.readNumber();
        int opcion = 0;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Division");
            System.out.println ("5. Cancelar operaión");
            System.out.println("¿Qué operación deseas realizar?");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            int resultado = 0; 
            switch (opcion) {
                case 1:
                    resultado = calculator.suma(num1, num2);
                    System.out.println("Resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = calculator.resta(num1, num2);
                    System.out.println("Resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = calculator.multiplica(num1, num2);
                    System.out.println("Resultado de la multiplicacion es: " + resultado);
                    break;
                case 4:
                    try {
                        resultado = calculator.divide(num1, num2);
                        System.out.println("Resultado de la división es: " + resultado);
                        break;
                    }
                    catch (Exception n2) {
                        System.out.println ("No se puede dividir por cero");
                    }
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

    }
}
