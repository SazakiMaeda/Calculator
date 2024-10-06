package Schet;
import Start.*;

public class Delenie {
    public static double resoutDelenie = 0;

    public static double answer () {
        resoutDelenie = Question.A.get(0);
        for (int i = 1; i < Question.A.size(); i++) {
            resoutDelenie = resoutDelenie / Question.A.get(i);
        }

        for (int i = 1; i < Question.A.size(); i++) {
            if (Question.A.get(i) == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                System.out.println(resoutDelenie);
                break;
            }
        }
        return resoutDelenie;
    }
}