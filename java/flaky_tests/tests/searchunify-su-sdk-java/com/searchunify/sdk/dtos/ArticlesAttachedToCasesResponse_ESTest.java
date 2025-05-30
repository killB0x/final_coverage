/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 20:01:31 GMT 2022
 */

package com.searchunify.sdk.dtos;

import org.junit.Test;
import static org.junit.Assert.*;
import com.searchunify.sdk.dtos.ArticlesAttachedToCasesResponse;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArticlesAttachedToCasesResponse_ESTest extends ArticlesAttachedToCasesResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArticlesAttachedToCasesResponse articlesAttachedToCasesResponse0 = new ArticlesAttachedToCasesResponse();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      articlesAttachedToCasesResponse0.setData(hashMap0);
      Map<String, Object> map0 = articlesAttachedToCasesResponse0.getData();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArticlesAttachedToCasesResponse articlesAttachedToCasesResponse0 = new ArticlesAttachedToCasesResponse();
      Map<String, Object> map0 = articlesAttachedToCasesResponse0.getData();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArticlesAttachedToCasesResponse articlesAttachedToCasesResponse0 = new ArticlesAttachedToCasesResponse();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      articlesAttachedToCasesResponse0.setData(hashMap0);
      hashMap0.put("", "");
      Map<String, Object> map0 = articlesAttachedToCasesResponse0.getData();
      assertFalse(map0.isEmpty());
  }
}
