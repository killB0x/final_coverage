/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 13:42:20 GMT 2022
 */

package com.insightml.utils.types.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.insightml.utils.types.collections.IntArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IntArray_ESTest extends IntArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntArray intArray0 = new IntArray(1512);
      intArray0.add(0);
      intArray0.add(0);
      assertEquals(2, intArray0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IntArray intArray0 = new IntArray(1512);
      intArray0.add(0);
      intArray0.toArray();
      assertEquals(1, intArray0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IntArray intArray0 = new IntArray(1512);
      intArray0.add(0);
      int int0 = intArray0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IntArray intArray0 = null;
      try {
        intArray0 = new IntArray((-2931));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -2931
         //
         verifyException("com.insightml.utils.types.collections.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IntArray intArray0 = new IntArray(1);
      int int0 = intArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IntArray intArray0 = new IntArray(0);
      // Undeclared exception!
      try { 
        intArray0.add(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.insightml.utils.types.collections.IntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IntArray intArray0 = new IntArray(0);
      int[] intArray1 = intArray0.toArray();
      assertEquals(0, intArray0.size());
      assertEquals(0, intArray1.length);
  }
}
