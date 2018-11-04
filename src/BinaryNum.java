public class BinaryNum {


    public static void binary(int num){

        if(num <=1){
            System.out.print(num);
        }
        else {
            binary(num/2);
            System.out.print(num%2);
        }
    }

}
