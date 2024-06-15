public class ex_26 {
           public static String joinNumbersFromRange(int start, int finish) {
            var i=start;
            var res = "";
            while (i <= finish) {
                res = res + i;
                i = i + 1;
            }

            return res;

        }
    }