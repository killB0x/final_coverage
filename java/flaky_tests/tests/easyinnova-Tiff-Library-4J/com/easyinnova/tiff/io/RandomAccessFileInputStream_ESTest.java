/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:14:02 GMT 2022
 */

package com.easyinnova.tiff.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.easyinnova.tiff.io.RandomAccessFileInputStream;
import java.io.File;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RandomAccessFileInputStream_ESTest extends RandomAccessFileInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("1=1k9,-vw*M/eRG");
      File file0 = MockFile.createTempFile("1=1k9,-vw*M/eRG", "1=1k9,-vw*M/eRG", (File) mockFile0);
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      randomAccessFileInputStream0.limit(1L);
      int int0 = randomAccessFileInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      long long0 = randomAccessFileInputStream0.size();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("1=1k9,-vw*M/eRG");
      File file0 = MockFile.createTempFile("1=1k9,-vw*M/eRG", "1=1k9,-vw*M/eRG", (File) mockFile0);
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      byte[] byteArray0 = new byte[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("1=1k9,-vw*M/eRG/1=1k9,-vw*M/eRG01=1k9,-vw*M/eRG");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      randomAccessFileInputStream0.size();
      assertEquals(2, randomAccessFileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = MockFile.createTempFile("`-5(Q~kA->s?o?5", "`-5(Q~kA->s?o?5");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      byte[] byteArray0 = new byte[0];
      int int0 = randomAccessFileInputStream0.read(byteArray0, (-1), (int) (byte) (-100));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "rV_");
      MockFile mockFile0 = new MockFile("r");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      byte[] byteArray0 = new byte[7];
      int int0 = randomAccessFileInputStream0.read(byteArray0, 0, (int) (byte)1);
      assertEquals(2, randomAccessFileInputStream0.available());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("`-5(Q~kA->s?o?5", "`-5(Q~kA->s?o?5");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      byte[] byteArray0 = new byte[0];
      int int0 = randomAccessFileInputStream0.read(byteArray0, 2146027726, 2146027726);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File file0 = MockFile.createTempFile("`-5(Q~kA->s?o?5", "`-5(Q~kA->s?o?5");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      byte[] byteArray0 = new byte[0];
      int int0 = randomAccessFileInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("w?o=RVog?/w?o=RVog?");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "W_");
      MockFile mockFile0 = new MockFile("w?o=RVog?", "w?o=RVog?");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      byte[] byteArray0 = new byte[3];
      int int0 = randomAccessFileInputStream0.read(byteArray0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "rV_");
      MockFile mockFile0 = new MockFile("r");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      randomAccessFileInputStream0.read();
      assertEquals(2, randomAccessFileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = MockFile.createTempFile("`-5(Q~kA->s?o?5", "`-5(Q~kA->s?o?5");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      int int0 = randomAccessFileInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      String string0 = randomAccessFileInputStream0.getPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/$!eWa~S0$!eWa~S");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = MockFile.createTempFile("$!eWa~S", "$!eWa~S");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      int int0 = randomAccessFileInputStream0.available();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("`-5(Q~kA->s?o?5", "`-5(Q~kA->s?o?5");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      try { 
        randomAccessFileInputStream0.seek((-31L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Negative position: -31
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("com.easinnova.tff.io.RandomAccessFileInpu_Stream");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MockFile mockFile0 = new MockFile("com.easinnova.tff.io.RandomAccessFileInpu_Stream");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      // Undeclared exception!
      try { 
        randomAccessFileInputStream0.read(byteArray0, (int) (byte) (-29), 2145689593);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -29 out of bounds for length 2
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = MockFile.createTempFile("$!eWa~S", "$!eWa~S");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      // Undeclared exception!
      try { 
        randomAccessFileInputStream0.read((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Hq%.q8UoJ0s", "DNN i}A");
      File file0 = MockFile.createTempFile("Hq%.q8UoJ0s", "DNN i}A", (File) mockFile0);
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      byte[] byteArray0 = new byte[1];
      randomAccessFileInputStream0.close();
      try { 
        randomAccessFileInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      try { 
        randomAccessFileInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RandomAccessFileInputStream randomAccessFileInputStream0 = null;
      try {
        randomAccessFileInputStream0 = new RandomAccessFileInputStream((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.RandomAccessFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File file0 = MockFile.createTempFile("2Z{?,P1:AzY'dw}@o)", "2Z{?,P1:AzY'dw}@o)");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      randomAccessFileInputStream0.limit(0L);
      int int0 = randomAccessFileInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("1=1k9,-vw*M/eRG");
      File file0 = MockFile.createTempFile("1=1k9,-vw*M/eRG", "1=1k9,-vw*M/eRG", (File) mockFile0);
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      byte[] byteArray0 = new byte[2];
      randomAccessFileInputStream0.read(byteArray0);
      int int0 = randomAccessFileInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      byte[] byteArray0 = new byte[1];
      try { 
        randomAccessFileInputStream0.read(byteArray0, (int) (byte)94, (int) (byte)94);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      File file0 = MockFile.createTempFile("$!eWa~S", "$!eWa~S");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      String string0 = randomAccessFileInputStream0.getPath();
      assertEquals("/tmp/$!eWa~S0$!eWa~S", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      File file0 = MockFile.createTempFile("$!eWa~S", "$!eWa~S");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      randomAccessFileInputStream0.close();
      try { 
        randomAccessFileInputStream0.available();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File file0 = MockFile.createTempFile("com.easyinnova.tiff.io.RandomAccessFileInputStream", "com.easyinnova.tiff.io.RandomAccessFileInputStream");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      randomAccessFileInputStream0.reset();
      assertEquals("/tmp/com.easyinnova.tiff.io.RandomAccessFileInputStream0com.easyinnova.tiff.io.RandomAccessFileInputStream", randomAccessFileInputStream0.getPath());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("$~e|aDS/$~e|aDS");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MockFile mockFile0 = new MockFile("$~e|aDS", "$~e|aDS");
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(mockFile0);
      randomAccessFileInputStream0.read();
      assertEquals(5, randomAccessFileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("1=1k9,-vw*M/eRG");
      File file0 = MockFile.createTempFile("1=1k9,-vw*M/eRG", "1=1k9,-vw*M/eRG", (File) mockFile0);
      RandomAccessFileInputStream randomAccessFileInputStream0 = new RandomAccessFileInputStream(file0);
      randomAccessFileInputStream0.seek(0L);
      assertEquals(0L, randomAccessFileInputStream0.size());
  }
}
