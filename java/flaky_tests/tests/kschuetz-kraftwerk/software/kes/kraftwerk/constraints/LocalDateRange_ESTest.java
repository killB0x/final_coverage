/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 07:27:45 GMT 2022
 */

package software.kes.kraftwerk.constraints;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;
import software.kes.kraftwerk.constraints.LocalDateRange;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalDateRange_ESTest extends LocalDateRange_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate1 = MockLocalDate.now((ZoneId) zoneOffset0);
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate1);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      localDateRange0.forEach(consumer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      LocalDateRange localDateRange1 = localDateRange0.withMinInclusive(localDate0);
      assertNotSame(localDateRange0, localDateRange1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      LocalDateRange localDateRange1 = localDateRange0.withMaxInclusive(localDate0);
      assertNotSame(localDateRange1, localDateRange0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDate localDate1 = MockLocalDate.ofEpochDay((-1L));
      LocalDateRange localDateRange0 = LocalDateRange.exclusive(localDate1, localDate0);
      LocalDateRange localDateRange1 = localDateRange0.withMaxExclusive(localDate0);
      assertTrue(localDateRange1.equals((Object)localDateRange0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDate localDate1 = MockLocalDate.ofEpochDay(0L);
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate1, localDate1);
      // Undeclared exception!
      try { 
        localDateRange0.withMinInclusive(localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max must be >= min
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      LocalDate localDate1 = MockLocalDate.ofEpochDay((-377L));
      // Undeclared exception!
      try { 
        localDateRange0.withMaxInclusive(localDate1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max must be >= min
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      // Undeclared exception!
      try { 
        localDateRange0.withMaxExclusive((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateRange.inclusive((LocalDate) null, (LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDate localDate1 = MockLocalDate.ofYearDay(107, 107);
      // Undeclared exception!
      try { 
        LocalDateRange.inclusive(localDate0, localDate1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max must be >= min
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      // Undeclared exception!
      try { 
        localDateRange0.includes((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("software.kes.kraftwerk.constraints.LocalDateRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      // Undeclared exception!
      try { 
        LocalDateRange.exclusive(localDate0, localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max must be > min
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      LocalDate localDate1 = MockLocalDate.ofYearDay(1, 1);
      LocalDateRange localDateRange1 = LocalDateRange.inclusive(localDate1, localDate1);
      boolean boolean0 = localDateRange1.equals(localDateRange0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      LocalDateRange localDateRange1 = LocalDateRange.inclusive(localDate0, localDate0);
      boolean boolean0 = localDateRange0.equals(localDateRange1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      boolean boolean0 = localDateRange0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      boolean boolean0 = localDateRange0.equals(localDateRange0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      boolean boolean0 = localDateRange0.equals(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDate localDate1 = MockLocalDate.ofEpochDay((-1L));
      LocalDateRange localDateRange0 = LocalDateRange.exclusive(localDate1, localDate0);
      boolean boolean0 = localDateRange0.includes(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      boolean boolean0 = localDateRange0.includes(localDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      LocalDate localDate1 = MockLocalDate.ofEpochDay((-377L));
      boolean boolean0 = localDateRange0.includes(localDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      localDateRange0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      LocalDate localDate1 = localDateRange0.minInclusive();
      assertSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      // Undeclared exception!
      try { 
        localDateRange0.withMaxExclusive(localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // max must be > min
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      LocalDate localDate1 = localDateRange0.maxInclusive();
      assertSame(localDate0, localDate1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      // Undeclared exception!
      try { 
        localDateRange0.withMaxInclusive((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateRange.exclusive((LocalDate) null, (LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("software.kes.kraftwerk.constraints.RangeInputValidation", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      // Undeclared exception!
      try { 
        localDateRange0.withMinInclusive((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.time.chrono.ChronoLocalDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      String string0 = localDateRange0.toString();
      assertEquals("LocalDateRange{2014-02-14 .. 2014-02-14}", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      Period period0 = localDateRange0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDateRange.LocalDateRangeFrom localDateRange_LocalDateRangeFrom0 = LocalDateRange.from((LocalDate) null);
      assertNotNull(localDateRange_LocalDateRangeFrom0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalDateRange localDateRange0 = LocalDateRange.inclusive(localDate0, localDate0);
      Iterator<LocalDate> iterator0 = localDateRange0.iterator();
      assertNotNull(iterator0);
  }
}
