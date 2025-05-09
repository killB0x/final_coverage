/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 16:36:45 GMT 2022
 */

package com.github.myzhan.locust4j.stats;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.myzhan.locust4j.stats.RequestFailure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RequestFailure_ESTest extends RequestFailure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      requestFailure0.setResponseTime(1063L);
      long long0 = requestFailure0.getResponseTime();
      assertEquals(1063L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      requestFailure0.setRequestType("");
      String string0 = requestFailure0.getRequestType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      requestFailure0.setName("Dn:7byRoigeSjT#gd*");
      String string0 = requestFailure0.getName();
      assertEquals("Dn:7byRoigeSjT#gd*", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      requestFailure0.setError("com.github.myzhan.locust4j.stats.RequestFailure");
      String string0 = requestFailure0.getError();
      assertEquals("com.github.myzhan.locust4j.stats.RequestFailure", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      String string0 = requestFailure0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      requestFailure0.setResponseTime((-2291L));
      long long0 = requestFailure0.getResponseTime();
      assertEquals((-2291L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      String string0 = requestFailure0.getError();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      requestFailure0.setName("");
      String string0 = requestFailure0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      requestFailure0.setError("");
      String string0 = requestFailure0.getError();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      requestFailure0.setRequestType("CM3");
      String string0 = requestFailure0.getRequestType();
      assertEquals("CM3", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      long long0 = requestFailure0.getResponseTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RequestFailure requestFailure0 = new RequestFailure();
      String string0 = requestFailure0.getRequestType();
      assertNull(string0);
  }
}
