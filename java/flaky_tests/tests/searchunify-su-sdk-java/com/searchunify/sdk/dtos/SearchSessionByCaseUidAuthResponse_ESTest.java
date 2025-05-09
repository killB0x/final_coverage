/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:59:10 GMT 2022
 */

package com.searchunify.sdk.dtos;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.searchunify.sdk.dtos.SearchSessionByCaseUidAuthResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SearchSessionByCaseUidAuthResponse_ESTest extends SearchSessionByCaseUidAuthResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SearchSessionByCaseUidAuthResponse searchSessionByCaseUidAuthResponse0 = new SearchSessionByCaseUidAuthResponse();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("q!+:O(hIC", object0, biFunction0);
      searchSessionByCaseUidAuthResponse0.setData(hashMap0);
      Map<String, Object> map0 = searchSessionByCaseUidAuthResponse0.getData();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SearchSessionByCaseUidAuthResponse searchSessionByCaseUidAuthResponse0 = new SearchSessionByCaseUidAuthResponse();
      Map<String, Object> map0 = searchSessionByCaseUidAuthResponse0.getData();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SearchSessionByCaseUidAuthResponse searchSessionByCaseUidAuthResponse0 = new SearchSessionByCaseUidAuthResponse();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      searchSessionByCaseUidAuthResponse0.setData(hashMap0);
      Map<String, Object> map0 = searchSessionByCaseUidAuthResponse0.getData();
      assertEquals(0, map0.size());
  }
}
