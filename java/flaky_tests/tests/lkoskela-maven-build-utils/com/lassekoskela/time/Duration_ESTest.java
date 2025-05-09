/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 15 18:06:28 GMT 2022
 */

package com.lassekoskela.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lassekoskela.time.Duration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Duration_ESTest extends Duration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Duration duration0 = new Duration((-2973L));
      String string0 = duration0.toString();
      assertEquals("", string0);
      assertEquals((-2.973), duration0.inSeconds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Duration duration0 = new Duration(2212L);
      Duration duration1 = new Duration(1476L);
      boolean boolean0 = duration0.equals(duration1);
      assertFalse(boolean0);
      assertEquals(1.476, duration1.inSeconds(), 0.01);
      assertFalse(duration1.equals((Object)duration0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Duration duration1 = new Duration(3600000L);
      double double0 = duration0.percentageOf(duration1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Duration duration0 = new Duration((-626L));
      double double0 = duration0.percentageOf(duration0);
      assertEquals(100.0, double0, 0.01);
      assertEquals((-0.626), duration0.inSeconds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = new Duration(1091L);
      Duration duration1 = new Duration((-482L));
      double double0 = duration0.percentageOf(duration1);
      assertEquals((-482L), duration1.inMillis());
      assertEquals((-226.34854771784234), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      double double0 = duration0.percentageOf(1L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = new Duration(705L);
      double double0 = duration0.percentageOf(1545L);
      assertEquals(45.63106796116505, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = new Duration(545L);
      double double0 = duration0.inSeconds();
      assertEquals(0.545, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = new Duration((-1292L));
      double double0 = duration0.inSeconds();
      assertEquals((-1.292), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      long long0 = duration0.inMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = new Duration(705L);
      long long0 = duration0.inMillis();
      assertEquals(705L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = new Duration((-617L));
      // Undeclared exception!
      try { 
        duration0.percentageOf((Duration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lassekoskela.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      // Undeclared exception!
      try { 
        duration0.equals((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lassekoskela.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = new Duration(705L);
      double double0 = duration0.percentageOf((-2081L));
      assertEquals((-33.87794329649207), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = new Duration((-626L));
      long long0 = duration0.inMillis();
      assertEquals((-626L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = new Duration(2338L);
      String string0 = duration0.toString();
      assertEquals("2s 338ms", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = new Duration(60000L);
      String string0 = duration0.toString();
      assertEquals("1m", string0);
      assertEquals(60000L, duration0.inMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = new Duration(3600000L);
      String string0 = duration0.toString();
      assertEquals(3600000L, duration0.inMillis());
      assertEquals("1h", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = new Duration((-161L));
      Duration duration1 = new Duration(88L);
      boolean boolean0 = duration0.equals(duration1);
      assertFalse(boolean0);
      assertFalse(duration1.equals((Object)duration0));
      assertEquals(0.088, duration1.inSeconds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Object object0 = new Object();
      boolean boolean0 = duration0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = new Duration((-161L));
      boolean boolean0 = duration0.equals(duration0);
      assertTrue(boolean0);
      assertEquals((-0.161), duration0.inSeconds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Duration duration0 = new Duration((-2973L));
      // Undeclared exception!
      try { 
        duration0.hashCode();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Objects
         //
         verifyException("com.lassekoskela.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      double double0 = duration0.inSeconds();
      assertEquals(0.0, double0, 0.01);
  }
}
