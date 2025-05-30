/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:20:58 GMT 2022
 */

package net.imglib2.interpolation.neighborsearch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.KDTree;
import net.imglib2.Point;
import net.imglib2.PointSampleList;
import net.imglib2.RealPointSampleList;
import net.imglib2.interpolation.neighborsearch.NearestNeighborSearchInterpolator;
import net.imglib2.neighborsearch.KNearestNeighborSearchOnIterableRealInterval;
import net.imglib2.neighborsearch.KNearestNeighborSearchOnKDTree;
import net.imglib2.neighborsearch.NearestNeighborSearch;
import net.imglib2.neighborsearch.NearestNeighborSearchOnIterableRealInterval;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NearestNeighborSearchInterpolator_ESTest extends NearestNeighborSearchInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      PointSampleList<Object> pointSampleList1 = new PointSampleList<Object>(0);
      Point point0 = pointSampleList1.dimensionsAsPoint();
      pointSampleList0.add(point0, (Integer) null);
      NearestNeighborSearchOnIterableRealInterval<Integer> nearestNeighborSearchOnIterableRealInterval0 = new NearestNeighborSearchOnIterableRealInterval<Integer>(pointSampleList0);
      NearestNeighborSearchInterpolator<Integer> nearestNeighborSearchInterpolator0 = new NearestNeighborSearchInterpolator<Integer>(nearestNeighborSearchOnIterableRealInterval0);
      Integer integer0 = nearestNeighborSearchInterpolator0.get();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      NearestNeighborSearchOnIterableRealInterval<Integer> nearestNeighborSearchOnIterableRealInterval0 = new NearestNeighborSearchOnIterableRealInterval<Integer>(pointSampleList0);
      NearestNeighborSearchInterpolator<Integer> nearestNeighborSearchInterpolator0 = new NearestNeighborSearchInterpolator<Integer>(nearestNeighborSearchOnIterableRealInterval0);
      NearestNeighborSearchInterpolator<Integer> nearestNeighborSearchInterpolator1 = nearestNeighborSearchInterpolator0.copy();
      assertEquals(0, nearestNeighborSearchInterpolator1.numDimensions());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RealPointSampleList<Object> realPointSampleList0 = new RealPointSampleList<Object>(0);
      KNearestNeighborSearchOnIterableRealInterval<Object> kNearestNeighborSearchOnIterableRealInterval0 = new KNearestNeighborSearchOnIterableRealInterval<Object>(realPointSampleList0, 0);
      NearestNeighborSearchInterpolator<Object> nearestNeighborSearchInterpolator0 = new NearestNeighborSearchInterpolator<Object>(kNearestNeighborSearchOnIterableRealInterval0);
      // Undeclared exception!
      try { 
        nearestNeighborSearchInterpolator0.get();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.neighborsearch.KNearestNeighborSearchOnIterableRealInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PointSampleList<NearestNeighborSearchInterpolator<Object>> pointSampleList0 = new PointSampleList<NearestNeighborSearchInterpolator<Object>>(1380);
      KDTree<NearestNeighborSearchInterpolator<Object>> kDTree0 = new KDTree<NearestNeighborSearchInterpolator<Object>>(pointSampleList0);
      KNearestNeighborSearchOnKDTree<NearestNeighborSearchInterpolator<Object>> kNearestNeighborSearchOnKDTree0 = new KNearestNeighborSearchOnKDTree<NearestNeighborSearchInterpolator<Object>>(kDTree0, 4058);
      KNearestNeighborSearchOnKDTree<NearestNeighborSearchInterpolator<Object>> kNearestNeighborSearchOnKDTree1 = kNearestNeighborSearchOnKDTree0.copy();
      NearestNeighborSearchInterpolator<NearestNeighborSearchInterpolator<Object>> nearestNeighborSearchInterpolator0 = new NearestNeighborSearchInterpolator<NearestNeighborSearchInterpolator<Object>>(kNearestNeighborSearchOnKDTree1);
      // Undeclared exception!
      nearestNeighborSearchInterpolator0.copy();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NearestNeighborSearchInterpolator<Object> nearestNeighborSearchInterpolator0 = null;
      try {
        nearestNeighborSearchInterpolator0 = new NearestNeighborSearchInterpolator<Object>((NearestNeighborSearch<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.neighborsearch.NearestNeighborSearchInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      NearestNeighborSearchOnIterableRealInterval<Integer> nearestNeighborSearchOnIterableRealInterval0 = new NearestNeighborSearchOnIterableRealInterval<Integer>(pointSampleList0);
      NearestNeighborSearchInterpolator<Integer> nearestNeighborSearchInterpolator0 = new NearestNeighborSearchInterpolator<Integer>(nearestNeighborSearchOnIterableRealInterval0);
      // Undeclared exception!
      try { 
        nearestNeighborSearchInterpolator0.get();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.neighborsearch.NearestNeighborSearchInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PointSampleList<NearestNeighborSearchInterpolator<Object>> pointSampleList0 = new PointSampleList<NearestNeighborSearchInterpolator<Object>>(1380);
      KDTree<NearestNeighborSearchInterpolator<Object>> kDTree0 = new KDTree<NearestNeighborSearchInterpolator<Object>>(pointSampleList0);
      KNearestNeighborSearchOnKDTree<NearestNeighborSearchInterpolator<Object>> kNearestNeighborSearchOnKDTree0 = new KNearestNeighborSearchOnKDTree<NearestNeighborSearchInterpolator<Object>>(kDTree0, 4058);
      NearestNeighborSearchInterpolator<NearestNeighborSearchInterpolator<Object>> nearestNeighborSearchInterpolator0 = new NearestNeighborSearchInterpolator<NearestNeighborSearchInterpolator<Object>>(kNearestNeighborSearchOnKDTree0);
      NearestNeighborSearchInterpolator<NearestNeighborSearchInterpolator<Object>> nearestNeighborSearchInterpolator1 = nearestNeighborSearchInterpolator0.copy();
      assertNotSame(nearestNeighborSearchInterpolator0, nearestNeighborSearchInterpolator1);
  }
}
