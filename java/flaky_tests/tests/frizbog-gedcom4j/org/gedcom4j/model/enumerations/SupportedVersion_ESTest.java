/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 23:09:11 GMT 2022
 */

package org.gedcom4j.model.enumerations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.model.enumerations.SupportedVersion;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SupportedVersion_ESTest extends SupportedVersion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportedVersion[] supportedVersionArray0 = SupportedVersion.values();
      assertEquals(2, supportedVersionArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportedVersion supportedVersion0 = SupportedVersion.valueOf("V5_5_1");
      assertEquals(SupportedVersion.V5_5_1, supportedVersion0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      try { 
        SupportedVersion.forString("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unsupported version: 
         //
         verifyException("org.gedcom4j.model.enumerations.SupportedVersion", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportedVersion supportedVersion0 = SupportedVersion.forString("5.5");
      assertEquals(SupportedVersion.V5_5, supportedVersion0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportedVersion supportedVersion0 = SupportedVersion.forString("5.5.1");
      assertEquals(SupportedVersion.V5_5_1, supportedVersion0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportedVersion supportedVersion0 = SupportedVersion.V5_5;
      String string0 = supportedVersion0.toString();
      assertEquals("5.5", string0);
  }
}
