/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:05:03 GMT 2022
 */

package iot.jcypher.query.ast.returns;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.query.ast.predicate.PredicateExpression;
import iot.jcypher.query.ast.returns.ReturnBoolean;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReturnBoolean_ESTest extends ReturnBoolean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReturnBoolean returnBoolean0 = new ReturnBoolean();
      PredicateExpression predicateExpression0 = new PredicateExpression();
      returnBoolean0.setPredicateExpression(predicateExpression0);
      PredicateExpression predicateExpression1 = returnBoolean0.getPredicateExpression();
      assertSame(predicateExpression1, predicateExpression0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReturnBoolean returnBoolean0 = new ReturnBoolean();
      PredicateExpression predicateExpression0 = returnBoolean0.getPredicateExpression();
      assertNull(predicateExpression0);
  }
}
