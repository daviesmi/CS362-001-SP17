package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	 public void test01()  throws Throwable  {
	     int startHour=13;
	     int startMinute=30;
	     int startDay=10;
	     int startMonth=4;
	     int startYear=2017;
	     String title="Birthday Party";
	     String description="This is my birthday party.";
	     //Construct a new Appointment object with the initial data	 
	     Appt appt = new Appt(startHour,
		     startMinute ,
		     startDay ,
		     startMonth ,
		     startYear ,
		     title,
		     description);
	     // assertions
	     assertTrue(appt.getValid());
	     assertEquals(13, appt.getStartHour());
	     assertEquals(30, appt.getStartMinute());
	     assertEquals(10, appt.getStartDay());
	     assertEquals(04, appt.getStartMonth());
	     assertEquals(2017, appt.getStartYear());
	     assertEquals("Birthday Party", appt.getTitle());
	     assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
	public void test02() throws Throwable {
	    int startHour=13;
	    int newHour = 14;
	    int startMinute=30;
	    int newMinute = 40;
	    int startDay=10;
	    int newDay = 12;
	    int startMonth=4;
	    int newMonth = 5;
	    int startYear=2017;
	    int newYear = 2018;
	    String title="Birthday Party";
	    String newTitle="Deathday Party";
	    String description="This is my birthday party.";
	    String newDescription="This is my deathday party.";
	    //Construct a new Appointment object with the initial data	 
	    Appt appt = new Appt(startHour,
		    startMinute ,
		    startDay ,
		    startMonth ,
		    startYear ,
		    title,
		    description);
	    appt.setStartHour(newHour);
	    appt.setStartMinute(newMinute);
	    appt.setStartDay(newDay);
	    appt.setStartMonth(newMonth);
	    appt.setStartYear(newYear);
	    
	    appt.setTitle(null);
	    appt.setDescription(null);
	    assertEquals("", appt.getTitle());
	    assertEquals("", appt.getDescription());
	    
	    appt.setTitle(newTitle);
	    appt.setDescription(newDescription);
	    
	    // assertions
	    assertTrue(appt.getValid());
	    assertEquals(14, appt.getStartHour());
	    assertEquals(40, appt.getStartMinute());
	    assertEquals(12, appt.getStartDay());
	    assertEquals(05, appt.getStartMonth());
	    assertEquals(2018, appt.getStartYear());
	    assertEquals("Deathday Party", appt.getTitle());
	    assertEquals("This is my deathday party.", appt.getDescription());
	    assertEquals("\t5/12/2018 at 2:40pm ,Deathday Party, This is my deathday party.\n", appt.toString());
	}
	
	@Test
	public void test03() throws Throwable {
	    int startHour=13;
	    int startMinute=30;
	    int startDay=10;
	    int startMonth=4;
	    int startYear=2017;
	    String title="Birthday Party";
	    String description="This is my birthday party.";
	    //Construct invalid Appointment objects with the initial data	 
	    Appt appt = new Appt(startHour,
		    startMinute ,
		    startDay ,
		    0 ,
		    startYear ,
		    title,
		    description);
	    assertFalse(appt.getValid());
	    
	    appt = new Appt(startHour,
		    startMinute ,
		    32 ,
		    startMonth ,
		    startYear ,
		    title,
		    description);
	    assertFalse(appt.getValid());
	    
	    appt = new Appt(startHour,
		    61 ,
		    startDay ,
		    startMonth ,
		    startYear ,
		    title,
		    description);
	    assertFalse(appt.getValid());
	    
	    appt = new Appt(25,
		    startMinute ,
		    startDay ,
		    startMonth ,
		    startYear ,
		    title,
		    description);
	    assertFalse(appt.getValid());
	    assertNull(appt.toString());
	    appt.setStartHour(0);
	    assertEquals("\t4/10/2017 at 12:30am ,Birthday Party, This is my birthday party.\n", appt.toString());
	}
}
