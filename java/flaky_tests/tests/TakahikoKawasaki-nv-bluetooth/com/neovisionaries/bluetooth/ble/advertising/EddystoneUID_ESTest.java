/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:38:13 GMT 2022
 */

package com.neovisionaries.bluetooth.ble.advertising;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.neovisionaries.bluetooth.ble.advertising.EddystoneUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EddystoneUID_ESTest extends EddystoneUID_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)33;
      EddystoneUID eddystoneUID0 = new EddystoneUID(1570, 1570, byteArray0);
      int int0 = eddystoneUID0.getTxPower();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-89);
      EddystoneUID eddystoneUID0 = new EddystoneUID((-2), (-2), byteArray0);
      int int0 = eddystoneUID0.getTxPower();
      assertEquals((-89), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EddystoneUID eddystoneUID0 = new EddystoneUID((-215), (-215), byteArray0);
      String string0 = eddystoneUID0.getNamespaceIdAsString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EddystoneUID eddystoneUID0 = new EddystoneUID((-215), (-215), byteArray0);
      byte[] byteArray1 = eddystoneUID0.getNamespaceId();
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EddystoneUID eddystoneUID0 = new EddystoneUID((-215), (-215), byteArray0);
      String string0 = eddystoneUID0.getInstanceIdAsString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EddystoneUID eddystoneUID0 = new EddystoneUID((-215), (-215), byteArray0);
      String string0 = eddystoneUID0.getBeaconIdAsString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EddystoneUID eddystoneUID0 = null;
      try {
        eddystoneUID0 = new EddystoneUID(9, 9, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.neovisionaries.bluetooth.ble.advertising.EddystoneUID", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EddystoneUID eddystoneUID0 = new EddystoneUID((-215), (-215), byteArray0);
      byte[] byteArray1 = eddystoneUID0.getBeaconId();
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EddystoneUID eddystoneUID0 = new EddystoneUID((-215), (-215), byteArray0);
      byte[] byteArray1 = eddystoneUID0.getInstanceId();
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EddystoneUID eddystoneUID0 = new EddystoneUID();
      eddystoneUID0.toString();
      String string0 = eddystoneUID0.toString();
      assertNotNull(string0);
      assertEquals("EddyStoneUID(TxPower=0,NamespaceId=00000000000000000000,InstanceId=000000000000)", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EddystoneUID eddystoneUID0 = new EddystoneUID();
      eddystoneUID0.getBeaconIdAsString();
      String string0 = eddystoneUID0.getBeaconIdAsString();
      assertNotNull(string0);
      assertEquals(0, eddystoneUID0.getTxPower());
      assertEquals("00000000000000000000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EddystoneUID eddystoneUID0 = new EddystoneUID();
      String string0 = eddystoneUID0.getBeaconIdAsString();
      assertNotNull(string0);
      assertEquals("00000000000000000000000000000000", string0);
      
      eddystoneUID0.getBeaconId();
      assertEquals(0, eddystoneUID0.getTxPower());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EddystoneUID eddystoneUID0 = new EddystoneUID();
      eddystoneUID0.getInstanceIdAsString();
      String string0 = eddystoneUID0.getInstanceIdAsString();
      assertNotNull(string0);
      assertEquals("000000000000", string0);
      assertEquals(0, eddystoneUID0.getTxPower());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EddystoneUID eddystoneUID0 = new EddystoneUID();
      String string0 = eddystoneUID0.getInstanceIdAsString();
      assertNotNull(string0);
      assertEquals("000000000000", string0);
      
      eddystoneUID0.getInstanceId();
      assertEquals(0, eddystoneUID0.getTxPower());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EddystoneUID eddystoneUID0 = new EddystoneUID();
      eddystoneUID0.getNamespaceIdAsString();
      String string0 = eddystoneUID0.getNamespaceIdAsString();
      assertNotNull(string0);
      assertEquals(0, eddystoneUID0.getTxPower());
      assertEquals("00000000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EddystoneUID eddystoneUID0 = new EddystoneUID();
      eddystoneUID0.getNamespaceId();
      byte[] byteArray0 = eddystoneUID0.getNamespaceId();
      assertEquals(10, byteArray0.length);
      assertEquals(0, eddystoneUID0.getTxPower());
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      EddystoneUID eddystoneUID0 = new EddystoneUID(247, 247, byteArray0);
      assertEquals(0, eddystoneUID0.getTxPower());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EddystoneUID eddystoneUID0 = new EddystoneUID();
      int int0 = eddystoneUID0.getTxPower();
      assertEquals(0, int0);
  }
}
