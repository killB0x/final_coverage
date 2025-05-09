/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 20:33:49 GMT 2022
 */

package info.michaelwittig.javaq.query.value.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import info.michaelwittig.javaq.query.type.Type;
import info.michaelwittig.javaq.query.type.impl.TypeList;
import info.michaelwittig.javaq.query.value.impl.ListValue;
import info.michaelwittig.javaq.query.value.impl.TimestampValue;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimestampValue_ESTest extends TimestampValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimestampValue.from(3365, 0, 0, (-1), 1318, 0, 1318, 350, 350);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // nanos > 999999999 or < 0
         //
         verifyException("java.sql.Timestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimestampValue timestampValue0 = TimestampValue.from(0, (-1375), (-802), 0, (-1), 0, 0, 3365, (-1375));
      assertEquals(1000000, TimestampValue.MILLIS_TO_NANOS);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimestampValue.froms((Collection<Timestamp>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.michaelwittig.javaq.query.value.impl.TimestampValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimestampValue.from((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("info.michaelwittig.javaq.query.value.impl.TimestampValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Timestamp timestamp0 = new Timestamp(1931L);
      TimestampValue timestampValue0 = TimestampValue.from(timestamp0);
      assertEquals(1000000, TimestampValue.MILLIS_TO_NANOS);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TimestampValue timestampValue0 = TimestampValue.from((Timestamp) null);
      String string0 = timestampValue0.toQ();
      assertEquals("0Np", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedHashSet<Timestamp> linkedHashSet0 = new LinkedHashSet<Timestamp>();
      ListValue<Timestamp, TypeList<Timestamp, Type<Timestamp>>> listValue0 = TimestampValue.froms((Collection<Timestamp>) linkedHashSet0);
      assertNotNull(listValue0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TimestampValue timestampValue0 = TimestampValue.from(951, 951, 951, 951, 951, 951, 951, 951, 951);
      String string0 = timestampValue0.toQ();
      assertEquals("1970.01.01D00:00:00.951951951", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ListValue<Timestamp, TypeList<Timestamp, Type<Timestamp>>> listValue0 = TimestampValue.froms((Timestamp[]) null);
      assertNotNull(listValue0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Timestamp timestamp0 = new Timestamp(1931L);
      TimestampValue timestampValue0 = TimestampValue.from((Date) timestamp0);
      assertEquals(1000000, TimestampValue.MILLIS_TO_NANOS);
  }
}
