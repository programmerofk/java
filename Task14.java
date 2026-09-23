// Конец уроков
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 45 * n + 5 * (n / 2) + 15 * ((n - 1) / 2);

        int h = 9 + total / 60;
        int m = total % 60;

        System.out.println(h + " " + m);
    }
}