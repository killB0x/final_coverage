/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:30:07 GMT 2022
 */

package com.watchrabbit.executor.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import com.watchrabbit.executor.wrapper.CacheConfig;
import com.watchrabbit.executor.wrapper.CommandConfig;
import com.watchrabbit.executor.wrapper.RetryConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CommandConfig_ESTest extends CommandConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      RetryConfig retryConfig0 = RetryConfig.retry();
      commandConfig0.setRetryConfig(retryConfig0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      retryConfig0.withRetryInterval((-1990L), timeUnit0);
      commandConfig0.getRetryConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      RetryConfig retryConfig0 = RetryConfig.retry();
      commandConfig0.setRetryConfig(retryConfig0);
      commandConfig0.getRetryConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      RetryConfig retryConfig0 = RetryConfig.retry();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      RetryConfig retryConfig1 = retryConfig0.withRetryInterval((-1L), timeUnit0);
      commandConfig0.setRetryConfig(retryConfig1);
      commandConfig0.getRetryConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.setCommandName((String) null);
      commandConfig0.getCommandName();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.setCommandName(" r");
      commandConfig0.getCommandName();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      CacheConfig cacheConfig0 = CacheConfig.cache("", "");
      cacheConfig0.withExpireTime(0);
      commandConfig0.setCacheConfig(cacheConfig0);
      commandConfig0.getCacheConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      CacheConfig cacheConfig0 = CacheConfig.cache("|6d7t01|", "|6d7t01|");
      CacheConfig cacheConfig1 = cacheConfig0.withExpireTime((-2236));
      commandConfig0.setCacheConfig(cacheConfig1);
      commandConfig0.getCacheConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      CacheConfig cacheConfig0 = CacheConfig.cache("", "");
      CacheConfig cacheConfig1 = cacheConfig0.withCacheSize(0);
      commandConfig0.setCacheConfig(cacheConfig1);
      commandConfig0.getCacheConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      CacheConfig cacheConfig0 = CacheConfig.cache("|6d7t01|", "|6d7t01|");
      cacheConfig0.withCacheSize((-2236));
      commandConfig0.setCacheConfig(cacheConfig0);
      commandConfig0.getCacheConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.setBreakerRetryTimeout(0L);
      long long0 = commandConfig0.getBreakerRetryTimeout();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.getExcludedExceptions();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.getCommandName();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.setBreakerRetryTimeout((-2236));
      long long0 = commandConfig0.getBreakerRetryTimeout();
      assertEquals((-2236L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.setExcludedExceptions((List<Class<? extends Exception>>) null);
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.getRetryConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      commandConfig0.getCacheConfig();
      assertEquals(100L, commandConfig0.getBreakerRetryTimeout());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandConfig commandConfig0 = new CommandConfig();
      long long0 = commandConfig0.getBreakerRetryTimeout();
      assertEquals(100L, long0);
  }
}
