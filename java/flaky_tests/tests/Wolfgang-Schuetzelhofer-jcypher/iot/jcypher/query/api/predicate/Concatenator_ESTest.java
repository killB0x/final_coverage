/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:17:17 GMT 2022
 */

package iot.jcypher.query.api.predicate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.query.api.predicate.Concat;
import iot.jcypher.query.api.predicate.Concatenator;
import iot.jcypher.query.ast.predicate.BooleanValue;
import iot.jcypher.query.ast.predicate.PredicateConcatenator;
import iot.jcypher.query.ast.predicate.PredicateExpression;
import iot.jcypher.query.ast.predicate.PredicateFunction;
import iot.jcypher.query.ast.predicate.SubExpression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Concatenator_ESTest extends Concatenator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      BooleanValue booleanValue0 = new BooleanValue(false);
      predicateExpression0.setPredicate(booleanValue0);
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      Concat concat0 = concatenator0.XOR();
      assertNotNull(concat0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      BooleanValue booleanValue0 = new BooleanValue(false);
      predicateExpression0.setPredicate(booleanValue0);
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      Concat concat0 = concatenator0.OR();
      assertNotNull(concat0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      BooleanValue booleanValue0 = new BooleanValue(false);
      predicateExpression0.setPredicate(booleanValue0);
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      Concat concat0 = concatenator0.AND();
      assertNotNull(concat0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      SubExpression subExpression0 = new SubExpression();
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      predicateConcatenator0.setPredicate(subExpression0);
      subExpression0.setNext(predicateConcatenator0);
      predicateExpression0.setPredicate(subExpression0);
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      // Undeclared exception!
      concatenator0.XOR();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      SubExpression subExpression0 = new SubExpression();
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      predicateConcatenator0.setPredicate(subExpression0);
      subExpression0.setNext(predicateConcatenator0);
      predicateExpression0.setPredicate(subExpression0);
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      // Undeclared exception!
      concatenator0.OR();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Concatenator concatenator0 = new Concatenator((PredicateExpression) null);
      // Undeclared exception!
      try { 
        concatenator0.BR_CLOSE();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.predicate.Concatenator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      PredicateFunction predicateFunction0 = new PredicateFunction();
      predicateFunction0.setNext(predicateConcatenator0);
      predicateConcatenator0.setPredicate(predicateFunction0);
      predicateExpression0.setPredicate(predicateFunction0);
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      // Undeclared exception!
      concatenator0.AND();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      predicateExpression0.setParent(predicateExpression0);
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      Concatenator concatenator1 = concatenator0.BR_CLOSE();
      assertNotSame(concatenator1, concatenator0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      // Undeclared exception!
      try { 
        concatenator0.BR_CLOSE();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No matching open bracket
         //
         verifyException("iot.jcypher.query.api.predicate.Concatenator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      // Undeclared exception!
      try { 
        concatenator0.XOR();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.predicate.Concatenator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      // Undeclared exception!
      try { 
        concatenator0.AND();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.predicate.Concatenator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      // Undeclared exception!
      try { 
        concatenator0.OR();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.predicate.Concatenator", e);
      }
  }
}
