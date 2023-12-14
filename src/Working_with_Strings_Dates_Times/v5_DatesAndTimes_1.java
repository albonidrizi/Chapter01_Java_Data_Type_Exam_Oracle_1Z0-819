package Working_with_Strings_Dates_Times;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class v5_DatesAndTimes_1 {
    public static void main(String[] args) {
        System.out.println("\n** Datat dhe Koha, Pjesa 1 ** \n");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        localDate = LocalDate.of(2022,04,22);
        System.out.println(localDate);

        localTime = LocalTime.of(9,45,22,11);
        System.out.println(localTime);


        localDateTime = LocalDateTime.now();
        String dateTimeString = " "
                + localDateTime.getDayOfMonth() + " "
                + localDateTime.getMonth() + " "
                + localDateTime.getYear() + " "
                + localDateTime.getDayOfWeek() + " ";
        System.out.println(dateTimeString);



    }
}
