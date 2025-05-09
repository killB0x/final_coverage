/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 08:46:11 GMT 2022
 */

package io.unlaunch.engine;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.unlaunch.engine.UnlaunchBooleanValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnlaunchBooleanValue_ESTest extends UnlaunchBooleanValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      UnlaunchBooleanValue unlaunchBooleanValue0 = new UnlaunchBooleanValue(boolean0);
      String string0 = unlaunchBooleanValue0.toString();
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      UnlaunchBooleanValue unlaunchBooleanValue0 = new UnlaunchBooleanValue(boolean0);
      Boolean boolean1 = unlaunchBooleanValue0.get();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      UnlaunchBooleanValue unlaunchBooleanValue0 = new UnlaunchBooleanValue(boolean0);
      Boolean boolean1 = unlaunchBooleanValue0.get();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnlaunchBooleanValue unlaunchBooleanValue0 = new UnlaunchBooleanValue((Boolean) null);
      Boolean boolean0 = unlaunchBooleanValue0.get();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnlaunchBooleanValue unlaunchBooleanValue0 = new UnlaunchBooleanValue((Boolean) null);
      // Undeclared exception!
      try { 
        unlaunchBooleanValue0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.unlaunch.engine.UnlaunchBooleanValue", e);
      }
  }
}
