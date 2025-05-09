/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:56:05 GMT 2022
 */

package com.criteo.marketing.auth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.criteo.marketing.Pair;
import com.criteo.marketing.auth.HttpBearerAuth;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HttpBearerAuth_ESTest extends HttpBearerAuth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpBearerAuth httpBearerAuth0 = new HttpBearerAuth((String) null);
      httpBearerAuth0.setBearerToken("4)");
      String string0 = httpBearerAuth0.getBearerToken();
      assertEquals("4)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpBearerAuth httpBearerAuth0 = new HttpBearerAuth("");
      httpBearerAuth0.setBearerToken("");
      String string0 = httpBearerAuth0.getBearerToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HttpBearerAuth httpBearerAuth0 = new HttpBearerAuth("Bearer");
      httpBearerAuth0.setBearerToken("Bearer");
      LinkedList<Pair> linkedList0 = new LinkedList<Pair>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      httpBearerAuth0.applyToParams(linkedList0, hashMap0);
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HttpBearerAuth httpBearerAuth0 = new HttpBearerAuth((String) null);
      httpBearerAuth0.setBearerToken("#'KU(v|=2LR");
      LinkedList<Pair> linkedList0 = new LinkedList<Pair>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      httpBearerAuth0.applyToParams(linkedList0, hashMap0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HttpBearerAuth httpBearerAuth0 = new HttpBearerAuth("D=gc6`oy~SWn");
      LinkedList<Pair> linkedList0 = new LinkedList<Pair>();
      httpBearerAuth0.applyToParams(linkedList0, (Map<String, String>) null);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HttpBearerAuth httpBearerAuth0 = new HttpBearerAuth("RBnM^v");
      LinkedList<Pair> linkedList0 = new LinkedList<Pair>();
      httpBearerAuth0.setBearerToken("RBnM^v");
      // Undeclared exception!
      try { 
        httpBearerAuth0.applyToParams(linkedList0, (Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.criteo.marketing.auth.HttpBearerAuth", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HttpBearerAuth httpBearerAuth0 = new HttpBearerAuth("");
      String string0 = httpBearerAuth0.getBearerToken();
      assertNull(string0);
  }
}
