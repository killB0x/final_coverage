/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 15:56:37 GMT 2022
 */

package com.tecacet.finance.service.stock.yahoo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.tecacet.finance.service.stock.yahoo.RedirectableRequest;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RedirectableRequest_ESTest extends RedirectableRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      RedirectableRequest redirectableRequest0 = new RedirectableRequest(uRL0, 1482);
      redirectableRequest0.setConnectTimeout((-438));
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        redirectableRequest0.openConnection((Map<String, String>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout can not be negative
         //
         verifyException("java.net.URLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RedirectableRequest redirectableRequest0 = new RedirectableRequest((URL) null, (-1));
      // Undeclared exception!
      try { 
        redirectableRequest0.openConnection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      RedirectableRequest redirectableRequest0 = new RedirectableRequest(uRL0, 0);
      URLConnection uRLConnection0 = redirectableRequest0.openConnection((Map<String, String>) hashMap0);
      assertEquals(10000, uRLConnection0.getConnectTimeout());
      assertEquals(10000, uRLConnection0.getReadTimeout());
      assertNotNull(uRLConnection0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      RedirectableRequest redirectableRequest0 = new RedirectableRequest(uRL0, 302);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "");
      try { 
        redirectableRequest0.openConnection((Map<String, String>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RedirectableRequest redirectableRequest0 = new RedirectableRequest((URL) null, (-977));
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        redirectableRequest0.openConnection((Map<String, String>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "_(u1");
      RedirectableRequest redirectableRequest0 = new RedirectableRequest(uRL0, 0);
      URLConnection uRLConnection0 = redirectableRequest0.openConnection();
      assertNotNull(uRLConnection0);
      assertEquals(10000, uRLConnection0.getReadTimeout());
      assertEquals(10000, uRLConnection0.getConnectTimeout());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      RedirectableRequest redirectableRequest0 = new RedirectableRequest(uRL0, 0);
      redirectableRequest0.setReadTimeout(0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      RedirectableRequest redirectableRequest0 = new RedirectableRequest(uRL0, 0);
      try { 
        redirectableRequest0.openConnection();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      RedirectableRequest redirectableRequest0 = new RedirectableRequest(uRL0, 0);
      redirectableRequest0.setConnectTimeout((-1));
      // Undeclared exception!
      try { 
        redirectableRequest0.openConnection();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout can not be negative
         //
         verifyException("java.net.URLConnection", e);
      }
  }
}
