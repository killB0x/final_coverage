/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 06:06:02 GMT 2022
 */

package xyz.luan.console.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import xyz.luan.console.parser.Context;
import xyz.luan.console.parser.Controller;
import xyz.luan.console.parser.DefaultConsole;
import xyz.luan.console.parser.call.CallResult;
import xyz.luan.console.parser.config.ConfigCallablesController;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConfigCallablesController configCallablesController0 = new ConfigCallablesController();
      Context context0 = new Context();
      DefaultConsole defaultConsole0 = new DefaultConsole();
      Controller<Context> controller0 = configCallablesController0.setup(context0, defaultConsole0);
      MockThrowable mockThrowable0 = new MockThrowable();
      MockException mockException0 = new MockException(":config :aliases :default", mockThrowable0);
      CallResult callResult0 = controller0.handleInvalidMethod(mockException0);
      assertEquals(1, callResult0.getResponseCode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConfigCallablesController configCallablesController0 = new ConfigCallablesController();
      MockException mockException0 = new MockException();
      // Undeclared exception!
      try { 
        configCallablesController0.handleInvalidMethod(mockException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("xyz.luan.console.parser.Controller", e);
      }
  }
}
