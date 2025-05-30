/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:20:32 GMT 2022
 */

package iot.jcypher.query.ast.predicate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import iot.jcypher.query.ast.predicate.BooleanValue;
import iot.jcypher.query.ast.predicate.ExistsPattern;
import iot.jcypher.query.ast.predicate.Negation;
import iot.jcypher.query.ast.predicate.Predicate;
import iot.jcypher.query.ast.predicate.PredicateConcatenator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PredicateConcatenator_ESTest extends PredicateConcatenator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      Negation negation0 = new Negation();
      predicateConcatenator0.setPredicate(negation0);
      predicateConcatenator0.setPredicate(negation0);
      assertEquals(2, negation0.getNotCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      ExistsPattern existsPattern0 = new ExistsPattern();
      predicateConcatenator0.setPredicate(existsPattern0);
      Predicate predicate0 = predicateConcatenator0.getPredicate();
      assertSame(predicate0, existsPattern0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      Negation negation0 = new Negation();
      predicateConcatenator0.setPredicate(negation0);
      Predicate predicate0 = predicateConcatenator0.getPredicate();
      assertSame(predicate0, negation0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      Negation negation0 = new Negation();
      predicateConcatenator0.setPredicate(negation0);
      negation0.setNotCount((-207));
      Predicate predicate0 = predicateConcatenator0.getPredicate();
      assertNull(predicate0.getClauseType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      BooleanValue booleanValue0 = new BooleanValue(false);
      predicateConcatenator0.setPredicate(booleanValue0);
      // Undeclared exception!
      try { 
        predicateConcatenator0.setPredicate((Predicate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("iot.jcypher.query.ast.predicate.PredicateConcatenator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      PredicateConcatenator.ConcatOperator predicateConcatenator_ConcatOperator0 = PredicateConcatenator.ConcatOperator.valueOf("XOR");
      predicateConcatenator0.setConcatOperator(predicateConcatenator_ConcatOperator0);
      PredicateConcatenator.ConcatOperator predicateConcatenator_ConcatOperator1 = predicateConcatenator0.getConcatOperator();
      assertSame(predicateConcatenator_ConcatOperator1, predicateConcatenator_ConcatOperator0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      Predicate predicate0 = predicateConcatenator0.getPredicate();
      assertNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PredicateConcatenator predicateConcatenator0 = new PredicateConcatenator();
      predicateConcatenator0.getConcatOperator();
  }
}
