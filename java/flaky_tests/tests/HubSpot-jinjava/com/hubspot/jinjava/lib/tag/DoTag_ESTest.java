/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 22:59:29 GMT 2022
 */

package com.hubspot.jinjava.lib.tag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.tag.DoTag;
import com.hubspot.jinjava.tree.TagNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DoTag_ESTest extends DoTag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DoTag doTag0 = new DoTag();
      // Undeclared exception!
      try { 
        doTag0.interpret((TagNode) null, (JinjavaInterpreter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.hubspot.jinjava.lib.tag.DoTag", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoTag doTag0 = new DoTag();
      String string0 = doTag0.getEndTagName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoTag doTag0 = new DoTag();
      String string0 = doTag0.getName();
      assertEquals("do", string0);
  }
}
