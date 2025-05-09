/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:50:28 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.user.item;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.user.item.UserLoginItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UserLoginItem_ESTest extends UserLoginItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      userLoginItem0.setUuid(592L);
      long long0 = userLoginItem0.getUuid();
      assertEquals(592L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      userLoginItem0.setUuid((-3424L));
      long long0 = userLoginItem0.getUuid();
      assertEquals((-3424L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      userLoginItem0.setRefreshToken("qqS$JEK9mi %,w+~N");
      String string0 = userLoginItem0.getRefreshToken();
      assertEquals("qqS$JEK9mi %,w+~N", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      userLoginItem0.setRefreshToken("");
      String string0 = userLoginItem0.getRefreshToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      userLoginItem0.setExpiresIn(1L);
      long long0 = userLoginItem0.getExpiresIn();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      userLoginItem0.setExpiresIn((-4245L));
      long long0 = userLoginItem0.getExpiresIn();
      assertEquals((-4245L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      userLoginItem0.setAccessToken(">:j3xgb]^]I]w-");
      String string0 = userLoginItem0.getAccessToken();
      assertEquals(">:j3xgb]^]I]w-", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      userLoginItem0.setAccessToken("");
      String string0 = userLoginItem0.getAccessToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      long long0 = userLoginItem0.getExpiresIn();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      long long0 = userLoginItem0.getUuid();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      String string0 = userLoginItem0.getAccessToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      String string0 = userLoginItem0.toString();
      assertEquals("UserLoginItem{accessToken='null', refreshToken='null', expiresIn=0, uuid=0}", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UserLoginItem userLoginItem0 = new UserLoginItem();
      String string0 = userLoginItem0.getRefreshToken();
      assertNull(string0);
  }
}
