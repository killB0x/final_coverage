/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 08:45:58 GMT 2022
 */

package com.acidmanic.consoletools.textualcontent.builtin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.acidmanic.consoletools.textualcontent.builtin.TextWrapperStringModifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TextWrapperStringModifier_ESTest extends TextWrapperStringModifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextWrapperStringModifier textWrapperStringModifier0 = new TextWrapperStringModifier(1);
      String string0 = textWrapperStringModifier0.process("\n!\nk\n\"\n\"\nk\n3\nR\nj\nF\n]");
      assertEquals("\n!\nk\n\"\n\"\nk\n3\nR\nj\nF\n]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextWrapperStringModifier textWrapperStringModifier0 = new TextWrapperStringModifier(0);
      // Undeclared exception!
      textWrapperStringModifier0.process("v[p(z");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextWrapperStringModifier textWrapperStringModifier0 = new TextWrapperStringModifier((-1796));
      // Undeclared exception!
      try { 
        textWrapperStringModifier0.process("(s|.|;|,|-)");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextWrapperStringModifier textWrapperStringModifier0 = new TextWrapperStringModifier(1171);
      // Undeclared exception!
      try { 
        textWrapperStringModifier0.process((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.acidmanic.consoletools.textualcontent.builtin.TextWrapperStringModifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TextWrapperStringModifier textWrapperStringModifier0 = new TextWrapperStringModifier(1);
      String string0 = textWrapperStringModifier0.process("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TextWrapperStringModifier textWrapperStringModifier0 = new TextWrapperStringModifier(1);
      String string0 = textWrapperStringModifier0.process("!k\"\"k3RjF]");
      assertEquals("\n!\nk\n\"\n\"\nk\n3\nR\nj\nF\n]", string0);
  }
}
