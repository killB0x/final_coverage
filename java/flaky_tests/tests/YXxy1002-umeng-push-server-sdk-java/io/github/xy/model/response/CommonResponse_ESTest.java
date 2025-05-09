/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 16:21:20 GMT 2022
 */

package io.github.xy.model.response;

import org.junit.Test;
import static org.junit.Assert.*;
import io.github.xy.model.response.CommonResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CommonResponse_ESTest extends CommonResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CommonResponse commonResponse0 = new CommonResponse();
      commonResponse0.setErrorMsg("Ng");
      String string0 = commonResponse0.getErrorMsg();
      assertEquals("Ng", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CommonResponse commonResponse0 = new CommonResponse();
      commonResponse0.setErrorCode("\"x@N@");
      String string0 = commonResponse0.getErrorCode();
      assertEquals("\"x@N@", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CommonResponse commonResponse0 = new CommonResponse();
      commonResponse0.setErrorCode("");
      String string0 = commonResponse0.getErrorCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CommonResponse commonResponse0 = new CommonResponse();
      String string0 = commonResponse0.getErrorCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CommonResponse commonResponse0 = new CommonResponse();
      String string0 = commonResponse0.getErrorMsg();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CommonResponse commonResponse0 = new CommonResponse();
      commonResponse0.setErrorMsg("");
      String string0 = commonResponse0.getErrorMsg();
      assertEquals("", string0);
  }
}
