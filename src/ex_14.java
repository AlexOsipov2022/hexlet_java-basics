import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ex_14 {
//Рассчитаем количество дней между двумя датами, используя встроенные возможности Java.
public static void countday() {
            // С даты
    LocalDate dateFrom = LocalDate.of(2024, Month.MAY, 30);
// По дату
    LocalDate dateTo = LocalDate.of(2024, Month.JULY, 29);
// Количество дней между этими датами
    long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
    System.out.println(noOfDaysBetween);
        }
    }
