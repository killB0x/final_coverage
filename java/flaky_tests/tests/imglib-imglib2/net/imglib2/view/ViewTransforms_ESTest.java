/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:01:17 GMT 2022
 */

package net.imglib2.view;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.FinalInterval;
import net.imglib2.Interval;
import net.imglib2.PointSampleList;
import net.imglib2.transform.integer.Mixed;
import net.imglib2.transform.integer.MixedTransform;
import net.imglib2.view.ViewTransforms;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ViewTransforms_ESTest extends ViewTransforms_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.permute((-1968), (-474), 972);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1968
         //
         verifyException("net.imglib2.view.ViewTransforms", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MixedTransform mixedTransform0 = (MixedTransform)ViewTransforms.rotate(2459, 23, 409);
      assertNotNull(mixedTransform0);
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertEquals(2459, mixedTransform0.numSourceDimensions());
      assertEquals(2459, mixedTransform0.numTargetDimensions());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MixedTransform mixedTransform0 = (MixedTransform)ViewTransforms.permute(742, 1, 0);
      assertNotNull(mixedTransform0);
      assertEquals(742, mixedTransform0.numTargetDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertEquals(742, mixedTransform0.numSourceDimensions());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long[] longArray0 = new long[0];
      FinalInterval finalInterval0 = FinalInterval.createMinMax(longArray0);
      assertEquals(0, longArray0.length);
      assertNotNull(finalInterval0);
      assertEquals(0, finalInterval0.numDimensions());
      assertArrayEquals(new long[] {}, longArray0);
      
      MixedTransform mixedTransform0 = ViewTransforms.zeroMin(finalInterval0);
      assertEquals(0, longArray0.length);
      assertNotNull(mixedTransform0);
      assertEquals(0, finalInterval0.numDimensions());
      assertEquals(0, mixedTransform0.numSourceDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertEquals(0, mixedTransform0.numTargetDimensions());
      assertArrayEquals(new long[] {}, longArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[] longArray0 = new long[0];
      MixedTransform mixedTransform0 = ViewTransforms.translateInverse(longArray0);
      assertEquals(0, longArray0.length);
      assertNotNull(mixedTransform0);
      assertEquals(0, mixedTransform0.numTargetDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertEquals(0, mixedTransform0.numSourceDimensions());
      assertArrayEquals(new long[] {}, longArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[] longArray0 = new long[3];
      MixedTransform mixedTransform0 = ViewTransforms.translateInverse(longArray0);
      assertEquals(3, longArray0.length);
      assertNotNull(mixedTransform0);
      assertEquals(3, mixedTransform0.numSourceDimensions());
      assertEquals(3, mixedTransform0.numTargetDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertArrayEquals(new long[] {0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[5];
      MixedTransform mixedTransform0 = ViewTransforms.translate(longArray0);
      assertEquals(5, longArray0.length);
      assertNotNull(mixedTransform0);
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertEquals(5, mixedTransform0.numTargetDimensions());
      assertEquals(5, mixedTransform0.numSourceDimensions());
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[0];
      MixedTransform mixedTransform0 = ViewTransforms.translate(longArray0);
      assertEquals(0, longArray0.length);
      assertNotNull(mixedTransform0);
      assertEquals(0, mixedTransform0.numSourceDimensions());
      assertEquals(0, mixedTransform0.numTargetDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertArrayEquals(new long[] {}, longArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MixedTransform mixedTransform0 = (MixedTransform)ViewTransforms.rotate(0, (-1), 0);
      assertNotNull(mixedTransform0);
      assertEquals(0, mixedTransform0.numTargetDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertEquals(0, mixedTransform0.numSourceDimensions());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MixedTransform mixedTransform0 = (MixedTransform)ViewTransforms.permute(0, 0, 0);
      assertNotNull(mixedTransform0);
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertEquals(0, mixedTransform0.numTargetDimensions());
      assertEquals(0, mixedTransform0.numSourceDimensions());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MixedTransform mixedTransform0 = ViewTransforms.moveAxis(0, 406, 406);
      assertNotNull(mixedTransform0);
      assertTrue(mixedTransform0.hasFullSourceMapping());
      assertEquals(0, mixedTransform0.numTargetDimensions());
      assertEquals(0, mixedTransform0.numSourceDimensions());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MixedTransform mixedTransform0 = ViewTransforms.hyperSlice(1, 0, (-345L));
      assertNotNull(mixedTransform0);
      assertEquals(1, mixedTransform0.numTargetDimensions());
      assertEquals(0, mixedTransform0.numSourceDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MixedTransform mixedTransform0 = ViewTransforms.addDimension(0);
      assertNotNull(mixedTransform0);
      assertFalse(mixedTransform0.hasFullSourceMapping());
      assertEquals(0, mixedTransform0.numTargetDimensions());
      assertEquals(1, mixedTransform0.numSourceDimensions());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.zeroMin((Interval) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.view.ViewTransforms", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.rotate((-2053), (-2053), (-2053));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -2053
         //
         verifyException("net.imglib2.transform.integer.MixedTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.permute((-228), 0, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -228
         //
         verifyException("net.imglib2.transform.integer.MixedTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      ViewTransforms.moveAxis(2147483639, (-499), (-499));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.moveAxis((-16), (-16), (-16));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -16
         //
         verifyException("net.imglib2.transform.integer.MixedTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.moveAxis(1562, 687, 1562);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1562, Size: 1561
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.invertAxis((-1), (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("net.imglib2.view.ViewTransforms", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.invertAxis(2345, 2345);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2345 out of bounds for length 2345
         //
         verifyException("net.imglib2.view.ViewTransforms", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MixedTransform mixedTransform0 = ViewTransforms.moveAxis(2721, 2446, 0);
      assertNotNull(mixedTransform0);
      assertEquals(2721, mixedTransform0.numSourceDimensions());
      assertEquals(2721, mixedTransform0.numTargetDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      
      MixedTransform mixedTransform1 = ViewTransforms.addDimension(2446);
      assertFalse(mixedTransform1.equals((Object)mixedTransform0));
      assertNotSame(mixedTransform1, mixedTransform0);
      assertNotNull(mixedTransform1);
      assertEquals(2446, mixedTransform1.numTargetDimensions());
      assertEquals(2447, mixedTransform1.numSourceDimensions());
      
      // Undeclared exception!
      ViewTransforms.hyperSlice(5044, 2446, 2721);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      ViewTransforms.hyperSlice(2147483639, 2147483639, 2147483639);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.hyperSlice((-1968), (-1968), (-1968));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1968
         //
         verifyException("net.imglib2.transform.integer.MixedTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.hyperSlice(387, 387, 387);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 387 out of bounds for length 387
         //
         verifyException("net.imglib2.view.ViewTransforms", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MixedTransform mixedTransform0 = ViewTransforms.invertAxis(2963, 89);
      assertNotNull(mixedTransform0);
      assertEquals(2963, mixedTransform0.numTargetDimensions());
      assertEquals(2963, mixedTransform0.numSourceDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      
      MixedTransform mixedTransform1 = ViewTransforms.addDimension(2963);
      assertFalse(mixedTransform1.equals((Object)mixedTransform0));
      assertNotSame(mixedTransform1, mixedTransform0);
      assertNotNull(mixedTransform1);
      assertEquals(2963, mixedTransform1.numTargetDimensions());
      assertEquals(2964, mixedTransform1.numSourceDimensions());
      
      MixedTransform mixedTransform2 = ViewTransforms.hyperSlice(2963, 89, 995L);
      assertFalse(mixedTransform2.equals((Object)mixedTransform0));
      assertFalse(mixedTransform2.equals((Object)mixedTransform1));
      assertNotSame(mixedTransform2, mixedTransform0);
      assertNotSame(mixedTransform2, mixedTransform1);
      assertNotNull(mixedTransform2);
      assertEquals(2963, mixedTransform2.numTargetDimensions());
      assertEquals(2962, mixedTransform2.numSourceDimensions());
      assertTrue(mixedTransform2.hasFullSourceMapping());
      
      // Undeclared exception!
      ViewTransforms.addDimension(2963);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      ViewTransforms.addDimension(2147483639);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.addDimension((-2671));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -2671
         //
         verifyException("net.imglib2.transform.integer.MixedTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.translate((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.view.ViewTransforms", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MixedTransform mixedTransform0 = ViewTransforms.moveAxis(2697, 2458, 2458);
      assertNotNull(mixedTransform0);
      assertEquals(2697, mixedTransform0.numSourceDimensions());
      assertEquals(2697, mixedTransform0.numTargetDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      
      MixedTransform mixedTransform1 = ViewTransforms.addDimension(2458);
      assertFalse(mixedTransform1.equals((Object)mixedTransform0));
      assertNotSame(mixedTransform1, mixedTransform0);
      assertNotNull(mixedTransform1);
      assertEquals(2459, mixedTransform1.numSourceDimensions());
      assertEquals(2458, mixedTransform1.numTargetDimensions());
      
      MixedTransform mixedTransform2 = ViewTransforms.hyperSlice(2697, 2458, 2458);
      assertFalse(mixedTransform2.equals((Object)mixedTransform0));
      assertFalse(mixedTransform2.equals((Object)mixedTransform1));
      assertNotSame(mixedTransform2, mixedTransform0);
      assertNotSame(mixedTransform2, mixedTransform1);
      assertNotNull(mixedTransform2);
      assertTrue(mixedTransform2.hasFullSourceMapping());
      assertEquals(2696, mixedTransform2.numSourceDimensions());
      assertEquals(2697, mixedTransform2.numTargetDimensions());
      
      // Undeclared exception!
      ViewTransforms.invertAxis(2458, 0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MixedTransform mixedTransform0 = ViewTransforms.moveAxis(2746, 2409, 0);
      assertNotNull(mixedTransform0);
      assertEquals(2746, mixedTransform0.numTargetDimensions());
      assertEquals(2746, mixedTransform0.numSourceDimensions());
      assertTrue(mixedTransform0.hasFullSourceMapping());
      
      MixedTransform mixedTransform1 = ViewTransforms.hyperSlice(2746, 0, 2161L);
      assertFalse(mixedTransform1.equals((Object)mixedTransform0));
      assertNotSame(mixedTransform1, mixedTransform0);
      assertNotNull(mixedTransform1);
      assertEquals(2746, mixedTransform1.numTargetDimensions());
      assertEquals(2745, mixedTransform1.numSourceDimensions());
      
      MixedTransform mixedTransform2 = ViewTransforms.hyperSlice(2725, 40, 2161L);
      assertFalse(mixedTransform2.equals((Object)mixedTransform1));
      assertFalse(mixedTransform2.equals((Object)mixedTransform0));
      assertNotSame(mixedTransform2, mixedTransform1);
      assertNotSame(mixedTransform2, mixedTransform0);
      assertNotNull(mixedTransform2);
      assertEquals(2725, mixedTransform2.numTargetDimensions());
      assertTrue(mixedTransform2.hasFullSourceMapping());
      assertEquals(2724, mixedTransform2.numSourceDimensions());
      
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(2409);
      assertNotNull(pointSampleList0);
      assertEquals(2409, pointSampleList0.numDimensions());
      assertEquals(0L, pointSampleList0.size());
      
      // Undeclared exception!
      ViewTransforms.zeroMin(pointSampleList0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.permute(9, 2366, 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2366 out of bounds for length 9
         //
         verifyException("net.imglib2.view.ViewTransforms", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      ViewTransforms.rotate(2147483639, 2366, 2366);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Mixed mixed0 = ViewTransforms.rotate(2345, 2345, 1);
      assertEquals(2345, mixed0.numTargetDimensions());
      assertEquals(2345, mixed0.numSourceDimensions());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PointSampleList<Object> pointSampleList0 = new PointSampleList<Object>(2409);
      MixedTransform mixedTransform0 = ViewTransforms.zeroMin(pointSampleList0);
      assertEquals(2409, mixedTransform0.numSourceDimensions());
      assertEquals(2409, mixedTransform0.numTargetDimensions());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ViewTransforms viewTransforms0 = new ViewTransforms();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        ViewTransforms.translateInverse((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.view.ViewTransforms", e);
      }
  }
}
