import java.util.Scanner;
public class exp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(exponenta(sc.nextDouble()));
    }

    public static double exponenta(double x) {
        double q = x, n = 1, fuc = 1,expon = 0;
        while (x/fuc > 0.00001){
            expon = expon + x/fuc; //переменная, накапливающая сумму
            x = q * x; //возведение в степень
            fuc = n * fuc; // увеличение факториала с помощью умножения
            n += 1;
        }
        return expon;
    }

}