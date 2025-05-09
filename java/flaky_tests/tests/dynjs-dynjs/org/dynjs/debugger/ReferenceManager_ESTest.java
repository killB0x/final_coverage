/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 21:27:00 GMT 2022
 */

package org.dynjs.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import org.dynjs.debugger.ReferenceManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReferenceManager_ESTest extends ReferenceManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReferenceManager referenceManager0 = new ReferenceManager();
      Object object0 = new Object();
      referenceManager0.getReference(object0);
      Object object1 = referenceManager0.getObject(1);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReferenceManager referenceManager0 = new ReferenceManager();
      Object object0 = new Object();
      referenceManager0.getReference(object0);
      int int0 = referenceManager0.getReference(object0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReferenceManager referenceManager0 = new ReferenceManager();
      Object object0 = referenceManager0.getObject(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReferenceManager referenceManager0 = new ReferenceManager();
      referenceManager0.reset();
  }
}
