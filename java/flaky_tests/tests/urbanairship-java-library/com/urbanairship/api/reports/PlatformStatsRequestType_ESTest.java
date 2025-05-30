/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 19:34:24 GMT 2022
 */

package com.urbanairship.api.reports;

import org.junit.Test;
import static org.junit.Assert.*;
import com.urbanairship.api.reports.PlatformStatsRequestType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PlatformStatsRequestType_ESTest extends PlatformStatsRequestType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlatformStatsRequestType[] platformStatsRequestTypeArray0 = PlatformStatsRequestType.values();
      assertEquals(5, platformStatsRequestTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlatformStatsRequestType platformStatsRequestType0 = PlatformStatsRequestType.valueOf("OPT_INS");
      assertEquals(PlatformStatsRequestType.OPT_INS, platformStatsRequestType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlatformStatsRequestType platformStatsRequestType0 = PlatformStatsRequestType.APP_OPENS;
      String string0 = platformStatsRequestType0.getPath();
      assertEquals("/api/reports/opens/", string0);
  }
}
