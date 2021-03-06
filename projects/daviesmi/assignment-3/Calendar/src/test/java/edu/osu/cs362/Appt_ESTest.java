/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 01:17:23 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 1136, 12, "J_", "J_");
      assertEquals(1136, appt0.getStartMonth());
      
      appt0.setStartMonth(12);
      assertTrue(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(15, 311, 15, 4, 31, "Q2,nUu *F3/ ", "Q2,nUu *F3/ ");
      appt0.setStartDay(31);
      appt0.setStartMinute(1);
      assertEquals(1, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(0, 59, 0, 59, 907, "", "");
      assertEquals(907, appt0.getStartYear());
      assertEquals(59, appt0.getStartMonth());
      assertEquals(59, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "\t", "\t");
      appt0.setStartMonth(10);
      appt0.setStartDay(10);
      boolean boolean0 = appt0.getValid();
      assertEquals(10, appt0.getStartMonth());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(31, 31, 1973, 1973, 31, "%Y%z", "%Y%z");
      int int0 = appt0.getStartYear();
      assertEquals(1973, appt0.getStartDay());
      assertEquals("%Y%z", appt0.getDescription());
      assertEquals(31, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals("%Y%z", appt0.getTitle());
      assertEquals(31, appt0.getStartMinute());
      assertEquals(31, int0);
      assertEquals(1973, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(1127, 0, 31, 0, 31, "/", "pm");
      appt0.setStartYear((-3108));
      int int0 = appt0.getStartYear();
      assertEquals((-3108), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(586, 0, (-1986), 0, (-1986), "", "");
      int int0 = appt0.getStartMonth();
      assertEquals(-1986, appt0.getStartYear());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(586, appt0.getStartHour());
      assertEquals(-1986, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(7, (-3579), 37, 37, 7, "uz9D5.N[vVB", "uz9D5.N[vVB");
      int int0 = appt0.getStartMonth();
      assertEquals(7, appt0.getStartYear());
      assertEquals(-3579, appt0.getStartMinute());
      assertEquals(7, appt0.getStartHour());
      assertEquals("uz9D5.N[vVB", appt0.getTitle());
      assertEquals("uz9D5.N[vVB", appt0.getDescription());
      assertEquals(37, appt0.getStartDay());
      assertEquals(37, int0);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(1000000000, 1000000000, 1000000000, 1556, 31, " Zjs#Cr,0Mc14", " Zjs#Cr,0Mc14");
      int int0 = appt0.getStartMinute();
      assertEquals(31, appt0.getStartYear());
      assertEquals(1000000000, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(" Zjs#Cr,0Mc14", appt0.getTitle());
      assertEquals(" Zjs#Cr,0Mc14", appt0.getDescription());
      assertEquals(1556, appt0.getStartMonth());
      assertEquals(1000000000, int0);
      assertEquals(1000000000, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(0, (-182), (-182), 0, 0, " at ", " at ");
      int int0 = appt0.getStartMinute();
      assertEquals(-182, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals(" at ", appt0.getDescription());
      assertEquals(0, appt0.getStartHour());
      assertEquals(" at ", appt0.getTitle());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals((-182), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(1000000000, 1000000000, 1000000000, 1556, 31, " Zjs#Cr,0Mc14", " Zjs#Cr,0Mc14");
      int int0 = appt0.getStartHour();
      assertEquals(1000000000, appt0.getStartMinute());
      assertEquals(1000000000, int0);
      assertEquals(1000000000, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(31, appt0.getStartYear());
      assertEquals(" Zjs#Cr,0Mc14", appt0.getDescription());
      assertEquals(1556, appt0.getStartMonth());
      assertEquals(" Zjs#Cr,0Mc14", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(13, 13, 11, (-49), 13, " at ", "QH.C");
      assertEquals(13, appt0.getStartHour());
      
      appt0.setStartHour((-49));
      int int0 = appt0.getStartHour();
      assertEquals((-49), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(1291, 0, 0, 23, 0, "Year", "Year");
      int int0 = appt0.getStartDay();
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals("Year", appt0.getDescription());
      assertEquals(0, appt0.getStartYear());
      assertEquals(1291, appt0.getStartHour());
      assertEquals(23, appt0.getStartMonth());
      assertEquals(0, int0);
      assertEquals("Year", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(1000000000, 1000000000, 1000000000, 1556, 31, " Zjs#Cr,0Mc14", " Zjs#Cr,0Mc14");
      int int0 = appt0.getStartDay();
      assertEquals(1000000000, appt0.getStartMinute());
      assertEquals(" Zjs#Cr,0Mc14", appt0.getDescription());
      assertEquals(" Zjs#Cr,0Mc14", appt0.getTitle());
      assertEquals(1556, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(1000000000, appt0.getStartHour());
      assertEquals(1000000000, int0);
      assertEquals(31, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt((-3955), (-3955), 2722, 0, 0, "", "");
      appt0.getDescription();
      assertEquals(0, appt0.getStartYear());
      assertEquals(-3955, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(2722, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(-3955, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, ".A7hva}", ".A7hva}");
      appt0.setDescription(".A7hva}");
      assertFalse(appt0.getValid());
      assertEquals(".A7hva}", appt0.getDescription());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(".A7hva}", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt((-2425), (-2425), (-2425), (-2425), (-2425), "017UdDtw.<]3$_ehKsx", "017UdDtw.<]3$_ehKsx");
      assertEquals("017UdDtw.<]3$_ehKsx", appt0.getDescription());
      
      appt0.setDescription((String) null);
      assertEquals(-2425, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-2248), (-2248), (-2248), (-2248), (-2248), "5", (String) null);
      assertEquals("5", appt0.getTitle());
      
      appt0.setTitle("");
      assertEquals("", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, (String) null, "");
      String string0 = appt0.getTitle();
      assertNotNull(string0);
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "\t", "\t");
      boolean boolean0 = appt0.getValid();
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
      assertFalse(boolean0);
      assertEquals("\t", appt0.getTitle());
      assertEquals("\t", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      int int0 = appt0.getStartHour();
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt((-877), 2561, (-542), 0, 0, "", "");
      int int0 = appt0.getStartYear();
      assertEquals(-542, appt0.getStartDay());
      assertEquals(0, int0);
      assertEquals(2561, appt0.getStartMinute());
      assertEquals(-877, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "\t", "\t");
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals("\t", appt0.getDescription());
      assertEquals(0, appt0.getStartHour());
      assertEquals("\t", appt0.getTitle());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "\t", "\t");
      String string0 = appt0.getDescription();
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals("\t", string0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals("\t", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt((-1057), (-1057), (-1057), (-1057), (-1057), "*", " *1}T)T9 ?|?WsrA<pB");
      int int0 = appt0.getStartMonth();
      assertEquals(-1057, appt0.getStartDay());
      assertEquals(" *1}T)T9 ?|?WsrA<pB", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals("*", appt0.getTitle());
      assertEquals(-1057, appt0.getStartYear());
      assertEquals((-1057), int0);
      assertEquals(-1057, appt0.getStartHour());
      assertEquals(-1057, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "\t", "\t");
      appt0.setStartMonth(10);
      appt0.setStartDay(10);
      appt0.toString();
      assertEquals(10, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt((-2248), (-2248), (-2248), (-2248), (-2248), "5", (String) null);
      String string0 = appt0.toString();
      assertEquals(-2248, appt0.getStartMinute());
      assertEquals("5", appt0.getTitle());
      assertEquals(-2248, appt0.getStartDay());
      assertEquals(-2248, appt0.getStartMonth());
      assertEquals(-2248, appt0.getStartHour());
      assertEquals("", appt0.getDescription());
      assertNull(string0);
      assertEquals(-2248, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt((-2248), (-2248), (-2248), (-2248), (-2248), "5", (String) null);
      assertEquals("5", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertEquals(-2248, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 59, 0, "_xmh_&UPnbp0_XQB", "_xmh_&UPnbp0_XQB");
      appt0.setStartDay(462);
      assertEquals(462, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(15, 311, 15, 4, 31, "Q2,nUu *F3/ ", "Q2,nUu *F3/ ");
      String string0 = appt0.getTitle();
      assertEquals(4, appt0.getStartMonth());
      assertEquals("Q2,nUu *F3/ ", appt0.getDescription());
      assertEquals("Q2,nUu *F3/ ", string0);
      assertEquals(311, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(31, appt0.getStartYear());
      assertEquals(15, appt0.getStartHour());
      assertEquals(15, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(976, (-726), 23, (-726), 0, "", "Vs)[jbvt$");
      assertEquals(976, appt0.getStartHour());
      
      appt0.setStartHour(23);
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt((-1636), (-1636), (-2014), 0, 1084, "+q$p I92", "+q$p I92");
      int int0 = appt0.getStartDay();
      assertEquals("+q$p I92", appt0.getDescription());
      assertEquals(1084, appt0.getStartYear());
      assertEquals(-1636, appt0.getStartHour());
      assertEquals(-1636, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals("+q$p I92", appt0.getTitle());
      assertEquals(0, appt0.getStartMonth());
      assertEquals((-2014), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 307, 12, "J#_j", "J#_j");
      appt0.setStartHour(11);
      appt0.setStartMonth(10);
      appt0.toString();
      assertEquals(10, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 307, 12, "J#_j", "J#_j");
      appt0.setStartMonth(10);
      appt0.toString();
      assertEquals(10, appt0.getStartMonth());
  }
}
