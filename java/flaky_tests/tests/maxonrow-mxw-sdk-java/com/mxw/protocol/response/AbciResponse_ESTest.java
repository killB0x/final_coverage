/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 10:05:20 GMT 2022
 */

package com.mxw.protocol.response;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mxw.protocol.response.AbciResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbciResponse_ESTest extends AbciResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbciResponse<Object> abciResponse0 = new AbciResponse<Object>();
      Object object0 = new Object();
      abciResponse0.setValue(object0);
      Object object1 = abciResponse0.getValue();
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AbciResponse<Object> abciResponse0 = new AbciResponse<Object>();
      abciResponse0.setHeight("b-");
      String string0 = abciResponse0.getHeight();
      assertEquals("b-", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbciResponse<Object> abciResponse0 = new AbciResponse<Object>();
      abciResponse0.setHeight("");
      String string0 = abciResponse0.getHeight();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AbciResponse<Object> abciResponse0 = new AbciResponse<Object>();
      String string0 = abciResponse0.getHeight();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AbciResponse<Object> abciResponse0 = new AbciResponse<Object>();
      Object object0 = abciResponse0.getValue();
      abciResponse0.setValue(object0);
      assertNull(abciResponse0.getHeight());
  }
}
