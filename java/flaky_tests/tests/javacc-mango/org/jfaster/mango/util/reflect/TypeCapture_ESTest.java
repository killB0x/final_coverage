/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 15:13:22 GMT 2022
 */

package org.jfaster.mango.util.reflect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.util.reflect.TypeToken;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeCapture_ESTest extends TypeCapture_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.of(class0);
      Type type0 = typeToken0.capture();
      assertNotNull(type0);
  }
}
