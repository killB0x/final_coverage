/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 01:09:07 GMT 2022
 */

package net.jhorstmann.packedtime;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import net.jhorstmann.packedtime.PackedZonedDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PackedZonedDateTime_ESTest extends PackedZonedDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now((ZoneId) zoneOffset0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      String string0 = packedZonedDateTime0.toString();
      assertEquals("2014-02-15T14:21:21.320+18:00", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.parse("2014-02-14T20:21:21.320Z");
      assertEquals(14, packedZonedDateTime0.getDay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(0L);
      int int0 = packedZonedDateTime0.getYear();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      int int0 = packedZonedDateTime0.getYear();
      assertEquals(2014, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      int int0 = packedZonedDateTime0.getSecond();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(0L);
      int int0 = packedZonedDateTime0.getNano();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(1L);
      int int0 = packedZonedDateTime0.getMonth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(354L);
      int int0 = packedZonedDateTime0.getMinute();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(0L);
      int int0 = packedZonedDateTime0.getMilliSecond();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      int int0 = packedZonedDateTime0.getHour();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(0L);
      int int0 = packedZonedDateTime0.getDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Month month0 = Month.MARCH;
      LocalDateTime localDateTime0 = MockLocalDateTime.of(0, month0, 18, 10, 18, 18, 10);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(10);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.ofInstant(localDateTime0, zoneOffset0, (ZoneId) zoneOffset0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      assertEquals(18, packedZonedDateTime0.getDay());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(0L, 4095L);
      ZoneId zoneId0 = ZoneId.systemDefault();
      ZonedDateTime zonedDateTime0 = MockInstant.atZone(instant0, zoneId0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      assertEquals(0, packedZonedDateTime0.getHour());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        PackedZonedDateTime.toZonedDateTime(0L);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Invalid value for MonthOfYear (valid values 1 - 12): 0
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        PackedZonedDateTime.toZonedDateTime((-1L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4095 out of bounds for length 4095
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime$ZoneAndOffsetCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf((-1L));
      // Undeclared exception!
      try { 
        packedZonedDateTime0.toZonedDateTime();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4095 out of bounds for length 4095
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime$ZoneAndOffsetCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(1323L);
      // Undeclared exception!
      try { 
        packedZonedDateTime0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf((-1L));
      // Undeclared exception!
      try { 
        packedZonedDateTime0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4095 out of bounds for length 4095
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime$ZoneAndOffsetCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        PackedZonedDateTime.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // text
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(802L);
      // Undeclared exception!
      try { 
        packedZonedDateTime0.getZone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf((-1L));
      // Undeclared exception!
      try { 
        packedZonedDateTime0.getZone();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4095 out of bounds for length 4095
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime$ZoneAndOffsetCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(3462L);
      // Undeclared exception!
      try { 
        packedZonedDateTime0.getOffset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(4095L);
      // Undeclared exception!
      try { 
        packedZonedDateTime0.getOffset();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4095 out of bounds for length 4095
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime$ZoneAndOffsetCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        PackedZonedDateTime.fromZonedDateTime((ZonedDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime$ZoneAndOffsetCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      String string0 = packedZonedDateTime0.toString();
      assertEquals("2014-02-14T20:21:21.320Z[GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      Clock clock0 = MockClock.system(zoneOffset0);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      String string0 = packedZonedDateTime0.toString();
      assertEquals("2014-02-14T02:21:21.320-18:00", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(1);
      // Undeclared exception!
      try { 
        packedZonedDateTime0.toZonedDateTime();
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Invalid value for MonthOfYear (valid values 1 - 12): 0
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      ZonedDateTime zonedDateTime1 = packedZonedDateTime0.toZonedDateTime();
      assertTrue(zonedDateTime1.equals((Object)zonedDateTime0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      PackedZonedDateTime.ZoneAndOffsetCache packedZonedDateTime_ZoneAndOffsetCache0 = new PackedZonedDateTime.ZoneAndOffsetCache();
      int int0 = packedZonedDateTime_ZoneAndOffsetCache0.getId(zonedDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      PackedZonedDateTime.ZoneAndOffset packedZonedDateTime_ZoneAndOffset0 = new PackedZonedDateTime.ZoneAndOffset((ZoneId) null, zoneOffset0);
      boolean boolean0 = packedZonedDateTime_ZoneAndOffset0.equals(zoneOffset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutesSeconds((-1), (-1), (-1));
      PackedZonedDateTime.ZoneAndOffset packedZonedDateTime_ZoneAndOffset0 = new PackedZonedDateTime.ZoneAndOffset(zoneOffset0, zoneOffset0);
      boolean boolean0 = packedZonedDateTime_ZoneAndOffset0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PackedZonedDateTime.ZoneAndOffsetCache packedZonedDateTime_ZoneAndOffsetCache0 = new PackedZonedDateTime.ZoneAndOffsetCache();
      PackedZonedDateTime.ZoneAndOffset packedZonedDateTime_ZoneAndOffset0 = packedZonedDateTime_ZoneAndOffsetCache0.getZoneId(1);
      assertNull(packedZonedDateTime_ZoneAndOffset0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(0L);
      int int0 = packedZonedDateTime0.getSecond();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      int int0 = packedZonedDateTime0.getMinute();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      int int0 = packedZonedDateTime0.getNano();
      assertEquals(320000000, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf((-253L));
      int int0 = packedZonedDateTime0.getYear();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      ZoneId zoneId0 = packedZonedDateTime0.getZone();
      assertNotNull(zoneId0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now((ZoneId) zoneOffset0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      int int0 = packedZonedDateTime0.getMilliSecond();
      assertEquals(320, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        PackedZonedDateTime.toZonedDateTime((-1017L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.jhorstmann.packedtime.PackedZonedDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      int int0 = packedZonedDateTime0.getMonth();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.valueOf(0L);
      int int0 = packedZonedDateTime0.getHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        PackedZonedDateTime.parse("ZwG%AQ3QiK\"n;/3");
        fail("Expecting exception: DateTimeParseException");
      
      } catch(DateTimeParseException e) {
         //
         // Text 'ZwG%AQ3QiK\"n;/3' could not be parsed at index 0
         //
         verifyException("java.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      ZoneOffset zoneOffset0 = packedZonedDateTime0.getOffset();
      assertNotNull(zoneOffset0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      PackedZonedDateTime packedZonedDateTime0 = PackedZonedDateTime.fromZonedDateTime(zonedDateTime0);
      int int0 = packedZonedDateTime0.getDay();
      assertEquals(14, int0);
  }
}
