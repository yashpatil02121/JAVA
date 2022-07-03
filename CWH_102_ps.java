package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWH_102_ps {
    public static void main(String[] args) {
        //Q.1
        ArrayList ar = new ArrayList();
        ar.add("Student 1:");
        ar.add("Student 2:");
        ar.add("Student 3:");
        ar.add("Student 4:");
        ar.add("Student 5:");
        ar.add("Student 6:");
        ar.add("Student 7:");
        ar.add("Student 8:");
        ar.add("Student 9:");
        ar.add("Student 10:");
        for (Object o:ar)
        {
            System.out.println(o);
        }

        //Q.2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //Q.3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //Q.4
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m:s");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);
        System.out.println(myDate);

        //Q.5
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(2);
        s.add(3);
        System.out.println(s);



    }
}
