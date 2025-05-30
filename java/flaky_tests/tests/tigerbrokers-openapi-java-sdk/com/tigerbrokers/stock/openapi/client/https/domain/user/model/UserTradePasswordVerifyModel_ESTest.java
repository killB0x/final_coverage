/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:13:56 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.user.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.user.model.UserTradePasswordVerifyModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UserTradePasswordVerifyModel_ESTest extends UserTradePasswordVerifyModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserTradePasswordVerifyModel userTradePasswordVerifyModel0 = new UserTradePasswordVerifyModel("'VV<Yb9@gQ6<8a.dsS");
      String string0 = userTradePasswordVerifyModel0.getIdNo();
      assertEquals("'VV<Yb9@gQ6<8a.dsS", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UserTradePasswordVerifyModel userTradePasswordVerifyModel0 = new UserTradePasswordVerifyModel((String) null);
      userTradePasswordVerifyModel0.setIdNo("");
      String string0 = userTradePasswordVerifyModel0.getIdNo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UserTradePasswordVerifyModel userTradePasswordVerifyModel0 = new UserTradePasswordVerifyModel((String) null);
      String string0 = userTradePasswordVerifyModel0.getIdNo();
      assertNull(string0);
  }
}
