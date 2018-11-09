public class ReverseCheck {


    public static boolean checkString(String level) {


        int length = level.length();

        String a = "";
        String b = "";


        return level.equals(new StringBuffer(level).reverse().toString());
/*
        if (length % 2 != 0) {

            int mid = length / 2;

            for (int i = 0; i < mid; i++) {
                a += level.charAt(i);
            }
            for (int i = mid + 1; i < length; i++) {
                b += level.charAt(i);
            }

        }

        //llll
        else {
            int mid = length / 2;
            for (int i = 0; i < mid; i++) {
                a += level.charAt(i);
            }
            for (int i = mid; i < length; i++) {
                b += level.charAt(i);
            }

        }

        b = new StringBuffer(b).reverse().toString();



        return a.equals(b);*/
    }
}
