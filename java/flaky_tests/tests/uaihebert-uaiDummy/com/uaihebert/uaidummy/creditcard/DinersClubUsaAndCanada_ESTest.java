/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 02:21:46 GMT 2022
 */

package com.uaihebert.uaidummy.creditcard;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.uaihebert.uaidummy.creditcard.DinersClubUsaAndCanada;
import com.uaihebert.uaidummy.creditcard.DummyBaseCreditCard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DinersClubUsaAndCanada_ESTest extends DinersClubUsaAndCanada_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DinersClubUsaAndCanada dinersClubUsaAndCanada0 = new DinersClubUsaAndCanada();
      int int0 = dinersClubUsaAndCanada0.getSecurityNumberLength();
      assertEquals(3, int0);
      assertEquals("5400000000000005", dinersClubUsaAndCanada0.getNumber());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DinersClubUsaAndCanada dinersClubUsaAndCanada0 = new DinersClubUsaAndCanada();
      dinersClubUsaAndCanada0.getPrefix();
      assertEquals("5400000000000005", dinersClubUsaAndCanada0.getNumber());
      assertEquals("333", dinersClubUsaAndCanada0.getSecurityNumber());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DummyBaseCreditCard.setDefaultExpirationDateMask((String) null);
      DinersClubUsaAndCanada dinersClubUsaAndCanada0 = null;
      try {
        dinersClubUsaAndCanada0 = new DinersClubUsaAndCanada();
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
      DummyBaseCreditCard.setDefaultExpirationDateMask(">{HWC!Y)4u:");
      DinersClubUsaAndCanada dinersClubUsaAndCanada0 = null;
      try {
        dinersClubUsaAndCanada0 = new DinersClubUsaAndCanada();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'C'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DinersClubUsaAndCanada dinersClubUsaAndCanada0 = new DinersClubUsaAndCanada();
      int int0 = dinersClubUsaAndCanada0.getLength();
      assertEquals("5400000000000005", dinersClubUsaAndCanada0.getNumber());
      assertEquals("333", dinersClubUsaAndCanada0.getSecurityNumber());
      assertEquals(16, int0);
  }
}
