/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 21:35:16 GMT 2022
 */

package iot.jcypher.query.ast.returns;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.query.ast.returns.ReturnAggregate;
import iot.jcypher.query.values.ValueElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReturnAggregate_ESTest extends ReturnAggregate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReturnAggregate returnAggregate0 = new ReturnAggregate();
      returnAggregate0.setPercentile((Number) null);
      assertFalse(returnAggregate0.isDistinct());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReturnAggregate returnAggregate0 = new ReturnAggregate();
      returnAggregate0.getPercentile();
      assertFalse(returnAggregate0.isDistinct());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReturnAggregate returnAggregate0 = new ReturnAggregate();
      ReturnAggregate.AggregateFunctionType returnAggregate_AggregateFunctionType0 = ReturnAggregate.AggregateFunctionType.PERCENTILE_CONT;
      returnAggregate0.setType(returnAggregate_AggregateFunctionType0);
      returnAggregate0.getType();
      assertFalse(returnAggregate0.isDistinct());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReturnAggregate returnAggregate0 = new ReturnAggregate();
      returnAggregate0.getType();
      assertFalse(returnAggregate0.isDistinct());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReturnAggregate returnAggregate0 = new ReturnAggregate();
      boolean boolean0 = returnAggregate0.isDistinct();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReturnAggregate returnAggregate0 = new ReturnAggregate();
      returnAggregate0.getArgument();
      assertFalse(returnAggregate0.isDistinct());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ReturnAggregate returnAggregate0 = new ReturnAggregate();
      assertFalse(returnAggregate0.isDistinct());
      
      returnAggregate0.setDistinct();
      boolean boolean0 = returnAggregate0.isDistinct();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ReturnAggregate returnAggregate0 = new ReturnAggregate();
      returnAggregate0.setArgument((ValueElement) null);
      assertFalse(returnAggregate0.isDistinct());
  }
}
