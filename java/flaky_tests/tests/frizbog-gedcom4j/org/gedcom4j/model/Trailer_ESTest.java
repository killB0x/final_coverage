/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 23:19:41 GMT 2022
 */

package org.gedcom4j.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gedcom4j.model.Trailer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Trailer_ESTest extends Trailer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Trailer trailer0 = new Trailer();
      boolean boolean0 = trailer0.equals(trailer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Trailer trailer0 = new Trailer();
      String string0 = trailer0.toString();
      assertEquals("Trailer []", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Trailer trailer0 = new Trailer();
      trailer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Trailer trailer0 = new Trailer();
      Object object0 = new Object();
      boolean boolean0 = trailer0.equals(object0);
      assertFalse(boolean0);
  }
}
