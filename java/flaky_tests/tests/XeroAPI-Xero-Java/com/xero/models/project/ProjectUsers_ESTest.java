/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 17:54:42 GMT 2022
 */

package com.xero.models.project;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.project.ProjectUsers;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProjectUsers_ESTest extends ProjectUsers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProjectUsers projectUsers0 = null;
      try {
        projectUsers0 = new ProjectUsers();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/threeten/bp/ZoneId
         //
         verifyException("com.xero.models.project.ProjectUsers", e);
      }
  }
}
