/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 02:22:00 GMT 2022
 */

package com.github.lyhnx.bittrexapiwrapper.api;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.lyhnx.bittrexapiwrapper.api.ApiKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApiKey_ESTest extends ApiKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApiKey apiKey0 = new ApiKey("", "");
      String string0 = apiKey0.getSecret();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ApiKey apiKey0 = new ApiKey(",4~", ",4~");
      String string0 = apiKey0.getKey();
      assertEquals(",4~", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ApiKey apiKey0 = null;
      try {
        apiKey0 = new ApiKey("mnQ: EAmw)EALpoH(<", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // api key and secret cannot be null!
         //
         verifyException("com.github.lyhnx.bittrexapiwrapper.api.ApiKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ApiKey apiKey0 = null;
      try {
        apiKey0 = new ApiKey((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // api key and secret cannot be null!
         //
         verifyException("com.github.lyhnx.bittrexapiwrapper.api.ApiKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ApiKey apiKey0 = new ApiKey("com.github.lyhnx.bittrexapiwrapper.api.ApiKey", "com.github.lyhnx.bittrexapiwrapper.api.ApiKey");
      String string0 = apiKey0.getSecret();
      assertEquals("com.github.lyhnx.bittrexapiwrapper.api.ApiKey", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ApiKey apiKey0 = new ApiKey("", "");
      String string0 = apiKey0.getKey();
      assertEquals("", string0);
  }
}
