/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 08:15:25 GMT 2022
 */

package com.obdobion.algebrain.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncAlpha;
import com.obdobion.algebrain.token.TokVariable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FuncAlpha_ESTest extends FuncAlpha_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FuncAlpha funcAlpha0 = new FuncAlpha();
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) funcAlpha0);
      try { 
        funcAlpha0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // function(alpha); invalid type FuncAlpha
         //
         verifyException("com.obdobion.algebrain.function.FuncAlpha", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FuncAlpha funcAlpha0 = new FuncAlpha();
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "function(alpha)");
      try { 
        funcAlpha0.resolve(valueStack0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FuncAlpha funcAlpha0 = new FuncAlpha();
      try { 
        funcAlpha0.resolve((ValueStack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.function.FuncAlpha", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FuncAlpha funcAlpha0 = null;
      try {
        funcAlpha0 = new FuncAlpha((TokVariable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.Function", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FuncAlpha funcAlpha0 = new FuncAlpha();
      ValueStack valueStack0 = new ValueStack();
      try { 
        funcAlpha0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for function(alpha)
         //
         verifyException("com.obdobion.algebrain.function.FuncAlpha", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FuncAlpha funcAlpha0 = new FuncAlpha();
      ValueStack valueStack0 = new ValueStack();
      Integer integer0 = new Integer((-1406));
      valueStack0.add((Object) integer0);
      funcAlpha0.resolve(valueStack0);
      assertEquals("[-1406]", valueStack0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TokVariable tokVariable0 = new TokVariable();
      FuncAlpha funcAlpha0 = new FuncAlpha(tokVariable0);
      assertEquals("function(alpha)", funcAlpha0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FuncAlpha funcAlpha0 = new FuncAlpha();
      String string0 = funcAlpha0.toString();
      assertEquals("function(alpha)", string0);
  }
}
