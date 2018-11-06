public class Factorial {


    public static int factorial(int num) {

        //3
        //3*2*1 = 6
        if (num <= 1) {
            return num;
        }

        return num * factorial(num - 1);
    }

}
