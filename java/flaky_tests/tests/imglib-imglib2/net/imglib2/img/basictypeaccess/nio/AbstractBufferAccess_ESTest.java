/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 15:01:12 GMT 2022
 */

package net.imglib2.img.basictypeaccess.nio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import net.imglib2.img.basictypeaccess.nio.ByteBufferAccess;
import net.imglib2.img.basictypeaccess.nio.CharBufferAccess;
import net.imglib2.img.basictypeaccess.nio.DoubleBufferAccess;
import net.imglib2.img.basictypeaccess.nio.LongBufferAccess;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractBufferAccess_ESTest extends AbstractBufferAccess_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LongBufferAccess longBufferAccess0 = new LongBufferAccess();
      ByteBuffer byteBuffer0 = longBufferAccess0.allocateByteBuffer(523, false);
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=4184 cap=4184]", byteBuffer0.toString());
      assertFalse(longBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharBufferAccess charBufferAccess0 = new CharBufferAccess(2863, false);
      charBufferAccess0.createView((Object) null);
      assertFalse(charBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(523);
      CharBuffer charBuffer0 = byteBuffer0.asCharBuffer();
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      CharBufferAccess charBufferAccess0 = new CharBufferAccess(charBuffer1);
      charBufferAccess0.createView(byteBuffer0);
      assertTrue(charBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(18);
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(byteBuffer0, true);
      byteBufferAccess0.createView(byteBuffer0);
      assertTrue(byteBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharBufferAccess charBufferAccess0 = new CharBufferAccess(0, true);
      Object object0 = new Object();
      charBufferAccess0.createView(object0);
      assertTrue(charBufferAccess0.isValid());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      DoubleBufferAccess doubleBufferAccess0 = DoubleBufferAccess.fromByteBuffer(byteBuffer0, false);
      DoubleBufferAccess doubleBufferAccess1 = doubleBufferAccess0.createArray(1);
      assertFalse(doubleBufferAccess0.isDirect());
      assertFalse(doubleBufferAccess0.isValid());
      assertEquals(1, doubleBufferAccess1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2);
      LongBufferAccess longBufferAccess0 = new LongBufferAccess();
      LongBufferAccess longBufferAccess1 = longBufferAccess0.newInstance(byteBuffer0, true);
      LongBufferAccess longBufferAccess2 = longBufferAccess1.createArray(1);
      assertTrue(longBufferAccess2.isValid());
      assertFalse(longBufferAccess0.isValid());
      assertEquals(1, longBufferAccess2.getArrayLength());
      assertTrue(longBufferAccess2.isDirect());
      assertTrue(longBufferAccess1.isDirect());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess((byte)0);
      DoubleBufferAccess doubleBufferAccess1 = doubleBufferAccess0.createArray((byte)0);
      assertFalse(doubleBufferAccess0.isDirect());
      assertTrue(doubleBufferAccess0.isValid());
      assertEquals(0, doubleBufferAccess1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(0);
      ByteBufferAccess byteBufferAccess1 = byteBufferAccess0.allocate(0, false, false);
      assertFalse(byteBufferAccess1.isValid());
      assertEquals(0, byteBufferAccess1.getArrayLength());
      assertFalse(byteBufferAccess1.isDirect());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess((ByteBuffer) null, true);
      ByteBufferAccess byteBufferAccess1 = byteBufferAccess0.allocate(587, true, true);
      assertTrue(byteBufferAccess1.isDirect());
      assertEquals(587, byteBufferAccess1.getArrayLength());
      assertTrue(byteBufferAccess1.isValid());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      DoubleBufferAccess doubleBufferAccess0 = DoubleBufferAccess.fromByteBuffer(byteBuffer0, false);
      DoubleBufferAccess doubleBufferAccess1 = doubleBufferAccess0.allocate(1);
      assertFalse(doubleBufferAccess0.isValid());
      assertFalse(doubleBufferAccess0.isDirect());
      assertEquals(1, doubleBufferAccess1.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        doubleBufferAccess0.createView(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.imglib2.img.basictypeaccess.nio.DoubleBufferAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess();
      // Undeclared exception!
      try { 
        doubleBufferAccess0.createArray((-2460));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity < 0: (-2460 < 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess();
      // Undeclared exception!
      try { 
        doubleBufferAccess0.allocateByteBuffer((-194), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity < 0: (-1552 < 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(byteBuffer0, true);
      // Undeclared exception!
      try { 
        byteBufferAccess0.allocate((-1593), true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity < 0: (-1593 < 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess();
      // Undeclared exception!
      try { 
        doubleBufferAccess0.allocate((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // capacity < 0: (-1 < 0)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess(byteBuffer0, true);
      DoubleBufferAccess doubleBufferAccess1 = doubleBufferAccess0.allocate(0);
      assertEquals(0, doubleBufferAccess1.getArrayLength());
      assertTrue(doubleBufferAccess1.isValid());
      assertTrue(doubleBufferAccess0.isDirect());
      assertTrue(doubleBufferAccess0.isValid());
      assertTrue(doubleBufferAccess1.isDirect());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteBufferAccess byteBufferAccess0 = new ByteBufferAccess(2070);
      ByteBufferAccess byteBufferAccess1 = byteBufferAccess0.createArray(2070);
      assertTrue(byteBufferAccess1.isValid());
      assertEquals(2070, byteBufferAccess1.getArrayLength());
      assertFalse(byteBufferAccess0.isDirect());
      assertTrue(byteBufferAccess0.isValid());
      assertFalse(byteBufferAccess1.isDirect());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleBufferAccess doubleBufferAccess0 = new DoubleBufferAccess();
      DoubleBufferAccess doubleBufferAccess1 = doubleBufferAccess0.allocate(0);
      // Undeclared exception!
      try { 
        doubleBufferAccess1.setValues(doubleBufferAccess0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapDoubleBuffer", e);
      }
  }
}
