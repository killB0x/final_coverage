/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:47:15 GMT 2022
 */

package com.hubspot.jinjava.lib.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.filter.DatetimeFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DatetimeFilter_ESTest extends DatetimeFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatetimeFilter datetimeFilter0 = new DatetimeFilter();
      // Undeclared exception!
      try { 
        datetimeFilter0.filter((Object) "com.hubspot.jinjava.lib.filter.DatetimeFilter", (JinjavaInterpreter) null, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.lib.filter.DateTimeFormatFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DatetimeFilter datetimeFilter0 = new DatetimeFilter();
      String[] stringArray0 = new String[10];
      // Undeclared exception!
      try { 
        datetimeFilter0.filter((Object) null, (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/fasterxml/jackson/core/PrettyPrinter
         //
         verifyException("com.hubspot.jinjava.lib.fn.Functions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DatetimeFilter datetimeFilter0 = new DatetimeFilter();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        datetimeFilter0.filter((Object) "date", (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Input to function must be a date object, was: class java.lang.String
         //
         verifyException("com.hubspot.jinjava.lib.fn.Functions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DatetimeFilter datetimeFilter0 = new DatetimeFilter();
      String string0 = datetimeFilter0.getName();
      assertEquals("date", string0);
  }
}
