public class ex_20 {
    public static String getHiddenCard(String number, Integer x) {
        return "*".repeat(x) + number.substring(12);
    }
    public static String getHiddenCard(String number) {
       // return "*".repeat(4) + number.substring(12);
       return ex_20.getHiddenCard(number, 4);
    }
    }
