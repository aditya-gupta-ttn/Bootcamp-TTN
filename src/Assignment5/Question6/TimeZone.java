package Assignment5.Question6;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZone{
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));


        System.out.println("Current Date & Time in New York: " + newYorkTime.format(formatter));
        System.out.println("Current Date & Time in London: " + londonTime.format(formatter));
        System.out.println("Current Date & Time in Tokyo: " + tokyoTime.format(formatter));
    }
}

