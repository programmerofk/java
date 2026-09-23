// следующее и предыдущее
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("The next number for the number " + n + " is " + (n + 1) + ".");
        System.out.println("The previous number for the number " + n + " is " + (n - 1) + ".");
        
        scanner.close();
    }
}