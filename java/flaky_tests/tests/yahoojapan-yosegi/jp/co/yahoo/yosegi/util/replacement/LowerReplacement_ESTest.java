/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 01:31:42 GMT 2022
 */

package jp.co.yahoo.yosegi.util.replacement;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jp.co.yahoo.yosegi.util.replacement.LowerReplacement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LowerReplacement_ESTest extends LowerReplacement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LowerReplacement lowerReplacement0 = new LowerReplacement();
      String string0 = lowerReplacement0.replace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LowerReplacement lowerReplacement0 = new LowerReplacement();
      // Undeclared exception!
      try { 
        lowerReplacement0.replace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jp.co.yahoo.yosegi.util.replacement.LowerReplacement", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LowerReplacement lowerReplacement0 = new LowerReplacement();
      String string0 = lowerReplacement0.replace("R~6aq`Zj`orL/PV");
      assertEquals("r~6aq`zj`orl/pv", string0);
  }
}
