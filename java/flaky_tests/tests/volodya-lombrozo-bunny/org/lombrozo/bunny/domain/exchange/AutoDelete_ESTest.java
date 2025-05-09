/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 00:36:21 GMT 2022
 */

package org.lombrozo.bunny.domain.exchange;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.lombrozo.bunny.domain.exchange.AutoDelete;
import org.lombrozo.bunny.domain.exchange.Durable;
import org.lombrozo.bunny.domain.exchange.ExchangeDescription;
import org.lombrozo.bunny.domain.exchange.Internal;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AutoDelete_ESTest extends AutoDelete_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AutoDelete autoDelete0 = new AutoDelete();
      boolean boolean0 = autoDelete0.internal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Durable durable0 = new Durable();
      Internal internal0 = new Internal(durable0);
      AutoDelete autoDelete0 = new AutoDelete(internal0);
      boolean boolean0 = autoDelete0.durable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AutoDelete autoDelete0 = new AutoDelete((ExchangeDescription) null);
      // Undeclared exception!
      try { 
        autoDelete0.internal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.lombrozo.bunny.domain.exchange.AutoDelete", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AutoDelete autoDelete0 = new AutoDelete((ExchangeDescription) null);
      // Undeclared exception!
      try { 
        autoDelete0.durable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.lombrozo.bunny.domain.exchange.AutoDelete", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Durable durable0 = new Durable();
      Internal internal0 = new Internal(durable0);
      AutoDelete autoDelete0 = new AutoDelete(internal0);
      boolean boolean0 = autoDelete0.internal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AutoDelete autoDelete0 = new AutoDelete();
      boolean boolean0 = autoDelete0.autoDelete();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AutoDelete autoDelete0 = new AutoDelete();
      boolean boolean0 = autoDelete0.durable();
      assertFalse(boolean0);
  }
}
