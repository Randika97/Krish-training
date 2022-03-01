package com.training.javaDateTime;

import java.util.Calendar;

public class JavaCalender {
    public static void main(String[] args) {

        //usage of getInstance() method
        //this will return a Date object representing this Calendar's time value
        Calendar calender1 = Calendar.getInstance();
        System.out.println("The Current Date is:" + calender1.getTime());

        // usage of Calendar's get()method
        System.out.println("Current Calendar's Year: " + calender1.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calender1.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calender1.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calender1.get(Calendar.SECOND));

        //usage getMaximum() method
        int max = calender1.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in a week: " + max);
        max = calender1.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in a year: " + max);

        //usage of getMinimum() method
        int min = calender1.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + min);
        min = calender1.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + min);

        //using add() method
        calender1.add(Calendar.DATE, -5);
        System.out.println("5 days ago: " + calender1.getTime());
        calender1.add(Calendar.MONTH, 7);
        System.out.println("7 months after: " + calender1.getTime());
        calender1.add(Calendar.YEAR, 7);
        System.out.println("7 years later: " + calender1.getTime());



    }
}
