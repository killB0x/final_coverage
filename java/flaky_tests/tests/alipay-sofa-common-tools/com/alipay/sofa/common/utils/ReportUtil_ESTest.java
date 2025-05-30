/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 20:14:50 GMT 2022
 */

package com.alipay.sofa.common.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import com.alipay.sofa.common.utils.ReportUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReportUtil_ESTest extends ReportUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReportUtil.reportDebug("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReportUtil.reportWarn("Sofa-Middleware-Log:DEBUG  ");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      ReportUtil.reportError("@-D]c.", (Throwable) mockThrowable0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      ReportUtil.reportWarn("N!o 4juFm&JXu{LF", (Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReportUtil.reportInfo("0Pt");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReportUtil reportUtil0 = new ReportUtil();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ReportUtil.reportError((String) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ReportUtil.report("],");
  }
}
