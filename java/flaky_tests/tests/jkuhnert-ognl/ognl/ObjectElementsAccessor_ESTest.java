/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 14:32:53 GMT 2022
 */

package ognl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Enumeration;
import ognl.ObjectElementsAccessor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ObjectElementsAccessor_ESTest extends ObjectElementsAccessor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectElementsAccessor objectElementsAccessor0 = new ObjectElementsAccessor();
      Enumeration<?> enumeration0 = objectElementsAccessor0.getElements(objectElementsAccessor0);
      assertNotNull(enumeration0);
  }
}
