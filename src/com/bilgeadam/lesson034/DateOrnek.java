package com.bilgeadam.lesson034;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOrnek {


    public static void main(String[] args) {
        long sure=System.currentTimeMillis()-24*60*60*1000;
        Date date=new Date();
        System.out.println(date);
        Date date2=new Date(sure);
        System.out.println(date2);
        System.out.println(date.getTime());

        LocalDate localDate=LocalDate.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localDateTime);
        LocalDate localDate1=LocalDate.of(2021,06,10);
        LocalDate localDate2=LocalDate.of(2020, Month.DECEMBER,10);
        System.out.println(localDate1);
        System.out.println(localDate2);
        /// String bir veriden tarih uretmek
        LocalDate localDate3=LocalDate.parse("1992-10-14");
        System.out.println(localDate3);
       // LocalDate localDate4=LocalDate.parse("10-10-1960");
     //  System.out.println(localDate4);
        System.out.println(localDate2.getDayOfYear());// yılın kacıncı gunu
        System.out.println(localDate2.getMonth());
        System.out.println(localDate2.getYear());
        System.out.println(localDate2.getDayOfMonth());
        System.out.println(localDate2.getDayOfWeek());
        System.out.println(localDate2.getDayOfWeek().getValue());
        System.out.println(localDate2.isLeapYear());
        System.out.println(localDate2.plusYears(2));
        System.out.println(localDate2);
        System.out.println(localDate2.plusMonths(2));
        System.out.println(localDate2.plusWeeks(1));
        System.out.println(localDate2.plusDays(1));
        System.out.println(localDate2.minusDays(5));
        System.out.println(localDate2.minusWeeks(5));
        System.out.println(localDate2.minusMonths(5));
        System.out.println(localDate2.minusYears(5));
        System.out.println(localDate2.isBefore(LocalDate.now()));
        System.out.println(localDate2.isAfter(LocalDate.now()));
        //  17/10/1990
        LocalDate localDate4=LocalDate.parse("1990-10-17");
        System.out.println(localDate4);


        //M==> ay
        // d==> gun
        // y==> yıl
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate localDate5=LocalDate.parse("17/10/1990",formatter);
        System.out.println(localDate5);
        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("MM/dd/yy");
        String stringDate=LocalDate.now().plusDays(2).format(formatter2);
        System.out.println(stringDate);
        String stringDate2="10/24/21";
        String defaultString="2021-10-24";
        LocalDate localDate6=LocalDate.parse(defaultString);
        System.out.println(localDate6);
        LocalDate localDate7=LocalDate.parse(stringDate2,formatter2);
        System.out.println(localDate7);

        LocalDate localDate8=LocalDate.now();
        LocalDate localDate9=LocalDate.parse("2022-12-10");

        long ay=localDate9.until(localDate8, ChronoUnit.MONTHS);
        System.out.println(ay);
        long ay2=localDate8.until(localDate9, ChronoUnit.MONTHS);
        System.out.println(ay2);
        long gun=localDate9.until(localDate8, ChronoUnit.DAYS);
        long yıl=localDate9.until(localDate8, ChronoUnit.YEARS);
        long week=localDate9.until(localDate8, ChronoUnit.WEEKS);
        long yuzyıl=localDate9.until(localDate8, ChronoUnit.CENTURIES);
        System.out.println("gun"+gun);
        System.out.println("yıl "+yıl);
        System.out.println("hafta "+week);
        System.out.println("yuzyıl "+yuzyıl);
        long gun2=ChronoUnit.DAYS.between(localDate9,localDate8);
        System.out.println(gun2);


    }
}
