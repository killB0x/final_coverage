/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:33:37 GMT 2022
 */

package net.imglib2.img.planar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.img.planar.PlanarLocalizingCursor1D;
import net.imglib2.type.volatiles.VolatileFloatType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PlanarLocalizingCursor1D_ESTest extends PlanarLocalizingCursor1D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlanarLocalizingCursor1D<VolatileFloatType> planarLocalizingCursor1D0 = null;
      try {
        planarLocalizingCursor1D0 = new PlanarLocalizingCursor1D<VolatileFloatType>((PlanarLocalizingCursor1D<VolatileFloatType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.planar.PlanarLocalizingCursor", e);
      }
  }
}
