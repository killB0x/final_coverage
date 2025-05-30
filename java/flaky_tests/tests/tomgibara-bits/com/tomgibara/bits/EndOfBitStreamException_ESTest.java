/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 00:31:33 GMT 2022
 */

package com.tomgibara.bits;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tomgibara.bits.EndOfBitStreamException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EndOfBitStreamException_ESTest extends EndOfBitStreamException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EndOfBitStreamException endOfBitStreamException0 = new EndOfBitStreamException("JpJ?J!|J5~");
      EndOfBitStreamException endOfBitStreamException1 = new EndOfBitStreamException(endOfBitStreamException0);
      assertFalse(endOfBitStreamException1.equals((Object)endOfBitStreamException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EndOfBitStreamException endOfBitStreamException0 = new EndOfBitStreamException("JpJ?J!|J5~");
      EndOfBitStreamException endOfBitStreamException1 = new EndOfBitStreamException("&W#~pC6w]", endOfBitStreamException0);
      assertFalse(endOfBitStreamException1.equals((Object)endOfBitStreamException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EndOfBitStreamException endOfBitStreamException0 = new EndOfBitStreamException();
  }
}
