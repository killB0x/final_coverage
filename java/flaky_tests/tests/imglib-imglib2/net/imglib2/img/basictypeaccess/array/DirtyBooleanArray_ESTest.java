/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:15:42 GMT 2022
 */

package net.imglib2.img.basictypeaccess.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import net.imglib2.img.basictypeaccess.array.DirtyBooleanArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DirtyBooleanArray_ESTest extends DirtyBooleanArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray(booleanArray0);
      assertFalse(dirtyBooleanArray0.isDirty());
      
      dirtyBooleanArray0.setDirty(true);
      assertTrue(dirtyBooleanArray0.isDirty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray(booleanArray0);
      dirtyBooleanArray0.setValue(1, true);
      assertTrue(Arrays.equals(new boolean[] {false, true}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray(0);
      assertFalse(dirtyBooleanArray0.isDirty());
      
      dirtyBooleanArray0.setDirty();
      boolean boolean0 = dirtyBooleanArray0.isDirty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray(0);
      DirtyBooleanArray dirtyBooleanArray1 = dirtyBooleanArray0.createArray(1);
      assertEquals(1, dirtyBooleanArray1.getArrayLength());
      assertFalse(dirtyBooleanArray1.isDirty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray(booleanArray0);
      // Undeclared exception!
      try { 
        dirtyBooleanArray0.setValue(1259, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1259 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.DirtyBooleanArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray(0);
      // Undeclared exception!
      try { 
        dirtyBooleanArray0.createArray((-6));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -6
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractBooleanArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DirtyBooleanArray dirtyBooleanArray0 = null;
      try {
        dirtyBooleanArray0 = new DirtyBooleanArray((-2545));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -2545
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractBooleanArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray((boolean[]) null);
      // Undeclared exception!
      try { 
        dirtyBooleanArray0.setValue(1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.array.DirtyBooleanArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray(0);
      DirtyBooleanArray dirtyBooleanArray1 = dirtyBooleanArray0.createArray(0);
      assertFalse(dirtyBooleanArray1.isDirty());
      assertEquals(0, dirtyBooleanArray1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      DirtyBooleanArray dirtyBooleanArray0 = new DirtyBooleanArray(booleanArray0);
      boolean boolean0 = dirtyBooleanArray0.isDirty();
      assertFalse(boolean0);
  }
}
