/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 08:54:32 GMT 2022
 */

package se.mockachino.verifier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import se.mockachino.verifier.BadUsageThrower;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BadUsageThrower_ESTest extends BadUsageThrower_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BadUsageThrower badUsageThrower0 = new BadUsageThrower("vpkO>'6E/'0");
      Object[] objectArray0 = new Object[0];
      try { 
        badUsageThrower0.invoke("vpkO>'6E/'0", (Method) null, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // vpkO>'6E/'0
         //
      }
  }
}
