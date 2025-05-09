/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 10:20:32 GMT 2022
 */

package com.ning.tr13.lookup;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ning.tr13.impl.vint.ByteArrayVIntTrieLookup;
import com.ning.tr13.impl.vint.ByteBufferVIntTrieLookup;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VIntTrieLookup_ESTest extends VIntTrieLookup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      long long0 = byteArrayVIntTrieLookup0.getValue(byteArray0, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      long long0 = byteArrayVIntTrieLookup0.getValue(byteArray0, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      long long0 = byteArrayVIntTrieLookup0.getValue(byteArray0, (-3012L));
      assertEquals((-3012L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-102);
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      byte[] byteArray1 = new byte[0];
      long long0 = byteArrayVIntTrieLookup0.getValue(byteArray1);
      assertEquals(26L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[6];
      byteArray1[3] = (byte) (-25);
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray1);
      Long long0 = byteArrayVIntTrieLookup0.findValue(byteArray0);
      assertEquals(103L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup((byte[]) null);
      // Undeclared exception!
      try { 
        byteArrayVIntTrieLookup0.getValue((byte[]) null, 79L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ning.tr13.impl.vint.ByteArrayVIntTrieLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      ByteBufferVIntTrieLookup byteBufferVIntTrieLookup0 = new ByteBufferVIntTrieLookup(byteBuffer0, 1);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        byteBufferVIntTrieLookup0.getValue(byteArray0, (long) 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      // Undeclared exception!
      try { 
        byteArrayVIntTrieLookup0.getValue(byteArray0, 0L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.ning.tr13.impl.vint.ByteArrayVIntTrieLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      try { 
        byteArrayVIntTrieLookup0.getValue(byteArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No value for key 0x
         //
         verifyException("com.ning.tr13.impl.vint.ByteArrayVIntTrieLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup((byte[]) null);
      // Undeclared exception!
      try { 
        byteArrayVIntTrieLookup0.getValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ning.tr13.impl.vint.ByteArrayVIntTrieLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
      ByteBufferVIntTrieLookup byteBufferVIntTrieLookup0 = new ByteBufferVIntTrieLookup(byteBuffer0, 0);
      // Undeclared exception!
      try { 
        byteBufferVIntTrieLookup0.getValue(byteArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      // Undeclared exception!
      try { 
        byteArrayVIntTrieLookup0.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.ning.tr13.impl.vint.ByteArrayVIntTrieLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup((byte[]) null);
      // Undeclared exception!
      try { 
        byteArrayVIntTrieLookup0.findValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ning.tr13.impl.vint.ByteArrayVIntTrieLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2867);
      ByteBufferVIntTrieLookup byteBufferVIntTrieLookup0 = new ByteBufferVIntTrieLookup(byteBuffer0, 2867);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        byteBufferVIntTrieLookup0.findValue(byteArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      // Undeclared exception!
      try { 
        byteArrayVIntTrieLookup0.findValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.ning.tr13.impl.vint.ByteArrayVIntTrieLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayVIntTrieLookup byteArrayVIntTrieLookup0 = new ByteArrayVIntTrieLookup(byteArray0);
      Long long0 = byteArrayVIntTrieLookup0.findValue(byteArray0);
      assertNull(long0);
  }
}
