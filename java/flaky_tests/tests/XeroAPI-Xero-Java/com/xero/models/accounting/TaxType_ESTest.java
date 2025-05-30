/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 20:19:47 GMT 2022
 */

package com.xero.models.accounting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.accounting.TaxType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TaxType_ESTest extends TaxType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaxType taxType0 = TaxType.fromValue("INPUT3");
      assertEquals(TaxType.INPUT3, taxType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TaxType[] taxTypeArray0 = TaxType.values();
      assertEquals(67, taxTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TaxType taxType0 = TaxType.valueOf("EXEMPTEXPORT");
      assertEquals("EXEMPTEXPORT", taxType0.getValue());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        TaxType.fromValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value ''
         //
         verifyException("com.xero.models.accounting.TaxType", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TaxType taxType0 = TaxType.fromValue("EXEMPTEXPORT");
      String string0 = taxType0.getValue();
      assertEquals("EXEMPTEXPORT", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TaxType taxType0 = TaxType.fromValue("EXEMPTEXPORT");
      String string0 = taxType0.toString();
      assertEquals("EXEMPTEXPORT", string0);
  }
}
