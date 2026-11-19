/// by uran
import java.util.Scanner;

public class JavaFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Words = 0");
        } else {
            int count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (i < s.length() - 1 && s.charAt(i + 1) != ' ') {
                        count++;
                    }
                }
            }
            System.out.println("Words = " + count);
        }
        sc.close();
    }
}