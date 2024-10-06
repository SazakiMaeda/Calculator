package Start.Fail;

import Start.Question;

public class Fail {
    public static boolean end = false;
    private static double test;

    public static void wrong() {
        System.out.println("Ошибка, вы ввели не число.");
        System.out.println("Выберети нужный вариант: \n1. Продолжить. \n2. Выйти (решение).");
        test = Question.sc.nextDouble();
        if (test == 1) {
            System.out.println("Продолжаем.");
        } else if (test == 2) {
            end = true;
        } else {
            System.out.println("Ты долбаеб? Выбери из ДВУХ варинатов ОДИН!");
        }
    }
}
