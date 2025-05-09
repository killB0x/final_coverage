/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 18:45:56 GMT 2022
 */

package com.inspiring.pugtsdb.rollup.aggregation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringMaxAggregation_ESTest extends StringMaxAggregation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringMaxAggregation stringMaxAggregation0 = new StringMaxAggregation();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("{oj&iN6A:'`");
      String string0 = stringMaxAggregation0.aggregate(linkedList0);
      assertEquals("{oj&iN6A:'`", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringMaxAggregation stringMaxAggregation0 = new StringMaxAggregation();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = stringMaxAggregation0.aggregate(linkedList0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringMaxAggregation stringMaxAggregation0 = new StringMaxAggregation();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      linkedList0.add("");
      // Undeclared exception!
      try { 
        stringMaxAggregation0.aggregate(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringMaxAggregation stringMaxAggregation0 = new StringMaxAggregation();
      // Undeclared exception!
      try { 
        stringMaxAggregation0.aggregate((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation", e);
      }
  }
}
