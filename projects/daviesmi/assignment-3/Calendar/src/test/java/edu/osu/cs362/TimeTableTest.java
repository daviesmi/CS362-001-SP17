package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	 public void test01()  throws Throwable  {
	     int day = 15;
	     int month = 5;
	     int year = 2017;
	     int lDay = 16;
	     int lMonth = 5;
	     int lYear = 2017;
	     
	     GregorianCalendar firstDay = new GregorianCalendar(year, month, day);
	     GregorianCalendar lastDay = new GregorianCalendar(lYear, lMonth, lDay);
	     //Construct a new CalDay objects using the GregorianCalendar object
	     CalDay calDay = new CalDay(firstDay);
	     
	     //Construct a new TimeTable object
	     TimeTable timeTable = new TimeTable();
	     
	     int startHour=13;
	     int startMinute=30;
	     int startDay=15;
	     int startMonth=5;
	     int startYear=2017;
	     String title="Birthday Party";
	     String description="This is my birthday party.";
	     //Construct a couple new Appointment objects with the initial data	 
	     Appt appt = new Appt(startHour,
		     startMinute ,
		     startDay ,
		     startMonth ,
		     startYear ,
		     title,
		     description);
	     
	     Appt appt2 = new Appt(startHour,
		     startMinute ,
		     startDay ,
		     startMonth ,
		     lYear+1 ,
		     title,
		     description);
	     
	     assertNull(timeTable.deleteAppt(null, appt2));
	     assertNull(timeTable.deleteAppt(calDay.appts, appt));
	     
	     
	     
	     //Add appt to calDay
	     calDay.addAppt(appt);
	     calDay.addAppt(appt2);
	     
	     assertNull(timeTable.deleteAppt(calDay.appts, null));
	     
	     appt2.setStartMinute(70);
	     
	     assertNull(timeTable.deleteAppt(calDay.appts, appt2));
	     
	     
	     assertEquals("[\t --- 5/15/2017 --- \n --- -------- Appointments ------------ --- \n\t5/15/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n \n]",
		     timeTable.getApptRange(calDay.appts, firstDay,lastDay).toString());
	     timeTable.deleteAppt(calDay.appts, appt2);
	     assertEquals("[\t --- 5/15/2017 --- \n --- -------- Appointments ------------ --- \n\t5/15/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n \n]",
		     timeTable.getApptRange(calDay.appts, firstDay,lastDay).toString());
	 }
	 
	 @Test(expected=IllegalArgumentException.class)
	 public void test02()  throws Throwable  {
	     int day = 15;
	     int month = 5;
	     int year = 2017;
	     int lDay = 16;
	     int lMonth = 5;
	     int lYear = 2017;
	     
	     GregorianCalendar firstDay = new GregorianCalendar(year, month, day);
	     GregorianCalendar lastDay = new GregorianCalendar(lYear, lMonth, lDay);
	     //Construct a new CalDay objects using the GregorianCalendar object
	     CalDay calDay = new CalDay(firstDay);
	     
	     //Construct a new TimeTable object
	     TimeTable timeTable = new TimeTable();
	     
	     timeTable.getApptRange(calDay.appts, lastDay,firstDay);
	 }
	 
	 @Test
	 public void test03()  throws Throwable  {
	     int day = 15;
	     int month = 5;
	     int year = 2017;
	     int lDay = 18;
	     int lMonth = 5;
	     int lYear = 2017;
	     
	     GregorianCalendar firstDay = new GregorianCalendar(year, month, day);
	     GregorianCalendar lastDay = new GregorianCalendar(lYear, lMonth, lDay);
	     //Construct a new CalDay objects using the GregorianCalendar object
	     CalDay calDay = new CalDay(firstDay);
	     
	     //Construct a new TimeTable object
	     TimeTable timeTable = new TimeTable();
	     
	     int startHour=13;
	     int startMinute=30;
	     int startDay=15;
	     int startMonth=5;
	     int startYear=2017;
	     String title="Birthday Party";
	     String description="This is my birthday party.";
	     //Construct a couple new Appointment objects with the initial data	 
	     Appt appt = new Appt(startHour,
		     startMinute ,
		     startDay ,
		     startMonth ,
		     startYear ,
		     title,
		     description);
	     
	     Appt appt2 = new Appt(startHour,
		     startMinute ,
		     startDay+2 ,
		     startMonth ,
		     lYear ,
		     title,
		     description);
	     
	     Appt appt3 = new Appt(startHour,
		     startMinute ,
		     startDay ,
		     startMonth ,
		     lYear+1 ,
		     title,
		     description);
	     
	     //Add appt to calDay
	     calDay.addAppt(appt3);
	     calDay.addAppt(appt);
	     calDay.addAppt(appt2);
	     
	     assertEquals("[\t --- 5/15/2017 --- \n --- -------- Appointments ------------ --- \n\t5/15/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n \n"
	     	+ ", \t --- 5/16/2017 --- \n --- -------- Appointments ------------ --- \n\n"
	     	+ ", \t --- 5/17/2017 --- \n --- -------- Appointments ------------ --- \n\t5/17/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n \n]",
		     timeTable.getApptRange(calDay.appts, firstDay,lastDay).toString());
	     
	     LinkedList<Appt> tempList= timeTable.deleteAppt(calDay.appts, appt2);
	     
	     assertNotNull(tempList);
	     
	     assertEquals("[\t --- 5/15/2017 --- \n --- -------- Appointments ------------ --- \n\t5/15/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n \n"
		     	+ ", \t --- 5/16/2017 --- \n --- -------- Appointments ------------ --- \n\n"
		     	+ ", \t --- 5/17/2017 --- \n --- -------- Appointments ------------ --- \n\n]",
			     timeTable.getApptRange(calDay.appts, firstDay,lastDay).toString());
	     
	 }
	 
}
