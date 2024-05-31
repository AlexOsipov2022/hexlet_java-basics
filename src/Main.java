import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           System.out.print("Введите строку: ");
       String res = scan.nextLine();
       System.out.println(res.toUpperCase().charAt(0) + res.toLowerCase().substring(1));
    }
}

