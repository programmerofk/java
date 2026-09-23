// сумма цифр
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n / 100 + (n / 10) % 10 + n % 10;
        System.out.println(sum);
        sc.close();
    }
}