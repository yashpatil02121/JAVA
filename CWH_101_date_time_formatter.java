package com.company;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt  = LocalDateTime.  now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("E");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);
        System.out.println(myDate);

    }
}
