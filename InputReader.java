import java.util.Scanner;

public class InputReader {
    
    private Scanner scanner;
    
    public InputReader() {
        scanner = new Scanner(System.in);
    }
    
    public int readNumber() {
        System.out.print("Introduce un numero: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
