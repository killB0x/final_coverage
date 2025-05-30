/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:19:48 GMT 2022
 */

package com.google.common.css.compiler.passes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.compiler.ast.VisitController;
import com.google.common.css.compiler.passes.CodeBuffer;
import com.google.common.css.compiler.passes.GssSourceMapGenerator;
import com.google.common.css.compiler.passes.NullGssSourceMapGenerator;
import com.google.common.css.compiler.passes.PrettyPrinter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CodePrinter_ESTest extends CodePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullGssSourceMapGenerator nullGssSourceMapGenerator0 = new NullGssSourceMapGenerator();
      PrettyPrinter prettyPrinter0 = new PrettyPrinter((VisitController) null, nullGssSourceMapGenerator0);
      // Undeclared exception!
      try { 
        prettyPrinter0.visit();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/reflect/Reflection
         //
         verifyException("com.google.common.css.compiler.passes.UniformVisitor$Adapters", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CodeBuffer codeBuffer0 = new CodeBuffer();
      PrettyPrinter prettyPrinter0 = new PrettyPrinter((VisitController) null, codeBuffer0, (GssSourceMapGenerator) null);
      // Undeclared exception!
      try { 
        prettyPrinter0.visit();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.common.css.compiler.passes.PrettyPrintingVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrettyPrinter prettyPrinter0 = new PrettyPrinter((VisitController) null);
      String string0 = prettyPrinter0.getOutputBuffer();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PrettyPrinter prettyPrinter0 = new PrettyPrinter((VisitController) null);
      prettyPrinter0.resetBuffer();
      assertNull(prettyPrinter0.getPrettyPrintedString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PrettyPrinter prettyPrinter0 = new PrettyPrinter((VisitController) null);
      prettyPrinter0.setPreserveMarkedComments(true);
      // Undeclared exception!
      try { 
        prettyPrinter0.visit();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/reflect/Reflection
         //
         verifyException("com.google.common.css.compiler.passes.UniformVisitor$Adapters", e);
      }
  }
}
