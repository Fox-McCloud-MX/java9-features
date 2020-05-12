package com.mx.java9.features.stream.of.dates;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOfDates {

    public static void main(String[] args) {
        System.out.println(getDaysInJava9(LocalDate.now(), LocalDate.now().plusDays(10)));
        /*[ 2017-07-31,
            2017-08-01,
            2017-08-02,
            2017-08-03,
            2017-08-04,
            2017-08-05,
            2017-08-06,
            2017-08-07,
            2017-08-08,
            2017-08-09
          ]
         */

        System.out.println(getDaysInJava9Weeks(LocalDate.now(), LocalDate.now().plusWeeks(10)));
        /*[ 2017-07-31,
            2017-08-07,
            2017-08-14,
            2017-08-21,
            2017-08-28,
            2017-09-04, 
            2017-09-11,
            2017-09-18,
            2017-09-25,
            2017-10-02
          ]
        */
    }

    //Stream of dates with 1 day difference
    public static List<LocalDate> getDaysInJava9(LocalDate start, LocalDate end) {
        return start.datesUntil(end).collect(Collectors.toList());
    }

    //Stream of dates with 1 week difference
    public static List<LocalDate> getDaysInJava9Weeks(LocalDate start, LocalDate end) {
        return start.datesUntil(end, Period.ofWeeks(1)).collect(Collectors.toList());
    }

}
