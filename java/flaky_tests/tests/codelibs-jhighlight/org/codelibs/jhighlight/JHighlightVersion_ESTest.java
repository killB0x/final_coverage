/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 03:23:53 GMT 2022
 */

package org.codelibs.jhighlight;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.codelibs.jhighlight.JHighlightVersion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JHighlightVersion_ESTest extends JHighlightVersion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JHighlightVersion jHighlightVersion0 = null;
      try {
        jHighlightVersion0 = new JHighlightVersion();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/output/ByteArrayOutputStream
         //
         verifyException("org.codelibs.jhighlight.JHighlightVersion", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        JHighlightVersion.getVersion();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.codelibs.jhighlight.JHighlightVersionSingleton
         //
         verifyException("org.codelibs.jhighlight.JHighlightVersion", e);
      }
  }
}
