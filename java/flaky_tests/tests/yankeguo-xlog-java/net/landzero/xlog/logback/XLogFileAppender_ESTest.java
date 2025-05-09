/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 18:48:04 GMT 2022
 */

package net.landzero.xlog.logback;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.landzero.xlog.logback.XLogFileAppender;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XLogFileAppender_ESTest extends XLogFileAppender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setRotate(0);
      assertEquals(0, xLogFileAppender0.getRotate());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setRotate(2616);
      int int0 = xLogFileAppender0.getRotate();
      assertEquals(2616, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setDir("Ms");
      String string0 = xLogFileAppender0.getDir();
      assertEquals("Ms", string0);
      assertEquals(0, xLogFileAppender0.getRotate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      int int0 = xLogFileAppender0.getRotate();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.getFilename();
      assertEquals(0, xLogFileAppender0.getRotate());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      String string0 = xLogFileAppender0.getDir();
      assertNull(string0);
      assertEquals(0, xLogFileAppender0.getRotate());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/xlog.reopen.txt");
      FileSystemHandling.createFolder(evoSuiteFile0);
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      // Undeclared exception!
      try { 
        xLogFileAppender0.appendString("json");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null-20140213");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "plain");
      xLogFileAppender0.setRotate(30000);
      // Undeclared exception!
      try { 
        xLogFileAppender0.appendString("/tmp/xlog.reopen.txt");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.landzero.xlog.logback.XLogFileAppender", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      System.setCurrentTimeMillis(1571L);
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setRotate(1175);
      // Undeclared exception!
      try { 
        xLogFileAppender0.appendString("[D[FCH");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.landzero.xlog.logback.XLogFileAppender", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          FileSystemHandling.shouldAllThrowIOExceptions();
          XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
          xLogFileAppender0.setProject("_json_");
          xLogFileAppender0.setMode("json");
          xLogFileAppender0.setEnv("plain");
          xLogFileAppender0.setDir("/tmp/xlog.reopen.txt");
          // Undeclared exception!
          try { 
            xLogFileAppender0.start();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/tmp/xlog.reopen.txt/plain/_json_/_json_.log\" \"write\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.base/java.lang.SecurityManager.checkWrite(SecurityManager.java:752)
             // java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:225)
             // ch.qos.logback.core.recovery.ResilientFileOutputStream.<init>(ResilientFileOutputStream.java:26)
             // net.landzero.xlog.logback.XLogFileAppender.unsafeInitOutputStream(XLogFileAppender.java:99)
             // net.landzero.xlog.logback.XLogFileAppender.initOutputStream(XLogFileAppender.java:86)
             // net.landzero.xlog.logback.XLogFileAppender.start(XLogFileAppender.java:199)
             // jdk.internal.reflect.GeneratedMethodAccessor108.invoke(Unknown Source)
             // java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.base/java.lang.reflect.Method.invoke(Method.java:566)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
             // java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
             // java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
             // java.base/java.lang.Thread.run(Thread.java:829)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setMode("json");
      xLogFileAppender0.setEnv("plain");
      xLogFileAppender0.setDir("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
      xLogFileAppender0.start();
      assertEquals("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", xLogFileAppender0.getDir());
      assertEquals(0, xLogFileAppender0.getRotate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setEnv("l3 ?`.^(n;");
      xLogFileAppender0.setDir("8v4cwTTn");
      xLogFileAppender0.start();
      assertEquals(0, xLogFileAppender0.getRotate());
      assertEquals("8v4cwTTn", xLogFileAppender0.getDir());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setDir("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
      xLogFileAppender0.start();
      assertEquals(0, xLogFileAppender0.getRotate());
      assertEquals("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", xLogFileAppender0.getDir());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.start();
      assertEquals(0, xLogFileAppender0.getRotate());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setRotate((-429));
      assertEquals(0, xLogFileAppender0.getRotate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.setRotate(1175);
      // Undeclared exception!
      try { 
        xLogFileAppender0.appendString("[D[FCH");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
      xLogFileAppender0.stop();
      assertEquals(0, xLogFileAppender0.getRotate());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          XLogFileAppender xLogFileAppender0 = new XLogFileAppender();
          xLogFileAppender0.setProject("_json_");
          xLogFileAppender0.setMode("json");
          xLogFileAppender0.setEnv("plain");
          xLogFileAppender0.setDir("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
          // Undeclared exception!
          try { 
            xLogFileAppender0.start();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/home/user/[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n/plain/_json_/_json_.log\" \"write\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.base/java.lang.SecurityManager.checkWrite(SecurityManager.java:752)
             // java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:225)
             // ch.qos.logback.core.recovery.ResilientFileOutputStream.<init>(ResilientFileOutputStream.java:26)
             // net.landzero.xlog.logback.XLogFileAppender.unsafeInitOutputStream(XLogFileAppender.java:99)
             // net.landzero.xlog.logback.XLogFileAppender.initOutputStream(XLogFileAppender.java:86)
             // net.landzero.xlog.logback.XLogFileAppender.start(XLogFileAppender.java:199)
             // jdk.internal.reflect.GeneratedMethodAccessor108.invoke(Unknown Source)
             // java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.base/java.lang.reflect.Method.invoke(Method.java:566)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
             // java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
             // java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
             // java.base/java.lang.Thread.run(Thread.java:829)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
