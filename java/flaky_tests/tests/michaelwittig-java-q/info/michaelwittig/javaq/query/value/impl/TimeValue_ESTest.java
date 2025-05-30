/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 20:34:49 GMT 2022
 */

package info.michaelwittig.javaq.query.value.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import info.michaelwittig.javaq.query.type.Type;
import info.michaelwittig.javaq.query.type.impl.TypeList;
import info.michaelwittig.javaq.query.value.impl.ListValue;
import info.michaelwittig.javaq.query.value.impl.TimeValue;
import java.sql.Time;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeValue_ESTest extends TimeValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeValue timeValue0 = TimeValue.from(0, 2858, 1, 1);
      assertEquals(3600000L, TimeValue.HOURS_TO_MILLIS);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeValue timeValue0 = TimeValue.from(0, 0, (-3274), 0);
      assertEquals(3600000L, TimeValue.HOURS_TO_MILLIS);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeValue timeValue0 = TimeValue.from((-1928), (-1928), 0, 0);
      assertEquals(60000L, TimeValue.MINUTES_TO_MILLIS);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeValue.froms((Collection<Time>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.michaelwittig.javaq.query.value.impl.TimeValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Time time0 = new Time(0L);
      TimeValue timeValue0 = TimeValue.from(time0);
      assertEquals(1000L, TimeValue.SECONDS_TO_MILLIS);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TimeValue timeValue0 = TimeValue.from((Time) null);
      String string0 = timeValue0.toQ();
      assertEquals("0Nt", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TimeValue timeValue0 = TimeValue.from((-1), 0, 0, 0);
      String string0 = timeValue0.toQ();
      assertEquals("23:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Time[] timeArray0 = new Time[4];
      ListValue<Time, TypeList<Time, Type<Time>>> listValue0 = TimeValue.froms(timeArray0);
      assertNotNull(listValue0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedHashSet<Time> linkedHashSet0 = new LinkedHashSet<Time>();
      ListValue<Time, TypeList<Time, Type<Time>>> listValue0 = TimeValue.froms((Collection<Time>) linkedHashSet0);
      assertNotNull(listValue0);
  }
}
