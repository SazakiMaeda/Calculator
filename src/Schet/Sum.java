package Schet;
import Start.*;

public class Sum {
    public static double resoutSum = 0;

    public static double answer () {
        for (int i = 0; i < Question.A.size(); i++) {
            resoutSum = resoutSum + Question.A.get(i);
        }
        System.out.println(resoutSum);
        return resoutSum;
    }
}
