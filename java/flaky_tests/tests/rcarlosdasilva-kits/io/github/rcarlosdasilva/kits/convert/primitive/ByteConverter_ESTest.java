/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 08:55:56 GMT 2022
 */

package io.github.rcarlosdasilva.kits.convert.primitive;

import org.junit.Test;
import static org.junit.Assert.*;
import io.github.rcarlosdasilva.kits.convert.primitive.ByteConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ByteConverter_ESTest extends ByteConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteConverter byteConverter0 = new ByteConverter();
      Byte byte0 = byteConverter0.convert((Object) byteConverter0);
      Byte byte1 = byteConverter0.convert((Object) byte0, byte0);
      assertEquals((byte)0, (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteConverter byteConverter0 = new ByteConverter();
      Object object0 = new Object();
      Byte byte0 = byteConverter0.convert(object0);
      Byte byte1 = new Byte((byte)72);
      Byte byte2 = byteConverter0.convert((Object) byte1, byte0);
      assertFalse(byte2.equals((Object)byte0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteConverter byteConverter0 = new ByteConverter();
      Byte byte0 = new Byte((byte)13);
      Byte byte1 = byteConverter0.convert((Object) byte0);
      assertEquals((byte)13, (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteConverter byteConverter0 = new ByteConverter();
      Byte byte0 = new Byte((byte) (-107));
      Byte byte1 = byteConverter0.convert((Object) byte0, byte0);
      assertEquals((byte) (-107), (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteConverter byteConverter0 = new ByteConverter();
      Byte byte0 = new Byte((byte) (-107));
      Byte byte1 = byteConverter0.convert((Object) null, byte0);
      assertEquals((byte) (-107), (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ByteConverter byteConverter0 = new ByteConverter();
      Byte byte0 = new Byte((byte) (-101));
      Byte byte1 = byteConverter0.convert((Object) byte0);
      assertEquals((byte) (-101), (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteConverter byteConverter0 = new ByteConverter();
      Object object0 = new Object();
      Byte byte0 = byteConverter0.convert(object0, (Byte) null);
      Byte byte1 = byteConverter0.convert((Object) byte0);
      assertEquals((byte)0, (byte)byte1);
  }
}
