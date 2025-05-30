/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 09:49:07 GMT 2022
 */

package com.github.panhongan.utils.datetime;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.panhongan.utils.datetime.TimeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeUtils_ESTest extends TimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeUtils.TimeSection timeUtils_TimeSection0 = TimeUtils.getTimeSectionByMinute(2306L, 16, "");
      assertNotNull(timeUtils_TimeSection0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = TimeUtils.getTime(4562);
      assertEquals(1392683001L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = TimeUtils.secToDate(896, "yyyy-MM-dd HH:mm:ss");
      assertEquals("1970-01-01 00:14:56", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = TimeUtils.secToDate((-1L), "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = TimeUtils.getTime("#", 0);
      assertEquals("#", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      System.setCurrentTimeMillis((-223L));
      long long0 = TimeUtils.getTime(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      System.setCurrentTimeMillis((-3665));
      long long0 = TimeUtils.getTime(0);
      assertEquals((-3L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      long long0 = TimeUtils.dateToSec(";:=", ";:=");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = TimeUtils.dateToSec("8", "8");
      assertEquals(1392409281L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = TimeUtils.currTime("%02d:00");
      assertEquals("%0214:00", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.secToDate(1L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.getTimeSectionByMinute((-3665), (-3665), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.getTimeSectionByMinute((-1417L), (-429), "-=O:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'O'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.getTimeSectionByMinute(0, 0, "");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.github.panhongan.utils.datetime.TimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.getTime((String) null, 643);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.getTime("MQ9xeNXAvqr", 4562);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'Q'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.currTime((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.currTime("$Gq&i<N+rzC3Ag`()Dh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'q'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long long0 = TimeUtils.dateToSec("", "");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeUtils.TimeSection timeUtils_TimeSection0 = new TimeUtils.TimeSection("", "x;f");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeUtils.secToDate(144, "{:4p2(H{rh=;1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'p'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeUtils timeUtils0 = new TimeUtils();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = TimeUtils.getTime("", 144);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = TimeUtils.currTime("");
      assertEquals("", string0);
  }
}
