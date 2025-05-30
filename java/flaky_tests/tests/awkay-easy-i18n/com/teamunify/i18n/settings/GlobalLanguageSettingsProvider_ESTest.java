/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 16 22:04:38 GMT 2022
 */

package com.teamunify.i18n.settings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.teamunify.i18n.settings.GlobalLanguageSettingsProvider;
import com.teamunify.i18n.settings.LanguageSetting;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GlobalLanguageSettingsProvider_ESTest extends GlobalLanguageSettingsProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GlobalLanguageSettingsProvider globalLanguageSettingsProvider0 = new GlobalLanguageSettingsProvider();
      Locale locale0 = Locale.GERMAN;
      globalLanguageSettingsProvider0.setLocale(locale0);
      LanguageSetting languageSetting0 = globalLanguageSettingsProvider0.vend();
      assertNotNull(languageSetting0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GlobalLanguageSettingsProvider globalLanguageSettingsProvider0 = new GlobalLanguageSettingsProvider();
      LanguageSetting languageSetting0 = globalLanguageSettingsProvider0.vend();
      assertNull(languageSetting0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GlobalLanguageSettingsProvider globalLanguageSettingsProvider0 = new GlobalLanguageSettingsProvider();
      // Undeclared exception!
      try { 
        globalLanguageSettingsProvider0.setLocale((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.teamunify.i18n.settings.LanguageSetting", e);
      }
  }
}
