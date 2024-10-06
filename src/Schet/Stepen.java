package Schet;

import Start.Fail.Fail;

import java.util.Scanner;

public class Stepen {
    public static Scanner sc = new Scanner(System.in);
    private static String exit = "Exit";

    public static void answer() {
        double resoutStepen;
        System.out.println("Введи число для возведения в степень: ");
        while (!Fail.end) {
            if (sc.hasNextDouble()) {
                resoutStepen = sc.nextDouble();
                double num = resoutStepen;
                resoutStepen = resoutStepen * resoutStepen;
                if (resoutStepen % 1 == 0) {
                    System.out.println("Степень числа " + (int) num + " = " + (int) resoutStepen);
                } else {
                    System.out.println("Степень числа " + num + " = " + resoutStepen);
                }
            } else {
                sc.next();
                Fail.wrong();
            }
        }
        sc.close();
    }
}