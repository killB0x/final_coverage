/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 02:58:02 GMT 2022
 */

package io.github.hengyunabc.metrics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.hengyunabc.metrics.ThreadFactoryBuilder;
import java.util.DuplicateFormatFlagsException;
import java.util.FormatFlagsConversionMismatchException;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatWidthException;
import java.util.MissingFormatArgumentException;
import java.util.MissingFormatWidthException;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.ThreadFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ThreadFactoryBuilder_ESTest extends ThreadFactoryBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      String string0 = ThreadFactoryBuilder.format("Thread priority (%s) must be <= %s", objectArray0);
      assertEquals("Thread priority (null) must be <= null [null]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      ThreadFactoryBuilder threadFactoryBuilder1 = threadFactoryBuilder0.setPriority(10);
      assertSame(threadFactoryBuilder1, threadFactoryBuilder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = mock(Thread.UncaughtExceptionHandler.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(thread_UncaughtExceptionHandler0).toString();
      ThreadFactoryBuilder threadFactoryBuilder1 = threadFactoryBuilder0.setUncaughtExceptionHandler(thread_UncaughtExceptionHandler0);
      assertSame(threadFactoryBuilder0, threadFactoryBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      String string0 = ThreadFactoryBuilder.format("", objectArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setNameFormat("m+w@PD!~/xxer:L%W<");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'W'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setNameFormat("i#w% -xVUUyu):o");
        fail("Expecting exception: MissingFormatWidthException");
      
      } catch(MissingFormatWidthException e) {
         //
         // %- x
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setNameFormat("Thread priority (%s) must be >= %s");
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%s'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setNameFormat("sZhy%8n2o@o$+0^S [null, null, null, null, null, null, null, null, null]");
        fail("Expecting exception: IllegalFormatWidthException");
      
      } catch(IllegalFormatWidthException e) {
         //
         // 8
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setNameFormat("TJ8#!N|%,x]`jBV");
        fail("Expecting exception: FormatFlagsConversionMismatchException");
      
      } catch(FormatFlagsConversionMismatchException e) {
         //
         // Conversion = x, Flags = ,
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setNameFormat("R2Rjj4EL%((67J31");
        fail("Expecting exception: DuplicateFormatFlagsException");
      
      } catch(DuplicateFormatFlagsException e) {
         //
         // Flags = '('
         //
         verifyException("java.util.Formatter$Flags", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setNameFormat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadFactoryBuilder.format((String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.hengyunabc.metrics.ThreadFactoryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ThreadFactoryBuilder.checkNotNull((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.hengyunabc.metrics.ThreadFactoryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      Object object0 = ThreadFactoryBuilder.checkNotNull((Object) threadFactoryBuilder0);
      assertSame(threadFactoryBuilder0, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      String string0 = ThreadFactoryBuilder.format("", objectArray0);
      assertEquals(" [null, null, null, null, null, null, null, null, null, null, null, null]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      threadFactoryBuilder0.setNameFormat("io.github.hengyunabc.metrics.ThreadFactoryBuilder");
      ThreadFactory threadFactory0 = threadFactoryBuilder0.build();
      assertNotNull(threadFactory0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setPriority(1352);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Thread priority (1352) must be <= 10
         //
         verifyException("io.github.hengyunabc.metrics.ThreadFactoryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      ThreadFactoryBuilder threadFactoryBuilder1 = threadFactoryBuilder0.setPriority(1);
      assertSame(threadFactoryBuilder0, threadFactoryBuilder1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setPriority((-1895));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Thread priority (-1895) must be >= 1
         //
         verifyException("io.github.hengyunabc.metrics.ThreadFactoryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setThreadFactory((ThreadFactory) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.hengyunabc.metrics.ThreadFactoryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.hengyunabc.metrics.ThreadFactoryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      // Undeclared exception!
      try { 
        threadFactoryBuilder0.setNameFormat("2X$(%e&l,eK6v^");
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // e != java.lang.Integer
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      ThreadFactoryBuilder threadFactoryBuilder1 = threadFactoryBuilder0.setDaemon(false);
      assertSame(threadFactoryBuilder0, threadFactoryBuilder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ThreadFactoryBuilder threadFactoryBuilder0 = new ThreadFactoryBuilder();
      ThreadFactory threadFactory0 = threadFactoryBuilder0.build();
      ThreadFactoryBuilder threadFactoryBuilder1 = threadFactoryBuilder0.setThreadFactory(threadFactory0);
      ThreadFactory threadFactory1 = threadFactoryBuilder1.build();
      assertNotSame(threadFactory0, threadFactory1);
  }
}
