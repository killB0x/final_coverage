/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:41:27 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast.partial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.ASTNode;
import com.evolvedbinary.xpath.parser.ast.ForExpr;
import com.evolvedbinary.xpath.parser.ast.SimpleForClause;
import com.evolvedbinary.xpath.parser.ast.partial.PartialForExpr;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PartialForExpr_ESTest extends PartialForExpr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PartialForExpr partialForExpr0 = new PartialForExpr((SimpleForClause) null);
      // Undeclared exception!
      try { 
        partialForExpr0.describe();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.partial.PartialForExpr", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<SimpleForClause.RangeVariable> linkedList0 = new LinkedList<SimpleForClause.RangeVariable>();
      SimpleForClause simpleForClause0 = new SimpleForClause(linkedList0);
      PartialForExpr partialForExpr0 = new PartialForExpr(simpleForClause0);
      String string0 = partialForExpr0.describe();
      assertEquals("ForExpr(AST_SimpleForClause() return ?)", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PartialForExpr partialForExpr0 = new PartialForExpr((SimpleForClause) null);
      ForExpr forExpr0 = partialForExpr0.complete((ASTNode) null);
      assertNotNull(forExpr0);
  }
}
