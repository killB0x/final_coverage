/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:49:21 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.request.future;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.request.future.FutureTickRequest;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FutureTickRequest_ESTest extends FutureTickRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(2689);
      FutureTickRequest futureTickRequest0 = FutureTickRequest.newRequest((List<String>) null, integer0, integer0);
      assertEquals("1.0", futureTickRequest0.getApiVersion());
      assertEquals("future_tick", futureTickRequest0.getApiMethodName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FutureTickRequest futureTickRequest0 = new FutureTickRequest();
      futureTickRequest0.getResponseClass();
      assertEquals("future_tick", futureTickRequest0.getApiMethodName());
      assertEquals("1.0", futureTickRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FutureTickRequest futureTickRequest0 = FutureTickRequest.newRequest((List<String>) null);
      assertEquals("1.0", futureTickRequest0.getApiVersion());
      assertEquals("future_tick", futureTickRequest0.getApiMethodName());
  }
}
