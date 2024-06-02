
public class ex_23 {
    public static String convertString(String input) {
               if (input == null || input.isEmpty()) {
            return "";
        }

        char firstChar = input.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            return input;
        } else {
            return new StringBuilder(input).reverse().toString();
        }
    }
}
//public static String convertString(String line)  {
//if (line.equals("")) {
//        return "";}
//   else if (Character.isUpperCase(line.charAt(0))) {
//        return line; }
//        else {
//        return StringUtils.reverse(line);
//        }