/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:57:03 GMT 2022
 */

package net.named_data.jndn.security.v2.validator_config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;
import net.named_data.jndn.Interest;
import net.named_data.jndn.Name;
import net.named_data.jndn.security.v2.InterestValidationFailureCallback;
import net.named_data.jndn.security.v2.InterestValidationState;
import net.named_data.jndn.security.v2.InterestValidationSuccessCallback;
import net.named_data.jndn.security.v2.ValidationState;
import net.named_data.jndn.security.v2.validator_config.ConfigRegexChecker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConfigRegexChecker_ESTest extends ConfigRegexChecker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConfigRegexChecker configRegexChecker0 = new ConfigRegexChecker("<.>");
      Name name0 = new Name();
      Name name1 = new Name("");
      // Undeclared exception!
      try { 
        configRegexChecker0.checkNames(name0, name1, (ValidationState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.security.v2.validator_config.ConfigRegexChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConfigRegexChecker configRegexChecker0 = new ConfigRegexChecker("<.*LU>+");
      Name name0 = new Name();
      Interest interest0 = new Interest();
      InterestValidationSuccessCallback interestValidationSuccessCallback0 = mock(InterestValidationSuccessCallback.class, new ViolatedAssumptionAnswer());
      InterestValidationFailureCallback interestValidationFailureCallback0 = mock(InterestValidationFailureCallback.class, new ViolatedAssumptionAnswer());
      InterestValidationState interestValidationState0 = new InterestValidationState(interest0, interestValidationSuccessCallback0, interestValidationFailureCallback0);
      configRegexChecker0.checkNames(name0, name0, interestValidationState0);
      // Undeclared exception!
      try { 
        configRegexChecker0.checkNames(name0, name0, interestValidationState0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The ValidationState already has an outcome
         //
         verifyException("net.named_data.jndn.security.v2.ValidationState", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InterestValidationSuccessCallback interestValidationSuccessCallback0 = mock(InterestValidationSuccessCallback.class, new ViolatedAssumptionAnswer());
      ConfigRegexChecker configRegexChecker0 = new ConfigRegexChecker("<.*>*");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) interestValidationSuccessCallback0);
      Name name0 = new Name(arrayList0);
      // Undeclared exception!
      try { 
        configRegexChecker0.checkNames(name0, name0, (ValidationState) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class net.named_data.jndn.security.v2.InterestValidationSuccessCallback$MockitoMock$1936797740 cannot be cast to class net.named_data.jndn.Name$Component (net.named_data.jndn.security.v2.InterestValidationSuccessCallback$MockitoMock$1936797740 and net.named_data.jndn.Name$Component are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5eaaf88d)
         //
         verifyException("net.named_data.jndn.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConfigRegexChecker configRegexChecker0 = null;
      try {
        configRegexChecker0 = new ConfigRegexChecker("}");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unexpected syntax
         //
         verifyException("net.named_data.jndn.util.regex.NdnRegexPatternListMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConfigRegexChecker configRegexChecker0 = null;
      try {
        configRegexChecker0 = new ConfigRegexChecker("<*>*");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Dangling meta character '*' near index 0
         // *
         // ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConfigRegexChecker configRegexChecker0 = null;
      try {
        configRegexChecker0 = new ConfigRegexChecker("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConfigRegexChecker configRegexChecker0 = null;
      try {
        configRegexChecker0 = new ConfigRegexChecker((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.named_data.jndn.util.regex.NdnRegexTopMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ConfigRegexChecker configRegexChecker0 = new ConfigRegexChecker("<.*>*");
      Name name0 = new Name("<.*>*");
      boolean boolean0 = configRegexChecker0.checkNames(name0, name0, (ValidationState) null);
      assertTrue(boolean0);
  }
}
