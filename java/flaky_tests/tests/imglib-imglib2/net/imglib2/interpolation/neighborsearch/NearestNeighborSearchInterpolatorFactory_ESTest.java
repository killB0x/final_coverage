/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:15:00 GMT 2022
 */

package net.imglib2.interpolation.neighborsearch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.KDTree;
import net.imglib2.PointSample;
import net.imglib2.PointSampleList;
import net.imglib2.RealInterval;
import net.imglib2.RealPointSampleList;
import net.imglib2.interpolation.neighborsearch.NearestNeighborSearchInterpolator;
import net.imglib2.interpolation.neighborsearch.NearestNeighborSearchInterpolatorFactory;
import net.imglib2.neighborsearch.KNearestNeighborSearchOnIterableRealInterval;
import net.imglib2.neighborsearch.NearestNeighborSearch;
import net.imglib2.neighborsearch.NearestNeighborSearchOnIterableRealInterval;
import net.imglib2.neighborsearch.NearestNeighborSearchOnKDTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NearestNeighborSearchInterpolatorFactory_ESTest extends NearestNeighborSearchInterpolatorFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NearestNeighborSearchInterpolatorFactory<PointSample<Integer>> nearestNeighborSearchInterpolatorFactory0 = new NearestNeighborSearchInterpolatorFactory<PointSample<Integer>>();
      RealPointSampleList<PointSample<Integer>> realPointSampleList0 = new RealPointSampleList<PointSample<Integer>>(0);
      NearestNeighborSearchOnIterableRealInterval<PointSample<Integer>> nearestNeighborSearchOnIterableRealInterval0 = new NearestNeighborSearchOnIterableRealInterval<PointSample<Integer>>(realPointSampleList0);
      NearestNeighborSearchInterpolator<PointSample<Integer>> nearestNeighborSearchInterpolator0 = nearestNeighborSearchInterpolatorFactory0.create((NearestNeighborSearch<PointSample<Integer>>) nearestNeighborSearchOnIterableRealInterval0, (RealInterval) realPointSampleList0);
      assertEquals(0, nearestNeighborSearchInterpolator0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NearestNeighborSearchInterpolatorFactory<PointSample<Integer>> nearestNeighborSearchInterpolatorFactory0 = new NearestNeighborSearchInterpolatorFactory<PointSample<Integer>>();
      RealPointSampleList<PointSample<Integer>> realPointSampleList0 = new RealPointSampleList<PointSample<Integer>>(0);
      NearestNeighborSearchOnIterableRealInterval<PointSample<Integer>> nearestNeighborSearchOnIterableRealInterval0 = new NearestNeighborSearchOnIterableRealInterval<PointSample<Integer>>(realPointSampleList0);
      NearestNeighborSearchInterpolator<PointSample<Integer>> nearestNeighborSearchInterpolator0 = nearestNeighborSearchInterpolatorFactory0.create((NearestNeighborSearch<PointSample<Integer>>) nearestNeighborSearchOnIterableRealInterval0);
      assertEquals(0, nearestNeighborSearchInterpolator0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NearestNeighborSearchInterpolatorFactory<PointSample<Integer>> nearestNeighborSearchInterpolatorFactory0 = new NearestNeighborSearchInterpolatorFactory<PointSample<Integer>>();
      RealPointSampleList<PointSample<Integer>> realPointSampleList0 = new RealPointSampleList<PointSample<Integer>>(998);
      KDTree<PointSample<Integer>> kDTree0 = new KDTree<PointSample<Integer>>(realPointSampleList0);
      NearestNeighborSearchOnKDTree<PointSample<Integer>> nearestNeighborSearchOnKDTree0 = new NearestNeighborSearchOnKDTree<PointSample<Integer>>(kDTree0);
      NearestNeighborSearchInterpolator<PointSample<Integer>> nearestNeighborSearchInterpolator0 = nearestNeighborSearchInterpolatorFactory0.create((NearestNeighborSearch<PointSample<Integer>>) nearestNeighborSearchOnKDTree0);
      assertEquals(998, nearestNeighborSearchInterpolator0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NearestNeighborSearchInterpolatorFactory<Object> nearestNeighborSearchInterpolatorFactory0 = new NearestNeighborSearchInterpolatorFactory<Object>();
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(0);
      KNearestNeighborSearchOnIterableRealInterval<Object> kNearestNeighborSearchOnIterableRealInterval0 = new KNearestNeighborSearchOnIterableRealInterval<Object>(pointSampleList0, 6708);
      KNearestNeighborSearchOnIterableRealInterval<Object> kNearestNeighborSearchOnIterableRealInterval1 = kNearestNeighborSearchOnIterableRealInterval0.copy();
      // Undeclared exception!
      nearestNeighborSearchInterpolatorFactory0.create((NearestNeighborSearch<Object>) kNearestNeighborSearchOnIterableRealInterval1, (RealInterval) pointSampleList0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NearestNeighborSearchInterpolatorFactory<Integer> nearestNeighborSearchInterpolatorFactory0 = new NearestNeighborSearchInterpolatorFactory<Integer>();
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(3682);
      KDTree<Integer> kDTree0 = new KDTree<Integer>(pointSampleList0);
      KNearestNeighborSearchOnIterableRealInterval<Integer> kNearestNeighborSearchOnIterableRealInterval0 = new KNearestNeighborSearchOnIterableRealInterval<Integer>(kDTree0, 3682);
      KNearestNeighborSearchOnIterableRealInterval<Integer> kNearestNeighborSearchOnIterableRealInterval1 = kNearestNeighborSearchOnIterableRealInterval0.copy();
      nearestNeighborSearchInterpolatorFactory0.create((NearestNeighborSearch<Integer>) kNearestNeighborSearchOnIterableRealInterval1, (RealInterval) kDTree0);
      // Undeclared exception!
      nearestNeighborSearchInterpolatorFactory0.create((NearestNeighborSearch<Integer>) kNearestNeighborSearchOnIterableRealInterval0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NearestNeighborSearchInterpolatorFactory<Object> nearestNeighborSearchInterpolatorFactory0 = new NearestNeighborSearchInterpolatorFactory<Object>();
      // Undeclared exception!
      try { 
        nearestNeighborSearchInterpolatorFactory0.create((NearestNeighborSearch<Object>) null, (RealInterval) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.neighborsearch.NearestNeighborSearchInterpolatorFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NearestNeighborSearchInterpolatorFactory<Object> nearestNeighborSearchInterpolatorFactory0 = new NearestNeighborSearchInterpolatorFactory<Object>();
      // Undeclared exception!
      try { 
        nearestNeighborSearchInterpolatorFactory0.create((NearestNeighborSearch<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.neighborsearch.NearestNeighborSearchInterpolatorFactory", e);
      }
  }
}
