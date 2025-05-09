/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 13:45:19 GMT 2022
 */

package com.rogoman.easyauth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.rogoman.easyauth.Authenticator;
import com.rogoman.easyauth.InMemoryUsedCodesManager;
import com.rogoman.easyauth.TimeAuthenticator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Authenticator_ESTest extends Authenticator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeAuthenticator timeAuthenticator0 = new TimeAuthenticator();
      int int0 = 9;
      Authenticator.randomInt(9);
      InMemoryUsedCodesManager inMemoryUsedCodesManager0 = new InMemoryUsedCodesManager();
      // Undeclared exception!
      try { 
        inMemoryUsedCodesManager0.isCodeUsed((long) 9, (String) null, "com.rogoman.easyauth.AuthenticatorException");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/StringUtils
         //
         verifyException("com.rogoman.easyauth.InMemoryUsedCodesManager$UsedCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Authenticator.randomInt(39);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeAuthenticator timeAuthenticator0 = new TimeAuthenticator();
      // Undeclared exception!
      try { 
        timeAuthenticator0.stringEquals((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.rogoman.easyauth.Authenticator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Authenticator.randomInt((-1048));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be positive
         //
         verifyException("java.util.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TimeAuthenticator timeAuthenticator0 = new TimeAuthenticator();
      // Undeclared exception!
      try { 
        timeAuthenticator0.getCodeInternal("9 \"eb)\"", 30);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/StringUtils
         //
         verifyException("com.rogoman.easyauth.Base32Encoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TimeAuthenticator timeAuthenticator0 = new TimeAuthenticator();
      // Undeclared exception!
      try { 
        timeAuthenticator0.getCode("MFX5KKTDCRFVNSOE");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/StringUtils
         //
         verifyException("com.rogoman.easyauth.TimeAuthenticator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TimeAuthenticator timeAuthenticator0 = new TimeAuthenticator();
      // Undeclared exception!
      try { 
        timeAuthenticator0.checkCode("M63ZU66HJGESRZRV", "M63ZU66HJGESRZRV", "M63ZU66HJGESRZRV");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/StringUtils
         //
         verifyException("com.rogoman.easyauth.TimeAuthenticator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InMemoryUsedCodesManager inMemoryUsedCodesManager0 = new InMemoryUsedCodesManager(2, 125);
      TimeAuthenticator timeAuthenticator0 = new TimeAuthenticator(inMemoryUsedCodesManager0);
      boolean boolean0 = timeAuthenticator0.stringEquals("HACFCJJ4VULAIGET", ">]9,`>)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TimeAuthenticator timeAuthenticator0 = new TimeAuthenticator();
      boolean boolean0 = timeAuthenticator0.stringEquals(">]9,`>)", ">]9,`>)");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      String string0 = Authenticator.generateKey();
      //  // Unstable assertion: assertEquals("QCA2MHYK5YFMS5LT", string0);
  }
}
