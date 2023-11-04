import java.util.*;
public class cool 
{
    Scanner sc = new Scanner(System.in);
    int M;
    int N;
    cool() 
    {
        M = 0;
        N = 0;
    }
    void read() 
    { 
        System.out.println("Enter Lower Limit= ");
        M = sc.nextInt();
        System.out.println("Enter Upper Limit= ");
        N = sc.nextInt();
    }
    void generate() 
    {
        System.out.println("Cool Numbers Are= ");
        for (int k = M; k <= N; k++) {
            String str = k + "";
            int[] digits = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                digits[i] = str.charAt(i) - '0';
            }
            int total = 0;
            for (int i = 0; i < digits.length; i++) {
                total += digits[i];
            }
            if (total % 2 == 0) {
                total = total / 2;
                boolean[] ans = new boolean[total + 1];
                ans[0] = true;
                for (int i = 0; i < digits.length; i++) {
                    for (int j = total; j >= digits[i]; j--) {
                        ans[j] = ans[j] || ans[j - digits[i]];
                    }
                }
                if (ans[total]) {
                    System.out.println(k);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        cool ob = new cool();
        ob.read();
        ob.generate();
    }
}