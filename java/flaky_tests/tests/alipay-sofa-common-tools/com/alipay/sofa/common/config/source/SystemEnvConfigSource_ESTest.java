/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 20:14:33 GMT 2022
 */

package com.alipay.sofa.common.config.source;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alipay.sofa.common.config.source.SystemEnvConfigSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SystemEnvConfigSource_ESTest extends SystemEnvConfigSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      boolean boolean0 = systemEnvConfigSource0.hasKey("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      String string0 = systemEnvConfigSource0.doGetConfig("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      String string0 = systemEnvConfigSource0.doGetConfig("_");
      assertEquals("/usr/bin/java", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      // Undeclared exception!
      try { 
        systemEnvConfigSource0.hasKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      // Undeclared exception!
      try { 
        systemEnvConfigSource0.doGetConfig((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      String string0 = systemEnvConfigSource0.getName();
      assertEquals("SystemEnv", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      int int0 = systemEnvConfigSource0.getOrder();
      assertEquals(200, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SystemEnvConfigSource systemEnvConfigSource0 = new SystemEnvConfigSource();
      boolean boolean0 = systemEnvConfigSource0.hasKey("_");
      assertTrue(boolean0);
  }
}
