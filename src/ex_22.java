public class ex_22 {
            public static boolean isLeapYear(Integer year) {
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        }
    }
