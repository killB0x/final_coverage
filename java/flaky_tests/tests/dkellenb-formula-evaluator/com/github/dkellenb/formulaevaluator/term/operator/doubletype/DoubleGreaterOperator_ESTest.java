/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 13:30:05 GMT 2022
 */

package com.github.dkellenb.formulaevaluator.term.operator.doubletype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.dkellenb.formulaevaluator.FormulaEvaluatorConfiguration;
import com.github.dkellenb.formulaevaluator.term.Term;
import com.github.dkellenb.formulaevaluator.term.operator.doubletype.DoubleGreaterOperator;
import com.github.dkellenb.formulaevaluator.term.value.ConstantTerm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DoubleGreaterOperator_ESTest extends DoubleGreaterOperator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double(0.0);
      ConstantTerm<Double> constantTerm0 = new ConstantTerm<Double>(double0);
      DoubleGreaterOperator doubleGreaterOperator0 = new DoubleGreaterOperator(constantTerm0, constantTerm0);
      FormulaEvaluatorConfiguration formulaEvaluatorConfiguration0 = new FormulaEvaluatorConfiguration();
      // Undeclared exception!
      try { 
        doubleGreaterOperator0.calculateDefault(formulaEvaluatorConfiguration0, (Double) null, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.dkellenb.formulaevaluator.term.operator.doubletype.DoubleGreaterOperator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleGreaterOperator doubleGreaterOperator0 = new DoubleGreaterOperator((Term<Double>) null, (Term<Double>) null);
      FormulaEvaluatorConfiguration formulaEvaluatorConfiguration0 = new FormulaEvaluatorConfiguration();
      Double double0 = doubleGreaterOperator0.one();
      Double double1 = doubleGreaterOperator0.calculateDefault(formulaEvaluatorConfiguration0, double0, double0);
      Double double2 = doubleGreaterOperator0.calculateDefault(formulaEvaluatorConfiguration0, double0, double1);
      assertNotEquals((double)double2, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleGreaterOperator doubleGreaterOperator0 = new DoubleGreaterOperator((Term<Double>) null, (Term<Double>) null);
      String string0 = doubleGreaterOperator0.getOperatorName();
      assertEquals(">", string0);
  }
}
