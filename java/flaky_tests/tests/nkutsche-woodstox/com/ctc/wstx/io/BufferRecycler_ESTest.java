/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:34:19 GMT 2022
 */

package com.ctc.wstx.io;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ctc.wstx.io.BufferRecycler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BufferRecycler_ESTest extends BufferRecycler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      byte[] byteArray0 = new byte[3];
      bufferRecycler0.returnFullBBuffer(byteArray0);
      byte[] byteArray1 = bufferRecycler0.getFullBBuffer(3);
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[1];
      bufferRecycler0.returnFullCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getFullCBuffer(1);
      assertEquals(1, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[8];
      bufferRecycler0.returnSmallCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getSmallCBuffer((-1));
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[0];
      bufferRecycler0.returnMediumCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getMediumCBuffer(0);
      assertArrayEquals(new char[] {}, charArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[0];
      bufferRecycler0.returnFullCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getFullCBuffer((-1062));
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      byte[] byteArray0 = new byte[0];
      bufferRecycler0.returnFullBBuffer(byteArray0);
      byte[] byteArray1 = bufferRecycler0.getFullBBuffer((-606));
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      byte[] byteArray0 = new byte[0];
      bufferRecycler0.returnFullBBuffer(byteArray0);
      byte[] byteArray1 = bufferRecycler0.getFullBBuffer(1125);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      byte[] byteArray0 = bufferRecycler0.getFullBBuffer((-924));
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[4];
      bufferRecycler0.returnFullCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getFullCBuffer(514);
      assertNull(charArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = bufferRecycler0.getFullCBuffer((-924));
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[4];
      bufferRecycler0.returnMediumCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getMediumCBuffer(1948);
      assertNull(charArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[6];
      bufferRecycler0.returnMediumCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getMediumCBuffer((-2370));
      assertSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = bufferRecycler0.getMediumCBuffer((-4421));
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[8];
      bufferRecycler0.returnSmallCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getSmallCBuffer((byte)22);
      assertNull(charArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = bufferRecycler0.getSmallCBuffer(1);
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      char[] charArray0 = new char[0];
      bufferRecycler0.returnSmallCBuffer(charArray0);
      char[] charArray1 = bufferRecycler0.getSmallCBuffer((byte)0);
      assertArrayEquals(new char[] {}, charArray1);
  }
}
