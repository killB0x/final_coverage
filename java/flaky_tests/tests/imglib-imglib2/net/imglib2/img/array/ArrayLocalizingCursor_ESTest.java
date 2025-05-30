/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 18:20:23 GMT 2022
 */

package net.imglib2.img.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.img.array.ArrayImg;
import net.imglib2.img.array.ArrayLocalizingCursor;
import net.imglib2.type.volatiles.VolatileFloatType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArrayLocalizingCursor_ESTest extends ArrayLocalizingCursor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayLocalizingCursor<VolatileFloatType> arrayLocalizingCursor0 = null;
      try {
        arrayLocalizingCursor0 = new ArrayLocalizingCursor<VolatileFloatType>((ArrayImg<VolatileFloatType, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.array.ArrayLocalizingCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayLocalizingCursor<VolatileFloatType> arrayLocalizingCursor0 = null;
      try {
        arrayLocalizingCursor0 = new ArrayLocalizingCursor<VolatileFloatType>((ArrayLocalizingCursor<VolatileFloatType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.array.AbstractArrayLocalizingCursor", e);
      }
  }
}
