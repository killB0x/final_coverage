/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 10:35:53 GMT 2022
 */

package io.gsonfire.util.reflection;

import org.junit.Test;
import static org.junit.Assert.*;
import io.gsonfire.util.reflection.MethodInspector;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MethodInspector_ESTest extends MethodInspector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MethodInspector methodInspector0 = new MethodInspector();
      Method method0 = methodInspector0.map((Method) null);
      assertNull(method0);
  }
}
