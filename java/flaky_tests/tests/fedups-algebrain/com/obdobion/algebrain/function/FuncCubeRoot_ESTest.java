/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 08:00:02 GMT 2022
 */

package com.obdobion.algebrain.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncCubeRoot;
import com.obdobion.algebrain.token.TokVariable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FuncCubeRoot_ESTest extends FuncCubeRoot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FuncCubeRoot funcCubeRoot0 = new FuncCubeRoot();
      ValueStack valueStack0 = new ValueStack();
      Integer integer0 = new Integer(1);
      valueStack0.add((Object) integer0);
      funcCubeRoot0.resolve(valueStack0);
      assertEquals(0, funcCubeRoot0.getLevel());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FuncCubeRoot funcCubeRoot0 = new FuncCubeRoot();
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) funcCubeRoot0);
      try { 
        funcCubeRoot0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // function(cbrt); invalid type FuncCubeRoot
         //
         verifyException("com.obdobion.algebrain.function.FuncCubeRoot", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FuncCubeRoot funcCubeRoot0 = new FuncCubeRoot();
      try { 
        funcCubeRoot0.resolve((ValueStack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.function.FuncCubeRoot", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FuncCubeRoot funcCubeRoot0 = new FuncCubeRoot();
      ValueStack valueStack0 = new ValueStack();
      try { 
        funcCubeRoot0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for function(cbrt)
         //
         verifyException("com.obdobion.algebrain.function.FuncCubeRoot", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TokVariable tokVariable0 = new TokVariable();
      FuncCubeRoot funcCubeRoot0 = new FuncCubeRoot(tokVariable0);
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "function(cbrt)");
      try { 
        funcCubeRoot0.resolve(valueStack0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FuncCubeRoot funcCubeRoot0 = null;
      try {
        funcCubeRoot0 = new FuncCubeRoot((TokVariable) null);
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
      FuncCubeRoot funcCubeRoot0 = new FuncCubeRoot();
      String string0 = funcCubeRoot0.toString();
      assertEquals("function(cbrt)", string0);
  }
}
