/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 15:41:41 GMT 2022
 */

package pageunit.html;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import pageunit.html.HTMLStyleImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HTMLStyleImpl_ESTest extends HTMLStyleImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HTMLStyleImpl hTMLStyleImpl0 = new HTMLStyleImpl("pageunit.html.GenericHTMLComponent");
      assertFalse(hTMLStyleImpl0.hasChildNodes());
  }
}
