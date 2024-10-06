package Schet;
import Start.*;

public class Minus {
    public static double resoutMinus = 0;

    public static double answer () {
        for (int i = 0; i < Question.A.size(); i++) {
            resoutMinus = resoutMinus - Question.A.get(i);
        }
        System.out.println(resoutMinus);
        return resoutMinus;
    }
}
