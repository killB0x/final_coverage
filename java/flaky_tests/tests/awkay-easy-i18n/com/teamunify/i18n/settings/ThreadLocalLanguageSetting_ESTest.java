/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 22:04:27 GMT 2022
 */

package com.teamunify.i18n.settings;

import org.junit.Test;
import static org.junit.Assert.*;
import com.teamunify.i18n.settings.LanguageSetting;
import com.teamunify.i18n.settings.ThreadLocalLanguageSetting;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ThreadLocalLanguageSetting_ESTest extends ThreadLocalLanguageSetting_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadLocalLanguageSetting threadLocalLanguageSetting0 = new ThreadLocalLanguageSetting();
      LanguageSetting languageSetting0 = threadLocalLanguageSetting0.initialValue();
      assertNotNull(languageSetting0);
  }
}
