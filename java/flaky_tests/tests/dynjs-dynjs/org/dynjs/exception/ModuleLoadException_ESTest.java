/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 22:07:23 GMT 2022
 */

package org.dynjs.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dynjs.exception.ModuleLoadException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ModuleLoadException_ESTest extends ModuleLoadException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("org.dynjs.exception.ModuleLoadException");
      ModuleLoadException moduleLoadException0 = new ModuleLoadException("", mockThrowable0);
      String string0 = moduleLoadException0.getModuleName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ModuleLoadException moduleLoadException0 = new ModuleLoadException("org.dynjs.exception.ModuleLoadException", "E]/X");
      String string0 = moduleLoadException0.getMessage();
      assertEquals("Unable to load module 'org.dynjs.exception.ModuleLoadException': E]/X", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ModuleLoadException moduleLoadException0 = new ModuleLoadException("org.dynjs.exception.ModuleLoadException", "E]/X");
      String string0 = moduleLoadException0.getModuleName();
      assertEquals("org.dynjs.exception.ModuleLoadException", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ModuleLoadException moduleLoadException0 = new ModuleLoadException((String) null, (String) null);
      String string0 = moduleLoadException0.getModuleName();
      assertNull(string0);
  }
}
