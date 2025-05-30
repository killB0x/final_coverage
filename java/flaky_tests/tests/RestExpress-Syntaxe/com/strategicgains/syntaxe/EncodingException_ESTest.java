/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 19:17:47 GMT 2022
 */

package com.strategicgains.syntaxe;

import org.junit.Test;
import static org.junit.Assert.*;
import com.strategicgains.syntaxe.EncodingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncodingException_ESTest extends EncodingException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EncodingException encodingException0 = new EncodingException("6`");
      MockThrowable mockThrowable0 = new MockThrowable("6`", encodingException0);
      EncodingException encodingException1 = new EncodingException("6`", mockThrowable0);
      assertFalse(encodingException1.equals((Object)encodingException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EncodingException encodingException0 = new EncodingException();
      EncodingException encodingException1 = new EncodingException(encodingException0);
      assertFalse(encodingException1.equals((Object)encodingException0));
  }
}
