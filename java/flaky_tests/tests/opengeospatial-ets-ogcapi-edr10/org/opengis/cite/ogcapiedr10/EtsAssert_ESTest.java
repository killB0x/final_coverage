/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 11:06:59 GMT 2022
 */

package org.opengis.cite.ogcapiedr10;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.opengis.cite.ogcapiedr10.EtsAssert;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EtsAssert_ESTest extends EtsAssert_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        EtsAssert.assertFalse(true, "");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // 
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EtsAssert.assertFalse(false, "cly?_kW");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        EtsAssert.assertTrue(false, "GTh`#T(Mu");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // GTh`#T(Mu
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EtsAssert.assertTrue(true, "");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EtsAssert etsAssert0 = new EtsAssert();
  }
}
