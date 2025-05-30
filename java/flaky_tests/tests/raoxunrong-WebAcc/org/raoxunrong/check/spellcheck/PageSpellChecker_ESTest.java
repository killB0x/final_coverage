/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 23:04:07 GMT 2022
 */

package org.raoxunrong.check.spellcheck;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker;
import org.raoxunrong.domain.page.CheckablePage;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PageSpellChecker_ESTest extends PageSpellChecker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker0 = new FirefoxSpellCheckerImprovedChecker();
      try { 
        firefoxSpellCheckerImprovedChecker0.doCheck((CheckablePage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker", e);
      }
  }
}
