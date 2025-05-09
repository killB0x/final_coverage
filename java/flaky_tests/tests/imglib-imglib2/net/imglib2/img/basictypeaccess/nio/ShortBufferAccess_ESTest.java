/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:26:38 GMT 2022
 */

package net.imglib2.img.basictypeaccess.nio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import net.imglib2.img.basictypeaccess.nio.ShortBufferAccess;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ShortBufferAccess_ESTest extends ShortBufferAccess_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(68);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(68);
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.newInstance(byteBuffer0, false);
      ShortBufferAccess shortBufferAccess2 = shortBufferAccess1.createArray(68);
      assertFalse(shortBufferAccess1.isValid());
      assertTrue(shortBufferAccess2.isDirect());
      assertFalse(shortBufferAccess2.isValid());
      assertEquals(68, shortBufferAccess2.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(68);
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.createArray(68);
      assertTrue(shortBufferAccess1.isValid());
      assertEquals(68, shortBufferAccess1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(0, false);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((short)1);
      ShortBuffer shortBuffer0 = byteBuffer0.asShortBuffer();
      ShortBuffer shortBuffer1 = shortBuffer0.asReadOnlyBuffer();
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.newInstance(shortBuffer1, true);
      assertTrue(shortBufferAccess1.isValid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.newInstance((ShortBuffer) null, false);
      assertFalse(shortBufferAccess1.isValid());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(68);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(68);
      ShortBuffer shortBuffer0 = byteBuffer0.asShortBuffer();
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.newInstance(shortBuffer0, false);
      assertFalse(shortBufferAccess1.isValid());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(920);
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(byteBuffer0, false);
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.newInstance(byteBuffer0, false);
      assertFalse(shortBufferAccess1.isValid());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)1729;
      ShortBuffer shortBuffer0 = ShortBuffer.wrap(shortArray0);
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(shortBuffer0);
      short short0 = shortBufferAccess0.getValue((short)0);
      assertEquals((short)1729, short0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      short[] shortArray0 = new short[4];
      shortArray0[1] = (short) (-1905);
      ShortBuffer shortBuffer0 = ShortBuffer.wrap(shortArray0);
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(shortBuffer0, true);
      short short0 = shortBufferAccess0.getValue(1);
      assertEquals((short) (-1905), short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2432);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      ShortBufferAccess shortBufferAccess0 = ShortBufferAccess.fromByteBuffer(byteBuffer1, false);
      assertFalse(shortBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      ShortBufferAccess shortBufferAccess0 = ShortBufferAccess.fromByteBuffer(byteBuffer0, true);
      assertTrue(shortBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(68);
      ShortBufferAccess shortBufferAccess0 = ShortBufferAccess.fromByteBuffer(byteBuffer0, true);
      assertTrue(shortBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.allocate(0, false, false);
      assertEquals(0, shortBufferAccess1.getArrayLength());
      assertFalse(shortBufferAccess1.isValid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(2);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2);
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.newInstance(byteBuffer0, false);
      // Undeclared exception!
      try { 
        shortBufferAccess1.setValues(shortBufferAccess0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ShortBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      // Undeclared exception!
      try { 
        shortBufferAccess0.setValues(shortBufferAccess0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ShortBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      // Undeclared exception!
      try { 
        shortBufferAccess0.setValue(1, (short)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ShortBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(5460, true);
      // Undeclared exception!
      try { 
        shortBufferAccess0.setValue(5460, (short)1452);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      // Undeclared exception!
      try { 
        shortBufferAccess0.newInstance((ByteBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ShortBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      // Undeclared exception!
      try { 
        shortBufferAccess0.getValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ShortBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(1);
      // Undeclared exception!
      try { 
        shortBufferAccess0.getValue(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("java.nio.HeapShortBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      // Undeclared exception!
      try { 
        shortBufferAccess0.duplicateBuffer((ShortBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ShortBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      // Undeclared exception!
      try { 
        shortBufferAccess0.allocate((-1378), true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity < 0: (-2756 < 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = null;
      try {
        shortBufferAccess0 = new ShortBufferAccess((ByteBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ShortBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = null;
      try {
        shortBufferAccess0 = new ShortBufferAccess((-1019), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity < 0: (-1019 < 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = null;
      try {
        shortBufferAccess0 = new ShortBufferAccess((-1378));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity < 0: (-1378 < 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ShortBufferAccess.fromByteBuffer((ByteBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ShortBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(byteBuffer0);
      assertEquals(0, shortBufferAccess0.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(0, false);
      ShortBuffer shortBuffer0 = shortBufferAccess0.setValues(shortBufferAccess0);
      assertEquals(0, shortBuffer0.limit());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      short[] shortArray0 = new short[4];
      ShortBuffer shortBuffer0 = ShortBuffer.wrap(shortArray0);
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(shortBuffer0, true);
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.allocate(3290, true, true);
      assertEquals(2, shortBufferAccess0.getNumBytesPerEntity());
      assertTrue(shortBufferAccess1.isValid());
      assertTrue(shortBufferAccess1.isDirect());
      assertEquals(3290, shortBufferAccess1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess();
      int int0 = shortBufferAccess0.getNumBytesPerEntity();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      short[] shortArray0 = new short[4];
      ShortBuffer shortBuffer0 = ShortBuffer.wrap(shortArray0);
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(shortBuffer0, true);
      ShortBuffer shortBuffer1 = shortBufferAccess0.duplicateBuffer(shortBuffer0);
      assertEquals(4, shortBuffer1.capacity());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = null;
      try {
        shortBufferAccess0 = new ShortBufferAccess((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.ShortBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      short[] shortArray0 = new short[4];
      ShortBuffer shortBuffer0 = ShortBuffer.wrap(shortArray0);
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(shortBuffer0, true);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      ShortBufferAccess shortBufferAccess1 = shortBufferAccess0.newInstance(byteBuffer0, true);
      assertTrue(shortBufferAccess1.isValid());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(68);
      shortBufferAccess0.setValue(0, (short) (-1));
      assertTrue(shortBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      short[] shortArray0 = new short[4];
      ShortBuffer shortBuffer0 = ShortBuffer.wrap(shortArray0);
      ShortBufferAccess shortBufferAccess0 = new ShortBufferAccess(shortBuffer0, true);
      short short0 = shortBufferAccess0.getValue(1);
      assertEquals((short)0, short0);
  }
}
