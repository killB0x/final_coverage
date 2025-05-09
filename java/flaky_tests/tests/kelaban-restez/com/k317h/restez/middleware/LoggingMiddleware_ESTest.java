/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 01:46:34 GMT 2022
 */

package com.k317h.restez.middleware;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.k317h.restez.Handler;
import com.k317h.restez.io.Request;
import com.k317h.restez.io.Response;
import com.k317h.restez.middleware.LoggingMiddleware;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LoggingMiddleware_ESTest extends LoggingMiddleware_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware("UTF-8");
      HashMap<String, LoggingMiddleware.LogTokenFormatter> hashMap0 = new HashMap<String, LoggingMiddleware.LogTokenFormatter>();
      Map<String, LoggingMiddleware.LogTokenFormatter> map0 = loggingMiddleware0.getFormatters(hashMap0);
      assertEquals(13, map0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, LoggingMiddleware.LogTokenFormatter> hashMap0 = new HashMap<String, LoggingMiddleware.LogTokenFormatter>();
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware("w9!M9)6c|", hashMap0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.referrer((Request) null, (Response) null, ":remote-addr :remote-user :method :url :http-version :status :res[content-length] - :response-time ms");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      try { 
        loggingMiddleware0.handle((Request) null, (Response) null, (Handler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.getFormatters((Map<String, LoggingMiddleware.LogTokenFormatter>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = null;
      try {
        loggingMiddleware0 = new LoggingMiddleware("m,e qwtCrRo9(", (Map<String, LoggingMiddleware.LogTokenFormatter>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, LoggingMiddleware.LogTokenFormatter> hashMap0 = new HashMap<String, LoggingMiddleware.LogTokenFormatter>(3286, 495.75F);
      LoggingMiddleware loggingMiddleware0 = null;
      try {
        loggingMiddleware0 = new LoggingMiddleware("'0Vzsf@4:Ez", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ':Ez' is not a supported log format
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = null;
      try {
        loggingMiddleware0 = new LoggingMiddleware((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LoggingMiddleware.SHORT_FORMAT = null;
      LoggingMiddleware loggingMiddleware0 = null;
      try {
        loggingMiddleware0 = new LoggingMiddleware();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = null;
      try {
        loggingMiddleware0 = new LoggingMiddleware("aG,8;:dx:$kBRY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ':dx' is not a supported log format
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.url((Request) null, (Response) null, ":remote-addr - :remote-user [:date] \":method :url :http-version\" :status :res[content-length] \":referrer\" \":user-agent\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.userAgent((Request) null, (Response) null, ":remote-addr :remote-user :method :url :http-version :status :res[content-length] - :response-time ms");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.remoteUser((Request) null, (Response) null, ":remote-addr :remote-user :method :url :http-version :status :res[content-length] - :response-time ms");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.method((Request) null, (Response) null, ":remote-addr :remote-user :method :url :http-version :status :res[content-length] - :response-time ms");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.status((Request) null, (Response) null, "moCoP d?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.remoteAddress((Request) null, (Response) null, ":remote-addr :remote-user :method :url :http-version :status :res[content-length] - :response-time ms");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.scheme((Request) null, (Response) null, ":remote-addr - :remote-user [:date] \":method :url :http-version\" :status :res[content-length]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.httpVersion((Request) null, (Response) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.respTime((Request) null, (Response) null, ":remote-addr - :remote-user [:date] \":method :url :http-version\" :status :res[content-length] \":referrer\" \":user-agent\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware("v");
      String string0 = loggingMiddleware0.date((Request) null, (Response) null, "v");
      assertEquals("14/Feb/2014:20:21:21+0000", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.reqHeader((Request) null, (Response) null, ":remote-addr :remote-user :method :url :http-version :status :res[content-length] - :response-time ms");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LoggingMiddleware loggingMiddleware0 = new LoggingMiddleware();
      // Undeclared exception!
      try { 
        loggingMiddleware0.respHeader((Request) null, (Response) null, ":remote-addr - :remote-user [:date] \":method :url :http-version\" :status :res[content-length] \":referrer\" \":user-agent\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.k317h.restez.middleware.LoggingMiddleware", e);
      }
  }
}
