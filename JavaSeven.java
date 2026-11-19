/// by uran
import java.util.Scanner;

public class JavaSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replace(' ', '_'));
        sc.close();
    }
}