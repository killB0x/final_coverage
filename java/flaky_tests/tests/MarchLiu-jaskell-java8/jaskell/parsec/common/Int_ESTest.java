/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:18:23 GMT 2022
 */

package jaskell.parsec.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jaskell.parsec.common.Int;
import jaskell.parsec.common.State;
import jaskell.parsec.common.TxtState;
import java.io.EOFException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Int_ESTest extends Int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Int int0 = new Int();
      TxtState txtState0 = new TxtState("[}$t$.");
      try { 
        int0.parse((State<Character>) txtState0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expect [ is digit.
         //
         verifyException("jaskell.parsec.common.TxtState", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Int int0 = new Int();
      try { 
        int0.parse((State<Character>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.common.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Int int0 = new Int();
      TxtState txtState0 = new TxtState("jaskell.parsec.common.Int", "jaskell.parsec.common.Int");
      Integer integer0 = new Integer((-1676));
      txtState0.rollback(integer0);
      try { 
        int0.parse((State<Character>) txtState0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Int int0 = new Int();
      TxtState txtState0 = new TxtState("");
      try { 
        int0.parse((State<Character>) txtState0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jaskell.parsec.common.TxtState", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Int int0 = new Int();
      TxtState txtState0 = new TxtState("7q699rjh`AI)");
      String string0 = int0.parse((State<Character>) txtState0);
      assertEquals("7", string0);
  }
}
