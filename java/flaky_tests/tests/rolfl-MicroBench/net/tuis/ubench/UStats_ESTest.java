/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 08:31:32 GMT 2022
 */

package net.tuis.ubench;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.TimeUnit;
import net.tuis.ubench.UStats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UStats_ESTest extends UStats_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long[] longArray0 = new long[2];
      longArray0[0] = (long) (-1);
      longArray0[1] = 1989L;
      UStats uStats0 = new UStats("", "", (-1), longArray0);
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      String string0 = uStats0.formatResults(timeUnit0);
      assertEquals("Task  -> : (Unit: MILLISECONDS)\n  Count    :        2      Average  :   0.0010\n  Fastest  :  -0.0000      Slowest  :   0.0020\n  95Pctile :   0.0020      99Pctile :   0.0020\n  TimeBlock : -0.000 0.002\n  Histogram :     1     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     1\n", string0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = (long) 2;
      longArray0[1] = (long) 2;
      longArray0[2] = 10L;
      longArray0[3] = (long) 2;
      UStats uStats0 = new UStats("", "", 2, longArray0);
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      double[] doubleArray0 = uStats0.getZoneTimes(2, timeUnit0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertArrayEquals(new double[] {2.0E-6, 6.0E-6}, doubleArray0, 0.01);
      assertEquals(10L, uStats0.get95thPercentileNanos());
      assertEquals(10L, uStats0.get99thPercentileNanos());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[1] = (-2427L);
      UStats uStats0 = new UStats((String) null, (String) null, 674, longArray0);
      uStats0.getSuiteName();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(3, uStats0.getCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = (long) (-1);
      UStats uStats0 = new UStats("", "", (-1), longArray0);
      uStats0.getSuiteName();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals((-1L), uStats0.getFastestNanos());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UStats uStats0 = new UStats(">zS~ ~iK:(", "MuC=w67Z)(!", 729, (long[]) null);
      long long0 = uStats0.getSlowestNanos();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0, uStats0.getCount());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(">zS~ ~iK:(", uStats0.getSuiteName());
      assertEquals(0L, long0);
      assertEquals("MuC=w67Z)(!", uStats0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[0] = (long) (-1574);
      longArray0[1] = (long) (-1574);
      longArray0[2] = (long) (-1574);
      longArray0[3] = (long) (-1574);
      longArray0[4] = (long) (-1574);
      longArray0[5] = (long) (-1574);
      longArray0[6] = (long) (-1574);
      UStats uStats0 = new UStats("'B7Cd", "'B7Cd", (-1574), longArray0);
      long long0 = uStats0.getSlowestNanos();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals((-1574L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (long) 1;
      UStats uStats0 = new UStats("gue$P@9Oo`e@L", "gue$P@9Oo`e@L", 1, longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.getSlowest(timeUnit0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) (-557);
      longArray0[1] = (long) (-557);
      longArray0[2] = (long) (-557);
      longArray0[3] = (long) (-557);
      longArray0[4] = (long) (-557);
      longArray0[5] = (long) (-557);
      longArray0[6] = (long) (-557);
      longArray0[7] = (long) (-557);
      UStats uStats0 = new UStats("pct99", "pct99", (-557), longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.getSlowest(timeUnit0);
      assertEquals((-557.0), double0, 0.01);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long[] longArray0 = new long[0];
      UStats uStats0 = new UStats("", (String) null, 2147462015, longArray0);
      String string0 = uStats0.getName();
      assertNull(string0);
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0, uStats0.getCount());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) 5;
      longArray0[1] = (long) 5;
      longArray0[2] = (long) 5;
      longArray0[3] = (long) 5;
      longArray0[4] = (long) 5;
      longArray0[5] = (long) 5;
      longArray0[6] = (long) 5;
      longArray0[7] = (long) 5;
      UStats uStats0 = new UStats("", "", 5, longArray0);
      uStats0.getName();
      assertEquals(5L, uStats0.getAverageRawNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = (long) 2125344641;
      longArray0[1] = 2126429886L;
      longArray0[2] = (long) 2125344641;
      longArray0[3] = (long) 2125344641;
      UStats uStats0 = new UStats("KZnTo,kV}aQw)7.Cpo;", "KZnTo,kV}aQw)7.Cpo;", 0, longArray0);
      int int0 = uStats0.getIndex();
      assertEquals(2126429886L, uStats0.get95thPercentileNanos());
      assertEquals(TimeUnit.SECONDS, uStats0.getGoodUnit());
      assertEquals(0, int0);
      assertEquals(2126429886L, uStats0.get99thPercentileNanos());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UStats uStats0 = new UStats("", "", 1897, (long[]) null);
      int int0 = uStats0.getIndex();
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(1897, int0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0, uStats0.getCount());
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long[] longArray0 = new long[0];
      UStats uStats0 = new UStats(",", ",", (-1812), longArray0);
      int int0 = uStats0.getIndex();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals((-1812), int0);
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0, uStats0.getCount());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (long) 1;
      UStats uStats0 = new UStats("gue$P@9Oo`e@L", "gue$P@9Oo`e@L", 1, longArray0);
      long long0 = uStats0.getFastestNanos();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[0] = (long) (-1852);
      UStats uStats0 = new UStats("&M>A-`X*]", "&M>A-`X*]", (-1852), longArray0);
      long long0 = uStats0.getFastestNanos();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals((-1852L), long0);
      assertEquals(0L, uStats0.get95thPercentileNanos());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UStats uStats0 = new UStats("g@uthR", "=:zl>'Ej[Oiw", 1112, (long[]) null);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      double double0 = uStats0.getFastest(timeUnit0);
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(0.0, double0, 0.01);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0, uStats0.getCount());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals("g@uthR", uStats0.getSuiteName());
      assertEquals("=:zl>'Ej[Oiw", uStats0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[1] = (-2427L);
      UStats uStats0 = new UStats((String) null, (String) null, 674, longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.getFastest(timeUnit0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals((-2427.0), double0, 0.01);
      assertEquals(0L, uStats0.get95thPercentileNanos());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[1] = (-2427L);
      UStats uStats0 = new UStats((String) null, (String) null, 674, longArray0);
      int[] intArray0 = uStats0.getDoublingHistogram();
      assertEquals(65, intArray0.length);
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[0];
      UStats uStats0 = new UStats((String) null, (String) null, 2125344641, longArray0);
      long[] longArray1 = uStats0.getData();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0, longArray1.length);
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = (long) 4;
      longArray0[1] = (long) 4;
      longArray0[2] = (long) 4;
      longArray0[3] = (long) 4;
      UStats uStats0 = new UStats("9z}OI.(@H\"", "9z}OI.(@H\"", 4, longArray0);
      int int0 = uStats0.getCount();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long[] longArray0 = new long[2];
      longArray0[0] = (long) (-1);
      longArray0[1] = 1989L;
      UStats uStats0 = new UStats("", "", (-1), longArray0);
      long long0 = uStats0.getAverageRawNanos();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(1989L, uStats0.get95thPercentileNanos());
      assertEquals(994L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[] longArray0 = new long[9];
      longArray0[0] = (long) (-1265);
      UStats uStats0 = new UStats("z:t?Ux3,", "pct99", (-1265), longArray0);
      long long0 = uStats0.getAverageRawNanos();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals((-140L), long0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals("pct99", uStats0.getName());
      assertEquals("z:t?Ux3,", uStats0.getSuiteName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UStats uStats0 = new UStats("g@uthR", "=:zl>'Ej[Oiw", 1112, (long[]) null);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      double double0 = uStats0.getAverage(timeUnit0);
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals("=:zl>'Ej[Oiw", uStats0.getName());
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals("g@uthR", uStats0.getSuiteName());
      assertEquals(0, uStats0.getCount());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (long) 1;
      UStats uStats0 = new UStats("gue$P@9Oo`e@L", "gue$P@9Oo`e@L", 1, longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.getAverage(timeUnit0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) (-557);
      UStats uStats0 = new UStats("pct99", "pct99", (-557), longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.getAverage(timeUnit0);
      assertEquals((-69.0), double0, 0.01);
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (long) 4;
      UStats uStats0 = new UStats("%5d", "", 4, longArray0);
      long long0 = uStats0.get99thPercentileNanos();
      assertEquals("", uStats0.getName());
      assertEquals("%5d", uStats0.getSuiteName());
      assertEquals(4L, long0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = (long) (-1);
      longArray0[1] = (long) (-1);
      longArray0[2] = (long) (-1);
      longArray0[3] = (long) (-1);
      longArray0[4] = (long) (-1);
      UStats uStats0 = new UStats("", "", (-1), longArray0);
      long long0 = uStats0.get99thPercentileNanos();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (long) 1;
      UStats uStats0 = new UStats("gue$P@9Oo`e@L", "gue$P@9Oo`e@L", 1, longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.get99thPercentile(timeUnit0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) (-557);
      longArray0[1] = (long) (-557);
      longArray0[2] = (long) (-557);
      longArray0[3] = (long) (-557);
      longArray0[4] = (long) (-557);
      longArray0[5] = (long) (-557);
      longArray0[6] = (long) (-557);
      longArray0[7] = (long) (-557);
      UStats uStats0 = new UStats("pct99", "pct99", (-557), longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.get99thPercentile(timeUnit0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals((-557.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      long[] longArray0 = new long[9];
      longArray0[0] = (long) 3266;
      longArray0[1] = (long) 3266;
      longArray0[2] = (long) 3266;
      longArray0[3] = (long) 3266;
      longArray0[4] = (long) 3266;
      longArray0[5] = (long) 3266;
      longArray0[6] = (long) 3266;
      longArray0[7] = (long) 3266;
      longArray0[8] = (long) 3266;
      UStats uStats0 = new UStats("", (String) null, 3266, longArray0);
      long long0 = uStats0.get95thPercentileNanos();
      assertEquals(TimeUnit.MICROSECONDS, uStats0.getGoodUnit());
      assertEquals(3266L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) (-557);
      longArray0[1] = (long) (-557);
      longArray0[2] = (long) (-557);
      longArray0[3] = (long) (-557);
      longArray0[4] = (long) (-557);
      longArray0[5] = (long) (-557);
      longArray0[6] = (long) (-557);
      longArray0[7] = (long) (-557);
      UStats uStats0 = new UStats("pct99", "pct99", (-557), longArray0);
      long long0 = uStats0.get95thPercentileNanos();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals((-557L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UStats uStats0 = new UStats("", "", 1897, (long[]) null);
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      double double0 = uStats0.get95thPercentile(timeUnit0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0, uStats0.getCount());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) 1036;
      longArray0[1] = (long) 1036;
      longArray0[2] = (long) 1036;
      longArray0[3] = (long) 1036;
      longArray0[4] = (long) 1036;
      longArray0[5] = (long) 1036;
      longArray0[6] = (long) 1036;
      longArray0[7] = (-1L);
      UStats uStats0 = new UStats(">:XLUB", "", 1036, longArray0);
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      double double0 = uStats0.get95thPercentile(timeUnit0);
      assertEquals(1036L, uStats0.get99thPercentileNanos());
      assertEquals(1.7266666666666666E-8, double0, 0.01);
      assertEquals("", uStats0.getName());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(">:XLUB", uStats0.getSuiteName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = (long) (-1);
      longArray0[1] = (long) (-1);
      longArray0[2] = (long) (-1);
      longArray0[3] = (long) (-1);
      longArray0[4] = (long) (-1);
      UStats uStats0 = new UStats("", "", (-1), longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.get95thPercentile(timeUnit0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) (-1);
      UStats uStats0 = new UStats("", "", (-1), longArray0);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        uStats0.getZoneTimes((-1), timeUnit0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -1
         //
         verifyException("net.tuis.ubench.UStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (long) (-3371);
      UStats uStats0 = new UStats("!8W4&%Z.3R", "!8W4&%Z.3R", (-3371), longArray0);
      // Undeclared exception!
      try { 
        uStats0.get99thPercentile((TimeUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tuis.ubench.UStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 8640000000003L;
      longArray0[2] = (-724L);
      UStats uStats0 = null;
      try {
        uStats0 = new UStats("9n-sZRO^k^-8+r", "9n-sZRO^k^-8+r", 1, longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 64 out of bounds for length 64
         //
         verifyException("net.tuis.ubench.UStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long[] longArray0 = new long[10];
      UStats uStats0 = null;
      try {
        uStats0 = new UStats("CE>L*\"_4WP (TX}+ty{", "CE>L*\"_4WP (TX}+ty{", (-2145645038), longArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("net.tuis.ubench.UStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = (long) 4;
      longArray0[1] = (long) 4;
      longArray0[2] = (long) 4;
      longArray0[3] = (long) 4;
      longArray0[4] = (long) 4;
      UStats uStats0 = new UStats("PvV}![r+", "PvV}![r+", 4, longArray0);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      double[] doubleArray0 = uStats0.getZoneTimes(4, timeUnit0);
      assertArrayEquals(new double[] {1.1111111111111112E-12, 1.1111111111111112E-12, 1.1111111111111112E-12, 1.1111111111111112E-12}, doubleArray0, 0.01);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UStats uStats0 = new UStats(">zS~ ~iK:(", "MuC=w67Z)(!", 729, (long[]) null);
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      double[] doubleArray0 = uStats0.getZoneTimes(9, timeUnit0);
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals("MuC=w67Z)(!", uStats0.getName());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(">zS~ ~iK:(", uStats0.getSuiteName());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TimeUnit timeUnit0 = UStats.findBestUnit(8640000000000L);
      assertEquals(TimeUnit.DAYS, timeUnit0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) 5;
      longArray0[1] = (long) 5;
      longArray0[2] = (long) 5;
      longArray0[3] = (long) 5;
      longArray0[4] = (long) 5;
      longArray0[5] = (long) 5;
      longArray0[6] = (long) 5;
      longArray0[7] = (long) 5;
      UStats uStats0 = new UStats("", "", 5, longArray0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      double double0 = uStats0.getFastest(timeUnit0);
      assertEquals(5.0, double0, 0.01);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      long[] longArray0 = new long[0];
      UStats uStats0 = new UStats("fh%~J9a|/xkI-t", "fh%~J9a|/xkI-t", 0, longArray0);
      // Undeclared exception!
      try { 
        uStats0.get95thPercentile((TimeUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tuis.ubench.UStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UStats uStats0 = new UStats("", "", 1897, (long[]) null);
      int[] intArray0 = uStats0.getDoublingHistogram();
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0, uStats0.getCount());
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UStats uStats0 = new UStats(">zS~ ~iK:(", "MuC=w67Z)(!", 729, (long[]) null);
      long long0 = uStats0.getFastestNanos();
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(0, uStats0.getCount());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals("MuC=w67Z)(!", uStats0.getName());
      assertEquals(0L, long0);
      assertEquals(">zS~ ~iK:(", uStats0.getSuiteName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (long) (-3371);
      UStats uStats0 = new UStats("!8W4&%Z.3R", "!8W4&%Z.3R", (-3371), longArray0);
      // Undeclared exception!
      try { 
        uStats0.getAverage((TimeUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.tuis.ubench.UStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[0] = (long) 1036;
      longArray0[1] = (long) 1036;
      longArray0[2] = (long) 1036;
      longArray0[3] = (long) 1036;
      longArray0[4] = (long) 1036;
      longArray0[5] = (long) 1036;
      longArray0[6] = (long) 1036;
      longArray0[7] = (-1L);
      UStats uStats0 = new UStats(">:XLUB", "", 1036, longArray0);
      long long0 = uStats0.getSlowestNanos();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(1036L, uStats0.get95thPercentileNanos());
      assertEquals("", uStats0.getName());
      assertEquals(">:XLUB", uStats0.getSuiteName());
      assertEquals(1036L, long0);
      assertEquals(1036L, uStats0.get99thPercentileNanos());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UStats uStats0 = new UStats("", (String) null, 1577, (long[]) null);
      TimeUnit timeUnit0 = uStats0.getGoodUnit();
      assertEquals(TimeUnit.NANOSECONDS, timeUnit0);
      
      double double0 = uStats0.getSlowest(timeUnit0);
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0, uStats0.getCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      UStats uStats0 = new UStats("", (String) null, 1577, (long[]) null);
      long long0 = uStats0.get99thPercentileNanos();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0L, long0);
      assertEquals(0, uStats0.getCount());
      assertEquals(0L, uStats0.getFastestNanos());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UStats uStats0 = new UStats(">zS~ ~iK:(", "MuC=w67Z)(!", 729, (long[]) null);
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      double double0 = uStats0.get99thPercentile(timeUnit0);
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0, uStats0.getCount());
      assertEquals(">zS~ ~iK:(", uStats0.getSuiteName());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals("MuC=w67Z)(!", uStats0.getName());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0L, uStats0.getSlowestNanos());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UStats uStats0 = new UStats(">zS~ ~iK:(", "MuC=w67Z)(!", 729, (long[]) null);
      int int0 = uStats0.getCount();
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(">zS~ ~iK:(", uStats0.getSuiteName());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals("MuC=w67Z)(!", uStats0.getName());
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UStats uStats0 = new UStats("", (String) null, 1577, (long[]) null);
      long long0 = uStats0.get95thPercentileNanos();
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0, uStats0.getCount());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, uStats0.getAverageRawNanos());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[0] = (long) (-1574);
      UStats uStats0 = new UStats("'B7Cd", "'B7Cd", (-1574), longArray0);
      TimeUnit timeUnit0 = UStats.findBestUnit(0L);
      String string0 = uStats0.formatResults(timeUnit0);
      assertEquals("Task 'B7Cd -> 'B7Cd: (Unit: NANOSECONDS)\n  Count    :          7      Average  :  -224.0000\n  Fastest  : -1574.0000      Slowest  :     0.0000\n  95Pctile :     0.0000      99Pctile :     0.0000\n  TimeBlock : -1574.000 0.000 0.000 0.000 0.000 0.000 0.000\n  Histogram :     1     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     0     6\n", string0);
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      long[] longArray0 = new long[0];
      UStats uStats0 = new UStats(",", ",", (-1812), longArray0);
      String string0 = uStats0.toString();
      assertEquals("Task , -> ,: (Unit: NANOSECONDS)\n  Count    :        0      Average  :   0.0000\n  Fastest  :   0.0000      Slowest  :   0.0000\n  95Pctile :   0.0000      99Pctile :   0.0000\n  TimeBlock : \n  Histogram : \n", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      UStats uStats0 = new UStats(">zS~ ~iK:(", "MuC=w67Z)(!", 729, (long[]) null);
      long long0 = uStats0.getAverageRawNanos();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(0L, uStats0.getFastestNanos());
      assertEquals(0, uStats0.getCount());
      assertEquals(0L, uStats0.get99thPercentileNanos());
      assertEquals(0L, uStats0.getSlowestNanos());
      assertEquals(0L, long0);
      assertEquals("MuC=w67Z)(!", uStats0.getName());
      assertEquals(">zS~ ~iK:(", uStats0.getSuiteName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = 8640000000014L;
      UStats uStats0 = new UStats(" !PHeL", " !PHeL", 0, longArray0);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      // Undeclared exception!
      try { 
        uStats0.getZoneTimes(0, timeUnit0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("net.tuis.ubench.UStats", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = UStats.getJSONFields();
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[0] = (long) (-1574);
      UStats uStats0 = new UStats("'B7Cd", "'B7Cd", (-1574), longArray0);
      uStats0.getSuiteName();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals((-224L), uStats0.getAverageRawNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[0] = (long) 1595;
      longArray0[1] = (long) 1595;
      longArray0[2] = (long) 1595;
      longArray0[3] = (long) 1595;
      longArray0[4] = (long) 1595;
      longArray0[5] = (long) 1595;
      UStats uStats0 = new UStats("UJ5OiB&G<u6Bo", "UJ5OiB&G<u6Bo", 1595, longArray0);
      uStats0.getData();
      assertEquals(TimeUnit.MICROSECONDS, uStats0.getGoodUnit());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[0] = (long) (-1574);
      UStats uStats0 = new UStats("'B7Cd", "'B7Cd", (-1574), longArray0);
      uStats0.getName();
      assertEquals(0L, uStats0.get95thPercentileNanos());
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals(7, uStats0.getCount());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = (long) 2;
      longArray0[1] = (long) 2;
      longArray0[2] = 10L;
      longArray0[3] = (long) 2;
      UStats uStats0 = new UStats("", "", 2, longArray0);
      String string0 = uStats0.toJSONString();
      assertEquals(TimeUnit.NANOSECONDS, uStats0.getGoodUnit());
      assertEquals("{index: 2, fastest: 2, slowest: 10, average: 4, pct95: 10, pct99: 10, count: 4}", string0);
  }
}
