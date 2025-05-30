/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 27 19:31:15 GMT 2022
 */

package com.conversantmedia.util.collection.spatial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.conversantmedia.util.collection.geometry.Point1d;
import com.conversantmedia.util.collection.geometry.Range1d;
import com.conversantmedia.util.collection.geometry.Rect2d;
import com.conversantmedia.util.collection.spatial.HyperRect;
import com.conversantmedia.util.collection.spatial.LinearSplitLeaf;
import com.conversantmedia.util.collection.spatial.Node;
import com.conversantmedia.util.collection.spatial.RectBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LinearSplitLeaf_ESTest extends LinearSplitLeaf_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RectBuilder<Integer> rectBuilder0 = (RectBuilder<Integer>) mock(RectBuilder.class, new ViolatedAssumptionAnswer());
      LinearSplitLeaf<Integer> linearSplitLeaf0 = new LinearSplitLeaf<Integer>(rectBuilder0, 1084, 1084);
      RectBuilder<Integer> rectBuilder1 = linearSplitLeaf0.builder;
      Integer integer0 = new Integer(0);
      LinearSplitLeaf<Integer> linearSplitLeaf1 = new LinearSplitLeaf<Integer>(rectBuilder1, (-673), 0);
      // Undeclared exception!
      try { 
        linearSplitLeaf1.add(integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.conversantmedia.util.collection.spatial.LinearSplitLeaf", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinearSplitLeaf<Object> linearSplitLeaf0 = new LinearSplitLeaf<Object>((RectBuilder<Object>) null, 2708, 2708);
      // Undeclared exception!
      try { 
        linearSplitLeaf0.split((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.conversantmedia.util.collection.spatial.LinearSplitLeaf", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinearSplitLeaf<Object> linearSplitLeaf0 = new LinearSplitLeaf<Object>((RectBuilder<Object>) null, 0, 0);
      // Undeclared exception!
      try { 
        linearSplitLeaf0.split((Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.conversantmedia.util.collection.spatial.LinearSplitLeaf", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinearSplitLeaf<Object> linearSplitLeaf0 = null;
      try {
        linearSplitLeaf0 = new LinearSplitLeaf<Object>((RectBuilder<Object>) null, 91, (-118));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -118
         //
         verifyException("com.conversantmedia.util.collection.spatial.Leaf", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Range1d range1d0 = new Range1d(1.0, 1.0);
      RectBuilder<Object> rectBuilder0 = (RectBuilder<Object>) mock(RectBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(range1d0, range1d0, range1d0, (HyperRect) null, (HyperRect) null).when(rectBuilder0).getBBox(any());
      LinearSplitLeaf<Object> linearSplitLeaf0 = new LinearSplitLeaf<Object>(rectBuilder0, 1476, 1476);
      Node<Object> node0 = linearSplitLeaf0.add(range1d0);
      linearSplitLeaf0.add(node0);
      Node<Object> node1 = linearSplitLeaf0.add(range1d0);
      // Undeclared exception!
      try { 
        linearSplitLeaf0.split(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.conversantmedia.util.collection.spatial.Leaf", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Rect2d rect2d0 = new Rect2d(2433.28618080558, 2245.7953192292, (-1.0), 2433.28618080558);
      Point1d point1d0 = new Point1d(2245.7953192292);
      Range1d range1d0 = new Range1d(point1d0, point1d0);
      RectBuilder<Object> rectBuilder0 = (RectBuilder<Object>) mock(RectBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(rect2d0, (HyperRect) null, (HyperRect) null, (HyperRect) null).when(rectBuilder0).getBBox(any());
      LinearSplitLeaf<Object> linearSplitLeaf0 = new LinearSplitLeaf<Object>(rectBuilder0, 1454, 1454);
      linearSplitLeaf0.add(point1d0);
      Integer integer0 = new Integer(1454);
      // Undeclared exception!
      try { 
        linearSplitLeaf0.split(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.conversantmedia.util.collection.spatial.Leaf", e);
      }
  }
}
