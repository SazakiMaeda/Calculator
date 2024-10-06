package Schet;

import Start.Fail.Fail;
import java.util.Scanner;

public class Procent {
    private static double A;
    private static double B;
    private static Scanner sc = new Scanner(System.in);

    public static void answer() {
        if (sc.hasNextDouble()) {
            System.out.println("Введи число: ");
            A = sc.nextDouble();
            System.out.println("Введи процент: ");
            B = sc.nextDouble();
            System.out.println((A * B) / 100);
            sc.close();
        } else {
            sc.next();
            Fail.wrong();
        }
    }
}

