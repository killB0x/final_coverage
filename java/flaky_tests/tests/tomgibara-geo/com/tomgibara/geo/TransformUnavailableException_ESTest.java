/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 11:20:37 GMT 2022
 */

package com.tomgibara.geo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tomgibara.geo.TransformUnavailableException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TransformUnavailableException_ESTest extends TransformUnavailableException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransformUnavailableException transformUnavailableException0 = new TransformUnavailableException("");
      TransformUnavailableException transformUnavailableException1 = new TransformUnavailableException(transformUnavailableException0);
      assertFalse(transformUnavailableException1.equals((Object)transformUnavailableException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      TransformUnavailableException transformUnavailableException0 = new TransformUnavailableException("@:Q1av?jkI~<e|b", mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TransformUnavailableException transformUnavailableException0 = new TransformUnavailableException();
  }
}
