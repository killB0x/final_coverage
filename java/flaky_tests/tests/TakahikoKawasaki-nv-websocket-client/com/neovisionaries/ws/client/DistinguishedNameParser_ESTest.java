/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 13:07:15 GMT 2022
 */

package com.neovisionaries.ws.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.neovisionaries.ws.client.DistinguishedNameParser;
import javax.security.auth.x500.X500Principal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DistinguishedNameParser_ESTest extends DistinguishedNameParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("c=T}t?hQOD#e&PW");
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      // Undeclared exception!
      try { 
        distinguishedNameParser0.findMostSpecific((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DistinguishedNameParser distinguishedNameParser0 = null;
      try {
        distinguishedNameParser0 = new DistinguishedNameParser((X500Principal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.neovisionaries.ws.client.DistinguishedNameParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("c=}*F0hQOD(#e&P");
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("c");
      assertEquals("}*F0hQOD(#e&P", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("S=");
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("S=");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("");
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      X500Principal x500Principal0 = new X500Principal("c=T}t?hQOD#e&PW");
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("c=T}t?hQOD#e&PW");
      assertNull(string0);
  }
}
