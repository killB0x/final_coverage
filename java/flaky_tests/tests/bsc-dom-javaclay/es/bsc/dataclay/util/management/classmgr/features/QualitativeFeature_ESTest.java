/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 14:20:29 GMT 2022
 */

package es.bsc.dataclay.util.management.classmgr.features;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.bsc.dataclay.util.management.classmgr.features.LanguageFeature;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QualitativeFeature_ESTest extends QualitativeFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LanguageFeature languageFeature0 = null;
      try {
        languageFeature0 = new LanguageFeature("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Language name is null or empty
         //
         verifyException("es.bsc.dataclay.util.management.classmgr.features.LanguageFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LanguageFeature languageFeature0 = new LanguageFeature();
      assertNull(languageFeature0.getType());
  }
}
