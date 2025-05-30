/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:55:02 GMT 2022
 */

package com.imadcn.framework.idworker.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.imadcn.framework.idworker.exception.ConfigException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConfigException_ESTest extends ConfigException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("%t<");
      MockException mockException0 = new MockException("%t<", mockThrowable0);
      Throwable[] throwableArray0 = mockException0.getSuppressed();
      ConfigException configException0 = null;
      try {
        configException0 = new ConfigException("DI*%", throwableArray0);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = '%'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConfigException configException0 = null;
      try {
        configException0 = new ConfigException((String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConfigException configException0 = new ConfigException("", (Object[]) null);
      ConfigException configException1 = new ConfigException(configException0);
      assertFalse(configException1.equals((Object)configException0));
  }
}
