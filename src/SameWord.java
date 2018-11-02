public class SameWord {
    public int calc(String[] words) {

        int result = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char val = words[i].charAt(i);
                words[i] = words[i].replaceAll(String.valueOf(val), String.valueOf(j));
            }
        }
        return result;
    }
}
