/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 19:57:43 GMT 2022
 */

package com.xero.models.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xero.models.file.ObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ObjectType_ESTest extends ObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectType objectType0 = ObjectType.fromValue("PayRun");
      assertEquals(ObjectType.PAYRUN, objectType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectType[] objectTypeArray0 = ObjectType.values();
      assertEquals(56, objectTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectType objectType0 = ObjectType.valueOf("SALES");
      assertEquals(ObjectType.SALES, objectType0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectType objectType0 = ObjectType.fromValue("AccRec");
      assertEquals(ObjectType.ACCREC, objectType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ObjectType.fromValue("j'f]y4JX]0WC1Pj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected value 'j'f]y4JX]0WC1Pj'
         //
         verifyException("com.xero.models.file.ObjectType", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectType objectType0 = ObjectType.ARPREPAYMENTPAYMENT;
      String string0 = objectType0.getValue();
      assertEquals("ArPrepaymentPayment", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectType objectType0 = ObjectType.APCREDITPAYMENT;
      String string0 = objectType0.toString();
      assertEquals("ApCreditPayment", string0);
  }
}
