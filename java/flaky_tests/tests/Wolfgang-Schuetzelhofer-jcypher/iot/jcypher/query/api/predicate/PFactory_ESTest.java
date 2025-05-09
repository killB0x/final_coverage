/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:08:19 GMT 2022
 */

package iot.jcypher.query.api.predicate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.query.api.collection.IPredicateFunction;
import iot.jcypher.query.api.pattern.IElement;
import iot.jcypher.query.api.predicate.BooleanOperation;
import iot.jcypher.query.api.predicate.Concat;
import iot.jcypher.query.api.predicate.Concatenator;
import iot.jcypher.query.api.predicate.IBeforePredicate;
import iot.jcypher.query.api.predicate.PFactory;
import iot.jcypher.query.ast.predicate.PredicateExpression;
import iot.jcypher.query.values.IHas;
import iot.jcypher.query.values.JcNode;
import iot.jcypher.query.values.JcRelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PFactory_ESTest extends PFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PredicateExpression predicateExpression0 = new PredicateExpression();
      predicateExpression0.setParent(predicateExpression0);
      Concatenator concatenator0 = new Concatenator(predicateExpression0);
      // Undeclared exception!
      PFactory.holdsTrue(concatenator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        PFactory.holdsTrue((IPredicateFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.api.APIObjectAccess", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        PFactory.existsPattern((IElement) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid expression
         //
         verifyException("iot.jcypher.query.api.predicate.PFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JcRelation jcRelation0 = new JcRelation("");
      JcNode jcNode0 = jcRelation0.startNode();
      BooleanOperation booleanOperation0 = PFactory.valueOf(jcNode0);
      assertNotNull(booleanOperation0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Concat concat0 = PFactory.BR_OPEN();
      assertNotNull(concat0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IBeforePredicate iBeforePredicate0 = PFactory.NOT();
      assertNotNull(iBeforePredicate0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Concat concat0 = PFactory.createConcat();
      assertNotNull(concat0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Concatenator concatenator0 = PFactory.createConcatenator((PredicateExpression) null);
      assertNotNull(concatenator0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PFactory pFactory0 = new PFactory();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Concatenator concatenator0 = PFactory.has((IHas) null);
      Concatenator concatenator1 = PFactory.holdsTrue(concatenator0);
      assertNotSame(concatenator0, concatenator1);
  }
}
