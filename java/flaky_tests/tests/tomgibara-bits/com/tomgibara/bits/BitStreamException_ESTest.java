/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 00:33:10 GMT 2022
 */

package com.tomgibara.bits;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tomgibara.bits.BitStreamException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BitStreamException_ESTest extends BitStreamException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BitStreamException bitStreamException0 = new BitStreamException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BitStreamException bitStreamException0 = new BitStreamException("rx~-3Igf9}~8%");
      BitStreamException bitStreamException1 = new BitStreamException(bitStreamException0);
      assertFalse(bitStreamException1.equals((Object)bitStreamException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      BitStreamException bitStreamException0 = new BitStreamException("", mockThrowable0);
  }
}
