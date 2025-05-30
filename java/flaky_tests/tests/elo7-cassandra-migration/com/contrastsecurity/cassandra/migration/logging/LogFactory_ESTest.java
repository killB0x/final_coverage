/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 08 20:38:52 GMT 2022
 */

package com.contrastsecurity.cassandra.migration.logging;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.contrastsecurity.cassandra.migration.logging.Log;
import com.contrastsecurity.cassandra.migration.logging.LogFactory;
import com.contrastsecurity.cassandra.migration.logging.apachecommons.ApacheCommonsLogCreator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LogFactory_ESTest extends LogFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        LogFactory.getLog((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.slf4j.LoggerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ApacheCommonsLogCreator apacheCommonsLogCreator0 = new ApacheCommonsLogCreator();
      LogFactory.setLogCreator(apacheCommonsLogCreator0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        LogFactory.getLog(class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("com.contrastsecurity.cassandra.migration.logging.apachecommons.ApacheCommonsLogCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Log log0 = LogFactory.getLog(class0);
      Class<Integer> class1 = Integer.class;
      Log log1 = LogFactory.getLog(class1);
      assertFalse(log1.equals((Object)log0));
  }
}
