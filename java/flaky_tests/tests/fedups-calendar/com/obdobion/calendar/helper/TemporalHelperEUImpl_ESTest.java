/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 03:01:43 GMT 2022
 */

package com.obdobion.calendar.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.calendar.helper.TemporalHelperEUImpl;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TemporalHelperEUImpl_ESTest extends TemporalHelperEUImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TemporalHelperEUImpl temporalHelperEUImpl0 = new TemporalHelperEUImpl();
      temporalHelperEUImpl0.createPredefinedDateFormats();
      temporalHelperEUImpl0.createMonthFormat2(2, '\\');
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TemporalHelperEUImpl temporalHelperEUImpl0 = new TemporalHelperEUImpl();
      // Undeclared exception!
      try { 
        temporalHelperEUImpl0.createMonthFormat2(0, '[');
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 29
         // [0-9]{1,2}[[0-9]{1,2}[[0-9]{4}
         //                              ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TemporalHelperEUImpl temporalHelperEUImpl0 = new TemporalHelperEUImpl();
      // Undeclared exception!
      try { 
        temporalHelperEUImpl0.createMonthFormat2(0, '@');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.calendar.helper.TemporalHelperAbstractImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TemporalHelperEUImpl temporalHelperEUImpl0 = new TemporalHelperEUImpl();
      // Undeclared exception!
      try { 
        temporalHelperEUImpl0.createMonthFormat2((-1948), 'm');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1948 out of bounds for length 3
         //
         verifyException("com.obdobion.calendar.helper.TemporalHelperEUImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TemporalHelperEUImpl temporalHelperEUImpl0 = new TemporalHelperEUImpl();
      // Undeclared exception!
      try { 
        temporalHelperEUImpl0.createMonthFormat1(0, ';');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.calendar.helper.TemporalHelperAbstractImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TemporalHelperEUImpl temporalHelperEUImpl0 = new TemporalHelperEUImpl();
      // Undeclared exception!
      try { 
        temporalHelperEUImpl0.createMonthFormat1('{', '{');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 123 out of bounds for length 3
         //
         verifyException("com.obdobion.calendar.helper.TemporalHelperEUImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TemporalHelperEUImpl temporalHelperEUImpl0 = new TemporalHelperEUImpl();
      temporalHelperEUImpl0.createPredefinedDateFormats();
      temporalHelperEUImpl0.createMonthFormat1(0, 'W');
  }
}
