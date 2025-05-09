/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 03:56:24 GMT 2022
 */

package org.dnal.core.logger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.IllegalFormatConversionException;
import java.util.UnknownFormatConversionException;
import org.dnal.core.logger.Log;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Log_ESTest extends Log_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Log.debugLogging = false;
      Object[] objectArray0 = new Object[7];
      Log.debugLogging = true;
      Log.debugLog("", objectArray0);
      assertEquals(7, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Log.debugLogging = true;
      // Undeclared exception!
      try { 
        Log.debugLog("<i%A%p}Af?|f3|]BB", (Object[]) null);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'p'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Log.debugLogging = false;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "";
      Log.debugLogging = true;
      // Undeclared exception!
      try { 
        Log.debugLog("GL=ME%EJ&LS<d8(", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // e != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Log.debugLogging = true;
      // Undeclared exception!
      try { 
        Log.debugLog((String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Log.debugLog("", objectArray0);
      assertEquals(8, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Log.useSLFLogging = false;
      Log.useSLFLogging = true;
      Log.log("~1/qi`V`m?");
      Log.log("u=GG");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Log.log("<i%A%p}Af?|f3|]BB");
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Log log0 = new Log();
      assertFalse(Log.useSLFLogging);
  }
}
