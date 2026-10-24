/// by uran
public class Java9 {
  public static void main(String[] args) {
    for (int i = 100; i <= 999; i++) {
      if (isArmstrong(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static boolean isArmstrong(int n) {
    int sum = 0;
    int temp = n;
    while (temp > 0) {
      int digit = temp % 10;
      sum += digit * digit * digit;
      temp /= 10;
    }
    return sum == n;
  }
}