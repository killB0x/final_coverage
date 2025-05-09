/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 17:43:55 GMT 2022
 */

package yahoofinance.histquotes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import yahoofinance.histquotes.HistQuotesRequest;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HistQuotesRequest_ESTest extends HistQuotesRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)HistQuotesRequest.DEFAULT_TO;
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      
      MockDate mockDate0 = new MockDate((-3538), 14, (-3538), 3077, 3077, 3077);
      Interval interval0 = Interval.MONTHLY;
      HistQuotesRequest histQuotesRequest0 = new HistQuotesRequest("", date0, mockDate0, interval0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1648,MONTH=9,WEEK_OF_YEAR=44,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=303,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=9,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HistQuotesRequest histQuotesRequest0 = new HistQuotesRequest("J6<Zk");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "J6<Zk");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      HistQuotesRequest histQuotesRequest1 = new HistQuotesRequest("J6<Zk", mockGregorianCalendar0, histQuotesRequest0.DEFAULT_FROM, histQuotesRequest0.DEFAULT_INTERVAL);
      histQuotesRequest1.getResult();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=J6<Zk,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=20,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Interval interval0 = Interval.MONTHLY;
      HistQuotesRequest histQuotesRequest0 = new HistQuotesRequest("", interval0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Interval interval0 = Interval.MONTHLY;
      HistQuotesRequest histQuotesRequest0 = null;
      try {
        histQuotesRequest0 = new HistQuotesRequest("}lYF'a!V)q", (Date) null, (Date) null, interval0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HistQuotesRequest histQuotesRequest0 = null;
      try {
        histQuotesRequest0 = new HistQuotesRequest("", (Date) null, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Interval interval0 = Interval.WEEKLY;
      HistQuotesRequest histQuotesRequest0 = null;
      try {
        histQuotesRequest0 = new HistQuotesRequest("W6<Zk", (Calendar) null, (Calendar) null, interval0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("yahoofinance.histquotes.HistQuotesRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Interval interval0 = Interval.DAILY;
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://ichart.yahoo.com/table.csv?s=yahoofinance.cookie.oathorigin&a=1&b=14&c=2014&d=1&e=14&f=2014&g=d&ignore=.csv");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "yahoofinance.cookie.oathorigin");
      HistQuotesRequest histQuotesRequest0 = new HistQuotesRequest("yahoofinance.cookie.oathorigin", mockDate0, mockDate0, interval0);
      List<HistoricalQuote> list0 = histQuotesRequest0.getResult();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      HistQuotesRequest histQuotesRequest0 = new HistQuotesRequest("e", gregorianCalendar0, gregorianCalendar0);
      try { 
        histQuotesRequest0.getResult();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: ichart.yahoo.com
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HistQuotesRequest histQuotesRequest0 = null;
      try {
        histQuotesRequest0 = new HistQuotesRequest("", (Calendar) null, (Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("yahoofinance.histquotes.HistQuotesRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      HistQuotesRequest histQuotesRequest0 = new HistQuotesRequest("MONTHLY", mockDate0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HistQuotesRequest histQuotesRequest0 = new HistQuotesRequest("W6<Zk");
      try { 
        histQuotesRequest0.getResult();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: ichart.yahoo.com
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }
}
