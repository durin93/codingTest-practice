public class Azimuth {

    private int result = 0;

    public int calc(String[] instructions) {
        for (String str : instructions) {
            String direction = str.trim();
            if (direction.contains("RIGHT")) {
                result += checkRight(direction);
            }
            if (direction.contains("LEFT")) {
                result += checkLeft(direction);
            }
            if (direction.contains("TURN")) {
                result += 180;
            }
            if (direction.equals("HALT")) {
                return result;
            }
        }
        return result;
    }


    public int checkRight(String direction) {
        if (direction.length() == 5) {
            return 90;
        }
        return Integer.parseInt(direction.substring(6));
    }

    public int checkLeft(String direction) {
        if (direction.length() == 4) {
            return -90;
        }
        return -Integer.parseInt(direction.substring(5));
    }

    public int getResult() {
        return result;
    }
}
