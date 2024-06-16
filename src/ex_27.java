public class ex_27 {
        public static int countChars(String str, char ch) {
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            var strinngg = str.charAt(i);
            if (Character.toLowerCase(strinngg) == Character.toLowerCase(ch)) {
                count = count + 1;
            }
            i += 1;
        }
        return count;
    }
}
