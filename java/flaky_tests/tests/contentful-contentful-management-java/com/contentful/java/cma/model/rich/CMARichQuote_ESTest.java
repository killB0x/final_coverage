/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:58:13 GMT 2022
 */

package com.contentful.java.cma.model.rich;

import org.junit.Test;
import static org.junit.Assert.*;
import com.contentful.java.cma.model.rich.CMARichQuote;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CMARichQuote_ESTest extends CMARichQuote_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CMARichQuote cMARichQuote0 = new CMARichQuote();
      assertEquals("blockquote", cMARichQuote0.getNodeType());
  }
}
