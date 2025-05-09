/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:41:58 GMT 2022
 */

package com.neovisionaries.bluetooth.ble.advertising;

import org.junit.Test;
import static org.junit.Assert.*;
import com.neovisionaries.bluetooth.ble.advertising.LocalName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalName_ESTest extends LocalName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LocalName localName0 = new LocalName((-327), (-589), byteArray0);
      localName0.setType(1338);
      boolean boolean0 = localName0.isComplete();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalName localName0 = new LocalName();
      localName0.setType((-4557));
      String string0 = localName0.toString();
      assertFalse(localName0.isShortened());
      assertEquals("LocalName(COMPLETE,null)", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      LocalName localName0 = new LocalName((-3855), (-3855), byteArray0);
      String string0 = localName0.getLocalName();
      assertEquals("\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalName localName0 = new LocalName();
      assertFalse(localName0.isShortened());
      
      localName0.setType(8);
      boolean boolean0 = localName0.isShortened();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LocalName localName0 = new LocalName();
      String string0 = localName0.toString();
      assertEquals("LocalName(COMPLETE,null)", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LocalName localName0 = new LocalName();
      boolean boolean0 = localName0.isComplete();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LocalName localName0 = new LocalName(2438, 8, byteArray0);
      boolean boolean0 = localName0.isComplete();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LocalName localName0 = new LocalName();
      boolean boolean0 = localName0.isShortened();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LocalName localName0 = new LocalName(2438, 8, byteArray0);
      String string0 = localName0.toString();
      assertEquals("LocalName(SHORTENED,\u0000)", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LocalName localName0 = new LocalName();
      String string0 = localName0.getLocalName();
      assertNull(string0);
  }
}
