// мкад
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        int pos = ((v * t) % 109 + 109) % 109;
        System.out.println(pos);
        sc.close();
    }
}