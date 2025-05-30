/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:39:31 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.request;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.tigerbrokers.stock.openapi.client.https.domain.ApiModel;
import com.tigerbrokers.stock.openapi.client.https.domain.BatchApiModel;
import com.tigerbrokers.stock.openapi.client.https.request.TigerHttpRequest;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TigerHttpRequest_ESTest extends TigerHttpRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("Oqnm7G>#u1COw");
      tigerHttpRequest0.setTimestamp((String) null);
      tigerHttpRequest0.getTimestamp();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("");
      tigerHttpRequest0.setTimestamp("");
      tigerHttpRequest0.getTimestamp();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest((String) null);
      tigerHttpRequest0.setTigerId("M(g4LvjD(~b(+k@?");
      tigerHttpRequest0.getTigerId();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("?>'$&");
      tigerHttpRequest0.setSignType("9ObzD1p4\"356_QwxG");
      tigerHttpRequest0.getSignType();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("");
      tigerHttpRequest0.setSignType("");
      tigerHttpRequest0.getSignType();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("");
      tigerHttpRequest0.setSign("yyyy-MM-dd HH:mm:ss.SSS");
      tigerHttpRequest0.getSign();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("]S>bOd#%~V4J(fg");
      tigerHttpRequest0.setSign("");
      tigerHttpRequest0.getSign();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("]");
      tigerHttpRequest0.setCharset("_D:;n/HzS{+qvuu");
      tigerHttpRequest0.getCharset();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("");
      tigerHttpRequest0.setCharset("");
      tigerHttpRequest0.getCharset();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("]S>bOd#%~V4J(fg");
      tigerHttpRequest0.setBizContent("]S>bOd#%~V4J(fg");
      tigerHttpRequest0.getBizContent();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("");
      tigerHttpRequest0.setBizContent("");
      tigerHttpRequest0.getBizContent();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("`MH%Pf97-~Yc`");
      tigerHttpRequest0.setApiVersion((String) null);
      String string0 = tigerHttpRequest0.getApiVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("");
      tigerHttpRequest0.setApiVersion("");
      String string0 = tigerHttpRequest0.getApiVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("#M6a[IS#2Xp-R4C");
      tigerHttpRequest0.getApiMethodName();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("");
      tigerHttpRequest0.getApiMethodName();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("Oqnm7G>#u1COw");
      tigerHttpRequest0.getSignType();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("]");
      tigerHttpRequest0.setTigerId("");
      tigerHttpRequest0.getTigerId();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("Oqnm7G>#u1COw");
      tigerHttpRequest0.getBizContent();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("Oqnm7G>#u1COw");
      tigerHttpRequest0.getTimestamp();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("]");
      LinkedList<ApiModel> linkedList0 = new LinkedList<ApiModel>();
      BatchApiModel<Object> batchApiModel0 = new BatchApiModel<Object>(linkedList0);
      // Undeclared exception!
      try { 
        tigerHttpRequest0.setApiModel(batchApiModel0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.tigerbrokers.stock.openapi.client.https.request.TigerHttpRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest((String) null);
      tigerHttpRequest0.getApiModel();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("");
      tigerHttpRequest0.getResponseClass();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest((String) null);
      tigerHttpRequest0.getSign();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("RK-l%}~z8u");
      String string0 = tigerHttpRequest0.getApiVersion();
      assertEquals("1.0", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("]");
      tigerHttpRequest0.getTigerId();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest((String) null);
      tigerHttpRequest0.getApiMethodName();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TigerHttpRequest tigerHttpRequest0 = new TigerHttpRequest("]");
      tigerHttpRequest0.getCharset();
      assertEquals("1.0", tigerHttpRequest0.getApiVersion());
  }
}
