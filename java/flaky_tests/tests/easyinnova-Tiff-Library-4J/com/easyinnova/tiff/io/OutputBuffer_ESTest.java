/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:06:22 GMT 2022
 */

package com.easyinnova.tiff.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.easyinnova.tiff.io.OutputBuffer;
import com.easyinnova.tiff.model.ByteOrder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OutputBuffer_ESTest extends OutputBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.close();
      outputBuffer0.getStream();
      outputBuffer0.writeByteCurrentPosition((byte)38);
      outputBuffer0.writeByteCurrentPosition((byte) (-38));
      outputBuffer0.Create("'Kim>T/Lak1m@<-*^e");
      outputBuffer0.writeIntCurrentPosition((byte) (-38));
      outputBuffer0.getStream();
      outputBuffer0.getStream();
      outputBuffer0.seek((byte)38);
      outputBuffer0.writeIntCurrentPosition((byte)38);
      int int0 = 2145281100;
      outputBuffer0.seek(2145281100);
      outputBuffer0.writeByteCurrentPosition((byte)60);
      outputBuffer0.writeByteCurrentPosition((byte)38);
      outputBuffer0.writeIntCurrentPosition((-3016));
      // Undeclared exception!
      outputBuffer0.seek((byte)38);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("B");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "B/e");
      try { 
        outputBuffer0.Create("B/e");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // Failed to create file
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.Create("#QYd^S3Ea;");
      outputBuffer0.seek(999);
      outputBuffer0.writeIntCurrentPosition(999);
      outputBuffer0.writeIntCurrentPosition((-2073432486));
      assertEquals(1001L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      assertEquals(0L, outputBuffer0.position());
      
      outputBuffer0.seek(999);
      outputBuffer0.Create("Ebpv4\"_jSg}6YV");
      outputBuffer0.writeByteCurrentPosition((byte)3);
      outputBuffer0.getStream();
      assertEquals(1000L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.Create("");
      outputBuffer0.seek(999);
      try { 
        outputBuffer0.writeByteCurrentPosition((byte) (-67));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.Create("Nf62_i_1dK6{}r>>oEg");
      outputBuffer0.seek(983);
      outputBuffer0.getStream();
      outputBuffer0.getStream();
      outputBuffer0.seek(1);
      outputBuffer0.getStream();
      outputBuffer0.writeByteCurrentPosition((byte) (-45));
      outputBuffer0.writeIntCurrentPosition((byte) (-45));
      outputBuffer0.seek(1994);
      outputBuffer0.getStream();
      outputBuffer0.writeByteCurrentPosition((byte)96);
      outputBuffer0.writeIntCurrentPosition(1);
      outputBuffer0.writeByteCurrentPosition((byte)96);
      outputBuffer0.writeByteCurrentPosition((byte) (-59));
      outputBuffer0.writeIntCurrentPosition(0);
      outputBuffer0.writeByteCurrentPosition((byte) (-45));
      outputBuffer0.writeIntCurrentPosition(1597);
      assertEquals(2001L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.Create("");
      outputBuffer0.seek(999);
      try { 
        outputBuffer0.writeIntCurrentPosition(999);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.seek(999);
      // Undeclared exception!
      try { 
        outputBuffer0.writeByteCurrentPosition((byte)29);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = 995;
      outputBuffer0.writeByteCurrentPosition((byte)11);
      outputBuffer0.writeIntCurrentPosition(1);
      outputBuffer0.writeIntCurrentPosition(1);
      outputBuffer0.writeByteCurrentPosition((byte)11);
      // Undeclared exception!
      try { 
        outputBuffer0.writeByteCurrentPosition((byte) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.Create("tIpe9^':O6$n`m5c");
      outputBuffer0.position = 972;
      outputBuffer0.writeByteCurrentPosition((byte) (-39));
      outputBuffer0.writeIntCurrentPosition(1076);
      outputBuffer0.writeByteCurrentPosition((byte)0);
      outputBuffer0.getStream();
      outputBuffer0.writeIntCurrentPosition(1076);
      outputBuffer0.position = 1076;
      outputBuffer0.writeByteCurrentPosition((byte)0);
      outputBuffer0.getStream();
      outputBuffer0.getStream();
      outputBuffer0.writeByteCurrentPosition((byte)0);
      outputBuffer0.getStream();
      outputBuffer0.writeIntCurrentPosition(1631);
      outputBuffer0.getStream();
      assertEquals(1079L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = (-1);
      outputBuffer0.close();
      outputBuffer0.getStream();
      outputBuffer0.position();
      // Undeclared exception!
      try { 
        outputBuffer0.seek(6181);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = 1076;
      // Undeclared exception!
      try { 
        outputBuffer0.writeByteCurrentPosition((byte) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      int int0 = 1000;
      outputBuffer0.position = 1000;
      outputBuffer0.close();
      // Undeclared exception!
      try { 
        outputBuffer0.writeIntCurrentPosition((-2140301427));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.close();
      assertEquals(0L, outputBuffer0.position());
      
      outputBuffer0.writeIntCurrentPosition(1000);
      outputBuffer0.close();
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer1 = new OutputBuffer(byteOrder1);
      RandomAccessFile randomAccessFile0 = outputBuffer1.aFile;
      outputBuffer1.getStream();
      outputBuffer0.getStream();
      outputBuffer0.close();
      String string0 = "%KVqXlczIqlOswhu";
      outputBuffer1.writeIntCurrentPosition(1000);
      outputBuffer0.Create("%KVqXlczIqlOswhu");
      // Undeclared exception!
      try { 
        outputBuffer1.seek(1000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.writeIntCurrentPosition(0);
      outputBuffer0.position = 0;
      outputBuffer0.writeIntCurrentPosition((-4717));
      outputBuffer0.writeIntCurrentPosition(0);
      outputBuffer0.getStream();
      outputBuffer0.getStream();
      outputBuffer0.close();
      outputBuffer0.getStream();
      outputBuffer0.writeByteCurrentPosition((byte)0);
      outputBuffer0.Create("~{ciOD\";");
      outputBuffer0.writeIntCurrentPosition((byte)0);
      outputBuffer0.seek(0);
      outputBuffer0.getStream();
      outputBuffer0.seek(0);
      outputBuffer0.Create("~{ciOD\";");
      outputBuffer0.close();
      outputBuffer0.position();
      outputBuffer0.writeIntCurrentPosition(0);
      outputBuffer0.writeByteCurrentPosition((byte)0);
      assertEquals(2L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = (-51);
      // Undeclared exception!
      try { 
        outputBuffer0.writeByteCurrentPosition((byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -51 out of bounds for length 1000
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.close();
      outputBuffer0.Create("lX!@");
      int int0 = 3298;
      outputBuffer0.position = 3298;
      outputBuffer0.writeIntCurrentPosition(3298);
      // Undeclared exception!
      try { 
        outputBuffer0.Create((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.writeByteCurrentPosition((byte)0);
      outputBuffer0.seek((byte)0);
      outputBuffer0.writeByteCurrentPosition((byte)0);
      assertEquals(1L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.seek(0);
      outputBuffer0.byteOrder = byteOrder0;
      outputBuffer0.Create("{");
      outputBuffer0.seek(0);
      outputBuffer0.writeIntCurrentPosition(0);
      outputBuffer0.seek(0);
      outputBuffer0.close();
      outputBuffer0.writeByteCurrentPosition((byte)0);
      outputBuffer0.getStream();
      outputBuffer0.getStream();
      outputBuffer0.close();
      assertEquals(1L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.writeIntCurrentPosition(0);
      int int0 = 0;
      outputBuffer0.position = 0;
      outputBuffer0.writeIntCurrentPosition((-4717));
      outputBuffer0.getStream();
      outputBuffer0.writeIntCurrentPosition(0);
      outputBuffer0.getStream();
      outputBuffer0.getStream();
      outputBuffer0.close();
      outputBuffer0.getStream();
      byte byte0 = (byte)0;
      outputBuffer0.writeByteCurrentPosition((byte)0);
      String string0 = "~{ciOD\";";
      outputBuffer0.Create("~{ciOD\";");
      outputBuffer0.writeIntCurrentPosition((byte)0);
      outputBuffer0.seek(0);
      outputBuffer0.getStream();
      try { 
        outputBuffer0.seek((-507));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Negative position: -507
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.seek(986);
      outputBuffer0.writeIntCurrentPosition(986);
      outputBuffer0.seek(986);
      outputBuffer0.writeIntCurrentPosition(966);
      assertEquals(987L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.seek(0);
      outputBuffer0.seek(0);
      outputBuffer0.byteOrder = byteOrder0;
      outputBuffer0.close();
      outputBuffer0.close();
      outputBuffer0.Create("Gh~I96T");
      outputBuffer0.writeByteCurrentPosition((byte) (-1));
      outputBuffer0.close();
      outputBuffer0.getStream();
      outputBuffer0.position();
      outputBuffer0.writeByteCurrentPosition((byte) (-1));
      outputBuffer0.writeIntCurrentPosition((-2891));
      outputBuffer0.position();
      try { 
        outputBuffer0.seek((byte) (-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.close();
      outputBuffer0.Create("com.easyinnova.tiff.io.OutputBuffer");
      outputBuffer0.getStream();
      outputBuffer0.byteOrder = byteOrder0;
      int int0 = (-1);
      outputBuffer0.writeIntCurrentPosition((-1));
      try { 
        outputBuffer0.seek((-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Negative position: -1
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.Create("com.easyinnova.tiff.io.OutputBuffer");
      try { 
        outputBuffer0.seek((-2090970919));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Negative position: -2090970919
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.byteOrder = byteOrder0;
      outputBuffer0.byteOrder = byteOrder0;
      outputBuffer0.writeByteCurrentPosition((byte)27);
      outputBuffer0.byteOrder = byteOrder0;
      outputBuffer0.position();
      outputBuffer0.getStream();
      outputBuffer0.writeIntCurrentPosition(0);
      outputBuffer0.close();
      outputBuffer0.close();
      outputBuffer0.getStream();
      assertEquals(2L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      // Undeclared exception!
      try { 
        outputBuffer0.seek(1150);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = (-1472);
      // Undeclared exception!
      try { 
        outputBuffer0.writeIntCurrentPosition(1639);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1472 out of bounds for length 1000
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.seek(0);
      outputBuffer0.close();
      outputBuffer0.byteOrder = byteOrder0;
      outputBuffer0.writeByteCurrentPosition((byte)1);
      outputBuffer0.writeIntCurrentPosition(1);
      outputBuffer0.writeByteCurrentPosition((byte)1);
      outputBuffer0.position = 1338;
      outputBuffer0.close();
      outputBuffer0.seek(0);
      outputBuffer0.getStream();
      assertEquals(0L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      // Undeclared exception!
      try { 
        outputBuffer0.Create((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      RandomAccessFile randomAccessFile0 = outputBuffer0.getStream();
      assertNull(randomAccessFile0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.writeIntCurrentPosition(2066);
      outputBuffer0.close();
      assertEquals(1L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.seek(952);
      assertEquals(952L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.byteOrder = byteOrder0;
      outputBuffer0.writeIntCurrentPosition(22);
      outputBuffer0.close();
      outputBuffer0.seek(1);
      byte byte0 = (byte) (-119);
      outputBuffer0.writeByteCurrentPosition((byte) (-119));
      outputBuffer0.getStream();
      outputBuffer0.getStream();
      outputBuffer0.close();
      // Undeclared exception!
      try { 
        outputBuffer0.Create((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.seek(999);
      // Undeclared exception!
      try { 
        outputBuffer0.writeIntCurrentPosition(999);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = 2222;
      // Undeclared exception!
      try { 
        outputBuffer0.writeIntCurrentPosition(2222);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = 1000;
      outputBuffer0.close();
      // Undeclared exception!
      try { 
        outputBuffer0.writeIntCurrentPosition(1000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = 995;
      byte byte0 = (byte)11;
      outputBuffer0.writeByteCurrentPosition((byte)11);
      outputBuffer0.writeIntCurrentPosition(1);
      outputBuffer0.writeIntCurrentPosition(1);
      outputBuffer0.writeByteCurrentPosition((byte)11);
      // Undeclared exception!
      try { 
        outputBuffer0.writeIntCurrentPosition((-2013));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.writeIntCurrentPosition(965);
      assertEquals(1L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position();
      outputBuffer0.position();
      int int0 = 1179;
      outputBuffer0.writeIntCurrentPosition(1179);
      outputBuffer0.writeIntCurrentPosition(1179);
      String string0 = "";
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile("", "mm`f1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"mm`f1\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      long long0 = outputBuffer0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      RandomAccessFile randomAccessFile0 = outputBuffer0.aFile;
      outputBuffer0.aFile = null;
      outputBuffer0.Create("#.W=B#U@(:z");
      long long0 = outputBuffer0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.Create("i3$");
      outputBuffer0.close();
      assertEquals(0L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      // Undeclared exception!
      try { 
        outputBuffer0.seek(2430);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.position = 1000;
      OutputBuffer outputBuffer1 = new OutputBuffer(byteOrder0);
      // Undeclared exception!
      try { 
        outputBuffer0.writeByteCurrentPosition((byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      // Undeclared exception!
      try { 
        outputBuffer0.seek((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.writeByteCurrentPosition((byte) (-1));
      assertEquals(1L, outputBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.writeByteCurrentPosition((byte) (-51));
      // Undeclared exception!
      try { 
        outputBuffer0.seek((byte) (-51));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      OutputBuffer outputBuffer0 = new OutputBuffer(byteOrder0);
      outputBuffer0.close();
      outputBuffer0.writeByteCurrentPosition((byte) (-123));
      outputBuffer0.close();
      outputBuffer0.close();
      byte byte0 = (byte) (-109);
      outputBuffer0.writeByteCurrentPosition((byte) (-109));
      outputBuffer0.close();
      // Undeclared exception!
      try { 
        outputBuffer0.seek((byte) (-109));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.easyinnova.tiff.io.OutputBuffer", e);
      }
  }
}
