/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 01:50:42 GMT 2022
 */

package com.google.common.css;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.css.IdentitySubstitutionMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IdentitySubstitutionMap_ESTest extends IdentitySubstitutionMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IdentitySubstitutionMap identitySubstitutionMap0 = new IdentitySubstitutionMap();
      // Undeclared exception!
      try { 
        identitySubstitutionMap0.get("8|`");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.common.css.IdentitySubstitutionMap", e);
      }
  }
}
