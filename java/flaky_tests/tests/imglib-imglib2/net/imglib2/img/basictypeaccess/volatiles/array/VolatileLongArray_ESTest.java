/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 18:45:59 GMT 2022
 */

package net.imglib2.img.basictypeaccess.volatiles.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileLongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VolatileLongArray_ESTest extends VolatileLongArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long[] longArray0 = new long[1];
      VolatileLongArray volatileLongArray0 = new VolatileLongArray(longArray0, true);
      VolatileLongArray volatileLongArray1 = volatileLongArray0.createArray(2103, false);
      assertEquals(2103, volatileLongArray1.getArrayLength());
      assertFalse(volatileLongArray1.isValid());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long[] longArray0 = new long[1];
      VolatileLongArray volatileLongArray0 = new VolatileLongArray(longArray0, true);
      VolatileLongArray volatileLongArray1 = volatileLongArray0.createArray(2103, true);
      assertTrue(volatileLongArray1.isValid());
      assertEquals(2103, volatileLongArray1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VolatileLongArray volatileLongArray0 = null;
      try {
        volatileLongArray0 = new VolatileLongArray((-1415), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1415
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long[] longArray0 = new long[5];
      VolatileLongArray volatileLongArray0 = new VolatileLongArray(longArray0, true);
      // Undeclared exception!
      try { 
        volatileLongArray0.createArray((-1415), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1415
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractLongArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VolatileLongArray volatileLongArray0 = new VolatileLongArray(0, true);
      VolatileLongArray volatileLongArray1 = volatileLongArray0.createArray(0, true);
      assertEquals(0, volatileLongArray1.getArrayLength());
      assertTrue(volatileLongArray1.isValid());
  }
}
