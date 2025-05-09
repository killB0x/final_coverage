/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 11:25:21 GMT 2022
 */

package com.iciql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iciql.Query;
import com.iciql.QueryJoinCondition;
import com.iciql.SelectTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QueryJoinCondition_ESTest extends QueryJoinCondition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((short)0);
      QueryJoinCondition<Integer, Integer> queryJoinCondition0 = new QueryJoinCondition<Integer, Integer>((Query<Integer>) null, (SelectTable<Integer>) null, integer0);
      // Undeclared exception!
      try { 
        queryJoinCondition0.is((short)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryJoinCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QueryJoinCondition<Integer, Integer> queryJoinCondition0 = new QueryJoinCondition<Integer, Integer>((Query<Integer>) null, (SelectTable<Integer>) null, (Integer) null);
      // Undeclared exception!
      try { 
        queryJoinCondition0.is(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryJoinCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer((short)1154);
      QueryJoinCondition<Integer, Integer> queryJoinCondition0 = new QueryJoinCondition<Integer, Integer>((Query<Integer>) null, (SelectTable<Integer>) null, integer0);
      // Undeclared exception!
      try { 
        queryJoinCondition0.is((int) (short)1154);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryJoinCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QueryJoinCondition<Integer, Integer> queryJoinCondition0 = new QueryJoinCondition<Integer, Integer>((Query<Integer>) null, (SelectTable<Integer>) null, (Integer) null);
      // Undeclared exception!
      try { 
        queryJoinCondition0.is((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryJoinCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QueryJoinCondition<Integer, Integer> queryJoinCondition0 = new QueryJoinCondition<Integer, Integer>((Query<Integer>) null, (SelectTable<Integer>) null, (Integer) null);
      // Undeclared exception!
      try { 
        queryJoinCondition0.is((byte)48);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryJoinCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer((short)1166);
      QueryJoinCondition<Integer, Integer> queryJoinCondition0 = new QueryJoinCondition<Integer, Integer>((Query<Integer>) null, (SelectTable<Integer>) null, integer0);
      // Undeclared exception!
      try { 
        queryJoinCondition0.is((long) (short)1166);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryJoinCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer((short)0);
      QueryJoinCondition<Integer, Integer> queryJoinCondition0 = new QueryJoinCondition<Integer, Integer>((Query<Integer>) null, (SelectTable<Integer>) null, integer0);
      // Undeclared exception!
      try { 
        queryJoinCondition0.is((float) (short)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryJoinCondition", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QueryJoinCondition<Integer, Integer> queryJoinCondition0 = new QueryJoinCondition<Integer, Integer>((Query<Integer>) null, (SelectTable<Integer>) null, (Integer) null);
      // Undeclared exception!
      try { 
        queryJoinCondition0.is(4922.811873621135);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iciql.QueryJoinCondition", e);
      }
  }
}
