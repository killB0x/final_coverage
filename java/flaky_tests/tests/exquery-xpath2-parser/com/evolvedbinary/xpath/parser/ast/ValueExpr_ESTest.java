/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:26:45 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.ASTNode;
import com.evolvedbinary.xpath.parser.ast.Axis;
import com.evolvedbinary.xpath.parser.ast.Predicate;
import com.evolvedbinary.xpath.parser.ast.PredicateList;
import com.evolvedbinary.xpath.parser.ast.QNameW;
import com.evolvedbinary.xpath.parser.ast.SimpleForClause;
import com.evolvedbinary.xpath.parser.ast.ValueExpr;
import com.evolvedbinary.xpath.parser.ast.VarRef;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ValueExpr_ESTest extends ValueExpr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValueExpr valueExpr0 = new ValueExpr((ASTNode) null);
      ASTNode aSTNode0 = valueExpr0.getPathExpr();
      assertNull(aSTNode0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleForClause.RangeVariable[] simpleForClause_RangeVariableArray0 = new SimpleForClause.RangeVariable[1];
      QNameW qNameW0 = new QNameW("*S&gH", "(o@Jwg_M^_]By9\"");
      SimpleForClause.RangeVariable simpleForClause_RangeVariable0 = new SimpleForClause.RangeVariable(qNameW0, qNameW0);
      simpleForClause_RangeVariableArray0[0] = simpleForClause_RangeVariable0;
      SimpleForClause simpleForClause0 = new SimpleForClause(simpleForClause_RangeVariableArray0);
      ValueExpr valueExpr0 = new ValueExpr(simpleForClause0);
      String string0 = valueExpr0.describe();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VarRef varRef0 = new VarRef((QNameW) null);
      ValueExpr valueExpr0 = new ValueExpr(varRef0);
      // Undeclared exception!
      try { 
        valueExpr0.equals(valueExpr0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.VarRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Predicate> linkedList0 = new LinkedList<Predicate>();
      PredicateList predicateList0 = new PredicateList(linkedList0);
      Predicate predicate0 = new Predicate(predicateList0);
      linkedList0.add(predicate0);
      ValueExpr valueExpr0 = new ValueExpr(predicateList0);
      // Undeclared exception!
      try { 
        valueExpr0.describe();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleForClause.RangeVariable[] simpleForClause_RangeVariableArray0 = new SimpleForClause.RangeVariable[1];
      SimpleForClause simpleForClause0 = new SimpleForClause(simpleForClause_RangeVariableArray0);
      ValueExpr valueExpr0 = new ValueExpr(simpleForClause0);
      boolean boolean0 = valueExpr0.equals("QNameW(*S&gH:(o@Jwg_M^_]By9\")");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimpleForClause.RangeVariable[] simpleForClause_RangeVariableArray0 = new SimpleForClause.RangeVariable[1];
      SimpleForClause simpleForClause0 = new SimpleForClause(simpleForClause_RangeVariableArray0);
      ValueExpr valueExpr0 = new ValueExpr(simpleForClause0);
      boolean boolean0 = valueExpr0.equals(valueExpr0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VarRef varRef0 = new VarRef((QNameW) null);
      ValueExpr valueExpr0 = new ValueExpr(varRef0);
      boolean boolean0 = valueExpr0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SimpleForClause.RangeVariable[] simpleForClause_RangeVariableArray0 = new SimpleForClause.RangeVariable[1];
      SimpleForClause simpleForClause0 = new SimpleForClause(simpleForClause_RangeVariableArray0);
      ValueExpr valueExpr0 = new ValueExpr(simpleForClause0);
      // Undeclared exception!
      try { 
        valueExpr0.describe();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.SimpleForClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Axis axis0 = Axis.DESCENDANT;
      ValueExpr valueExpr0 = new ValueExpr(axis0);
      ASTNode aSTNode0 = valueExpr0.getPathExpr();
      assertSame(axis0, aSTNode0);
  }
}
