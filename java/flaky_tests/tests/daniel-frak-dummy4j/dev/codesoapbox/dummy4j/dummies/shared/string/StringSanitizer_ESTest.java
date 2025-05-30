/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:39:20 GMT 2022
 */

package dev.codesoapbox.dummy4j.dummies.shared.string;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dev.codesoapbox.dummy4j.dummies.shared.string.StringSanitizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringSanitizer_ESTest extends StringSanitizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = StringSanitizer.sanitizeForEmail("^Q");
      assertEquals("^Q", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringSanitizer.sanitizeForEmail((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.Normalizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = StringSanitizer.sanitizeForEmail("");
      assertEquals("", string0);
  }
}
