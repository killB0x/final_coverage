/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 12:18:47 GMT 2022
 */

package com.j256.simplemagic.types;

import org.junit.Test;
import static org.junit.Assert.*;
import com.j256.simplemagic.endian.EndianType;
import com.j256.simplemagic.types.UtcLongDateType;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UtcLongDateType_ESTest extends UtcLongDateType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      UtcLongDateType utcLongDateType0 = new UtcLongDateType(endianType0);
      int int0 = utcLongDateType0.getBytesPerType();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EndianType endianType0 = EndianType.MIDDLE;
      UtcLongDateType utcLongDateType0 = new UtcLongDateType(endianType0);
      Date date0 = utcLongDateType0.dateFromExtractedValue(0L);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }
}
