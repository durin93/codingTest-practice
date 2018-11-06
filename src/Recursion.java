public class Recursion {


    public static int factorial(int num) {

        //3
        //3*2*1 = 6
        if (num <= 1) {
            return num;
        }

        return num * factorial(num - 1);
    }

    public static int fibonacci(int num){

        if(num<=1){
            return num;
        }

        return fibonacci(num-1)+fibonacci(num-2);


    }

}
