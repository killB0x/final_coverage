/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 14:47:22 GMT 2022
 */

package de.flapdoodle.embedmongo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.flapdoodle.embedmongo.MongodExecutable;
import de.flapdoodle.embedmongo.MongodProcess;
import de.flapdoodle.embedmongo.config.MongodConfig;
import de.flapdoodle.embedmongo.distribution.Version;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MongodProcess_ESTest extends MongodProcess_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)100, (byte)0);
      Charset charset0 = Charset.defaultCharset();
      InputStreamReader inputStreamReader0 = new InputStreamReader(byteArrayInputStream0, charset0);
      boolean boolean0 = MongodProcess.LogWatch.waitForStart(inputStreamReader0, "|'[D7@", "", (byte)2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      Charset charset0 = Charset.defaultCharset();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pushbackInputStream0, charset0);
      inputStreamReader0.close();
      MongodProcess.ConsoleOutput mongodProcess_ConsoleOutput0 = new MongodProcess.ConsoleOutput(inputStreamReader0);
      mongodProcess_ConsoleOutput0.run();
      assertFalse(mongodProcess_ConsoleOutput0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      Charset charset0 = Charset.defaultCharset();
      pushbackInputStream0.unread(325);
      InputStreamReader inputStreamReader0 = new InputStreamReader(pushbackInputStream0, charset0);
      MongodProcess.ConsoleOutput mongodProcess_ConsoleOutput0 = new MongodProcess.ConsoleOutput(inputStreamReader0);
      mongodProcess_ConsoleOutput0.run();
      assertEquals(0, mongodProcess_ConsoleOutput0.countStackFrames());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Version version0 = Version.V1_8_4;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 0, true, "V1_8_0_rc0");
      MockFile mockFile0 = new MockFile("V1_8_0_rc0");
      MongodExecutable mongodExecutable0 = new MongodExecutable(mongodConfig0, mockFile0);
      MongodProcess mongodProcess0 = null;
      try {
        mongodProcess0 = new MongodProcess(mongodConfig0, mongodExecutable0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/FileUtils
         //
         verifyException("de.flapdoodle.embedmongo.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Version version0 = Version.V2_1;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 5, true, "Could not delete temp db dir: ");
      MongodExecutable mongodExecutable0 = new MongodExecutable(mongodConfig0, (File) null);
      MongodProcess mongodProcess0 = null;
      try {
        mongodProcess0 = new MongodProcess(mongodConfig0, mongodExecutable0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Could not create Tempdir: Could not delete temp db dir: 
         //
         verifyException("de.flapdoodle.embedmongo.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Version version0 = Version.V1_8_4;
          MongodConfig mongodConfig0 = new MongodConfig(version0, (-1229), true);
          MockFile mockFile0 = new MockFile("");
          MongodExecutable mongodExecutable0 = new MongodExecutable(mongodConfig0, mockFile0);
          MongodProcess mongodProcess0 = null;
          try {
            mongodProcess0 = new MongodProcess(mongodConfig0, mongodExecutable0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/home/user\" \"execute\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.base/java.lang.SecurityManager.checkExec(SecurityManager.java:569)
             // java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1096)
             // java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1071)
             // de.flapdoodle.embedmongo.MongodProcess.<init>(MongodProcess.java:65)
             // jdk.internal.reflect.GeneratedConstructorAccessor69.newInstance(Unknown Source)
             // java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
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
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Version version0 = Version.V1_7_6;
          MongodConfig mongodConfig0 = new MongodConfig(version0, 104, false);
          File file0 = MockFile.createTempFile("C/|7", "C/|7");
          MongodExecutable mongodExecutable0 = new MongodExecutable(mongodConfig0, file0);
          MongodProcess mongodProcess0 = null;
          try {
            mongodProcess0 = new MongodProcess(mongodConfig0, mongodExecutable0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/tmp/C/|70C/|7\" \"execute\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1602)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.base/java.lang.SecurityManager.checkExec(SecurityManager.java:569)
             // java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1096)
             // java.base/java.lang.ProcessBuilder.start(ProcessBuilder.java:1071)
             // de.flapdoodle.embedmongo.MongodProcess.<init>(MongodProcess.java:65)
             // jdk.internal.reflect.GeneratedConstructorAccessor69.newInstance(Unknown Source)
             // java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
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
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Version version0 = Version.V1_8_0_rc0;
      MongodConfig mongodConfig0 = new MongodConfig(version0, 0, false);
      MongodProcess mongodProcess0 = null;
      try {
        mongodProcess0 = new MongodProcess(mongodConfig0, (MongodExecutable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.flapdoodle.embedmongo.MongodProcess", e);
      }
  }
}
