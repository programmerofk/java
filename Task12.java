// электронные часы 2
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n %= 86400;
        int h = n / 3600;
        int m = (n % 3600) / 60;
        int s = n % 60;
        System.out.printf("%d:%02d:%02d%n", h, m, s);
    }
}