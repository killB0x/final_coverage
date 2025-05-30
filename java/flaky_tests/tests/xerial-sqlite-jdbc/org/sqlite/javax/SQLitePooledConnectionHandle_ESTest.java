/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 16:14:32 GMT 2022
 */

package org.sqlite.javax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sqlite.javax.SQLitePooledConnection;
import org.sqlite.javax.SQLitePooledConnectionHandle;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SQLitePooledConnectionHandle_ESTest extends SQLitePooledConnectionHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SQLitePooledConnectionHandle sQLitePooledConnectionHandle0 = null;
      try {
        sQLitePooledConnectionHandle0 = new SQLitePooledConnectionHandle((SQLitePooledConnection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sqlite.javax.SQLitePooledConnectionHandle", e);
      }
  }
}
