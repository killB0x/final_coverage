/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:49:46 GMT 2022
 */

package com.neovisionaries.bluetooth.ble.advertising;

import org.junit.Test;
import static org.junit.Assert.*;
import com.neovisionaries.bluetooth.ble.advertising.ADStructure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ADStructure_ESTest extends ADStructure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ADStructure aDStructure0 = new ADStructure(0, 0, byteArray0);
      aDStructure0.setType((byte)49);
      int int0 = aDStructure0.getType();
      assertEquals(49, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ADStructure aDStructure0 = new ADStructure(2736, (-1374), (byte[]) null);
      int int0 = aDStructure0.getType();
      assertEquals((-1374), int0);
      assertEquals(2736, aDStructure0.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ADStructure aDStructure0 = new ADStructure(2736, (-1374), (byte[]) null);
      aDStructure0.setLength(0);
      int int0 = aDStructure0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ADStructure aDStructure0 = new ADStructure();
      aDStructure0.setLength((byte) (-43));
      int int0 = aDStructure0.getLength();
      assertEquals((-43), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ADStructure aDStructure0 = new ADStructure();
      byte[] byteArray0 = new byte[5];
      aDStructure0.setData(byteArray0);
      byte[] byteArray1 = aDStructure0.getData();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ADStructure aDStructure0 = new ADStructure(0, 0, byteArray0);
      aDStructure0.getData();
      assertEquals(0, aDStructure0.getLength());
      assertEquals(0, aDStructure0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ADStructure aDStructure0 = new ADStructure(2736, (-1374), (byte[]) null);
      String string0 = aDStructure0.toString();
      assertEquals("ADStructure(Length=2736,Type=0xFFFFFAA2)", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ADStructure aDStructure0 = new ADStructure(2736, (-1374), (byte[]) null);
      aDStructure0.getData();
      assertEquals(2736, aDStructure0.getLength());
      assertEquals((-1374), aDStructure0.getType());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ADStructure aDStructure0 = new ADStructure(2736, (-1374), (byte[]) null);
      int int0 = aDStructure0.getLength();
      assertEquals((-1374), aDStructure0.getType());
      assertEquals(2736, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ADStructure aDStructure0 = new ADStructure(0, 0, byteArray0);
      int int0 = aDStructure0.getType();
      assertEquals(0, int0);
      assertEquals(0, aDStructure0.getLength());
  }
}
