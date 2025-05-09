/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 16:42:50 GMT 2022
 */

package org.jfaster.mango.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.binding.DefaultInvocationContext;
import org.jfaster.mango.parser.ASTNull;
import org.jfaster.mango.parser.Parser;
import org.jfaster.mango.parser.ParserVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ASTNull_ESTest extends ASTNull_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(281);
      Parser parser0 = new Parser(pipedInputStream0);
      ASTNull aSTNull0 = new ASTNull(parser0, 281);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      Object object0 = aSTNull0.value(defaultInvocationContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTNull aSTNull0 = new ASTNull(1027);
      // Undeclared exception!
      try { 
        aSTNull0.jjtAccept((ParserVisitor) null, (Object) null);
        fail("Expecting exception: IncompatibleClassChangeError");
      
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.jfaster.mango.parser.ASTNull.value
         //
         verifyException("org.jfaster.mango.parser.ASTNull", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(281);
      Parser parser0 = new Parser(pipedInputStream0);
      ASTNull aSTNull0 = new ASTNull(parser0, 281);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      boolean boolean0 = aSTNull0.evaluate(defaultInvocationContext0);
      assertFalse(boolean0);
  }
}
