/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 01:51:34 GMT 2022
 */

package com.k317h.restez.errors;

import org.junit.Test;
import static org.junit.Assert.*;
import com.k317h.restez.errors.RestezApiException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RestezApiException_ESTest extends RestezApiException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RestezApiException restezApiException0 = new RestezApiException("", (-1170), (Throwable) null);
      int int0 = restezApiException0.getCode();
      assertEquals((-1170), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      RestezApiException restezApiException0 = new RestezApiException("", 0, mockThrowable0);
      int int0 = restezApiException0.getCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RestezApiException restezApiException0 = new RestezApiException("\"Fe2", 698);
      int int0 = restezApiException0.getCode();
      assertEquals(698, int0);
  }
}
