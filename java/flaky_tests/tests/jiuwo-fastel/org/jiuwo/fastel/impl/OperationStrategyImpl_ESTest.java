/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:02:00 GMT 2022
 */

package org.jiuwo.fastel.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jiuwo.fastel.contract.enums.ExpressionEnum;
import org.jiuwo.fastel.impl.ExpressionNode;
import org.jiuwo.fastel.impl.OperationStrategyImpl;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OperationStrategyImpl_ESTest extends OperationStrategyImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OperationStrategyImpl operationStrategyImpl0 = new OperationStrategyImpl();
      ExpressionEnum.Token expressionEnum_Token0 = ExpressionEnum.Token.VALUE_CONSTANTS;
      ExpressionNode expressionNode0 = new ExpressionNode(expressionEnum_Token0, operationStrategyImpl0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = operationStrategyImpl0.evaluate(expressionNode0, hashMap0);
      assertSame(operationStrategyImpl0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OperationStrategyImpl operationStrategyImpl0 = new OperationStrategyImpl();
      ExpressionEnum.Token expressionEnum_Token0 = ExpressionEnum.Token.OP_INVOKE_WITH_STATIC_PARAM;
      Object object0 = new Object();
      ExpressionNode expressionNode0 = new ExpressionNode(expressionEnum_Token0, object0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        operationStrategyImpl0.evaluate(expressionNode0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class [Ljava.lang.Object; (java.lang.Object and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')
         //
         verifyException("org.jiuwo.fastel.util.function.OperationStrategyFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OperationStrategyImpl operationStrategyImpl0 = new OperationStrategyImpl();
      ExpressionEnum.Token expressionEnum_Token0 = ExpressionEnum.Token.OP_LSH;
      ExpressionNode expressionNode0 = new ExpressionNode(expressionEnum_Token0, operationStrategyImpl0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        operationStrategyImpl0.evaluate(expressionNode0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiuwo.fastel.impl.OperationStrategyImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OperationStrategyImpl operationStrategyImpl0 = new OperationStrategyImpl();
      ExpressionEnum.Token expressionEnum_Token0 = ExpressionEnum.Token.OP_JOIN;
      ExpressionNode expressionNode0 = new ExpressionNode(expressionEnum_Token0, operationStrategyImpl0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        operationStrategyImpl0.evaluate(expressionNode0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiuwo.fastel.impl.OperationStrategyImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OperationStrategyImpl operationStrategyImpl0 = new OperationStrategyImpl();
      ExpressionEnum.Token expressionEnum_Token0 = ExpressionEnum.Token.VALUE_VAR;
      ExpressionNode expressionNode0 = new ExpressionNode(expressionEnum_Token0, operationStrategyImpl0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = operationStrategyImpl0.evaluate(expressionNode0, hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OperationStrategyImpl operationStrategyImpl0 = new OperationStrategyImpl();
      ExpressionNode expressionNode0 = new ExpressionNode(".");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        operationStrategyImpl0.evaluate(expressionNode0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jiuwo.fastel.impl.OperationStrategyImpl", e);
      }
  }
}
