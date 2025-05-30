/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:54:29 GMT 2022
 */

package com.neovisionaries.bluetooth.ble.advertising;

import org.junit.Test;
import static org.junit.Assert.*;
import com.neovisionaries.bluetooth.ble.advertising.Eddystone;
import com.neovisionaries.bluetooth.ble.advertising.EddystoneEID;
import com.neovisionaries.bluetooth.ble.advertising.EddystoneTLM;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Eddystone_ESTest extends Eddystone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EddystoneEID eddystoneEID0 = new EddystoneEID();
      String string0 = eddystoneEID0.toString();
      assertEquals("EddyStoneEID(TxPower=0,EID=0000000000000000)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EddystoneTLM eddystoneTLM0 = new EddystoneTLM();
      Eddystone.FrameType eddystone_FrameType0 = eddystoneTLM0.getFrameType();
      assertEquals(Eddystone.FrameType.TLM, eddystone_FrameType0);
  }
}
