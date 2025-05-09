/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:30:26 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.QNameW;
import com.evolvedbinary.xpath.parser.ast.VarRef;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VarRef_ESTest extends VarRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QNameW qNameW0 = new QNameW((String) null);
      VarRef varRef0 = new VarRef(qNameW0);
      // Undeclared exception!
      try { 
        varRef0.equals(varRef0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.QNameW", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QNameW qNameW0 = new QNameW("PH@f<h2db`N2:4yETo");
      VarRef varRef0 = new VarRef(qNameW0);
      boolean boolean0 = varRef0.equals(varRef0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QNameW qNameW0 = new QNameW("PH@f<h2db`N2:4yETo");
      VarRef varRef0 = new VarRef(qNameW0);
      Object object0 = new Object();
      boolean boolean0 = varRef0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QNameW qNameW0 = new QNameW((String) null);
      VarRef varRef0 = new VarRef(qNameW0);
      boolean boolean0 = varRef0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VarRef varRef0 = new VarRef((QNameW) null);
      String string0 = varRef0.describe();
      assertEquals("VarRef(null)", string0);
  }
}
