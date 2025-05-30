/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 17:50:40 GMT 2022
 */

package com.kestreldigital.conjuror.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.kestreldigital.conjuror.utils.ResourceUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResourceUtils_ESTest extends ResourceUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ResourceUtils resourceUtils0 = new ResourceUtils();
      // Undeclared exception!
      try { 
        resourceUtils0.readResourceToStringList((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResourceUtils resourceUtils0 = new ResourceUtils();
      // Undeclared exception!
      try { 
        resourceUtils0.readResourceToStringList("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("com.kestreldigital.conjuror.utils.ResourceUtils", e);
      }
  }
}
