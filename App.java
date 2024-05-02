public class App
{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputReader inputReader = new InputReader();

        int num1 = inputReader.readNumber();
        int num2 = inputReader.readNumber();

        int resultado = calculator.divide(num1, num2);
        System.out.println("Resultado de la division: " + resultado);

    }
}
