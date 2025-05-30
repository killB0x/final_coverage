/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 13:07:36 GMT 2022
 */

package com.github.dkellenb.formulaevaluator.definition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.dkellenb.formulaevaluator.definition.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Function_ESTest extends Function_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Function function0 = Function.MAX;
      Function function1 = Function.RANDOM;
      boolean boolean0 = function0.equals(function1);
      assertFalse(function1.equals((Object)function0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Function function0 = Function.RANDOM;
      int int0 = function0.getNumParams();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Function function0 = Function.MAX;
      int int0 = function0.getNumParams();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Function function0 = Function.MAX;
      String string0 = function0.getName();
      assertEquals("MAX", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Function function0 = null;
      try {
        function0 = new Function((String) null, (-799));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.dkellenb.formulaevaluator.definition.Function", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Function function0 = new Function("", (-2902));
      Function function1 = Function.MAX;
      boolean boolean0 = function0.equals(function1);
      assertEquals((-2902), function0.getNumParams());
      assertFalse(function1.equals((Object)function0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Function function0 = Function.LOG;
      boolean boolean0 = function0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Function function0 = Function.SINH;
      boolean boolean0 = function0.equals(function0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Function function0 = new Function("", (-2902));
      boolean boolean0 = function0.ROUND.equals("");
      assertFalse(boolean0);
      assertEquals((-2902), function0.getNumParams());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Function function0 = new Function("", (-2902));
      function0.getName();
      assertEquals((-2902), function0.getNumParams());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Function function0 = new Function("", (-2902));
      int int0 = function0.getNumParams();
      assertEquals((-2902), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Function function0 = Function.ROUND;
      function0.hashCode();
  }
}
