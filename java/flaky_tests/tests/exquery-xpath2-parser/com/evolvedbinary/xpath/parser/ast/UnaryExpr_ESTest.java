/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:08:13 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.ASTNode;
import com.evolvedbinary.xpath.parser.ast.AbstractOperand;
import com.evolvedbinary.xpath.parser.ast.Expr;
import com.evolvedbinary.xpath.parser.ast.GeneralComp;
import com.evolvedbinary.xpath.parser.ast.IntersectExceptExpr;
import com.evolvedbinary.xpath.parser.ast.OccurrenceIndicator;
import com.evolvedbinary.xpath.parser.ast.PITest;
import com.evolvedbinary.xpath.parser.ast.SequenceType;
import com.evolvedbinary.xpath.parser.ast.TextTest;
import com.evolvedbinary.xpath.parser.ast.TreatExpr;
import com.evolvedbinary.xpath.parser.ast.UnaryExpr;
import com.evolvedbinary.xpath.parser.ast.ValueExpr;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnaryExpr_ESTest extends UnaryExpr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnaryExpr unaryExpr0 = new UnaryExpr("\"V$-gz(", (ValueExpr) null);
      // Undeclared exception!
      try { 
        unaryExpr0.equals(unaryExpr0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.UnaryExpr", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<IntersectExceptExpr.IntersectExceptOp> linkedList0 = new LinkedList<IntersectExceptExpr.IntersectExceptOp>();
      IntersectExceptExpr intersectExceptExpr0 = new IntersectExceptExpr((AbstractOperand) null, linkedList0);
      ValueExpr valueExpr0 = new ValueExpr(intersectExceptExpr0);
      IntersectExceptExpr.IntersectExcept intersectExceptExpr_IntersectExcept0 = IntersectExceptExpr.IntersectExcept.INTERSECT;
      PITest pITest0 = new PITest("5v6q");
      OccurrenceIndicator occurrenceIndicator0 = OccurrenceIndicator.ZERO_OR_ONE;
      SequenceType sequenceType0 = new SequenceType(pITest0, occurrenceIndicator0);
      TreatExpr treatExpr0 = new TreatExpr(valueExpr0, sequenceType0);
      IntersectExceptExpr.IntersectExceptOp intersectExceptExpr_IntersectExceptOp0 = new IntersectExceptExpr.IntersectExceptOp(intersectExceptExpr_IntersectExcept0, treatExpr0);
      linkedList0.add(intersectExceptExpr_IntersectExceptOp0);
      UnaryExpr unaryExpr0 = new UnaryExpr("5v6q", valueExpr0);
      // Undeclared exception!
      try { 
        unaryExpr0.describe();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expr expr0 = new Expr((List<? extends ASTNode>) null);
      ValueExpr valueExpr0 = new ValueExpr(expr0);
      UnaryExpr unaryExpr0 = new UnaryExpr(".", valueExpr0);
      // Undeclared exception!
      try { 
        unaryExpr0.describe();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.Expr", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnaryExpr unaryExpr0 = new UnaryExpr("", (ValueExpr) null);
      ValueExpr valueExpr0 = new ValueExpr(unaryExpr0);
      UnaryExpr unaryExpr1 = new UnaryExpr("", valueExpr0);
      boolean boolean0 = unaryExpr0.equals(unaryExpr1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GeneralComp generalComp0 = GeneralComp.NOT_EQUAL;
      ValueExpr valueExpr0 = new ValueExpr(generalComp0);
      UnaryExpr unaryExpr0 = new UnaryExpr(",[", valueExpr0);
      boolean boolean0 = unaryExpr0.equals(unaryExpr0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GeneralComp generalComp0 = GeneralComp.NOT_EQUAL;
      ValueExpr valueExpr0 = new ValueExpr(generalComp0);
      UnaryExpr unaryExpr0 = new UnaryExpr(",[", valueExpr0);
      boolean boolean0 = unaryExpr0.equals("UnaryExpr(,[AST_ValueExpr(AST_GeneralComp(NOT_EQUAL)))");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TextTest textTest0 = TextTest.instance();
      ValueExpr valueExpr0 = new ValueExpr(textTest0);
      UnaryExpr unaryExpr0 = new UnaryExpr("Y3TsT", valueExpr0);
      boolean boolean0 = unaryExpr0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GeneralComp generalComp0 = GeneralComp.NOT_EQUAL;
      ValueExpr valueExpr0 = new ValueExpr(generalComp0);
      UnaryExpr unaryExpr0 = new UnaryExpr(",[", valueExpr0);
      String string0 = unaryExpr0.describe();
      assertEquals("UnaryExpr(,[AST_ValueExpr(AST_GeneralComp(NOT_EQUAL)))", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UnaryExpr unaryExpr0 = new UnaryExpr("UnaryExpr(", (ValueExpr) null);
      UnaryExpr unaryExpr1 = new UnaryExpr("ATTRIBUTE", (ValueExpr) null);
      boolean boolean0 = unaryExpr0.equals(unaryExpr1);
      assertFalse(boolean0);
  }
}
