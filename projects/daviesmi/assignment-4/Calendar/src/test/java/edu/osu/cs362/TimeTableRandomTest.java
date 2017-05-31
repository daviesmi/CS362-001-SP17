package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
    private static final int NUM_TESTS=100;
    
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
	     long startTime = Calendar.getInstance().getTimeInMillis();
	     long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
			 
	     System.out.println("Start testing...");
		 
	     for (int iteration = 0; elapsed < TestTimeout; iteration++) {
		 long randomseed =10;//System.currentTimeMillis();
//		 System.out.println(" Seed:"+randomseed );
		 Random random = new Random(randomseed);
		 int year = ValuesGenerator.getRandomIntBetween(random, 2000, 2020);
		 int year2 = ValuesGenerator.getRandomIntBetween(random, 2000, 2020);
		 int month = ValuesGenerator.getRandomIntBetween(random, 1, 12);
		 int day = ValuesGenerator.getRandomIntBetween(random, 1, 30);
		 
		 GregorianCalendar firstDay = new GregorianCalendar(year-1, 5, 1);
		 GregorianCalendar lastDay = new GregorianCalendar(year, 5, 1);
		 GregorianCalendar calDate = new GregorianCalendar(year2, month, day);
		 
		 CalDay calDay = new CalDay(calDate);
		 TimeTable timeTable = new TimeTable();
		 
		 for (int i = 0; i < NUM_TESTS; i++) {
		     int startMinute = ValuesGenerator.getRandomIntBetween(random, -1, 120);
		     int startHour = ValuesGenerator.getRandomIntBetween(random, -1, 48);
		     int startDay = ValuesGenerator.getRandomIntBetween(random, -1, 60);
		     int startMonth = ValuesGenerator.getRandomIntBetween(random, -1, 24);
		     int startYear = ValuesGenerator.getRandomIntBetween(random, 2000, 2020);
		     String startTitle = ValuesGenerator.getString(random);
		     String startDescription = ValuesGenerator.getString(random);
			
		     int startMinute2 = ValuesGenerator.getRandomIntBetween(random, -1, 120);
		     int startHour2 = ValuesGenerator.getRandomIntBetween(random, -1, 48);
		     int startDay2 = ValuesGenerator.getRandomIntBetween(random, -1, 60);
		     int startMonth2 = ValuesGenerator.getRandomIntBetween(random, -1, 24);
		     int startYear2 = ValuesGenerator.getRandomIntBetween(random, 2000, 2020);
		     String startTitle2 = ValuesGenerator.getString(random);
		     String startDescription2 = ValuesGenerator.getString(random);
		
		     Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, startTitle, startDescription);
		     Appt appt2 = new Appt(startHour2, startMinute2, startDay2, startMonth2, startYear2, startTitle2, startDescription2);
			
		     timeTable.deleteAppt(null, appt2);
		     timeTable.deleteAppt(calDay.appts, appt);
			
		     calDay.addAppt(appt);
		     calDay.addAppt(appt2);
			
		     timeTable.deleteAppt(calDay.appts, null);
		     timeTable.deleteAppt(calDay.appts, appt);
		     timeTable.deleteAppt(calDay.appts, appt2);

		 }
		
		 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
	        if((iteration%10000)==0 && iteration!=0 )
	              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		    
		}
	 }


	
}
