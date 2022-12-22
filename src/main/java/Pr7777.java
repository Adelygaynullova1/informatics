import java.util.Scanner;
public class Pr7777{
    public static void main(String[] args) {
        System.out.println("Введите несколько чисел через пробел и затем Enter ");
        Scanner sc = new Scanner(System.in);
        String[] st1 = sc.nextLine().split(" "); // читаем всю строку, разделяем по пробелам, и собираем в строковой массив 
        int r = 0;
        String vuvod = "";
        for (String number : st1) {  // перебор элементов массива
            if (check(number)) {
                r+=1;
                vuvod = vuvod + number+ " ";
            }
        }
        if (r==3){
            System.out.println("Нашлось три числа, удовлетворяющих условиям!");
            System.out.println(vuvod);
        } else{
            System.out.println("Трёх чисел, удовлетворяющих условиям, в вашем наборе не нашлось");
        }
    }

    public static boolean check(String numbers) {
        int maxi = 1000000;
        for (char cifra : numbers.toCharArray()) {
            if (maxi <= cifra){
                return false;
            } else{
                maxi = cifra;}
        }
        return true;
    }
}