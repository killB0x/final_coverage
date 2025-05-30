/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 20:20:39 GMT 2022
 */

package org.opengis.cite.indoorgml10.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.opengis.cite.indoorgml10.model.State;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class State_ESTest extends State_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      State state0 = new State("4eSASmH.&.jG-xd");
      state0.setGmlid((String) null);
      String string0 = state0.getGmlid();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      State state0 = new State("}_ThWZ");
      state0.setGmlid("");
      String string0 = state0.getGmlid();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      State state0 = new State("jk#J)oZmH`olP|");
      String string0 = state0.getGmlid();
      assertEquals("jk#J)oZmH`olP|", string0);
  }
}
