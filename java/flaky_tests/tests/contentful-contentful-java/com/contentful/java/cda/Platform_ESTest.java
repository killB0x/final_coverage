/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 03:25:02 GMT 2022
 */

package com.contentful.java.cda;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.contentful.java.cda.Platform;
import java.util.concurrent.Executor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Platform_ESTest extends Platform_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Platform platform0 = Platform.get();
      String string0 = platform0.version();
      assertEquals("5.15.0-50-generic", string0);
      
      int int0 = 20;
      Platform.Android platform_Android0 = new Platform.Android(int0, string0);
      boolean boolean0 = platform_Android0.needsCustomTLSSocketFactory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Platform.Base platform_Base0 = new Platform.Base();
      boolean boolean0 = platform_Base0.needsCustomTLSSocketFactory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Platform.Android platform_Android0 = new Platform.Android((-3803), (String) null);
      platform_Android0.version();
      assertTrue(platform_Android0.needsCustomTLSSocketFactory());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Platform.Android platform_Android0 = new Platform.Android(2355, "");
      String string0 = platform_Android0.name();
      assertEquals("Android", string0);
      assertFalse(platform_Android0.needsCustomTLSSocketFactory());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Platform.Android platform_Android0 = new Platform.Android(0, "~{PsCS]");
      // Undeclared exception!
      try { 
        platform_Android0.callbackExecutor();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // android/os/Handler
         //
         verifyException("com.contentful.java.cda.Platform$Android$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Platform.Android platform_Android0 = new Platform.Android((-3803), (String) null);
      platform_Android0.version();
      assertTrue(platform_Android0.needsCustomTLSSocketFactory());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Platform platform0 = Platform.get();
      boolean boolean0 = platform0.needsCustomTLSSocketFactory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Platform.Android platform_Android0 = new Platform.Android(2355, "");
      boolean boolean0 = platform_Android0.needsCustomTLSSocketFactory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Platform platform0 = Platform.get();
      String string0 = platform0.name();
      assertEquals("Linux", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Platform.Base platform_Base0 = new Platform.Base();
      String string0 = platform_Base0.version();
      assertEquals("5.15.0-50-generic", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Platform.Base platform_Base0 = new Platform.Base();
      String string0 = platform_Base0.name();
      assertEquals("Linux", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Platform.Base platform_Base0 = new Platform.Base();
      Executor executor0 = platform_Base0.callbackExecutor();
      assertNotNull(executor0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Platform platform0 = Platform.get();
      Executor executor0 = platform0.callbackExecutor();
      assertNotNull(executor0);
  }
}
