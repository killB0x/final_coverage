/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:24:21 GMT 2022
 */

package net.imglib2.display.projector.specialized;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import net.imglib2.display.projector.specialized.PlanarImgXYShortProjector;
import net.imglib2.img.array.ArrayImg;
import net.imglib2.img.basictypeaccess.array.ShortArray;
import net.imglib2.img.planar.PlanarImg;
import net.imglib2.type.numeric.integer.UnsignedShortType;
import net.imglib2.util.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PlanarImgXYShortProjector_ESTest extends PlanarImgXYShortProjector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<ShortArray> linkedList0 = new LinkedList<ShortArray>();
      long[] longArray0 = new long[19];
      Fraction fraction0 = new Fraction();
      PlanarImg<UnsignedShortType, ShortArray> planarImg0 = new PlanarImg<UnsignedShortType, ShortArray>(linkedList0, longArray0, fraction0);
      PlanarImgXYShortProjector<UnsignedShortType> planarImgXYShortProjector0 = null;
      try {
        planarImgXYShortProjector0 = new PlanarImgXYShortProjector<UnsignedShortType>(planarImg0, (ArrayImg<UnsignedShortType, ShortArray>) null, (-1.0), (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.planar.PlanarCursor", e);
      }
  }
}
