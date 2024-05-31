import java.util.Scanner;

public class ex_12 {
        public static void printCapitalize(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String res = scan.nextLine();
            System.out.println(res.toUpperCase().charAt(0) + res.toLowerCase().substring(1));

    }
}
