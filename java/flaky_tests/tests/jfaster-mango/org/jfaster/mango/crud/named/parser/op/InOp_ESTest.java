/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 00:57:25 GMT 2022
 */

package org.jfaster.mango.crud.named.parser.op;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.crud.named.parser.op.InOp;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InOp_ESTest extends InOp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InOp inOp0 = new InOp();
      String string0 = inOp0.keyword();
      assertEquals("In", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InOp inOp0 = new InOp();
      String string0 = inOp0.operator();
      assertEquals("in", string0);
  }
}
