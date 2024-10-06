package Schet;
import Start.*;

public class Umnojit {
    public static double resoutUmnojit = 0;

    public static double answer () {
        resoutUmnojit = Question.A.get(0);
        for (int i = 1; i < Question.A.size(); i++) {
            resoutUmnojit = resoutUmnojit * Question.A.get(i);
        }
        System.out.println(resoutUmnojit);
        return resoutUmnojit;
    }
}
