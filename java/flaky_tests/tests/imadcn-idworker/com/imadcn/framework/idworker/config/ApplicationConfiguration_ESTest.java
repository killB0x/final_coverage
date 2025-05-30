/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:54:51 GMT 2022
 */

package com.imadcn.framework.idworker.config;

import org.junit.Test;
import static org.junit.Assert.*;
import com.imadcn.framework.idworker.config.ApplicationConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApplicationConfiguration_ESTest extends ApplicationConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      assertFalse(applicationConfiguration0.isLowConcurrency());
      
      applicationConfiguration0.setLowConcurrency(true);
      boolean boolean0 = applicationConfiguration0.isLowConcurrency();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      
      applicationConfiguration0.setStrategy((String) null);
      applicationConfiguration0.getStrategy();
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertEquals("default", applicationConfiguration0.getGroup());
      assertTrue(applicationConfiguration0.isCacheable());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      applicationConfiguration0.setSerialize("PjqmmERXc>-SOz");
      applicationConfiguration0.getSerialize();
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("default", applicationConfiguration0.getGroup());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      applicationConfiguration0.setRegistryFile("V6[5|96Kd\"7'4'{,");
      applicationConfiguration0.getRegistryFile();
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("default", applicationConfiguration0.getGroup());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      assertEquals("default", applicationConfiguration0.getGroup());
      
      applicationConfiguration0.setGroup((String) null);
      applicationConfiguration0.getGroup();
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      assertFalse(applicationConfiguration0.isLowConcurrency());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      assertEquals("default", applicationConfiguration0.getGroup());
      
      applicationConfiguration0.setGroup("");
      applicationConfiguration0.getGroup();
      assertFalse(applicationConfiguration0.isLowConcurrency());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      String string0 = applicationConfiguration0.getGroup();
      assertEquals("default", string0);
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      assertTrue(applicationConfiguration0.isCacheable());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      applicationConfiguration0.setRegistryFile("");
      applicationConfiguration0.getRegistryFile();
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertEquals("default", applicationConfiguration0.getGroup());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      
      applicationConfiguration0.setStrategy("");
      applicationConfiguration0.getStrategy();
      assertTrue(applicationConfiguration0.isCacheable());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      String string0 = applicationConfiguration0.getStrategy();
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("snowflake", string0);
      assertEquals("default", applicationConfiguration0.getGroup());
      assertFalse(applicationConfiguration0.isLowConcurrency());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      assertTrue(applicationConfiguration0.isCacheable());
      
      applicationConfiguration0.setCacheable(false);
      boolean boolean0 = applicationConfiguration0.isCacheable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      applicationConfiguration0.setSerialize("");
      applicationConfiguration0.getSerialize();
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertEquals("default", applicationConfiguration0.getGroup());
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      boolean boolean0 = applicationConfiguration0.isLowConcurrency();
      assertEquals("default", applicationConfiguration0.getGroup());
      assertFalse(boolean0);
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      applicationConfiguration0.getRegistryFile();
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      assertEquals("default", applicationConfiguration0.getGroup());
      assertFalse(applicationConfiguration0.isLowConcurrency());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      applicationConfiguration0.setDurable(true);
      boolean boolean0 = applicationConfiguration0.isDurable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      applicationConfiguration0.isDurable();
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertEquals("default", applicationConfiguration0.getGroup());
      assertTrue(applicationConfiguration0.isCacheable());
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      boolean boolean0 = applicationConfiguration0.isCacheable();
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertEquals("default", applicationConfiguration0.getGroup());
      assertTrue(boolean0);
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ApplicationConfiguration applicationConfiguration0 = new ApplicationConfiguration();
      applicationConfiguration0.getSerialize();
      assertEquals("snowflake", applicationConfiguration0.getStrategy());
      assertTrue(applicationConfiguration0.isCacheable());
      assertFalse(applicationConfiguration0.isLowConcurrency());
      assertEquals("default", applicationConfiguration0.getGroup());
  }
}
