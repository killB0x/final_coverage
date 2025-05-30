/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 08:19:59 GMT 2022
 */

package com.obdobion.algebrain.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncStringIndexOf;
import com.obdobion.algebrain.token.TokVariable;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FuncStringIndexOf_ESTest extends FuncStringIndexOf_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TokVariable tokVariable0 = new TokVariable();
      tokVariable0.put('j');
      FuncStringIndexOf funcStringIndexOf0 = new FuncStringIndexOf(tokVariable0);
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "function(indexOf)");
      valueStack0.add((Object) tokVariable0);
      funcStringIndexOf0.resolve(valueStack0);
      try { 
        funcStringIndexOf0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // function(indexOf); Literal required, found Double
         //
         verifyException("com.obdobion.algebrain.function.FuncStringIndexOf", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TokVariable tokVariable0 = new TokVariable();
      FuncStringIndexOf funcStringIndexOf0 = new FuncStringIndexOf(tokVariable0);
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "function(indexOf)");
      try { 
        funcStringIndexOf0.resolve(valueStack0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TokVariable tokVariable0 = new TokVariable();
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) tokVariable0);
      FuncStringIndexOf funcStringIndexOf0 = new FuncStringIndexOf();
      try { 
        funcStringIndexOf0.resolve(valueStack0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FuncStringIndexOf funcStringIndexOf0 = new FuncStringIndexOf();
      try { 
        funcStringIndexOf0.resolve((ValueStack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.function.FuncStringIndexOf", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FuncStringIndexOf funcStringIndexOf0 = null;
      try {
        funcStringIndexOf0 = new FuncStringIndexOf((TokVariable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.Function", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TokVariable tokVariable0 = new TokVariable();
      FuncStringIndexOf funcStringIndexOf0 = new FuncStringIndexOf(tokVariable0);
      ValueStack valueStack0 = new ValueStack();
      try { 
        funcStringIndexOf0.resolve(valueStack0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FuncStringIndexOf funcStringIndexOf0 = new FuncStringIndexOf();
      funcStringIndexOf0.setParameterCount(1252);
      ValueStack valueStack0 = new ValueStack();
      try { 
        funcStringIndexOf0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for function(indexOf)
         //
         verifyException("com.obdobion.algebrain.function.FuncStringIndexOf", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TokVariable tokVariable0 = new TokVariable();
      FuncStringIndexOf funcStringIndexOf0 = new FuncStringIndexOf(tokVariable0);
      String string0 = funcStringIndexOf0.toString();
      assertEquals("function(indexOf)", string0);
  }
}
