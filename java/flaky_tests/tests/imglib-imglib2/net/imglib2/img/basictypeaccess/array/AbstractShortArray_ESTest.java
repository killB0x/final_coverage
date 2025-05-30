/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:51:46 GMT 2022
 */

package net.imglib2.img.basictypeaccess.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.imglib2.img.basictypeaccess.array.DirtyShortArray;
import net.imglib2.img.basictypeaccess.array.ShortArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractShortArray_ESTest extends AbstractShortArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      short[] shortArray0 = new short[4];
      ShortArray shortArray1 = new ShortArray(shortArray0);
      shortArray1.setValue(0, (short) (-1199));
      assertArrayEquals(new short[] {(short) (-1199), (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      short[] shortArray0 = new short[4];
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray(shortArray0);
      dirtyShortArray0.setValue(0, (short)266);
      short short0 = dirtyShortArray0.getValue((short)0);
      assertEquals((short)266, short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray(0);
      assertEquals(0, dirtyShortArray0.getArrayLength());
      
      short[] shortArray0 = new short[3];
      shortArray0[0] = (short) (-1);
      dirtyShortArray0.data = shortArray0;
      short short0 = dirtyShortArray0.getValue(0);
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray((short[]) null);
      short[] shortArray0 = dirtyShortArray0.getCurrentStorageArray();
      assertNull(shortArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray(0);
      short[] shortArray0 = dirtyShortArray0.getCurrentStorageArray();
      assertEquals(0, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      short[] shortArray0 = new short[0];
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray(shortArray0);
      int int0 = dirtyShortArray0.getArrayLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray(1797);
      int int0 = dirtyShortArray0.getArrayLength();
      assertEquals(1797, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray((short[]) null);
      // Undeclared exception!
      try { 
        dirtyShortArray0.setValue((short) (-2654), (short) (-2654));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.array.DirtyShortArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray((short[]) null);
      // Undeclared exception!
      try { 
        dirtyShortArray0.getValue(488);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractShortArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray(1);
      // Undeclared exception!
      try { 
        dirtyShortArray0.getValue(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractShortArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ShortArray shortArray0 = new ShortArray(0);
      // Undeclared exception!
      try { 
        shortArray0.setValue(0, (short)1323);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractShortArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      short[] shortArray0 = new short[4];
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray(shortArray0);
      short short0 = dirtyShortArray0.getValue((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      short[] shortArray0 = new short[4];
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray(shortArray0);
      short[] shortArray1 = dirtyShortArray0.getCurrentStorageArray();
      assertSame(shortArray0, shortArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DirtyShortArray dirtyShortArray0 = new DirtyShortArray((short[]) null);
      // Undeclared exception!
      try { 
        dirtyShortArray0.getArrayLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.array.AbstractShortArray", e);
      }
  }
}
