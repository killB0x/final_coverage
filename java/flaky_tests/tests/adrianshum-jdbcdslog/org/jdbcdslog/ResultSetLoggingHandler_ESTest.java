/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 07:26:34 GMT 2022
 */

package org.jdbcdslog;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdbcdslog.LogMetaData;
import org.jdbcdslog.ResultSetLoggingHandler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResultSetLoggingHandler_ESTest extends ResultSetLoggingHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LogMetaData logMetaData0 = LogMetaData.create();
      ResultSetLoggingHandler resultSetLoggingHandler0 = new ResultSetLoggingHandler(logMetaData0, (ResultSet) null);
      Object[] objectArray0 = new Object[0];
      try { 
        resultSetLoggingHandler0.invoke(logMetaData0, (Method) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jdbcdslog.ResultSetLoggingHandler", e);
      }
  }
}
