/// by uran
import java.util.Scanner;

public class JavaSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                result += c;
            }
        }

        System.out.println(result);
        sc.close();
    }
}