/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 07:23:18 GMT 2022
 */

package com.obdobion.algebrain.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.obdobion.algebrain.ValueStack;
import com.obdobion.algebrain.function.FuncStringReplace;
import com.obdobion.algebrain.token.TokVariable;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FuncStringReplace_ESTest extends FuncStringReplace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ValueStack valueStack0 = new ValueStack();
      Object object0 = new Object();
      valueStack0.add(object0);
      valueStack0.add(object0);
      valueStack0.add((Object) "");
      valueStack0.add((Object) null);
      TokVariable tokVariable0 = new TokVariable();
      FuncStringReplace funcStringReplace0 = new FuncStringReplace(tokVariable0);
      funcStringReplace0.setParameterCount(4);
      try { 
        funcStringReplace0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for function(replace)
         //
         verifyException("com.obdobion.algebrain.function.FuncStringReplace", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "@.g");
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      try { 
        funcStringReplace0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for function(replace)
         //
         verifyException("com.obdobion.algebrain.function.FuncStringReplace", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ValueStack valueStack0 = new ValueStack();
      Object object0 = new Object();
      valueStack0.add(object0);
      valueStack0.add(object0);
      valueStack0.add(object0);
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      funcStringReplace0.setParameterCount(3);
      try { 
        funcStringReplace0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // function(replace); Literal required, found Object
         //
         verifyException("com.obdobion.algebrain.function.FuncStringReplace", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "5hMJW:vu9To7?V[");
      valueStack0.add((Object) "5hMJW:vu9To7?V[");
      valueStack0.add((Object) "5hMJW:vu9To7?V[");
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      funcStringReplace0.setParameterCount(3);
      try { 
        funcStringReplace0.resolve(valueStack0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 14
         // 5hMJW:vu9To7?V[
         //               ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      try { 
        funcStringReplace0.resolve((ValueStack) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.function.FuncStringReplace", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "G");
      valueStack0.add((Object) "G");
      valueStack0.add((Object) "Hc$9zL");
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      funcStringReplace0.setParameterCount(3);
      try { 
        funcStringReplace0.resolve(valueStack0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // No group 9
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "$");
      valueStack0.add((Object) "$");
      valueStack0.add((Object) "$");
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      funcStringReplace0.setParameterCount(3);
      try { 
        funcStringReplace0.resolve(valueStack0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal group reference: group index is missing
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FuncStringReplace funcStringReplace0 = null;
      try {
        funcStringReplace0 = new FuncStringReplace((TokVariable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.obdobion.algebrain.Function", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      String string0 = funcStringReplace0.toString();
      assertEquals("function(replace)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      funcStringReplace0.setParameterCount(885);
      ValueStack valueStack0 = new ValueStack();
      try { 
        funcStringReplace0.resolve(valueStack0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // missing operands for function(replace)
         //
         verifyException("com.obdobion.algebrain.function.FuncStringReplace", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ValueStack valueStack0 = new ValueStack();
      valueStack0.add((Object) "@.g");
      valueStack0.add((Object) "@.g");
      valueStack0.add((Object) "e@pmge");
      FuncStringReplace funcStringReplace0 = new FuncStringReplace();
      funcStringReplace0.setParameterCount(3);
      funcStringReplace0.resolve(valueStack0);
      assertFalse(valueStack0.empty());
      assertEquals("[e@pmge]", valueStack0.toString());
  }
}
