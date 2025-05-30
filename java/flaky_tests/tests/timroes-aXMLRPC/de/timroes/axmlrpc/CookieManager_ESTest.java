/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 23:20:36 GMT 2022
 */

package de.timroes.axmlrpc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.timroes.axmlrpc.CookieManager;
import java.net.HttpURLConnection;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CookieManager_ESTest extends CookieManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CookieManager cookieManager0 = new CookieManager(798);
      // Undeclared exception!
      try { 
        cookieManager0.setCookies((HttpURLConnection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.timroes.axmlrpc.CookieManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CookieManager cookieManager0 = new CookieManager(0);
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      cookieManager0.setCookies(httpURLConnection0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CookieManager cookieManager0 = new CookieManager((-378));
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      cookieManager0.setCookies(httpURLConnection0);
      cookieManager0.clearCookies();
      HttpURLConnection httpURLConnection1 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      cookieManager0.setCookies(httpURLConnection1);
      HttpURLConnection httpURLConnection2 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      cookieManager0.setCookies(httpURLConnection2);
      cookieManager0.getCookies();
      cookieManager0.clearCookies();
      HttpURLConnection httpURLConnection3 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      cookieManager0.setCookies(httpURLConnection3);
      cookieManager0.getCookies();
      HttpURLConnection httpURLConnection4 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(httpURLConnection4).getHeaderFields();
      // Undeclared exception!
      try { 
        cookieManager0.readCookies(httpURLConnection4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.timroes.axmlrpc.CookieManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CookieManager cookieManager0 = new CookieManager(0);
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      cookieManager0.readCookies(httpURLConnection0);
  }
}
