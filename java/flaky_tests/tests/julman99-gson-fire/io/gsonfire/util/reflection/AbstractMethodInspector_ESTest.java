/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 10:37:58 GMT 2022
 */

package io.gsonfire.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.gsonfire.util.reflection.MethodInspector;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractMethodInspector_ESTest extends AbstractMethodInspector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MethodInspector methodInspector0 = new MethodInspector();
      Class<Object> class0 = Object.class;
      Method[] methodArray0 = methodInspector0.getDeclaredMembers(class0);
      assertEquals(12, methodArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MethodInspector methodInspector0 = new MethodInspector();
      // Undeclared exception!
      try { 
        methodInspector0.getDeclaredMembers((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.util.ReflectionUtils", e);
      }
  }
}
