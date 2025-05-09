/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 06:27:20 GMT 2022
 */

package org.testinfected.time.lib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testinfected.time.lib.DateBuilder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateBuilder_ESTest extends DateBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateBuilder dateBuilder0 = new DateBuilder();
      DateBuilder dateBuilder1 = dateBuilder0.at(1, (-1), 0, 0, 1, 0);
      assertSame(dateBuilder1, dateBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateBuilder dateBuilder0 = new DateBuilder();
      DateBuilder dateBuilder1 = dateBuilder0.at(12, 0, (-1), 0, 0, (-767));
      assertSame(dateBuilder1, dateBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateBuilder dateBuilder0 = DateBuilder.aDate();
      // Undeclared exception!
      try { 
        dateBuilder0.inZone((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateBuilder dateBuilder0 = DateBuilder.aDate();
      dateBuilder0.in((TimeZone) null);
      // Undeclared exception!
      try { 
        dateBuilder0.fromMillis(3231L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateBuilder dateBuilder0 = new DateBuilder();
      dateBuilder0.in((TimeZone) null);
      // Undeclared exception!
      try { 
        dateBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateBuilder dateBuilder0 = DateBuilder.calendarDate(2284, 2284, (-1151));
      DateBuilder dateBuilder1 = dateBuilder0.atTime(4117, (-3591), 4117, 5);
      assertSame(dateBuilder0, dateBuilder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateBuilder dateBuilder0 = DateBuilder.calendarDate(944, 1, 1);
      DateBuilder dateBuilder1 = dateBuilder0.atTime(2763, 0, (-935));
      assertSame(dateBuilder0, dateBuilder1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateBuilder dateBuilder0 = DateBuilder.calendarDate(944, 1, 1);
      DateBuilder dateBuilder1 = dateBuilder0.onCalendar(1, 1191, 0);
      assertSame(dateBuilder0, dateBuilder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateBuilder dateBuilder0 = DateBuilder.aDate();
      DateBuilder dateBuilder1 = dateBuilder0.fromMillis(3231L);
      assertSame(dateBuilder1, dateBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateBuilder dateBuilder0 = DateBuilder.aDate();
      DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
      assertSame(dateBuilder0, dateBuilder1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateBuilder dateBuilder0 = DateBuilder.aDate();
      Date date0 = dateBuilder0.build();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateBuilder dateBuilder0 = new DateBuilder();
      DateBuilder dateBuilder1 = dateBuilder0.inZone("Vie^~ x!ZU9,u>#Q()}");
      assertSame(dateBuilder1, dateBuilder0);
  }
}
