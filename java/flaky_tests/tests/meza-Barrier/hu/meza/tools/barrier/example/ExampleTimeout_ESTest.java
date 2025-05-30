/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 13:10:56 GMT 2022
 */

package hu.meza.tools.barrier.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import hu.meza.tools.barrier.CoolDownStrategy;
import hu.meza.tools.barrier.example.ExampleCoolDownStrategy;
import hu.meza.tools.barrier.example.ExampleTimeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExampleTimeout_ESTest extends ExampleTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExampleCoolDownStrategy exampleCoolDownStrategy0 = new ExampleCoolDownStrategy();
      ExampleTimeout exampleTimeout0 = new ExampleTimeout(exampleCoolDownStrategy0);
      exampleTimeout0.run();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExampleTimeout exampleTimeout0 = new ExampleTimeout((CoolDownStrategy) null);
      // Undeclared exception!
      try { 
        exampleTimeout0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("hu.meza.tools.barrier.example.ExampleTimeout", e);
      }
  }
}
