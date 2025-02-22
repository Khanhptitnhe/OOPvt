import java.util.*;
import java.math.BigInteger;

public class Main {

    // Hàm kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(long n) {
        if (n < 2) return false;

        long sum = 1; // Bắt đầu với ước số 1
        long sqrtN = (long) Math.sqrt(n);

        for (long i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Số lượng test case

        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(isPerfectNumber(n) ? 1 : 0);
        }
        scanner.close();
    }
}
