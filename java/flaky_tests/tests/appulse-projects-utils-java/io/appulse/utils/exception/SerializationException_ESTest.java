/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 05:49:40 GMT 2022
 */

package io.appulse.utils.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import io.appulse.utils.exception.SerializationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SerializationException_ESTest extends SerializationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException();
      SerializationException serializationException1 = new SerializationException("i*JjLwTt", serializationException0);
      assertFalse(serializationException1.equals((Object)serializationException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException();
      SerializationException serializationException1 = new SerializationException("", serializationException0, false, false);
      assertFalse(serializationException1.equals((Object)serializationException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException("");
      SerializationException serializationException1 = new SerializationException(serializationException0);
      assertFalse(serializationException1.equals((Object)serializationException0));
  }
}
