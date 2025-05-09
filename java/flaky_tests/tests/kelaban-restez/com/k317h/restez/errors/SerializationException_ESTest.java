/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 01:53:08 GMT 2022
 */

package com.k317h.restez.errors;

import org.junit.Test;
import static org.junit.Assert.*;
import com.k317h.restez.errors.SerializationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SerializationException_ESTest extends SerializationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException("");
      MockThrowable mockThrowable0 = new MockThrowable(serializationException0);
      SerializationException serializationException1 = new SerializationException("", mockThrowable0);
      assertFalse(serializationException1.equals((Object)serializationException0));
  }
}
