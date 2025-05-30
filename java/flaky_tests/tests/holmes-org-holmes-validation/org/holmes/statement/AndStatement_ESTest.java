/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 13:50:50 GMT 2022
 */

package org.holmes.statement;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.holmes.Statement;
import org.holmes.Validator;
import org.holmes.evaluator.ObjectEvaluator;
import org.holmes.statement.AndStatement;
import org.holmes.statement.OrStatement;
import org.holmes.statement.SimpleStatement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AndStatement_ESTest extends AndStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      ObjectEvaluator<Object> objectEvaluator0 = new ObjectEvaluator<Object>(object0);
      SimpleStatement simpleStatement0 = new SimpleStatement(objectEvaluator0);
      OrStatement orStatement0 = new OrStatement(simpleStatement0, simpleStatement0);
      AndStatement andStatement0 = new AndStatement(simpleStatement0, orStatement0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AndStatement andStatement0 = new AndStatement((Statement) null, (Statement) null);
      // Undeclared exception!
      try { 
        andStatement0.evaluate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.holmes.statement.AndStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      ObjectEvaluator<Object> objectEvaluator0 = new ObjectEvaluator<Object>(object0);
      SimpleStatement simpleStatement0 = new SimpleStatement(objectEvaluator0);
      AndStatement andStatement0 = new AndStatement(simpleStatement0, simpleStatement0);
      Validator<Object> validator0 = (Validator<Object>) mock(Validator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(validator0).isValid(any());
      objectEvaluator0.isValidBy(validator0);
      boolean boolean0 = andStatement0.evaluate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      ObjectEvaluator<Object> objectEvaluator0 = new ObjectEvaluator<Object>(object0);
      SimpleStatement simpleStatement0 = new SimpleStatement(objectEvaluator0);
      AndStatement andStatement0 = new AndStatement(simpleStatement0, simpleStatement0);
      objectEvaluator0.isNotEqualTo(andStatement0);
      boolean boolean0 = andStatement0.evaluate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      ObjectEvaluator<Object> objectEvaluator0 = new ObjectEvaluator<Object>(object0);
      SimpleStatement simpleStatement0 = new SimpleStatement(objectEvaluator0);
      AndStatement andStatement0 = new AndStatement(simpleStatement0, simpleStatement0);
      boolean boolean0 = andStatement0.evaluate();
      assertFalse(boolean0);
  }
}
