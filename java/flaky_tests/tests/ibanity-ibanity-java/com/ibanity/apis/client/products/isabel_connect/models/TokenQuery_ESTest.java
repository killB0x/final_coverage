/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 11:10:21 GMT 2022
 */

package com.ibanity.apis.client.products.isabel_connect.models;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibanity.apis.client.products.isabel_connect.models.create.AccessTokenCreateQuery;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TokenQuery_ESTest extends TokenQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccessTokenCreateQuery.AccessTokenCreateQueryBuilder<?, ?> accessTokenCreateQuery_AccessTokenCreateQueryBuilder0 = AccessTokenCreateQuery.builder();
      assertNotNull(accessTokenCreateQuery_AccessTokenCreateQueryBuilder0);
  }
}
