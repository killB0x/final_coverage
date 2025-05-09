/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 02:57:44 GMT 2022
 */

package com.obdobion.calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.calendar.AdjustmentDirection;
import java.text.ParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdjustmentDirection_ESTest extends AdjustmentDirection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdjustmentDirection[] adjustmentDirectionArray0 = AdjustmentDirection.values();
      assertEquals(7, adjustmentDirectionArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdjustmentDirection adjustmentDirection0 = AdjustmentDirection.valueOf("PREV");
      assertEquals(1, adjustmentDirection0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdjustmentDirection.find((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.calendar.AdjustmentDirection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdjustmentDirection adjustmentDirection0 = AdjustmentDirection.ADD;
      int int0 = adjustmentDirection0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      try { 
        AdjustmentDirection.find("RBYyRA':ZsLuT*8a)");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // invalid direction: RBYyRA':ZsLuT*8a)
         //
         verifyException("com.obdobion.calendar.AdjustmentDirection", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      try { 
        AdjustmentDirection.find(" ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // invalid direction:  
         //
         verifyException("com.obdobion.calendar.AdjustmentDirection", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      try { 
        AdjustmentDirection.find("");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // empty token when looking for direction
         //
         verifyException("com.obdobion.calendar.AdjustmentDirection", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      try { 
        AdjustmentDirection.find("W ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // invalid direction: W 
         //
         verifyException("com.obdobion.calendar.AdjustmentDirection", e);
      }
  }
}
