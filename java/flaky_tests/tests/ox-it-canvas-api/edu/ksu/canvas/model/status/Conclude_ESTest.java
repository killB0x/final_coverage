/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 11:16:55 GMT 2022
 */

package edu.ksu.canvas.model.status;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.ksu.canvas.model.status.Conclude;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Conclude_ESTest extends Conclude_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Conclude conclude0 = new Conclude();
      Boolean boolean0 = Boolean.TRUE;
      conclude0.setConclude(boolean0);
      Boolean boolean1 = conclude0.getConclude();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Conclude conclude0 = new Conclude();
      Boolean boolean0 = Boolean.valueOf(false);
      conclude0.setConclude(boolean0);
      Boolean boolean1 = conclude0.getConclude();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Conclude conclude0 = new Conclude();
      Boolean boolean0 = conclude0.getConclude();
      conclude0.setConclude(boolean0);
      assertNull(conclude0.getConclude());
  }
}
