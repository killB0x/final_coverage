/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 12:18:07 GMT 2022
 */

package com.j256.simplemagic.types;

import org.junit.Test;
import static org.junit.Assert.*;
import com.j256.simplemagic.types.LittleEndianString16Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LittleEndianString16Type_ESTest extends LittleEndianString16Type_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LittleEndianString16Type littleEndianString16Type0 = new LittleEndianString16Type();
      char char0 = littleEndianString16Type0.bytesToChar((-1170), 14);
      assertEquals('\u096E', char0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LittleEndianString16Type littleEndianString16Type0 = new LittleEndianString16Type();
      char char0 = littleEndianString16Type0.bytesToChar(8, (-1107));
      assertEquals('\uAD08', char0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LittleEndianString16Type littleEndianString16Type0 = new LittleEndianString16Type();
      char char0 = littleEndianString16Type0.bytesToChar(0, 0);
      assertEquals('\u0000', char0);
  }
}
