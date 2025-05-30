/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 06:38:38 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.user.item;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.user.item.UserTradePasswordResetItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UserTradePasswordResetItem_ESTest extends UserTradePasswordResetItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserTradePasswordResetItem userTradePasswordResetItem0 = new UserTradePasswordResetItem();
      userTradePasswordResetItem0.setMessage("UserTradePasswordResetItem{message='null'}");
      String string0 = userTradePasswordResetItem0.getMessage();
      assertEquals("UserTradePasswordResetItem{message='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UserTradePasswordResetItem userTradePasswordResetItem0 = new UserTradePasswordResetItem();
      userTradePasswordResetItem0.setMessage("");
      String string0 = userTradePasswordResetItem0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UserTradePasswordResetItem userTradePasswordResetItem0 = new UserTradePasswordResetItem();
      String string0 = userTradePasswordResetItem0.toString();
      assertEquals("UserTradePasswordResetItem{message='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UserTradePasswordResetItem userTradePasswordResetItem0 = new UserTradePasswordResetItem();
      String string0 = userTradePasswordResetItem0.getMessage();
      assertNull(string0);
  }
}
