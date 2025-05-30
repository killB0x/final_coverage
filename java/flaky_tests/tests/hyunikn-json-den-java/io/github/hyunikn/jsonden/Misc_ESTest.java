/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 22:11:08 GMT 2022
 */

package io.github.hyunikn.jsonden;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.hyunikn.jsonden.Misc;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Misc_ESTest extends Misc_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = Misc.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Misc.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.hyunikn.jsonden.Misc", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = Misc.escape("Frx>%(L_q-^=QG/J");
      assertEquals("\\u007FFrx>%(L_q-^=QG/J", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Misc.escape("GSn,\"F'@Ep");
      assertEquals("GSn,\\\"F'@Ep", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Misc.escape("\t");
      assertEquals("\\t", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Misc misc0 = new Misc();
  }
}
