/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 22:22:40 GMT 2022
 */

package com.contrastsecurity.cassandra.migration;

import org.junit.Test;
import static org.junit.Assert.*;
import com.contrastsecurity.cassandra.migration.CassandraMigrationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CassandraMigrationException_ESTest extends CassandraMigrationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("B");
      CassandraMigrationException cassandraMigrationException0 = new CassandraMigrationException("B", mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CassandraMigrationException cassandraMigrationException0 = new CassandraMigrationException("com.contrastsecurity.cassandra.migration.CassandraMigrationException");
  }
}
