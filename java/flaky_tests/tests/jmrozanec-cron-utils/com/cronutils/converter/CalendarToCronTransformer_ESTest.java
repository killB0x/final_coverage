/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 00:42:53 GMT 2022
 */

package com.cronutils.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.cronutils.converter.CalendarToCronTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CalendarToCronTransformer_ESTest extends CalendarToCronTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CalendarToCronTransformer calendarToCronTransformer0 = new CalendarToCronTransformer();
      // Undeclared exception!
      try { 
        calendarToCronTransformer0.transform();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.cronutils.converter.CalendarToCronTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CalendarToCronTransformer calendarToCronTransformer0 = new CalendarToCronTransformer();
      String[] stringArray0 = new String[8];
      stringArray0[4] = "75";
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 1, 2213, 0, 1);
      calendarToCronTransformer0.apply(stringArray0, mockGregorianCalendar0);
      calendarToCronTransformer0.transform();
  }
}
