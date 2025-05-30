/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:54:55 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.ValueComp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ValueComp_ESTest extends ValueComp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValueComp valueComp0 = ValueComp.LESS_THAN;
      ValueComp valueComp1 = ValueComp.GREATER_THAN_OR_EQUAL;
      boolean boolean0 = valueComp0.equals(valueComp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ValueComp valueComp0 = ValueComp.GREATER_THAN;
      Object object0 = new Object();
      boolean boolean0 = valueComp0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ValueComp valueComp0 = ValueComp.LESS_THAN;
      boolean boolean0 = valueComp0.equals(valueComp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ValueComp valueComp0 = ValueComp.NOT_EQUAL;
      boolean boolean0 = valueComp0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ValueComp valueComp0 = ValueComp.fromSyntax("lt");
      assertEquals("lt", valueComp0.getSyntax());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueComp.fromSyntax("<th|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such value comparison: '<th|'
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.ValueComp", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ValueComp valueComp0 = ValueComp.LESS_THAN;
      String string0 = valueComp0.getSyntax();
      assertEquals("lt", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ValueComp valueComp0 = ValueComp.LESS_THAN;
      String string0 = valueComp0.describe();
      assertEquals("ValueComp(LESS_THAN)", string0);
  }
}
