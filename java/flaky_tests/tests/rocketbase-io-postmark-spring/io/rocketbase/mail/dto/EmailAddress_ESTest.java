/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 17:39:02 GMT 2022
 */

package io.rocketbase.mail.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.rocketbase.mail.dto.EmailAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmailAddress_ESTest extends EmailAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmailAddress emailAddress0 = new EmailAddress("u", "+gSF6KK(Pcb##MJF3d");
      String string0 = emailAddress0.getName();
      assertEquals("u", emailAddress0.getEmail());
      assertEquals("+gSF6KK(Pcb##MJF3d", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmailAddress emailAddress0 = new EmailAddress("", "");
      String string0 = emailAddress0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmailAddress emailAddress0 = new EmailAddress((String) null);
      String string0 = emailAddress0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmailAddress emailAddress0 = new EmailAddress("Hr8_bD;^C7gNC#*", "Hr8_bD;^C7gNC#*");
      String string0 = emailAddress0.getEmail();
      assertEquals("Hr8_bD;^C7gNC#*", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmailAddress emailAddress0 = new EmailAddress("");
      // Undeclared exception!
      try { 
        emailAddress0.toRecipient();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/springframework/util/StringUtils
         //
         verifyException("io.rocketbase.mail.dto.EmailAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmailAddress emailAddress0 = new EmailAddress("", "");
      String string0 = emailAddress0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmailAddress emailAddress0 = new EmailAddress((String) null);
      String string0 = emailAddress0.getName();
      assertNull(string0);
  }
}
