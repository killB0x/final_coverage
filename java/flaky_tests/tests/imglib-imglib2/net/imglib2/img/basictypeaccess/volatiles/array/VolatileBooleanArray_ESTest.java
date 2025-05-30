/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 18:35:21 GMT 2022
 */

package net.imglib2.img.basictypeaccess.volatiles.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileBooleanArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VolatileBooleanArray_ESTest extends VolatileBooleanArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VolatileBooleanArray volatileBooleanArray0 = new VolatileBooleanArray(1, false);
      VolatileBooleanArray volatileBooleanArray1 = volatileBooleanArray0.createArray(1);
      assertEquals(1, volatileBooleanArray1.getArrayLength());
      assertTrue(volatileBooleanArray1.isValid());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VolatileBooleanArray volatileBooleanArray0 = new VolatileBooleanArray(1, false);
      VolatileBooleanArray volatileBooleanArray1 = volatileBooleanArray0.createArray(0, false);
      assertFalse(volatileBooleanArray1.isValid());
      assertEquals(0, volatileBooleanArray1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VolatileBooleanArray volatileBooleanArray0 = new VolatileBooleanArray(1, false);
      VolatileBooleanArray volatileBooleanArray1 = volatileBooleanArray0.createArray(1, false);
      assertFalse(volatileBooleanArray1.isValid());
      assertEquals(1, volatileBooleanArray1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VolatileBooleanArray volatileBooleanArray0 = null;
      try {
        volatileBooleanArray0 = new VolatileBooleanArray((-4117), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -4117
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractBooleanArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VolatileBooleanArray volatileBooleanArray0 = new VolatileBooleanArray(0, true);
      VolatileBooleanArray volatileBooleanArray1 = volatileBooleanArray0.createArray(0, true);
      assertEquals(0, volatileBooleanArray1.getArrayLength());
      assertTrue(volatileBooleanArray1.isValid());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VolatileBooleanArray volatileBooleanArray0 = new VolatileBooleanArray((boolean[]) null, false);
      // Undeclared exception!
      try { 
        volatileBooleanArray0.createArray((-4117), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -4117
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractBooleanArray", e);
      }
  }
}
