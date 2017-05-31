package edu.osu.cs362;


import org.junit.Test;


import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
    private static final int NUM_TESTS=100;

    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
    }
    
    /**
     * Generate Random Tests that tests CalDay Class.
     */
    @Test
    public void radnomtest()  throws Throwable  {
	     
	long startTime = Calendar.getInstance().getTimeInMillis();
	long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 
	System.out.println("Start testing...");
	 
	for (int iteration = 0; elapsed < TestTimeout; iteration++) {
	    long randomseed =10;//System.currentTimeMillis();
//	    System.out.println(" Seed:"+randomseed );
	    Random random = new Random(randomseed);
	    
	    GregorianCalendar cal = new GregorianCalendar(2017, 5, 1);
	    CalDay calDay = new CalDay(cal);
	    
	    for (int i = 0; i < NUM_TESTS; i++) {
		int startMinute = ValuesGenerator.getRandomIntBetween(random, -1, 120);
		int startHour = ValuesGenerator.getRandomIntBetween(random, -1, 48);
		int startDay = ValuesGenerator.getRandomIntBetween(random, -1, 60);
		int startMonth = ValuesGenerator.getRandomIntBetween(random, -1, 24);
		int startYear = ValuesGenerator.getRandomIntBetween(random, 2000, 2020);
		String startTitle = ValuesGenerator.getString(random);
		String startDescription = ValuesGenerator.getString(random); 
		    
		Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, startTitle, startDescription);
		calDay.addAppt(appt);
		calDay.addAppt(appt);
	    }
	
	 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
        if((iteration%10000)==0 && iteration!=0 )
              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
	    
	}
    }
}
