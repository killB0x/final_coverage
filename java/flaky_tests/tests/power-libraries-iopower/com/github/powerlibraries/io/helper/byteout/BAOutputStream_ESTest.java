/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 13 23:22:13 GMT 2022
 */

package com.github.powerlibraries.io.helper.byteout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.powerlibraries.io.helper.byteout.BAOutputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BAOutputStream_ESTest extends BAOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BAOutputStream bAOutputStream0 = new BAOutputStream(byteArrayOutputStream0, byteArrayOutputStream0);
      bAOutputStream0.flush();
      assertEquals("", bAOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BAOutputStream bAOutputStream0 = new BAOutputStream(byteArrayOutputStream0, byteArrayOutputStream0);
      bAOutputStream0.close();
      assertEquals("", bAOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BAOutputStream bAOutputStream0 = new BAOutputStream(byteArrayOutputStream0, byteArrayOutputStream0);
      bAOutputStream0.write(1960);
      bAOutputStream0.toString();
      assertEquals("\uFFFD", bAOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0, 576);
      BAOutputStream bAOutputStream0 = new BAOutputStream(bufferedOutputStream0, byteArrayOutputStream0);
      String string0 = bAOutputStream0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("`mSK3j25v1", "`mSK3j25v1");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BAOutputStream bAOutputStream0 = new BAOutputStream(mockPrintStream0, (ByteArrayOutputStream) null);
      ByteArrayOutputStream byteArrayOutputStream0 = bAOutputStream0.getUnderlyingOutput();
      assertNull(byteArrayOutputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BAOutputStream bAOutputStream0 = new BAOutputStream(byteArrayOutputStream0, byteArrayOutputStream0);
      bAOutputStream0.write(1960);
      bAOutputStream0.getUnderlyingOutput();
      assertEquals("\uFFFD", bAOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BAOutputStream bAOutputStream0 = new BAOutputStream((OutputStream) null, byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        bAOutputStream0.write(2136);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.powerlibraries.io.helper.byteout.BAOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BAOutputStream bAOutputStream0 = new BAOutputStream(byteArrayOutputStream0, byteArrayOutputStream0);
      ByteArrayOutputStream byteArrayOutputStream1 = bAOutputStream0.getUnderlyingOutput();
      assertEquals("", byteArrayOutputStream1.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)0);
      BAOutputStream bAOutputStream0 = new BAOutputStream(pipedOutputStream0, byteArrayOutputStream0);
      try { 
        bAOutputStream0.write(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BAOutputStream bAOutputStream0 = new BAOutputStream((OutputStream) null, (ByteArrayOutputStream) null);
      // Undeclared exception!
      try { 
        bAOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.powerlibraries.io.helper.byteout.BAOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BAOutputStream bAOutputStream0 = new BAOutputStream((OutputStream) null, byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        bAOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.powerlibraries.io.helper.byteout.BAOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BAOutputStream bAOutputStream0 = new BAOutputStream((OutputStream) null, (ByteArrayOutputStream) null);
      // Undeclared exception!
      try { 
        bAOutputStream0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.powerlibraries.io.helper.byteout.BAOutputStream", e);
      }
  }
}
