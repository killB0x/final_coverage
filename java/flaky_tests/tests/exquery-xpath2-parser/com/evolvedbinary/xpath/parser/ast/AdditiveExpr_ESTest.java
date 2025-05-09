/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:56:02 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.AbstractOperand;
import com.evolvedbinary.xpath.parser.ast.AdditiveExpr;
import com.evolvedbinary.xpath.parser.ast.AtomicType;
import com.evolvedbinary.xpath.parser.ast.CastExpr;
import com.evolvedbinary.xpath.parser.ast.CastableExpr;
import com.evolvedbinary.xpath.parser.ast.OrExpr;
import com.evolvedbinary.xpath.parser.ast.RelativePathExpr;
import com.evolvedbinary.xpath.parser.ast.SingleType;
import com.evolvedbinary.xpath.parser.ast.StepExpr;
import com.evolvedbinary.xpath.parser.ast.UnaryExpr;
import com.evolvedbinary.xpath.parser.ast.UnionExpr;
import com.evolvedbinary.xpath.parser.ast.ValueExpr;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdditiveExpr_ESTest extends AdditiveExpr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.fromSyntax('+');
      assertEquals(AdditiveExpr.Additive.ADD, additiveExpr_Additive0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        AdditiveExpr.Additive.fromSyntax('*');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such Additive: '*'
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.AdditiveExpr$Additive", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<CastableExpr> linkedList0 = new LinkedList<CastableExpr>();
      OrExpr orExpr0 = new OrExpr((AbstractOperand) null, linkedList0);
      LinkedList<AdditiveExpr.AdditiveOp> linkedList1 = new LinkedList<AdditiveExpr.AdditiveOp>();
      AdditiveExpr additiveExpr0 = new AdditiveExpr(orExpr0, linkedList1);
      StringBuilder stringBuilder0 = new StringBuilder(114);
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.ADD;
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp0 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive0, orExpr0);
      additiveExpr0.describeOp(stringBuilder0, additiveExpr_AdditiveOp0);
      assertEquals(" ADD AST_OrExpr(null)", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdditiveExpr.AdditiveOp[] additiveExpr_AdditiveOpArray0 = new AdditiveExpr.AdditiveOp[8];
      AdditiveExpr additiveExpr0 = new AdditiveExpr((AbstractOperand) null, additiveExpr_AdditiveOpArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<StepExpr> linkedList0 = new LinkedList<StepExpr>();
      RelativePathExpr relativePathExpr0 = new RelativePathExpr(linkedList0);
      ValueExpr valueExpr0 = new ValueExpr(relativePathExpr0);
      LinkedList<AdditiveExpr.AdditiveOp> linkedList1 = new LinkedList<AdditiveExpr.AdditiveOp>();
      AdditiveExpr additiveExpr0 = new AdditiveExpr(valueExpr0, linkedList1);
      AdditiveExpr additiveExpr1 = new AdditiveExpr(additiveExpr0, linkedList1);
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.ADD;
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp0 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive0, additiveExpr0);
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp1 = new AdditiveExpr.AdditiveOp(additiveExpr_AdditiveOp0.additive, additiveExpr1);
      boolean boolean0 = additiveExpr_AdditiveOp0.equals(additiveExpr_AdditiveOp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.SUBTRACT;
      SingleType singleType0 = new SingleType((AtomicType) null, true);
      CastExpr castExpr0 = new CastExpr((AbstractOperand) null, singleType0);
      AbstractOperand[] abstractOperandArray0 = new AbstractOperand[1];
      UnionExpr unionExpr0 = new UnionExpr(castExpr0, abstractOperandArray0);
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp0 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive0, unionExpr0);
      AdditiveExpr.Additive additiveExpr_Additive1 = AdditiveExpr.Additive.ADD;
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp1 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive1, unionExpr0);
      boolean boolean0 = additiveExpr_AdditiveOp0.equals(additiveExpr_AdditiveOp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<StepExpr> linkedList0 = new LinkedList<StepExpr>();
      RelativePathExpr relativePathExpr0 = new RelativePathExpr(linkedList0);
      ValueExpr valueExpr0 = new ValueExpr(relativePathExpr0);
      LinkedList<AdditiveExpr.AdditiveOp> linkedList1 = new LinkedList<AdditiveExpr.AdditiveOp>();
      AdditiveExpr additiveExpr0 = new AdditiveExpr(valueExpr0, linkedList1);
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.ADD;
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp0 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive0, additiveExpr0);
      boolean boolean0 = additiveExpr_AdditiveOp0.equals(additiveExpr_AdditiveOp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<StepExpr> linkedList0 = new LinkedList<StepExpr>();
      RelativePathExpr relativePathExpr0 = new RelativePathExpr(linkedList0);
      ValueExpr valueExpr0 = new ValueExpr(relativePathExpr0);
      UnaryExpr unaryExpr0 = new UnaryExpr("6n!8KTO", valueExpr0);
      LinkedList<AdditiveExpr.AdditiveOp> linkedList1 = new LinkedList<AdditiveExpr.AdditiveOp>();
      AdditiveExpr additiveExpr0 = new AdditiveExpr(unaryExpr0, linkedList1);
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.ADD;
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp0 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive0, additiveExpr0);
      boolean boolean0 = additiveExpr_AdditiveOp0.equals(additiveExpr0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.fromSyntax('-');
      assertEquals(AdditiveExpr.Additive.SUBTRACT, additiveExpr_Additive0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<AdditiveExpr.AdditiveOp> linkedList0 = new LinkedList<AdditiveExpr.AdditiveOp>();
      AdditiveExpr additiveExpr0 = new AdditiveExpr((AbstractOperand) null, linkedList0);
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.SUBTRACT;
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp0 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive0, (AbstractOperand) null);
      // Undeclared exception!
      try { 
        additiveExpr0.describeOp((StringBuilder) null, additiveExpr_AdditiveOp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.AdditiveExpr", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdditiveExpr additiveExpr0 = null;
      try {
        additiveExpr0 = new AdditiveExpr((AbstractOperand) null, (AdditiveExpr.AdditiveOp[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<StepExpr> linkedList0 = new LinkedList<StepExpr>();
      RelativePathExpr relativePathExpr0 = new RelativePathExpr(linkedList0);
      ValueExpr valueExpr0 = new ValueExpr(relativePathExpr0);
      UnaryExpr unaryExpr0 = new UnaryExpr("6n!8KTO", valueExpr0);
      LinkedList<AdditiveExpr.AdditiveOp> linkedList1 = new LinkedList<AdditiveExpr.AdditiveOp>();
      AdditiveExpr additiveExpr0 = new AdditiveExpr(unaryExpr0, linkedList1);
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.ADD;
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp0 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive0, additiveExpr0);
      char char0 = additiveExpr_AdditiveOp0.additive.getSyntax();
      assertEquals('+', char0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdditiveExpr.Additive additiveExpr_Additive0 = AdditiveExpr.Additive.SUBTRACT;
      LinkedList<AdditiveExpr.AdditiveOp> linkedList0 = new LinkedList<AdditiveExpr.AdditiveOp>();
      AdditiveExpr additiveExpr0 = new AdditiveExpr((AbstractOperand) null, linkedList0);
      AdditiveExpr.AdditiveOp additiveExpr_AdditiveOp0 = new AdditiveExpr.AdditiveOp(additiveExpr_Additive0, additiveExpr0);
      boolean boolean0 = additiveExpr_AdditiveOp0.equals((Object) null);
      assertFalse(boolean0);
  }
}
