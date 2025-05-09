/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 15:48:08 GMT 2022
 */

package com.tecacet.finance.service.stock.yahoo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.tecacet.finance.service.stock.yahoo.CrumbManager;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CrumbManager_ESTest extends CrumbManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        CrumbManager.getCrumb();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: finance.yahoo.com
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://query1.finance.yahoo.com/v1/test/getcrumb");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Set-Cookie");
      EvoSuiteURL evoSuiteURL1 = new EvoSuiteURL("https://finance.yahoo.com/quote/%5EGSPC/options");
      NetworkHandling.createRemoteTextFile(evoSuiteURL1, "Set-Cookie");
      CrumbManager.getCookie();
      String string0 = CrumbManager.getCrumb();
      assertEquals("Set-Cookie", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://query1.finance.yahoo.com/v1/test/getcrumb");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      EvoSuiteURL evoSuiteURL1 = new EvoSuiteURL("https://finance.yahoo.com/quote/%5EGSPC/options");
      NetworkHandling.createRemoteTextFile(evoSuiteURL1, "");
      String string0 = CrumbManager.getCrumb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://finance.yahoo.com/quote/%5EGSPC/options");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Set-Cookie");
      try { 
        CrumbManager.getCookie();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: query1.finance.yahoo.com
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CrumbManager crumbManager0 = new CrumbManager();
  }
}
