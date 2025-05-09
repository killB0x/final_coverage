/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:46:11 GMT 2022
 */

package com.hubspot.jinjava.lib.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.filter.EscapeJsonFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EscapeJsonFilter_ESTest extends EscapeJsonFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EscapeJsonFilter escapeJsonFilter0 = new EscapeJsonFilter();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        escapeJsonFilter0.filter((Object) "escapejson", (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringEscapeUtils
         //
         verifyException("com.hubspot.jinjava.lib.filter.EscapeJsonFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EscapeJsonFilter escapeJsonFilter0 = new EscapeJsonFilter();
      String string0 = escapeJsonFilter0.getName();
      assertEquals("escapejson", string0);
  }
}
