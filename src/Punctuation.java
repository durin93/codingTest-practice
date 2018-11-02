public class Punctuation {


    public String calc(String document) {
        document = document.replaceAll("!+", "!");
        document = document.replaceAll("!+\\?+", "?");
        document = document.replaceAll("\\?+!+", "?");
        document = document.replaceAll("\\?+\\?+", "?");

        return document;
    }

}
