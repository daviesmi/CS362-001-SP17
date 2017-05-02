package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.GregorianCalendar;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
	     int day = 1;
	     int month = 5;
	     int year = 2017;
	     String date = month+"/"+day+"/"+year;
	     GregorianCalendar cal = new GregorianCalendar(year, month, day);
	     //Construct two CalDay objects, one for each constructor
	     CalDay calDay = new CalDay();
	     CalDay calDay2 = new CalDay(cal);
	     
	     //Assertions
	     assertFalse(calDay.isValid());
	     assertEquals("", calDay.toString());
	     assertTrue(calDay2.isValid());
	     assertNull(calDay.iterator());
	     assertEquals(day, calDay2.getDay());
	     assertEquals(month, calDay2.getMonth());
	     assertEquals(year, calDay2.getYear());
	     assertEquals(0, calDay2.getSizeAppts());
	     assertEquals("\t --- " + date + " --- \n --- -------- Appointments ------------ --- \n\n", calDay2.toString());
	 }
	 
	 @Test
	 public void test02() throws Throwable {
	     int day = 1;
	     int month = 5;
	     int year = 2017;
	     String date = month+"/"+day+"/"+year;
	     int startHour=13;
	     int startMinute=30;
	     int startDay=10;
	     int startMonth=4;
	     int startYear=2017;
	     String title="Birthday Party";
	     String description="This is my birthday party.";
	     GregorianCalendar cal = new GregorianCalendar(year, month, day);
	     //Construct a new CalDay objects using the GregorianCalendar object
	     CalDay calDay = new CalDay(cal);
	     //Construct a new Appointment object with the initial data	 
	     Appt appt = new Appt(startHour,
		     startMinute ,
		     startDay ,
		     startMonth ,
		     startYear ,
		     title,
		     description);
	     //Add appt to calDay
	     calDay.addAppt(appt);
	     
	     //Assertions
	     assertEquals(1, calDay.getSizeAppts());
	     assertEquals(1, calDay.getAppts().size());
	     assertFalse(calDay.iterator() == null);
	     assertEquals("\t --- " + date + " --- \n --- -------- Appointments ------------ --- \n\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n \n", calDay.toString());
	     
	     //Construct a new invalid Appointment object with the initial data	 
	     Appt appt2 = new Appt(25,
		     startMinute ,
		     startDay ,
		     startMonth ,
		     startYear ,
		     title,
		     description);
	     
	     calDay.addAppt(appt2);
	     appt2.setStartHour(2);
	     calDay.addAppt(appt2);
	     assertEquals(2, calDay.getSizeAppts());
	 }
	
}
