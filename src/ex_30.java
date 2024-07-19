public class ex_30 {
    public static void fizzBuzz(int begin, int end) {
        var i = begin;
         while (i <= end) {
            if (i % 3 == 0) {System.out.println("Fizz");}
            else if (i % 5 == 0) {System.out.println("Buzz");}
            else if (i % 3 == 0 && i % 5 == 0) {System.out.println("FizzBuzz");}
            else {System.out.println(i);}
             i += 1;   }
        }
}
