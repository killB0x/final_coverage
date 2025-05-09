/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 22:00:38 GMT 2022
 */

package top.guokaicn.tools.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import top.guokaicn.tools.utils.DateUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1232), (-1232), (-1232), (-1232), (-1232));
      TimeZone timeZone0 = TimeZone.getTimeZone("yyyy-MM-dd HH:mm:ss");
      Locale locale0 = Locale.CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 62);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertEquals("Fri Apr 24 20:21:21 GMT 2015", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-1014), 0, (-348), 558, 0);
      Date date0 = DateUtils.addHours(mockDate0, 1501);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Thu Aug 17 10:18:00 GMT 1815", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(86400000L);
      Date date0 = DateUtils.addWeeks(mockDate0, 229);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Fri May 24 00:00:00 GMT 1974", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-53), (-22), (-22));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1232), (-1232), (-1232), (-1232), (-1232));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addMilliseconds(date0, 1);
      int int0 = DateUtils.intervalSeconds(date0, date1);
      assertFalse(date1.equals((Object)date0));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      int int0 = DateUtils.intervalMinutes(mockDate0, date0);
      assertEquals(226861702, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-497), (-497), (-497), 729, 0);
      String string0 = DateUtils.toStr(mockDate0, "4");
      assertEquals("4", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1109, 1109, (-3645));
      String string0 = DateUtils.toStr(mockDate0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = DateUtils.toDate("", "");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Date date0 = DateUtils.toDate("4", "4");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = DateUtils.parseDate("1802-04-03 21:32:33", "yyyy-MM-dd HH:mm:ss", "1802-04-03 21:32:33");
      assertEquals("1802-04-03 21:32:33", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2716), (-2716), (-2716), (-2716), (-2716));
      Date date0 = DateUtils.addDays(mockDate0, (-2716));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Wed Jun 23 22:44:00 GMT 1059", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1109, 1109, (-3645));
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.addDays(mockDate0, 0);
      int int0 = DateUtils.intervalSeconds(date1, date0);
      assertEquals((-363226049), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2716), (-2716), (-2716), (-2716), (-2716));
      Date date0 = DateUtils.addDays(mockDate0, (-2716));
      Date date1 = DateUtils.addMilliseconds(mockDate0, 6);
      int int0 = DateUtils.intervalMinutes(date0, date1);
      assertEquals("Wed Nov 29 22:44:00 GMT 1052", date1.toString());
      assertEquals((-3911040), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1259), (-1259), 0);
      int int0 = DateUtils.getYear(mockDate0);
      assertEquals(536, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1259), (-1259), 0);
      int int0 = DateUtils.getWeekOfMonth(mockDate0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      int int0 = DateUtils.getMonth(mockDate0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1280), (-5265), 693, (-1280), (-1280), (-5265));
      System.setCurrentTimeMillis(693);
      int int0 = DateUtils.getMinute(mockDate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-1), 0, 0, 2675);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      int int0 = DateUtils.getHour(date0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, (-1255));
      assertEquals("Fri Feb 14 20:00:26 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.toStr((Date) null, "yyyy-MM-dd");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.toDate("kaRq?", "kaRq?");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'R'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate((String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("", "", "H>lLu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'l'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 1997);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.intervalSeconds((Date) null, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.intervalMinutes((Date) null, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.getHour((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.getDayOfMonth((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 419);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, (-2359));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 2278);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, (-979));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, (-1346));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 487);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.toDate((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.toStr((Date) null, "*>W(:x1_g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'x'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1134), (-1134), 1150);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(0L);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate1, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2572, 2572, 2572);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 111, 111);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-1987), (-609), (-2274), 2014, 441);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-486), (-486), (-486), (-486), (-486), (-486));
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4337, 4337, 4337, 4337, 0, (-1));
      Date date0 = DateUtils.addMilliseconds(mockDate0, 365);
      int int0 = DateUtils.intervalSeconds(date0, mockDate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      int int0 = DateUtils.intervalSeconds(mockDate0, mockDate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MockDate mockDate0 = new MockDate(86400000L);
      int int0 = DateUtils.intervalMinutes(mockDate0, mockDate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, (-942));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("top.guokaicn.tools.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2335), (-2335), (-2335), (-2335), (-2978), 1977);
      Date date0 = DateUtils.addMonths(mockDate0, 1977);
      assertEquals("Fri Sep 30 15:54:57 GMT 638", date0.toString());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      int int0 = DateUtils.getDayOfMonth(mockDate0);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.getWeekOfMonth((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(1000L, DateUtils.MILLIONSECONDS_PER_SECOND);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-316), 0, 0, 0, 0);
      Date date0 = DateUtils.addYears(mockDate0, 0);
      assertEquals("Sat Dec 31 00:00:00 GMT 1583", date0.toString());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.getMonth((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.getYear((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      int int0 = DateUtils.getHour(mockDate0);
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = DateUtils.getMinute((Date) null);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = DateUtils.parseDate("|", "|", "");
      assertEquals("", string0);
  }
}
