/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 06:10:39 GMT 2022
 */

package xyz.luan.console.parser.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import xyz.luan.console.parser.actions.InvalidAction;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InvalidAction_ESTest extends InvalidAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidAction invalidAction0 = null;
      try {
        invalidAction0 = new InvalidAction((Method) null, "Action %s:%s is invalid: %s");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("xyz.luan.console.parser.actions.InvalidAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InvalidAction invalidAction0 = new InvalidAction("tF/5f(2(QnVD");
  }
}
