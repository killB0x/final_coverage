/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 12:22:06 GMT 2022
 */

package com.j256.simplemagic.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.j256.simplemagic.endian.EndianType;
import com.j256.simplemagic.types.UtcDateType;
import java.text.DateFormat;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UtcDateType_ESTest extends UtcDateType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EndianType endianType0 = EndianType.BIG;
      UtcDateType utcDateType0 = new UtcDateType(endianType0);
      utcDateType0.assisgnTimeZone(utcDateType0.DATE_FORMAT);
      assertEquals(4, utcDateType0.getBytesPerType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UtcDateType utcDateType0 = null;
      try {
        utcDateType0 = new UtcDateType((EndianType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.j256.simplemagic.types.NumberType", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EndianType endianType0 = EndianType.BIG;
      UtcDateType utcDateType0 = new UtcDateType(endianType0);
      // Undeclared exception!
      try { 
        utcDateType0.assisgnTimeZone((DateFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.j256.simplemagic.types.UtcDateType", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      UtcDateType utcDateType0 = new UtcDateType(endianType0);
      Date date0 = utcDateType0.dateFromExtractedValue(1715L);
      assertEquals("Thu Jan 01 00:28:35 GMT 1970", date0.toString());
  }
}
