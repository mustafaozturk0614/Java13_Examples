package com.bilgeadam.lesson034;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
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



    }
}
