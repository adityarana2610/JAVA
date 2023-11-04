import java.util.*;
public class PrimeAdam 
{
    Scanner sc=new Scanner(System.in);
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
        int s = x;
        int r = 0;
        while (s > 0) {
            int rem = s % 10;
            r=r*10+ rem;
            s/=10;
        }
        s = (int) Math.pow(x, 2);
        int squareReversed = 0;
        while (s > 0) {
            int rem = s % 10;
            squareReversed = squareReversed * 10 + rem;
            s /= 10;
        }
        int revSquared = (int) Math.pow(r, 2);
        return squareReversed == revSquared;
    }
    void display() {
        int counter = 0;
        System.out.println("THE PRIME-ADAM INTEGERS ARE: ");
        String str = "";
        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isAdam(i)) {
                str += i + " ";
                counter++;}}
            
        
        if (str.equals("")) {
            System.out.println("NONE");
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
            PrimeAdam ob = new PrimeAdam(lower, upper);
            ob.display();
        }
    }
}