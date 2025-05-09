/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:51:07 GMT 2022
 */

package com.searchunify.sdk.dtos;

import org.junit.Test;
import static org.junit.Assert.*;
import com.searchunify.sdk.dtos.GenerateTokenRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GenerateTokenRequest_ESTest extends GenerateTokenRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GenerateTokenRequest.GenerateTokenRequestBuilder generateTokenRequest_GenerateTokenRequestBuilder0 = new GenerateTokenRequest.GenerateTokenRequestBuilder();
      assertEquals("GenerateTokenRequest.GenerateTokenRequestBuilder()", generateTokenRequest_GenerateTokenRequestBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GenerateTokenRequest generateTokenRequest0 = new GenerateTokenRequest();
      assertNull(generateTokenRequest0.getContext());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GenerateTokenRequest.GenerateTokenRequestBuilder generateTokenRequest_GenerateTokenRequestBuilder0 = GenerateTokenRequest.builder();
      String string0 = generateTokenRequest_GenerateTokenRequestBuilder0.toString();
      assertEquals("GenerateTokenRequest.GenerateTokenRequestBuilder()", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GenerateTokenRequest.GenerateTokenRequestBuilder generateTokenRequest_GenerateTokenRequestBuilder0 = GenerateTokenRequest.builder();
      GenerateTokenRequest generateTokenRequest0 = generateTokenRequest_GenerateTokenRequestBuilder0.build();
      assertNull(generateTokenRequest0.getContext());
  }
}
