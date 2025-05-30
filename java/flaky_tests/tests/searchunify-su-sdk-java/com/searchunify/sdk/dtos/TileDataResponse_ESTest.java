/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 19:58:30 GMT 2022
 */

package com.searchunify.sdk.dtos;

import org.junit.Test;
import static org.junit.Assert.*;
import com.searchunify.sdk.dtos.TileDataResponse;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TileDataResponse_ESTest extends TileDataResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TileDataResponse tileDataResponse0 = new TileDataResponse();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      tileDataResponse0.setData(hashMap0);
      Map<String, Object> map0 = tileDataResponse0.getData();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TileDataResponse tileDataResponse0 = new TileDataResponse();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      tileDataResponse0.setData(hashMap0);
      hashMap0.put("", "");
      Map<String, Object> map0 = tileDataResponse0.getData();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TileDataResponse tileDataResponse0 = new TileDataResponse();
      Map<String, Object> map0 = tileDataResponse0.getData();
      assertNull(map0);
  }
}
