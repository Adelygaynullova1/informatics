package ru.itis.informatics.lab07.model;
import java.util.Scanner;


public class regularvurag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.matches("([0][1-9]|[1][1-9]|[2][1-9]|[3][0-1])?(\\W)([0][1-9]|[1][0-2]|I|II|III|IV|V|VI|VII|VIII|IX|X])(\\W)([0][1-9]|[1-9][1-9]|[0-2][0-9][0-9][0-9])")) {
            System.out.println("Совпадает");
        }else{
            System.out.println("Не совпадает");
        }
        if (text.matches("([0-2][0-9][0-9][0-9])(\\W)([0][1-9]|[1][0-2]|I|II|III|IV|V|VI|VII|VIII|IX|X])(\\W)([0][1-9]|[1][1-9]|[2][1-9]|[3][0-1])")) {
            System.out.println("Совпадает");
        }else{
            System.out.println("Не совпадает");
        }

    }


}
