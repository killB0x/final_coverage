/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:31:16 GMT 2022
 */

package iot.jcypher.query.api.using;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.query.api.using.UTerminal;
import iot.jcypher.query.api.using.UsingScan;
import iot.jcypher.query.ast.using.UsingExpression;
import iot.jcypher.query.values.JcNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UsingScan_ESTest extends UsingScan_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UsingExpression usingExpression0 = new UsingExpression();
      JcNode jcNode0 = new JcNode("-dHh/]C`E9Rdi");
      UsingScan usingScan0 = new UsingScan(usingExpression0);
      UTerminal uTerminal0 = usingScan0.on(jcNode0);
      assertNotNull(uTerminal0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UsingScan usingScan0 = new UsingScan((UsingExpression) null);
      // Undeclared exception!
      try { 
        usingScan0.on((JcNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.using.UsingScan", e);
      }
  }
}
