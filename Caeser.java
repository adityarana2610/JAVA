import java.util.*;
public class Caeser {
    Scanner sc=new Scanner(System.in);
    int N;
    int A[][];
    Caeser(){
        N=0;
        A=new int[0][0];
    }
    Caeser(int x){
        N=x;
        A=new int[N][N];
    }
    void generate() {
        int ul = 0;
        int ur = N - 1;
        int lr = N - 1;
        int ll = 0;
        int k = 1;
        for (k = 1; k <= (N * N); ) {
            for (int j = ll; j <= lr; j++) {
                A[ll][j] = k;
                k++;
            }
            for (int j = ll + 1; j <= ur; j++) {
                A[j][lr] = k;
                k++;
            }
            for (int j = ur - 1; j >= ul; j--) {
                A[ur][j] = k;
                k++;
            }
            for (int j = ur - 1; j > ll; j--) {
                A[j][ll] = k;
                k++;
            }
            ll++;
            lr--;
            ul++;
            ur--;
        }
    }
    void display()
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 2-D array: ");
        Caeser ob=new Caeser(sc.nextInt());
        ob.generate();
        ob.display();
    }
}
