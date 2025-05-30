/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 00:58:35 GMT 2022
 */

package org.jfaster.mango.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.parser.EmptyObjectException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmptyObjectException_ESTest extends EmptyObjectException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyObjectException emptyObjectException0 = new EmptyObjectException("caused by: ");
      EmptyObjectException emptyObjectException1 = new EmptyObjectException((String) null, emptyObjectException0);
      assertFalse(emptyObjectException1.equals((Object)emptyObjectException0));
  }
}
