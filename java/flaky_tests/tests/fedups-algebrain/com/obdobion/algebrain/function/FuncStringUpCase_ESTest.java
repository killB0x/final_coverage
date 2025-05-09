/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 08:02:46 GMT 2022
 */

package com.obdobion.algebrain.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncStringUpCase;
import com.obdobion.algebrain.token.TokVariable;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FuncStringUpCase_ESTest extends FuncStringUpCase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FuncStringUpCase funcStringUpCase0 = new FuncStringUpCase();
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) funcStringUpCase0);
      try { 
        funcStringUpCase0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // function(ucase); Literal required, found FuncStringUpCase
         //
         verifyException("com.obdobion.algebrain.function.FuncStringUpCase", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FuncStringUpCase funcStringUpCase0 = new FuncStringUpCase();
      try { 
        funcStringUpCase0.resolve((ValueStack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.function.FuncStringUpCase", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TokVariable tokVariable0 = new TokVariable();
      FuncStringUpCase funcStringUpCase0 = new FuncStringUpCase(tokVariable0);
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "var()");
      funcStringUpCase0.resolve(valueStack0);
      assertEquals(0, funcStringUpCase0.getLevel());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FuncStringUpCase funcStringUpCase0 = new FuncStringUpCase();
      funcStringUpCase0.setParameterCount(133);
      ValueStack valueStack0 = new ValueStack();
      try { 
        funcStringUpCase0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for function(ucase)
         //
         verifyException("com.obdobion.algebrain.function.FuncStringUpCase", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FuncStringUpCase funcStringUpCase0 = new FuncStringUpCase();
      ValueStack valueStack0 = new ValueStack();
      try { 
        funcStringUpCase0.resolve(valueStack0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FuncStringUpCase funcStringUpCase0 = null;
      try {
        funcStringUpCase0 = new FuncStringUpCase((TokVariable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.Function", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FuncStringUpCase funcStringUpCase0 = new FuncStringUpCase();
      String string0 = funcStringUpCase0.toString();
      assertEquals("function(ucase)", string0);
  }
}
