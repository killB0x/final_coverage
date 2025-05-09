/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 02:19:46 GMT 2022
 */

package com.uaihebert.uaidummy.creditcard;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.uaihebert.uaidummy.creditcard.DummyBaseCreditCard;
import com.uaihebert.uaidummy.creditcard.InstaPayment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InstaPayment_ESTest extends InstaPayment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstaPayment instaPayment0 = new InstaPayment();
      int int0 = instaPayment0.getSecurityNumberLength();
      assertEquals(3, int0);
      assertEquals("3589000000000003", instaPayment0.getNumber());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InstaPayment instaPayment0 = new InstaPayment();
      instaPayment0.getPrefix();
      assertEquals("333", instaPayment0.getSecurityNumber());
      assertEquals("3589000000000003", instaPayment0.getNumber());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DummyBaseCreditCard.setDefaultExpirationDateMask((String) null);
      InstaPayment instaPayment0 = null;
      try {
        instaPayment0 = new InstaPayment();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DummyBaseCreditCard.setDefaultExpirationDateMask("8H:<Dn3du");
      InstaPayment instaPayment0 = null;
      try {
        instaPayment0 = new InstaPayment();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'n'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InstaPayment instaPayment0 = new InstaPayment();
      int int0 = instaPayment0.getLength();
      assertEquals("333", instaPayment0.getSecurityNumber());
      assertEquals("3589000000000003", instaPayment0.getNumber());
      assertEquals(16, int0);
  }
}
