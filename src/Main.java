public class Main {

    public static void main(String[] args) {

        Azimuth azimuth = new Azimuth();


        String[] instructions = {"LEFT","LEFT","TURN AROUND"};
        String[] instructions2 = {"LEFT 5","RIGHT 10","LEFT 15","RIGHT 20","LEFT 25","RIGHT 30","LEFT 35","RIGHT 40"};
        String[] instructions3 = {"RIGHT 59","RIGHT","RIGHT","HALT","LEFT","LEFT","LEFT"};
        String[] instructions4 = {"TURN AROUND","HALT","LEFT 5","HALT","LEFT 5","HALT"};
        azimuth.calc(instructions4);

        System.out.println(azimuth.getResult());


    }
}
