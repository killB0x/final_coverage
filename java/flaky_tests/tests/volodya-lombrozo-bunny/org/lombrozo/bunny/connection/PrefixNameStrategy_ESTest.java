/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 00:43:00 GMT 2022
 */

package org.lombrozo.bunny.connection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.lombrozo.bunny.connection.PrefixNameStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrefixNameStrategy_ESTest extends PrefixNameStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrefixNameStrategy prefixNameStrategy0 = new PrefixNameStrategy("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrefixNameStrategy prefixNameStrategy0 = new PrefixNameStrategy();
      String string0 = prefixNameStrategy0.connectionName();
      assertNotNull(string0);
  }
}
