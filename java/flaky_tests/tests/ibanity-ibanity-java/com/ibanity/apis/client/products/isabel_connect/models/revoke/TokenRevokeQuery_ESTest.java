/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 11:27:02 GMT 2022
 */

package com.ibanity.apis.client.products.isabel_connect.models.revoke;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibanity.apis.client.products.isabel_connect.models.revoke.TokenRevokeQuery;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TokenRevokeQuery_ESTest extends TokenRevokeQuery_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      tokenRevokeQuery0.setToken("|_P[c");
      String string0 = tokenRevokeQuery0.getToken();
      assertEquals("|_P[c", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      tokenRevokeQuery0.setToken("");
      String string0 = tokenRevokeQuery0.getToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      boolean boolean0 = tokenRevokeQuery0.canEqual(tokenRevokeQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenRevokeQuery tokenRevokeQuery0 = null;
      try {
        tokenRevokeQuery0 = new TokenRevokeQuery((TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibanity.apis.client.products.isabel_connect.models.TokenQuery$TokenQueryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      String string0 = tokenRevokeQuery0.getToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      TokenRevokeQuery tokenRevokeQuery1 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      tokenRevokeQuery0.setToken("yrg):3_<K_.`fX");
      assertFalse(tokenRevokeQuery0.equals((Object)tokenRevokeQuery1));
      
      tokenRevokeQuery1.setToken("yrg):3_<K_.`fX");
      boolean boolean0 = tokenRevokeQuery0.equals(tokenRevokeQuery1);
      assertTrue(tokenRevokeQuery1.equals((Object)tokenRevokeQuery0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      TokenRevokeQuery tokenRevokeQuery1 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      assertTrue(tokenRevokeQuery1.equals((Object)tokenRevokeQuery0));
      
      tokenRevokeQuery1.setToken("e:Gt&-k0:%");
      boolean boolean0 = tokenRevokeQuery0.equals(tokenRevokeQuery1);
      assertFalse(tokenRevokeQuery1.equals((Object)tokenRevokeQuery0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      tokenRevokeQuery0.setToken("");
      TokenRevokeQuery tokenRevokeQuery1 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      boolean boolean0 = tokenRevokeQuery0.equals(tokenRevokeQuery1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      TokenRevokeQuery tokenRevokeQuery1 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      boolean boolean0 = tokenRevokeQuery0.equals(tokenRevokeQuery1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      boolean boolean0 = tokenRevokeQuery0.equals(tokenRevokeQuery0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      boolean boolean0 = tokenRevokeQuery0.equals(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      tokenRevokeQuery0.setToken("6c4B1 a4 ^*/K-K");
      tokenRevokeQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      String string0 = tokenRevokeQuery0.toString();
      assertEquals("TokenRevokeQuery(token=null)", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      boolean boolean0 = tokenRevokeQuery0.canEqual(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      tokenRevokeQuery0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      String[] stringArray0 = tokenRevokeQuery0.path();
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TokenRevokeQuery.TokenRevokeQueryBuilder<?, ?> tokenRevokeQuery_TokenRevokeQueryBuilder0 = TokenRevokeQuery.builder();
      TokenRevokeQuery tokenRevokeQuery0 = new TokenRevokeQuery(tokenRevokeQuery_TokenRevokeQueryBuilder0);
      Map<String, String> map0 = tokenRevokeQuery0.requestArguments();
      assertEquals(1, map0.size());
  }
}
