/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:50:49 GMT 2022
 */

package dev.codesoapbox.dummy4j.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dev.codesoapbox.dummy4j.exceptions.UrlCouldNotBeCreatedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UrlCouldNotBeCreatedException_ESTest extends UrlCouldNotBeCreatedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("+gE!E");
      UrlCouldNotBeCreatedException urlCouldNotBeCreatedException0 = new UrlCouldNotBeCreatedException(mockThrowable0);
      String string0 = urlCouldNotBeCreatedException0.getMessage();
      assertEquals("Url could not be created due to the following error: [ +gE!E ]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UrlCouldNotBeCreatedException urlCouldNotBeCreatedException0 = new UrlCouldNotBeCreatedException((Throwable) null);
      // Undeclared exception!
      try { 
        urlCouldNotBeCreatedException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dev.codesoapbox.dummy4j.exceptions.UrlCouldNotBeCreatedException", e);
      }
  }
}
