/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 14:16:31 GMT 2022
 */

package ognl;

import org.junit.Test;
import static org.junit.Assert.*;
import ognl.NumericDefaults;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NumericDefaults_ESTest extends NumericDefaults_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericDefaults numericDefaults0 = new NumericDefaults();
      Class<Object> class0 = Object.class;
      Object object0 = numericDefaults0.get(class0);
      assertNull(object0);
  }
}
