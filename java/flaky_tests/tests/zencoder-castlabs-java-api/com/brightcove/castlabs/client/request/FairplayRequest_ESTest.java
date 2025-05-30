/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 04:32:21 GMT 2022
 */

package com.brightcove.castlabs.client.request;

import org.junit.Test;
import static org.junit.Assert.*;
import com.brightcove.castlabs.client.request.FairplayRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FairplayRequest_ESTest extends FairplayRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      fairplayRequest0.setProviderPrivateKey("mb&cWlc7FPtrq'v");
      String string0 = fairplayRequest0.getProviderPrivateKey();
      assertEquals("mb&cWlc7FPtrq'v", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      fairplayRequest0.setProviderCertificate("}sD(%1Zdw1|~5Hdj ");
      String string0 = fairplayRequest0.getProviderCertificate();
      assertEquals("}sD(%1Zdw1|~5Hdj ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      fairplayRequest0.setApplicationSecretKey("");
      String string0 = fairplayRequest0.getApplicationSecretKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      String string0 = fairplayRequest0.getApplicationSecretKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      String string0 = fairplayRequest0.getProviderPrivateKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      fairplayRequest0.setProviderCertificate("");
      String string0 = fairplayRequest0.getProviderCertificate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      String string0 = fairplayRequest0.getProviderCertificate();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      fairplayRequest0.setProviderPrivateKey("");
      String string0 = fairplayRequest0.getProviderPrivateKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      String string0 = fairplayRequest0.toString();
      assertEquals("FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FairplayRequest fairplayRequest0 = new FairplayRequest();
      fairplayRequest0.setApplicationSecretKey("FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}");
      String string0 = fairplayRequest0.getApplicationSecretKey();
      assertEquals("FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}", string0);
  }
}
