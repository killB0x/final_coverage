/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 09:38:54 GMT 2022
 */

package org.xson.tangyuan.executor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xson.tangyuan.executor.ServiceException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ServiceException_ESTest extends ServiceException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServiceException serviceException0 = null;
      try {
        serviceException0 = new ServiceException();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.xson.tangyuan.TangYuanContainer
         //
         verifyException("org.xson.tangyuan.executor.ServiceException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServiceException serviceException0 = null;
      try {
        serviceException0 = new ServiceException(20, "&c9lX");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.xson.tangyuan.TangYuanContainer
         //
         verifyException("org.xson.tangyuan.executor.ServiceException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServiceException serviceException0 = null;
      try {
        serviceException0 = new ServiceException((Throwable) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.xson.tangyuan.TangYuanContainer
         //
         verifyException("org.xson.tangyuan.executor.ServiceException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ServiceException serviceException0 = null;
      try {
        serviceException0 = new ServiceException(0, "9l", (Throwable) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.xson.tangyuan.TangYuanContainer
         //
         verifyException("org.xson.tangyuan.executor.ServiceException", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServiceException serviceException0 = null;
      try {
        serviceException0 = new ServiceException((String) null, (Throwable) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.xson.tangyuan.TangYuanContainer
         //
         verifyException("org.xson.tangyuan.executor.ServiceException", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ServiceException serviceException0 = null;
      try {
        serviceException0 = new ServiceException("org.xsn.tangyuan.exeutor.ServiceException");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.xson.tangyuan.TangYuanContainer
         //
         verifyException("org.xson.tangyuan.executor.ServiceException", e);
      }
  }
}
