public class Prime {

    public static void getPrime(int num) {

        for(int i = 2; i <= num; i++){

            boolean prime = true;

            for(int j = 2; j < i; j++){

                if(i%j==0){
                    prime = false;
                }


            }

            if(prime){
                System.out.println(i);
            }


        }

    }

}
