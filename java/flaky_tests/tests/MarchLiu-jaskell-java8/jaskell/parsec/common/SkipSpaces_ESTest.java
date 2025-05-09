/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:49:39 GMT 2022
 */

package jaskell.parsec.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.parsec.common.SkipSpaces;
import jaskell.parsec.common.State;
import jaskell.parsec.common.TxtState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SkipSpaces_ESTest extends SkipSpaces_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SkipSpaces skipSpaces0 = new SkipSpaces();
      TxtState txtState0 = new TxtState("jaskell.parsec.common.SkipSpaces");
      Character character0 = skipSpaces0.parse((State<Character>) txtState0);
      assertNull(character0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SkipSpaces skipSpaces0 = new SkipSpaces();
      try { 
        skipSpaces0.parse((State<Character>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.common.Skip", e);
      }
  }
}
