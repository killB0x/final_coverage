/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:15:34 GMT 2022
 */

package org.jfaster.mango.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.binding.DefaultInvocationContext;
import org.jfaster.mango.parser.ASTElseStatement;
import org.jfaster.mango.parser.ASTJoinParameter;
import org.jfaster.mango.parser.ASTSelect;
import org.jfaster.mango.parser.ASTTruncate;
import org.jfaster.mango.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractRenderableNode_ESTest extends AbstractRenderableNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTTruncate aSTTruncate0 = new ASTTruncate((-1780));
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      boolean boolean0 = aSTTruncate0.render(defaultInvocationContext0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTJoinParameter aSTJoinParameter0 = new ASTJoinParameter(0);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      // Undeclared exception!
      try { 
        aSTJoinParameter0.render(defaultInvocationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // invoker chain must set
         //
         verifyException("org.jfaster.mango.parser.ASTJoinParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTElseStatement aSTElseStatement0 = new ASTElseStatement(0);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      // Undeclared exception!
      try { 
        aSTElseStatement0.render(defaultInvocationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ASTSelect aSTSelect0 = new ASTSelect((Parser) null, (-4590));
      assertEquals(0, aSTSelect0.jjtGetNumChildren());
  }
}
