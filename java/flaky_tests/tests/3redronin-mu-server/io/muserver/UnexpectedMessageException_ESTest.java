/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 23:27:15 GMT 2022
 */

package io.muserver;

import org.junit.Test;
import static org.junit.Assert.*;
import io.muserver.Exchange;
import io.muserver.UnexpectedMessageException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnexpectedMessageException_ESTest extends UnexpectedMessageException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnexpectedMessageException unexpectedMessageException0 = new UnexpectedMessageException((Exchange) null, (Object) null);
  }
}
