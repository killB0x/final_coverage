/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 21:40:10 GMT 2022
 */

package dev.codesoapbox.dummy4j.definitions.providers.files;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dev.codesoapbox.dummy4j.definitions.providers.files.ResourceStreamProvider;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResourceStreamProvider_ESTest extends ResourceStreamProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ResourceStreamProvider resourceStreamProvider0 = new ResourceStreamProvider();
      InputStream inputStream0 = resourceStreamProvider0.get("Ex=)s6ujAZo");
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResourceStreamProvider resourceStreamProvider0 = new ResourceStreamProvider();
      // Undeclared exception!
      try { 
        resourceStreamProvider0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ResourceStreamProvider resourceStreamProvider0 = new ResourceStreamProvider();
      InputStream inputStream0 = resourceStreamProvider0.get("");
      assertEquals(12, inputStream0.available());
  }
}
