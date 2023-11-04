import java.util.Scanner;
public class PrimeAdam2 {
    int m;
    int n;
    PrimeAdam(int lower, int upper) {
        m = lower;
        n = upper;
    }
    boolean isPrime(int N) {
        int fact = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                fact++;
            }
        }
        return fact == 2;
    }
    boolean isAdam(int x) {
        int store = x;
        int rev = 0;
        while (store > 0) {
            int rem = store % 10;
            rev = rev * 10 + rem;
            store /= 10;
        }
        store = (int) Math.pow(x, 2);
        int squareReversed = 0;
        while (store > 0) {
            int rem = store % 10;
            squareReversed = squareReversed * 10 + rem;
            store /= 10;
        }
        int revSquared = (int) Math.pow(rev, 2);
        return squareReversed == revSquared;
    }
    void display() {
        int counter = 0;
        System.out.println("THE PRIME-ADAM INTEGERS ARE: ");
        String str = "";
        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isAdam(i)) {
                str += i + " ";
                counter++;
            }
        }
        if (str.equals("")) {
            System.out.println("NIL");
        } else {
            System.out.println(str.trim());
        }
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS:" + counter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit:");
        int lower = sc.nextInt();
        System.out.println("Enter upper limit:");
        int upper = sc.nextInt();
        if (lower > upper) {
            System.out.println("Invalid input");
        } else {
            PrimeAdam obj = new PrimeAdam(lower, upper);
            obj.display();
        }
    }
}