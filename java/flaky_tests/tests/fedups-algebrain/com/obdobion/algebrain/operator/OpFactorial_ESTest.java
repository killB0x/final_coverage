/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 07:18:20 GMT 2022
 */

package com.obdobion.algebrain.operator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.EquPart;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncDegreesToRads;
import com.obdobion.algebrain.function.FuncNot;
import com.obdobion.algebrain.function.FuncRound;
import com.obdobion.algebrain.operator.OpFactorial;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OpFactorial_ESTest extends OpFactorial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "op(factorial)");
      try { 
        opFactorial0.resolve(valueStack0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"op(factorial)\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      try { 
        opFactorial0.resolve((ValueStack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.operator.OpFactorial", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpFactorial opFactorial0 = null;
      try {
        opFactorial0 = new OpFactorial((EquPart) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.Operator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      String string0 = opFactorial0.toString();
      assertEquals("op(factorial)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) opFactorial0);
      try { 
        opFactorial0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // op(factorial); invalid type OpFactorial
         //
         verifyException("com.obdobion.algebrain.operator.OpFactorial", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      FuncDegreesToRads funcDegreesToRads0 = new FuncDegreesToRads();
      boolean boolean0 = opFactorial0.multiplize(funcDegreesToRads0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      boolean boolean0 = opFactorial0.multiplize(opFactorial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      int int0 = opFactorial0.precedence();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      FuncRound funcRound0 = new FuncRound();
      boolean boolean0 = opFactorial0.negatize(funcRound0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpFactorial opFactorial0 = new OpFactorial();
      ValueStack valueStack0 = new ValueStack();
      try { 
        opFactorial0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operand for op(factorial)
         //
         verifyException("com.obdobion.algebrain.operator.OpFactorial", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FuncNot funcNot0 = new FuncNot();
      OpFactorial opFactorial0 = new OpFactorial(funcNot0);
      assertTrue(opFactorial0.includeInRpn());
  }
}
