package com.training.javaDateTime;

import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        Date utildate = new Date( );

        // Displaying the current date and time
        System.out.println("Current date and time  : "+ utildate.toString() );

        // setTime() : java.util.Date.setTime() method is a java.util.Date class method.
        // Sets this Date object to represent a point in time that is time milliseconds after January 1, 1970 00:00:00 GMT.
        utildate.setTime(15680);
        System.out.println("Time after setting:  " + utildate.toString());

        //hashCode() : java.util.Date.hashCode() method is a java.util.Date class method.
        // Returns a hash code value for the Date object.
        // The result is exclusive OR of the two halves of the primitive long value returned by the getTime() method.
        int milli = utildate.hashCode();
        System.out.println("Amount (in ms) by which time"+" is shifted :  " + milli);

        // create 2 dates
        Date dateOne = new Date(2022, 07, 07);
        Date dateTwo = new Date(1997, 07, 07);

        //after() : java.util.Date.after() method tests if current date is after the given date.
        // Use of after() to check date2 is after date1
        boolean check = dateTwo.after(dateOne);
        System.out.println("Is date2 is after date1 : " + check);

        // Use of after() to check date1 is after date2
        check = dateOne.after(dateTwo);
        System.out.println("Is date1 is after date2 : " + check);
        System.out.println("");

        // clone() : java.util.Date.clone() method returns the duplicate of passed Date object.
        Object date3 = dateOne.clone();
        System.out.println("Cloned date3 :" + date3.toString());
        System.out.println("");
        // before() : java.util.Date.after() method tests if current date is before the given date.
        // Use of before() to check date2 is after date1
        boolean b = dateTwo.before(dateTwo);
        System.out.println("Is date2 is before date1 : " + b);

        //Create new date objects
        Date date1 = new Date(2022, 07, 07);
        Date date2 = new Date(97, 07, 07);

        // java.util.Date.compareTo() method compares two dates and results in -1, 0 or 1 based on the comparison.
        int compare = date1.compareTo(date2);    // d1 > d2
        int compare2 = date2.compareTo(date1);   // d2 > d1
        int compare3 = date1.compareTo(date1);   // d1 = d1

        System.out.println("d1 > d2 : " + compare);
        System.out.println("d1 < d2 : " + compare2);
        System.out.println("d1 = d1 : " + compare3);

        //  java.util.Date.equals() method checks whether two dates are equal or
        //  not based on their millisecond difference
        boolean eq1 = date1.equals(date2);
        System.out.println("Result of equal() eq1 : " + eq1);
        boolean eq2 = date1.equals(date1);
        System.out.println("Result of equal() eq2 : " + eq2);



        // java.util.Date.getTime() method results in count of milliseconds of the argumented date,
        // referencing January 1, 1970, 00:00:00 GMT
        long count1 = date1.getTime();
        long count2 = date1.getTime();
        System.out.println("Milliseconds of d1 : " + count1);
        System.out.println("Milliseconds of d2 : " + count2);
    }
}
