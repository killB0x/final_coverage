/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:49:30 GMT 2022
 */

package org.dynjs.ir.instructions;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dynjs.ir.Operand;
import org.dynjs.ir.instructions.Sub;
import org.dynjs.ir.operands.Variable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Sub_ESTest extends Sub_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sub sub0 = new Sub((Variable) null, (Operand) null, (Operand) null);
      String string0 = sub0.toString();
      assertEquals("null = null - null", string0);
  }
}
