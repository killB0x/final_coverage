/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:44:43 GMT 2022
 */

package com.neovisionaries.bluetooth.ble.advertising;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.neovisionaries.bluetooth.ble.advertising.EddystoneEID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EddystoneEID_ESTest extends EddystoneEID_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)91;
      EddystoneEID eddystoneEID0 = new EddystoneEID(740, 740, byteArray0);
      int int0 = eddystoneEID0.getTxPower();
      assertEquals(91, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-9);
      EddystoneEID eddystoneEID0 = new EddystoneEID(3556, (-2656), byteArray0);
      int int0 = eddystoneEID0.getTxPower();
      assertEquals((-9), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EddystoneEID eddystoneEID0 = new EddystoneEID(1, 1, byteArray0);
      String string0 = eddystoneEID0.getEIDAsString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EddystoneEID eddystoneEID0 = new EddystoneEID(1, 1, byteArray0);
      byte[] byteArray1 = eddystoneEID0.getEID();
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EddystoneEID eddystoneEID0 = null;
      try {
        eddystoneEID0 = new EddystoneEID(5121, 5121, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.neovisionaries.bluetooth.ble.advertising.EddystoneEID", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EddystoneEID eddystoneEID0 = new EddystoneEID();
      String string0 = eddystoneEID0.toString();
      assertEquals("EddyStoneEID(TxPower=0,EID=0000000000000000)", string0);
      assertNotNull(string0);
      
      eddystoneEID0.getEID();
      assertEquals(0, eddystoneEID0.getTxPower());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EddystoneEID eddystoneEID0 = new EddystoneEID();
      eddystoneEID0.toString();
      String string0 = eddystoneEID0.toString();
      assertNotNull(string0);
      assertEquals("EddyStoneEID(TxPower=0,EID=0000000000000000)", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EddystoneEID eddystoneEID0 = new EddystoneEID();
      eddystoneEID0.getEIDAsString();
      String string0 = eddystoneEID0.getEIDAsString();
      assertEquals(0, eddystoneEID0.getTxPower());
      assertNotNull(string0);
      assertEquals("0000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      EddystoneEID eddystoneEID0 = new EddystoneEID(240, 240, byteArray0);
      assertEquals(0, eddystoneEID0.getTxPower());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      EddystoneEID eddystoneEID0 = new EddystoneEID();
      int int0 = eddystoneEID0.getTxPower();
      assertEquals(0, int0);
  }
}
