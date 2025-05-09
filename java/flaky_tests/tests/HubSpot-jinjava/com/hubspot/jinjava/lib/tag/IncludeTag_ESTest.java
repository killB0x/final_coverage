/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:09:05 GMT 2022
 */

package com.hubspot.jinjava.lib.tag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.tag.IncludeTag;
import com.hubspot.jinjava.tree.TagNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IncludeTag_ESTest extends IncludeTag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IncludeTag includeTag0 = new IncludeTag();
      // Undeclared exception!
      try { 
        includeTag0.interpret((TagNode) null, (JinjavaInterpreter) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/hubspot/jinjava/util/HelperStringTokenizer
         //
         verifyException("com.hubspot.jinjava.lib.tag.IncludeTag", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IncludeTag includeTag0 = new IncludeTag();
      String string0 = includeTag0.getName();
      assertEquals("include", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IncludeTag includeTag0 = new IncludeTag();
      String string0 = includeTag0.getEndTagName();
      assertNull(string0);
  }
}
