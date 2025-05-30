/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 18:54:35 GMT 2022
 */

package com.inspiring.pugtsdb.rollup.aggregation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.inspiring.pugtsdb.rollup.aggregation.LongAvgAggregation;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LongAvgAggregation_ESTest extends LongAvgAggregation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LongAvgAggregation longAvgAggregation0 = new LongAvgAggregation();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long(0L);
      linkedList0.add(long0);
      Long long1 = longAvgAggregation0.aggregate(linkedList0);
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LongAvgAggregation longAvgAggregation0 = new LongAvgAggregation();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long(400L);
      linkedList0.add(long0);
      Long long1 = longAvgAggregation0.aggregate(linkedList0);
      assertEquals(400L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LongAvgAggregation longAvgAggregation0 = new LongAvgAggregation();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long((-1L));
      linkedList0.add(long0);
      Long long1 = longAvgAggregation0.aggregate(linkedList0);
      assertEquals((-1L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LongAvgAggregation longAvgAggregation0 = new LongAvgAggregation();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      // Undeclared exception!
      try { 
        longAvgAggregation0.aggregate(linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.inspiring.pugtsdb.rollup.aggregation.LongAvgAggregation", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LongAvgAggregation longAvgAggregation0 = new LongAvgAggregation();
      // Undeclared exception!
      try { 
        longAvgAggregation0.aggregate((List<Long>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.inspiring.pugtsdb.rollup.aggregation.LongAvgAggregation", e);
      }
  }
}
