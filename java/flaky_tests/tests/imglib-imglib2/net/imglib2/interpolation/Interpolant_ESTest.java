/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 17:41:18 GMT 2022
 */

package net.imglib2.interpolation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import net.imglib2.Cursor;
import net.imglib2.EuclideanSpace;
import net.imglib2.FinalInterval;
import net.imglib2.KDTree;
import net.imglib2.Point;
import net.imglib2.PointSample;
import net.imglib2.PointSampleList;
import net.imglib2.RealInterval;
import net.imglib2.RealPointSample;
import net.imglib2.RealPointSampleList;
import net.imglib2.RealRandomAccess;
import net.imglib2.interpolation.Interpolant;
import net.imglib2.interpolation.InterpolatorFactory;
import net.imglib2.util.Grid;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Interpolant_ESTest extends Interpolant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(1);
      InterpolatorFactory<Integer, Integer> interpolatorFactory0 = (InterpolatorFactory<Integer, Integer>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      doReturn((RealRandomAccess) null).when(interpolatorFactory0).create(anyInt() , any(net.imglib2.RealInterval.class));
      Interpolant<Integer, Integer> interpolant0 = new Interpolant<Integer, Integer>(integer0, interpolatorFactory0, (-1547));
      interpolant0.realRandomAccess((RealInterval) null);
      assertEquals((-1547), interpolant0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RealPointSampleList<Integer> realPointSampleList0 = new RealPointSampleList<Integer>(67);
      RealPointSampleList.RealPointSampleListCursor realPointSampleList_RealPointSampleListCursor0 = realPointSampleList0.new RealPointSampleListCursor();
      InterpolatorFactory<Grid.CellIntervals, LinkedList<Integer>> interpolatorFactory0 = (InterpolatorFactory<Grid.CellIntervals, LinkedList<Integer>>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      doReturn((RealRandomAccess) null).when(interpolatorFactory0).create(any(java.util.LinkedList.class));
      Interpolant<Grid.CellIntervals, LinkedList<Integer>> interpolant0 = new Interpolant<Grid.CellIntervals, LinkedList<Integer>>(realPointSampleList_RealPointSampleListCursor0, interpolatorFactory0);
      RealRandomAccess<Grid.CellIntervals> realRandomAccess0 = interpolant0.realRandomAccess();
      assertNull(realRandomAccess0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(16);
      Supplier<Grid.CellIntervals> supplier0 = (Supplier<Grid.CellIntervals>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      double[] doubleArray0 = new double[6];
      RealPointSample<Grid.CellIntervals> realPointSample0 = RealPointSample.wrapSupplier(supplier0, doubleArray0);
      InterpolatorFactory<Grid.CellIntervals, Integer> interpolatorFactory0 = (InterpolatorFactory<Grid.CellIntervals, Integer>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      doReturn(realPointSample0).when(interpolatorFactory0).create(anyInt());
      Interpolant<Grid.CellIntervals, Integer> interpolant0 = new Interpolant<Grid.CellIntervals, Integer>(integer0, interpolatorFactory0, 16);
      RealRandomAccess<Grid.CellIntervals> realRandomAccess0 = interpolant0.realRandomAccess();
      assertNotNull(realRandomAccess0);
      assertEquals(16, interpolant0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      InterpolatorFactory<Integer, Object> interpolatorFactory0 = (InterpolatorFactory<Integer, Object>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      Interpolant<Integer, Object> interpolant0 = new Interpolant<Integer, Object>(object0, interpolatorFactory0, 0);
      int int0 = interpolant0.numDimensions();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      InterpolatorFactory<Object, Integer> interpolatorFactory0 = (InterpolatorFactory<Object, Integer>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      Interpolant<Object, Integer> interpolant0 = new Interpolant<Object, Integer>(integer0, interpolatorFactory0, (-1));
      int int0 = interpolant0.numDimensions();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatorFactory<List<Integer>, List<Integer>> interpolatorFactory0 = (InterpolatorFactory<List<Integer>, List<Integer>>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      Interpolant<List<Integer>, List<Integer>> interpolant0 = new Interpolant<List<Integer>, List<Integer>>((List<Integer>) null, interpolatorFactory0, 0);
      interpolant0.getSource();
      assertEquals(0, interpolant0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      InterpolatorFactory<Integer, Object> interpolatorFactory0 = (InterpolatorFactory<Integer, Object>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      Interpolant<Integer, Object> interpolant0 = new Interpolant<Integer, Object>(object0, interpolatorFactory0, 0);
      InterpolatorFactory<Object, Object> interpolatorFactory1 = (InterpolatorFactory<Object, Object>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      Interpolant<Object, Object> interpolant1 = new Interpolant<Object, Object>(interpolant0, interpolatorFactory1);
      Interpolant interpolant2 = (Interpolant)interpolant1.getSource();
      assertEquals(0, interpolant2.numDimensions());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Interpolant<Integer, List<Integer>> interpolant0 = new Interpolant<Integer, List<Integer>>(linkedList0, (InterpolatorFactory<Integer, List<Integer>>) null, 1);
      interpolant0.getInterpolatorFactory();
      assertEquals(1, interpolant0.numDimensions());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatorFactory<Grid.CellIntervals, List<Integer>> interpolatorFactory0 = (InterpolatorFactory<Grid.CellIntervals, List<Integer>>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      Interpolant<Grid.CellIntervals, List<Integer>> interpolant0 = null;
      try {
        interpolant0 = new Interpolant<Grid.CellIntervals, List<Integer>>((EuclideanSpace) null, interpolatorFactory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.Interpolant", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      Cursor<Integer> cursor0 = pointSampleList0.cursor();
      InterpolatorFactory<Integer, Point> interpolatorFactory0 = (InterpolatorFactory<Integer, Point>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(interpolatorFactory0).toString();
      Interpolant<Integer, Point> interpolant0 = new Interpolant<Integer, Point>(cursor0, interpolatorFactory0);
      InterpolatorFactory<Integer, Point> interpolatorFactory1 = interpolant0.getInterpolatorFactory();
      assertSame(interpolatorFactory1, interpolatorFactory0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Supplier<Grid.CellIntervals> supplier0 = (Supplier<Grid.CellIntervals>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      RealPointSample<Grid.CellIntervals> realPointSample0 = RealPointSample.wrapSupplier(supplier0, doubleArray0);
      InterpolatorFactory<PointSample<Integer>, Integer> interpolatorFactory0 = (InterpolatorFactory<PointSample<Integer>, Integer>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      Interpolant<PointSample<Integer>, Integer> interpolant0 = new Interpolant<PointSample<Integer>, Integer>(realPointSample0, interpolatorFactory0);
      int int0 = interpolant0.numDimensions();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Interpolant<Integer, Integer> interpolant0 = new Interpolant<Integer, Integer>(integer0, (InterpolatorFactory<Integer, Integer>) null, 0);
      // Undeclared exception!
      try { 
        interpolant0.realRandomAccess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.Interpolant", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      float[] floatArray0 = new float[16];
      RealPointSample<Object> realPointSample0 = new RealPointSample<Object>(supplier0, floatArray0);
      InterpolatorFactory<Object, Integer> interpolatorFactory0 = (InterpolatorFactory<Object, Integer>) mock(InterpolatorFactory.class, new ViolatedAssumptionAnswer());
      doReturn(realPointSample0).when(interpolatorFactory0).create(anyInt() , any(net.imglib2.RealInterval.class));
      Interpolant<Object, Integer> interpolant0 = new Interpolant<Object, Integer>(integer0, interpolatorFactory0, 0);
      PointSampleList<Integer> pointSampleList0 = new PointSampleList<Integer>(0);
      KDTree<Integer> kDTree0 = new KDTree<Integer>(pointSampleList0);
      RealRandomAccess<Object> realRandomAccess0 = interpolant0.realRandomAccess((RealInterval) kDTree0);
      assertEquals(0, interpolant0.numDimensions());
      assertNotNull(realRandomAccess0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long[] longArray0 = new long[4];
      FinalInterval finalInterval0 = FinalInterval.createMinSize(longArray0, longArray0);
      Interpolant<Integer, Point> interpolant0 = new Interpolant<Integer, Point>(finalInterval0, (InterpolatorFactory<Integer, Point>) null);
      // Undeclared exception!
      try { 
        interpolant0.realRandomAccess((RealInterval) finalInterval0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.interpolation.Interpolant", e);
      }
  }
}
