/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 22:22:37 GMT 2022
 */

package org.jivesoftware.smack.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jivesoftware.smack.util.DateFormatType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateFormatType_ESTest extends DateFormatType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateFormatType[] dateFormatTypeArray0 = DateFormatType.values();
      assertEquals(8, dateFormatTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateFormatType dateFormatType0 = DateFormatType.valueOf("XEP_0091_DATETIME");
      assertEquals(DateFormatType.XEP_0091_DATETIME, dateFormatType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateFormatType dateFormatType0 = DateFormatType.XEP_0082_DATETIME_PROFILE;
      String string0 = dateFormatType0.getFormatString();
      assertEquals("yyyy-MM-dd'T'HH:mm:ssZ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateFormatType dateFormatType0 = DateFormatType.XEP_0082_TIME_MILLIS_PROFILE;
      SimpleDateFormat simpleDateFormat0 = dateFormatType0.createFormatter();
      assertTrue(simpleDateFormat0.isLenient());
  }
}
