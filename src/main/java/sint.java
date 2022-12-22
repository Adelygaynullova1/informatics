import java.lang.Math;
import java.util.Scanner;

public class sint {
    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    static double p(double x, double x0, int n) {
        double PT = Math.pow(-1, n) * (Math.pow(x-x0, 2*n+1)/factorial(2*n+1));
        return PT;
    }

    static double r(double x, int n) {
        double rn = Math.pow(x, n+1)/factorial(n+1);
        return Math.abs(rn);
    }

    static double sum(double x, double x0, int n) {
        double sum = 0;
        for (int i = 0; i <= n; ++i) {
            sum += p(x, x0, i);
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x0 = 0;
        System.out.println("Give x. ");
        double x = sc.nextDouble();
        System.out.println("Give E. ");
        double e = sc.nextDouble();
        System.out.println("Give N. ");
        int n = sc.nextInt();
        int i = 0;
        //System.out.println(e<r(x, i) && i<n);
        //System.out.println(r(x, i));
        while((r(x, i)<e) && i<n) {
            i++;
            System.out.println("N is : "+i);
            System.out.println("P is : "+p(x,x0,n));
            System.out.println("E is : "+r(x,n));
        }
    }
}