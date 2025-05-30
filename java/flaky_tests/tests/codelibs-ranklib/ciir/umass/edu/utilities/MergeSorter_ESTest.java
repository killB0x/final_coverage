/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 16:54:00 GMT 2022
 */

package ciir.umass.edu.utilities;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ciir.umass.edu.utilities.MergeSorter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MergeSorter_ESTest extends MergeSorter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1789.21949);
      int[] intArray0 = MergeSorter.sort(doubleArray0, true);
      assertArrayEquals(new int[] {0, 1, 2}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[2] = 1658.4714F;
      floatArray0[3] = 1484.5535F;
      int[] intArray0 = MergeSorter.sort(floatArray0, true);
      assertArrayEquals(new int[] {0, 1, 4, 3, 2}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        MergeSorter.sort((float[]) null, 5686, (-1), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -5686
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        MergeSorter.sort(doubleArray0, 1316, 440, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -875
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        MergeSorter.sort(doubleArray0, 0, (-1), true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) (-23.998264F);
      doubleArray0[3] = (double) 1293;
      // Undeclared exception!
      try { 
        MergeSorter.sort(doubleArray0, 0, 1003, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 6 out of bounds for length 6
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 22.189383F;
      doubleArray0[2] = (double) 22.189383F;
      // Undeclared exception!
      try { 
        MergeSorter.sort(doubleArray0, 0, 1293, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      int[] intArray0 = MergeSorter.sort(doubleArray0, 708, 708, true);
      assertArrayEquals(new int[] {708}, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (double) 1293;
      // Undeclared exception!
      try { 
        MergeSorter.sort(doubleArray0, 0, 1003, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 6 out of bounds for length 6
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[1] = 2177.126F;
      floatArray0[2] = (-1009.848F);
      // Undeclared exception!
      try { 
        MergeSorter.sort(floatArray0, 0, 2154, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[10];
      floatArray0[1] = 2178.1062F;
      floatArray0[3] = 1.0F;
      // Undeclared exception!
      try { 
        MergeSorter.sort(floatArray0, 0, 2154, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 10 out of bounds for length 10
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      float[] floatArray0 = new float[2];
      // Undeclared exception!
      try { 
        MergeSorter.sort(floatArray0, 0, (-1), true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      float[] floatArray0 = new float[4];
      int[] intArray0 = MergeSorter.sort(floatArray0, (-1803), (-1803), false);
      assertArrayEquals(new int[] {(-1803)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1920.1343483215057);
      doubleArray0[2] = (-1859.2);
      doubleArray0[3] = (-307.88874951);
      doubleArray0[6] = 10.0;
      int[] intArray0 = MergeSorter.sort(doubleArray0, false);
      assertArrayEquals(new int[] {6, 1, 4, 5, 3, 2, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-287.4505);
      doubleArray0[2] = (-3151.27);
      int[] intArray0 = MergeSorter.sort(doubleArray0, false);
      assertArrayEquals(new int[] {1, 3, 0, 2}, intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 838.92358543883;
      int[] intArray0 = MergeSorter.sort(doubleArray0, true);
      assertArrayEquals(new int[] {1, 0, 3, 2}, intArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-1.0);
      int[] intArray0 = MergeSorter.sort(doubleArray0, true);
      assertArrayEquals(new int[] {1, 0, 2, 3}, intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        MergeSorter.sort(doubleArray0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        MergeSorter.sort((double[]) null, (-1), 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[2] = 2982.67F;
      floatArray0[3] = (-281.082F);
      floatArray0[4] = (-1.0F);
      floatArray0[6] = 1405.0F;
      int[] intArray0 = MergeSorter.sort(floatArray0, false);
      assertArrayEquals(new int[] {2, 6, 0, 1, 5, 4, 3}, intArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[2] = (float) 1;
      floatArray0[6] = (float) 1;
      int[] intArray0 = MergeSorter.sort(floatArray0, false);
      assertArrayEquals(new int[] {2, 6, 0, 1, 3, 4, 5}, intArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        MergeSorter.sort(floatArray0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        MergeSorter.sort((float[]) null, (-7), 445, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      MergeSorter.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        MergeSorter.sort((float[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        MergeSorter.sort((double[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ciir.umass.edu.utilities.MergeSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MergeSorter mergeSorter0 = new MergeSorter();
  }
}
