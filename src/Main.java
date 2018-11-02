import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
/*

        Azimuth azimuth = new Azimuth();
        String[] instructions = {"LEFT","LEFT","TURN AROUND"};
        String[] instructions2 = {"LEFT 5","RIGHT 10","LEFT 15","RIGHT 20","LEFT 25","RIGHT 30","LEFT 35","RIGHT 40"};
        String[] instructions3 = {"RIGHT 59","RIGHT","RIGHT","HALT","LEFT","LEFT","LEFT"};
        String[] instructions4 = {"TURN AROUND","HALT","LEFT 5","HALT","LEFT 5","HALT"};
        azimuth.calc(instructions4);
        System.out.println(azimuth.getResult());

        String problem1 = "This cheese is really great!!!!!";
        String problem2 = "You really like THIS cheese!?!?!?!!!?";
        String problem3 = "a??a ?!a a!?b b!?!C C?!!D D?!?EE ??? FF!!! !???!";
        String problem4 = " a b c A B ! !!C!!! ! ! !C ?!!? ?!? ??";
        String problem5 = " !!?X! ?? This is delicious!!! ??!a!?!";
        Punctuation punctuation = new Punctuation();

        System.out.println(punctuation.calc(problem1));
        System.out.println(punctuation.calc(problem2));
        System.out.println(punctuation.calc(problem3));
        System.out.println(punctuation.calc(problem4));
        System.out.println(punctuation.calc(problem5));
*/

        String[] words = {"abca","zbxz","opqr"};
        SameWord sameWord = new SameWord();

        System.out.println(sameWord.calc(words));

    }
}
