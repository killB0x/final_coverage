/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 09:14:39 GMT 2022
 */

package it.unitn.disi.smatch.renderers.context;

import org.junit.Test;
import static org.junit.Assert.*;
import it.unitn.disi.smatch.renderers.context.ContextRendererException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContextRendererException_ESTest extends ContextRendererException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextRendererException contextRendererException0 = new ContextRendererException("it_");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("N|c;\u0006#k");
      ContextRendererException contextRendererException0 = new ContextRendererException("N|c;\u0006#k", mockThrowable0);
  }
}
