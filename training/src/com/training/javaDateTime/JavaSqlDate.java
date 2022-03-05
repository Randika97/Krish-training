package com.training.javaDateTime;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;

public class JavaSqlDate {
    public static void main(String[] args) {

        //Get current date using sql time
        long millis=System.currentTimeMillis();
        Date date=new Date(millis);
        System.out.println(date);

        //convert string date into java.sql.Date using the valueOf()
        String str="2015-03-31";
        Date strDate=Date.valueOf(str);
        System.out.println(strDate);

        // use of  instance of toLocalDate() method.
        LocalDateTime dtm = LocalDateTime.now();
        System.out.println("The date is: " + dtm);
        // using the toLocalDate() method remove the time part and get the date
        System.out.println("The date is: " + dtm.toLocalDate());


        //usage of toInstant() method.

        // Creating an object of Calendar
        Calendar calender = Calendar.getInstance();
        // Setting the Month
        calender.set(Calendar.MONTH, 07);
        // Setting Date
        calender.set(Calendar.DATE, 07);
        // Setting Year
        calender.set(Calendar.YEAR, 1997);
        // Creating an object of the class Date
        java.util.Date d = calender.getTime();
        Instant inst = d.toInstant();
        System.out.println("The original Date is: " + d.toString());
        System.out.println("The instant is: " + inst);

    }
}
