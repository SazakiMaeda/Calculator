package Start;

import Schet.*;
import Start.Fail.Fail;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    public static ArrayList<Double> A = new ArrayList<>();
    private static int num = 1;
    private static int resout;
    public static Scanner sc = new Scanner(System.in);

    public static void calculateQuestion() {
        while (!Fail.end) {
            System.out.println("Напишите " + num + " число.");
            num++;
            if (sc.hasNextDouble()) {
                A.add(sc.nextDouble());
            } else {
                sc.next();
                num--;
                Fail.wrong();
            }
            System.out.println("Введённые числа: " + A);
        }
    }

    public static void start() {
        System.out.println("Какое действие ты хочет совершить?");
        System.out.println("1. Сложить.");
        System.out.println("2. Вычесть.");
        System.out.println("3. Умножить.");
        System.out.println("4. Делить.");
        System.out.println("5. Процент.");
        System.out.println("6. Степень.");
        resout = sc.nextInt();
        if (resout == 1) {
            Question.calculateQuestion();
            Sum.answer();
        } else if (resout == 2) {
            Question.calculateQuestion();
            Minus.answer();
        } else if (resout == 3) {
            Question.calculateQuestion();
            Umnojit.answer();
        } else if (resout == 4) {
            Question.calculateQuestion();
            Delenie.answer();
        } else if (resout == 5) {
            Procent.answer();
        } else if (resout == 6) {
            Stepen.answer();
        } else {
            System.out.println("Ошибка, выбери цифру из списка.");
        }
        sc.close();
    }
}
