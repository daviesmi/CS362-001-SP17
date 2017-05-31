package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setDescription","setStartMinute","setStartHour","setStartDay","setStartMonth","setStartYear"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
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
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					   if (methodName.equals("setDescription")){
						   String newDescription=(String) ValuesGenerator.getString(random);
						   appt.setDescription(newDescription);						   
						}
					   if (methodName.equals("setStartMinute")){
					       	   int newMinute = ValuesGenerator.getRandomIntBetween(random, -1, 120);
						   appt.setStartMinute(newMinute);						   
						}
					   if (methodName.equals("setStartHour")){
					       	   int newHour = ValuesGenerator.getRandomIntBetween(random, -1, 48);
						   appt.setStartHour(newHour);						   
						}
					   if (methodName.equals("setStartDay")){
					       	   int newDay = ValuesGenerator.getRandomIntBetween(random, -1, 60);
						   appt.setStartDay(newDay);						   
						}
					   if (methodName.equals("setStartMonth")){
					       	   int newMonth = ValuesGenerator.getRandomIntBetween(random, -1, 24);
						   appt.setStartMonth(newMonth);						   
						}
					   if (methodName.equals("setStartYear")){
					       	   int newYear = ValuesGenerator.getRandomIntBetween(random, 2000, 2020);
						   appt.setStartYear(newYear);						   
						}
					
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
	 
	 
		 System.out.println("Done testing...");
	 }


	
}
