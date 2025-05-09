/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:48:51 GMT 2022
 */

package org.dynjs.ir.operands;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.dynjs.ir.OperandType;
import org.dynjs.ir.operands.This;
import org.dynjs.ir.operands.Variable;
import org.dynjs.runtime.ExecutionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class This_ESTest extends This_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      This this0 = This.THIS;
      String string0 = this0.toString();
      assertEquals("%this", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      This this0 = new This();
      LinkedList<Variable> linkedList0 = new LinkedList<Variable>();
      this0.addUsedVariables(linkedList0);
      assertEquals(OperandType.THIS, this0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      This this0 = new This();
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        this0.retrieve((ExecutionContext) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dynjs.ir.operands.This", e);
      }
  }
}
