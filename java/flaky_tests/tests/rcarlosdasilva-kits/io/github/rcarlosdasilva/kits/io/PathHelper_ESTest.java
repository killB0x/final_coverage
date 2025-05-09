/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 12 08:47:55 GMT 2022
 */

package io.github.rcarlosdasilva.kits.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.rcarlosdasilva.kits.io.PathHelper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PathHelper_ESTest extends PathHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        PathHelper.fix("io.github.rcarlosdasilva.kits.net.UrlHelper");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Strings
         //
         verifyException("io.github.rcarlosdasilva.kits.io.PathHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        PathHelper.absolutePath("classpath:", class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Strings
         //
         verifyException("io.github.rcarlosdasilva.kits.io.PathHelper", e);
      }
  }
}
