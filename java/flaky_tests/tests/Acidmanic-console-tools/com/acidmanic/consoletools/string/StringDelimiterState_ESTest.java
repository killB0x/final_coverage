/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 09:13:59 GMT 2022
 */

package com.acidmanic.consoletools.string;

import org.junit.Test;
import static org.junit.Assert.*;
import com.acidmanic.consoletools.string.StringDelimiterState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringDelimiterState_ESTest extends StringDelimiterState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringDelimiterState stringDelimiterState0 = new StringDelimiterState();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringDelimiterState stringDelimiterState0 = StringDelimiterState.finished();
      assertNotNull(stringDelimiterState0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringDelimiterState stringDelimiterState0 = StringDelimiterState.normal();
      assertNotNull(stringDelimiterState0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringDelimiterState stringDelimiterState0 = StringDelimiterState.inmatch(737);
      assertNotNull(stringDelimiterState0);
  }
}
