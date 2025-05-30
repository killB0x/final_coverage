/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 31 23:53:56 GMT 2022
 */

package com.hubspot.jinjava.lib.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hubspot.jinjava.interpret.JinjavaInterpreter;
import com.hubspot.jinjava.lib.filter.TruncateFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TruncateFilter_ESTest extends TruncateFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TruncateFilter truncateFilter0 = new TruncateFilter();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        truncateFilter0.filter((Object) "truncate", (JinjavaInterpreter) null, stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/fasterxml/jackson/core/PrettyPrinter
         //
         verifyException("com.hubspot.jinjava.lib.fn.Functions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TruncateFilter truncateFilter0 = new TruncateFilter();
      String string0 = truncateFilter0.getName();
      assertEquals("truncate", string0);
  }
}
