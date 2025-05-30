/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 05:35:26 GMT 2022
 */

package com.beeinstant.metrics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.beeinstant.metrics.Metrics;
import com.beeinstant.metrics.MetricsCollector;
import com.beeinstant.metrics.MetricsLogger;
import com.beeinstant.metrics.Unit;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MetricsLogger_ESTest extends MetricsLogger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("U", "U");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      Consumer<MetricsCollector> consumer0 = (Consumer<MetricsCollector>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      metricsLogger0.updateMetricsCollector("U", consumer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      hashMap0.clear();
      Map<String, String> map0 = metricsLogger0.getRootDimensions();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("U", "U");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      Map<String, String> map0 = metricsLogger0.getRootDimensions();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("U", "U");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      String[] stringArray0 = new String[0];
      Metrics metrics0 = metricsLogger0.extendMultipleDimensionsIncludeRoot(stringArray0);
      assertNotNull(metrics0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("U", "U");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      String[] stringArray0 = new String[0];
      Metrics metrics0 = metricsLogger0.extendMultipleDimensions(stringArray0);
      assertNotNull(metrics0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      Metrics metrics0 = metricsLogger0.extendDimensions(",");
      assertNotNull(metrics0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("L76NZ", "L76NZ");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.updateMetricsCollector((String) null, (Consumer<MetricsCollector>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      Unit unit0 = Unit.PERCENT;
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      metricsLogger0.record("j", (-1663.056562801553), unit0);
      // Undeclared exception!
      try { 
        metricsLogger0.stopTimer("j", 1770L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot stop a timer in a Recorder
         //
         verifyException("com.beeinstant.metrics.Recorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.stopTimer("", 60000L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.MetricsCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      metricsLogger0.incCounter("j", 9);
      // Undeclared exception!
      try { 
        metricsLogger0.startTimer("j");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot start a timer in a Counter
         //
         verifyException("com.beeinstant.metrics.Counter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.startTimer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      metricsLogger0.startTimer("j");
      Unit unit0 = Unit.MEGA_BIT_PER_SEC;
      // Undeclared exception!
      try { 
        metricsLogger0.record("j", 78.0, unit0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot record measurements in a Counter
         //
         verifyException("com.beeinstant.metrics.Timer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      Unit unit0 = Unit.BYTE;
      // Undeclared exception!
      try { 
        metricsLogger0.record("NQH~uW,i_O$NUdq", (-197.70211399), unit0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.MetricsCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      metricsLogger0.stopTimer("j", (-1678L));
      // Undeclared exception!
      try { 
        metricsLogger0.incCounter("j", 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot increase a counter in a Timer
         //
         verifyException("com.beeinstant.metrics.Timer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(":", ":");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.incCounter((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.incCounter("", 7);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.MetricsCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "j";
      // Undeclared exception!
      try { 
        metricsLogger0.extendMultipleDimensionsIncludeRoot(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.DimensionsUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "j";
      // Undeclared exception!
      try { 
        metricsLogger0.extendMultipleDimensions(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.DimensionsUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.extendDimensions("j");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.DimensionsUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MetricsLogger metricsLogger0 = null;
      try {
        metricsLogger0 = new MetricsLogger((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.beeinstant.metrics.MetricsLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      MetricsLogger metricsLogger0 = null;
      try {
        metricsLogger0 = new MetricsLogger(hashMap0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.DimensionsUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MetricsLogger metricsLogger0 = null;
      try {
        metricsLogger0 = new MetricsLogger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.beeinstant.metrics.DimensionsUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MetricsLogger metricsLogger0 = null;
      try {
        metricsLogger0 = new MetricsLogger(",");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.DimensionsUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(":", ":");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      metricsLogger0.incCounter(":", (-21));
      metricsLogger0.flushToString((Consumer<String>) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("W", "W");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.extendDimensions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.beeinstant.metrics.DimensionsUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.flush(2147483647L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.MetricsLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(":", ":");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      metricsLogger0.incCounter(":", 0);
      // Undeclared exception!
      try { 
        metricsLogger0.flushToString((Consumer<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.beeinstant.metrics.MetricsLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Ii1r+ro**2dNd", "Ii1r+ro**2dNd");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.extendMultipleDimensionsIncludeRoot((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.beeinstant.metrics.MetricsLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MetricsLogger metricsLogger0 = null;
      try {
        metricsLogger0 = new MetricsLogger();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.DimensionsUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Y", "Y");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      Unit unit0 = Unit.TERA_BIT_PER_SEC;
      // Undeclared exception!
      try { 
        metricsLogger0.record((String) null, (-594.06087), unit0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(" c7 ", " c7 ");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.startTimer(" c7 ");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/http/conn/HttpClientConnectionManager
         //
         verifyException("com.beeinstant.metrics.MetricsCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(":", ":");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.extendMultipleDimensions((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("j", "j");
      MetricsLogger metricsLogger0 = new MetricsLogger(hashMap0);
      // Undeclared exception!
      try { 
        metricsLogger0.stopTimer((String) null, 526L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MetricsLogger metricsLogger0 = new MetricsLogger("N=_/ai.mh7GD1");
  }
}
