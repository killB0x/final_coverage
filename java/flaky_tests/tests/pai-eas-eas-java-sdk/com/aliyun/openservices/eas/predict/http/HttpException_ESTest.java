/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 08:28:20 GMT 2022
 */

package com.aliyun.openservices.eas.predict.http;

import org.junit.Test;
import static org.junit.Assert.*;
import com.aliyun.openservices.eas.predict.http.HttpException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HttpException_ESTest extends HttpException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpException httpException0 = new HttpException();
      String string0 = httpException0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpException httpException0 = new HttpException(0, "");
      String string0 = httpException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HttpException httpException0 = new HttpException((-685), "iS~dNWY");
      int int0 = httpException0.getCode();
      assertEquals((-685), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpException httpException0 = new HttpException(2683, "JAi/4#JZRPMyd");
      String string0 = httpException0.getMessage();
      assertEquals("JAi/4#JZRPMyd", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HttpException httpException0 = new HttpException(2683, "JAi/4#JZRPMyd");
      int int0 = httpException0.getCode();
      assertEquals(2683, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HttpException httpException0 = new HttpException();
      int int0 = httpException0.getCode();
      assertEquals(0, int0);
  }
}
