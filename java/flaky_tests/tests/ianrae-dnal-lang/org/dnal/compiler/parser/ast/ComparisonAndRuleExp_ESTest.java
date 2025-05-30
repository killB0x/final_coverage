/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:27:39 GMT 2022
 */

package org.dnal.compiler.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.dnal.compiler.parser.ast.ComparisonAndRuleExp;
import org.dnal.compiler.parser.ast.ComparisonRuleExp;
import org.dnal.compiler.parser.ast.Exp;
import org.dnal.compiler.parser.ast.IdentExp;
import org.dnal.compiler.parser.ast.PackageExp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ComparisonAndRuleExp_ESTest extends ComparisonAndRuleExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PackageExp packageExp0 = new PackageExp("");
      ComparisonRuleExp comparisonRuleExp0 = new ComparisonRuleExp(packageExp0, "", (Double) null);
      ComparisonRuleExp comparisonRuleExp1 = new ComparisonRuleExp((IdentExp) packageExp0, "", (Exp) packageExp0);
      ComparisonAndRuleExp comparisonAndRuleExp0 = new ComparisonAndRuleExp((-2680), comparisonRuleExp0, comparisonRuleExp1);
      String string0 = comparisonAndRuleExp0.strValue();
      assertEquals(" null and  ", string0);
      assertEquals((-2680), comparisonAndRuleExp0.pos);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ComparisonAndRuleExp comparisonAndRuleExp0 = new ComparisonAndRuleExp(0, (ComparisonRuleExp) null, (ComparisonRuleExp) null);
      // Undeclared exception!
      try { 
        comparisonAndRuleExp0.strValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dnal.compiler.parser.ast.ComparisonAndRuleExp", e);
      }
  }
}
