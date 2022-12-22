package regular;
import java.util.Scanner;

public class RegularD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Пожалуйста введите дату в формате:
                1) дд.мм.гггг или дд.мм.гг
                2) гггг-мм-дд
                3) дд/IV/гггг""");
        String dataV = sc.nextLine();
        if (dataV.matches("(0?[1-9]|[12][0-9]|3[01])(\\W)(0?[1-9]|1[012])(\\W)((19|20)\\d\\d|0?[1-9]04|[1-9][1-9])")) {
            System.out.println("Дата подходит под 1 выражение!");
        } else {
            System.out.println("Дата не подходит под 1 выражение");
        }

        if (dataV.matches("((19|20)\\d\\d)(\\W)(0?[1-9]|1[012])(\\W)(0?[1-9]|[12][0-9]|3[01])")) {
            System.out.println("Дата подходит под 2 выражение!");
        } else {
            System.out.println("Дата не подходит под 2 выражение");
        }

        if (dataV.matches("(0?[1-9]|[12][0-9]|3[01])(\\W)([IXV]{1,3})(\\W)((19|20)\\d\\d)")) {
            System.out.println("Дата подходит под 3 выражение!");
        } else {
            System.out.println("Дата не подходит под 3 выражение");
        }
    }

}
