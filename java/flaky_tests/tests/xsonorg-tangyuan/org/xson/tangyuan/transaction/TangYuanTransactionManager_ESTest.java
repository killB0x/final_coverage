/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 08:19:59 GMT 2022
 */

package org.xson.tangyuan.transaction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xson.tangyuan.transaction.TangYuanTransactionManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TangYuanTransactionManager_ESTest extends TangYuanTransactionManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TangYuanTransactionManager tangYuanTransactionManager0 = null;
      try {
        tangYuanTransactionManager0 = new TangYuanTransactionManager();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.xson.tangyuan.TangYuanContainer
         //
         verifyException("org.xson.tangyuan.transaction.DefaultTransactionManager", e);
      }
  }
}
