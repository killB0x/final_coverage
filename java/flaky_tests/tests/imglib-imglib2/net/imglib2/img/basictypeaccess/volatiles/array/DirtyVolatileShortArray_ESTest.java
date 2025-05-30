/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 18:40:15 GMT 2022
 */

package net.imglib2.img.basictypeaccess.volatiles.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.img.basictypeaccess.volatiles.array.DirtyVolatileShortArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DirtyVolatileShortArray_ESTest extends DirtyVolatileShortArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      short[] shortArray0 = new short[1];
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(shortArray0, true);
      dirtyVolatileShortArray0.setDirty(false);
      assertFalse(dirtyVolatileShortArray0.isDirty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      short[] shortArray0 = new short[1];
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(shortArray0, true);
      assertFalse(dirtyVolatileShortArray0.isDirty());
      
      dirtyVolatileShortArray0.setValue(0, (short)0);
      assertTrue(dirtyVolatileShortArray0.isDirty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(2178, true);
      assertFalse(dirtyVolatileShortArray0.isDirty());
      
      dirtyVolatileShortArray0.setDirty();
      boolean boolean0 = dirtyVolatileShortArray0.isDirty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      short[] shortArray0 = new short[1];
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(shortArray0, true);
      DirtyVolatileShortArray dirtyVolatileShortArray1 = dirtyVolatileShortArray0.createArray((int) (short)0, false);
      assertFalse(dirtyVolatileShortArray1.isValid());
      assertFalse(dirtyVolatileShortArray1.isDirty());
      assertFalse(dirtyVolatileShortArray0.isDirty());
      assertEquals(0, dirtyVolatileShortArray1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray((short[]) null, false);
      // Undeclared exception!
      try { 
        dirtyVolatileShortArray0.setValue((-2031), (short) (-804));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.volatiles.array.DirtyVolatileShortArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(0, true);
      // Undeclared exception!
      try { 
        dirtyVolatileShortArray0.createArray((-205), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -205
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractShortArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DirtyVolatileShortArray dirtyVolatileShortArray0 = null;
      try {
        dirtyVolatileShortArray0 = new DirtyVolatileShortArray((-205), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -205
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractShortArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      short[] shortArray0 = new short[1];
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(shortArray0, true);
      assertFalse(dirtyVolatileShortArray0.isDirty());
      
      dirtyVolatileShortArray0.setDirty(true);
      assertTrue(dirtyVolatileShortArray0.isDirty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(2178, true);
      boolean boolean0 = dirtyVolatileShortArray0.isDirty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(2178, true);
      DirtyVolatileShortArray dirtyVolatileShortArray1 = dirtyVolatileShortArray0.createArray(2178, true);
      assertTrue(dirtyVolatileShortArray1.isValid());
      assertFalse(dirtyVolatileShortArray1.isDirty());
      assertEquals(2178, dirtyVolatileShortArray1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      short[] shortArray0 = new short[4];
      DirtyVolatileShortArray dirtyVolatileShortArray0 = new DirtyVolatileShortArray(shortArray0, false);
      // Undeclared exception!
      try { 
        dirtyVolatileShortArray0.setValue(2992, (short)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2992 out of bounds for length 4
         //
         verifyException("net.imglib2.img.basictypeaccess.volatiles.array.DirtyVolatileShortArray", e);
      }
  }
}
