/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 10:21:30 GMT 2022
 */

package com.ning.tr13.lookup;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ning.tr13.impl.bytes.ByteArrayBytesTrieLookup;
import com.ning.tr13.impl.bytes.ByteBufferBytesTrieLookup;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BytesTrieLookup_ESTest extends BytesTrieLookup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayBytesTrieLookup byteArrayBytesTrieLookup0 = new ByteArrayBytesTrieLookup(byteArray0);
      byte[] byteArray1 = byteArrayBytesTrieLookup0.findValue(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      ByteBufferBytesTrieLookup byteBufferBytesTrieLookup0 = new ByteBufferBytesTrieLookup(byteBuffer0, 0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        byteBufferBytesTrieLookup0.findValue(byteArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayBytesTrieLookup byteArrayBytesTrieLookup0 = new ByteArrayBytesTrieLookup(byteArray0);
      // Undeclared exception!
      try { 
        byteArrayBytesTrieLookup0.findValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.ning.tr13.impl.bytes.ByteArrayBytesTrieLookup", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteArrayBytesTrieLookup byteArrayBytesTrieLookup0 = new ByteArrayBytesTrieLookup((byte[]) null);
      // Undeclared exception!
      try { 
        byteArrayBytesTrieLookup0.findValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ning.tr13.impl.bytes.ByteArrayBytesTrieLookup", e);
      }
  }
}
