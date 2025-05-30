/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:15:36 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.response;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.response.TigerResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TigerResponse_ESTest extends TigerResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setCode((-1276));
      boolean boolean0 = tigerResponse0.isSuccess();
      assertEquals((-1276), tigerResponse0.getCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setTimestamp(417L);
      long long0 = tigerResponse0.getTimestamp();
      assertEquals(417L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setTimestamp((-1276));
      long long0 = tigerResponse0.getTimestamp();
      assertEquals((-1276L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setSign("paper account response error");
      String string0 = tigerResponse0.getSign();
      assertEquals("paper account response error", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setMessage("J$LU@b`");
      String string0 = tigerResponse0.getMessage();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setMessage("");
      String string0 = tigerResponse0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setCode(3363);
      int int0 = tigerResponse0.getCode();
      assertEquals(3363, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setCode((-1276));
      int int0 = tigerResponse0.getCode();
      assertEquals((-1276), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      boolean boolean0 = tigerResponse0.isSuccess();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setCode(1300);
      boolean boolean0 = tigerResponse0.isSuccess();
      assertEquals(1300, tigerResponse0.getCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      int int0 = tigerResponse0.getCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      String string0 = tigerResponse0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      long long0 = tigerResponse0.getTimestamp();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      tigerResponse0.setSign("");
      String string0 = tigerResponse0.getSign();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TigerResponse tigerResponse0 = new TigerResponse();
      String string0 = tigerResponse0.getSign();
      assertNull(string0);
  }
}
