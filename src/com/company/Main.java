package com.company;
import java.util.Calendar;

import static java.lang.System.out;
public class Main {
    static int DAY=1000*60*60*24;

    public static void main(String[] args) {
	// write your code here
        Calendar c=Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();

        for (int i=0;i<60;i++){
            day1 += (DAY * 29.52);

            c.setTimeInMillis(day1);

            out.println(String.format("full moon on %tc",c));

        }


    }


}
