/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 08:59:33 GMT 2022
 */

package com.acidmanic.consoletools.textualcontent.builtin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.acidmanic.consoletools.textualcontent.StringModifier;
import com.acidmanic.consoletools.textualcontent.builtin.BuiltinStringModifierPriority;
import com.acidmanic.consoletools.textualcontent.builtin.DoNothingStringModifier;
import com.acidmanic.consoletools.textualcontent.builtin.TextWrapperStringModifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BuiltinStringModifierPriority_ESTest extends BuiltinStringModifierPriority_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuiltinStringModifierPriority builtinStringModifierPriority0 = new BuiltinStringModifierPriority();
      DoNothingStringModifier doNothingStringModifier0 = new DoNothingStringModifier();
      TextWrapperStringModifier textWrapperStringModifier0 = new TextWrapperStringModifier(0);
      boolean boolean0 = builtinStringModifierPriority0.compare(doNothingStringModifier0, textWrapperStringModifier0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuiltinStringModifierPriority builtinStringModifierPriority0 = new BuiltinStringModifierPriority();
      // Undeclared exception!
      try { 
        builtinStringModifierPriority0.compare((StringModifier) null, (StringModifier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.acidmanic.consoletools.textualcontent.builtin.BuiltinStringModifierPriority", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuiltinStringModifierPriority builtinStringModifierPriority0 = new BuiltinStringModifierPriority();
      DoNothingStringModifier doNothingStringModifier0 = new DoNothingStringModifier();
      TextWrapperStringModifier textWrapperStringModifier0 = new TextWrapperStringModifier((-2051));
      boolean boolean0 = builtinStringModifierPriority0.compare(textWrapperStringModifier0, doNothingStringModifier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BuiltinStringModifierPriority builtinStringModifierPriority0 = new BuiltinStringModifierPriority();
      DoNothingStringModifier doNothingStringModifier0 = new DoNothingStringModifier();
      boolean boolean0 = builtinStringModifierPriority0.compare(doNothingStringModifier0, doNothingStringModifier0);
      assertFalse(boolean0);
  }
}
