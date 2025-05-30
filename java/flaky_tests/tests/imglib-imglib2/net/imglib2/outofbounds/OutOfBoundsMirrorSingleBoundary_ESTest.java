/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 12:14:22 GMT 2022
 */

package net.imglib2.outofbounds;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Stack;
import net.imglib2.RandomAccessible;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.img.basictypeaccess.volatiles.array.DirtyVolatileFloatArray;
import net.imglib2.img.basictypeaccess.volatiles.array.VolatileLongArray;
import net.imglib2.img.list.ListImg;
import net.imglib2.outofbounds.OutOfBoundsMirrorSingleBoundary;
import net.imglib2.transform.integer.TranslationTransform;
import net.imglib2.view.IntervalView;
import net.imglib2.view.TransformView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OutOfBoundsMirrorSingleBoundary_ESTest extends OutOfBoundsMirrorSingleBoundary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OutOfBoundsMirrorSingleBoundary<RandomAccessibleInterval<VolatileLongArray>> outOfBoundsMirrorSingleBoundary0 = null;
      try {
        outOfBoundsMirrorSingleBoundary0 = new OutOfBoundsMirrorSingleBoundary<RandomAccessibleInterval<VolatileLongArray>>((OutOfBoundsMirrorSingleBoundary<RandomAccessibleInterval<VolatileLongArray>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.outofbounds.AbstractOutOfBoundsMirror", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<DirtyVolatileFloatArray> stack0 = new Stack<DirtyVolatileFloatArray>();
      long[] longArray0 = new long[1];
      ListImg<DirtyVolatileFloatArray> listImg0 = new ListImg<DirtyVolatileFloatArray>(stack0, longArray0);
      TranslationTransform translationTransform0 = new TranslationTransform(0);
      TransformView<Object> transformView0 = new TransformView<Object>((RandomAccessible<Object>) null, translationTransform0);
      IntervalView<Object> intervalView0 = new IntervalView<Object>(transformView0, listImg0);
      OutOfBoundsMirrorSingleBoundary<Object> outOfBoundsMirrorSingleBoundary0 = null;
      try {
        outOfBoundsMirrorSingleBoundary0 = new OutOfBoundsMirrorSingleBoundary<Object>((RandomAccessibleInterval<Object>) intervalView0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.transform.integer.BoundingBox", e);
      }
  }
}
