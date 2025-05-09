/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 02:17:28 GMT 2022
 */

package org.seasar.mayaa.impl.cycle.script;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.seasar.mayaa.impl.cycle.script.ScriptBlock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ScriptBlock_ESTest extends ScriptBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScriptBlock scriptBlock0 = null;
      try {
        scriptBlock0 = new ScriptBlock("L&6:", true, "U2");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.seasar.mayaa.impl.util.StringUtil
         //
         verifyException("org.seasar.mayaa.impl.cycle.script.ScriptBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScriptBlock scriptBlock0 = null;
      try {
        scriptBlock0 = new ScriptBlock((String) null, true, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.seasar.mayaa.impl.cycle.script.ScriptBlock", e);
      }
  }
}
