package Working_with_Strings_Dates_Times;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class v6_DatesAndTimes_2 {
    public static void main(String[] args) {

        System.out.println("\n** Datat dhe Koha, Pjesa 2 ** \n");

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        var pettern = DateTimeFormatter.ofPattern("EEEE,LLLL,dd,yyyy ' dhe ora eshte '  hh:mm");
        String dateTimeString = localDateTime.format(pettern);

        System.out.println(dateTimeString);


    }

}
