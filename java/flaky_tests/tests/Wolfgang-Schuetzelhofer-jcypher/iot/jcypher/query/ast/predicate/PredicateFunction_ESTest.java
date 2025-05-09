/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:55:47 GMT 2022
 */

package iot.jcypher.query.ast.predicate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.query.ast.collection.CollectExpression;
import iot.jcypher.query.ast.collection.PredicateFunctionEvalExpression;
import iot.jcypher.query.ast.collection.PropertyEvalExpresssion;
import iot.jcypher.query.ast.predicate.PredicateFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PredicateFunction_ESTest extends PredicateFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PredicateFunction predicateFunction0 = new PredicateFunction();
      CollectExpression collectExpression0 = new CollectExpression();
      PredicateFunctionEvalExpression predicateFunctionEvalExpression0 = new PredicateFunctionEvalExpression();
      collectExpression0.setEvalExpression(predicateFunctionEvalExpression0);
      predicateFunction0.setCollectExpression(collectExpression0);
      predicateFunction0.getType();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PredicateFunction predicateFunction0 = new PredicateFunction();
      CollectExpression collectExpression0 = new CollectExpression();
      PredicateFunctionEvalExpression predicateFunctionEvalExpression0 = new PredicateFunctionEvalExpression();
      PredicateFunction.PredicateFunctionType predicateFunction_PredicateFunctionType0 = PredicateFunction.PredicateFunctionType.ALL;
      predicateFunctionEvalExpression0.setType(predicateFunction_PredicateFunctionType0);
      collectExpression0.setEvalExpression(predicateFunctionEvalExpression0);
      predicateFunction0.setCollectExpression(collectExpression0);
      PredicateFunction.PredicateFunctionType predicateFunction_PredicateFunctionType1 = predicateFunction0.getType();
      assertEquals(PredicateFunction.PredicateFunctionType.ALL, predicateFunction_PredicateFunctionType1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PredicateFunction predicateFunction0 = new PredicateFunction();
      CollectExpression collectExpression0 = new CollectExpression();
      PropertyEvalExpresssion propertyEvalExpresssion0 = new PropertyEvalExpresssion();
      collectExpression0.setEvalExpression(propertyEvalExpresssion0);
      predicateFunction0.setCollectExpression(collectExpression0);
      // Undeclared exception!
      try { 
        predicateFunction0.getType();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class iot.jcypher.query.ast.collection.PropertyEvalExpresssion cannot be cast to class iot.jcypher.query.ast.collection.PredicateFunctionEvalExpression (iot.jcypher.query.ast.collection.PropertyEvalExpresssion and iot.jcypher.query.ast.collection.PredicateFunctionEvalExpression are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @18103a30)
         //
         verifyException("iot.jcypher.query.ast.predicate.PredicateFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PredicateFunction predicateFunction0 = new PredicateFunction();
      // Undeclared exception!
      try { 
        predicateFunction0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.ast.predicate.PredicateFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PredicateFunction predicateFunction0 = new PredicateFunction();
      CollectExpression collectExpression0 = new CollectExpression();
      predicateFunction0.setCollectExpression(collectExpression0);
      CollectExpression collectExpression1 = predicateFunction0.getCollectExpression();
      assertNull(collectExpression1.getClauseType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PredicateFunction predicateFunction0 = new PredicateFunction();
      CollectExpression collectExpression0 = predicateFunction0.getCollectExpression();
      assertNull(collectExpression0);
  }
}
