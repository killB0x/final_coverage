/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:54:11 GMT 2022
 */

package com.github.echisan.wbp4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.echisan.wbp4j.SzvoneLoginRequest;
import com.github.echisan.wbp4j.cache.AbstractCookieContext;
import com.github.echisan.wbp4j.cache.CookieContext;
import com.github.echisan.wbp4j.cache.FileCookieCacheAccessor;
import com.github.echisan.wbp4j.http.DefaultWbpHttpRequest;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SzvoneLoginRequest_ESTest extends SzvoneLoginRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultWbpHttpRequest defaultWbpHttpRequest0 = new DefaultWbpHttpRequest();
      FileCookieCacheAccessor fileCookieCacheAccessor0 = new FileCookieCacheAccessor();
      CookieContext cookieContext0 = new CookieContext(fileCookieCacheAccessor0);
      SzvoneLoginRequest szvoneLoginRequest0 = new SzvoneLoginRequest(defaultWbpHttpRequest0, cookieContext0);
      assertNull(szvoneLoginRequest0.getUsername());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SzvoneLoginRequest szvoneLoginRequest0 = new SzvoneLoginRequest((AbstractCookieContext) null);
      szvoneLoginRequest0.setUsernamePassword("]Y/iu>rU/|KiN9", "]Y/iu>rU/|KiN9");
      try { 
        szvoneLoginRequest0.login();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // \u767B\u9646\u5931\u8D25\uFF0C\u65E0\u6CD5\u53D1\u9001\u8BF7\u6C42\u3002
         //
         verifyException("com.github.echisan.wbp4j.SzvoneLoginRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SzvoneLoginRequest.LoginResponseEntity szvoneLoginRequest_LoginResponseEntity0 = new SzvoneLoginRequest.LoginResponseEntity();
      szvoneLoginRequest_LoginResponseEntity0.setString((List<String>) null);
      assertNull(szvoneLoginRequest_LoginResponseEntity0.getUid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SzvoneLoginRequest.LoginResponseEntity szvoneLoginRequest_LoginResponseEntity0 = new SzvoneLoginRequest.LoginResponseEntity();
      szvoneLoginRequest_LoginResponseEntity0.setUid("VE<>lE");
      assertNull(szvoneLoginRequest_LoginResponseEntity0.getRetcode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SzvoneLoginRequest.LoginResponseEntity szvoneLoginRequest_LoginResponseEntity0 = new SzvoneLoginRequest.LoginResponseEntity();
      List<String> list0 = szvoneLoginRequest_LoginResponseEntity0.getString();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SzvoneLoginRequest.LoginResponseEntity szvoneLoginRequest_LoginResponseEntity0 = new SzvoneLoginRequest.LoginResponseEntity();
      String string0 = szvoneLoginRequest_LoginResponseEntity0.getNick();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SzvoneLoginRequest.LoginResponseEntity szvoneLoginRequest_LoginResponseEntity0 = new SzvoneLoginRequest.LoginResponseEntity();
      String string0 = szvoneLoginRequest_LoginResponseEntity0.getRetcode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SzvoneLoginRequest.LoginResponseEntity szvoneLoginRequest_LoginResponseEntity0 = new SzvoneLoginRequest.LoginResponseEntity();
      szvoneLoginRequest_LoginResponseEntity0.setRetcode("ke2\"-Sw");
      assertNull(szvoneLoginRequest_LoginResponseEntity0.getNick());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SzvoneLoginRequest.LoginResponseEntity szvoneLoginRequest_LoginResponseEntity0 = new SzvoneLoginRequest.LoginResponseEntity();
      String string0 = szvoneLoginRequest_LoginResponseEntity0.getUid();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SzvoneLoginRequest.LoginResponseEntity szvoneLoginRequest_LoginResponseEntity0 = new SzvoneLoginRequest.LoginResponseEntity();
      szvoneLoginRequest_LoginResponseEntity0.setNick("VE<>lE");
      assertNull(szvoneLoginRequest_LoginResponseEntity0.getRetcode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SzvoneLoginRequest.LoginFailedResponse szvoneLoginRequest_LoginFailedResponse0 = new SzvoneLoginRequest.LoginFailedResponse();
      szvoneLoginRequest_LoginFailedResponse0.setReason("30");
      assertEquals("30", szvoneLoginRequest_LoginFailedResponse0.getReason());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SzvoneLoginRequest.LoginFailedResponse szvoneLoginRequest_LoginFailedResponse0 = new SzvoneLoginRequest.LoginFailedResponse();
      Integer integer0 = szvoneLoginRequest_LoginFailedResponse0.getRetcode();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SzvoneLoginRequest.LoginFailedResponse szvoneLoginRequest_LoginFailedResponse0 = new SzvoneLoginRequest.LoginFailedResponse();
      String string0 = szvoneLoginRequest_LoginFailedResponse0.getReason();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SzvoneLoginRequest.LoginFailedResponse szvoneLoginRequest_LoginFailedResponse0 = new SzvoneLoginRequest.LoginFailedResponse();
      Integer integer0 = Integer.valueOf(2890);
      szvoneLoginRequest_LoginFailedResponse0.setRetcode(integer0);
      assertEquals(2890, (int)szvoneLoginRequest_LoginFailedResponse0.getRetcode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CookieContext cookieContext0 = new CookieContext();
      SzvoneLoginRequest szvoneLoginRequest0 = new SzvoneLoginRequest(cookieContext0);
      // Undeclared exception!
      try { 
        szvoneLoginRequest0.login();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.echisan.wbp4j.SzvoneLoginRequest", e);
      }
  }
}
