/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 07:33:17 GMT 2022
 */

package org.jdbcdslog;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Timestamp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jdbcdslog.SqlServerRdbmsSpecifics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SqlServerRdbmsSpecifics_ESTest extends SqlServerRdbmsSpecifics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SqlServerRdbmsSpecifics sqlServerRdbmsSpecifics0 = new SqlServerRdbmsSpecifics();
      MockDate mockDate0 = new MockDate();
      String string0 = sqlServerRdbmsSpecifics0.formatParameter(mockDate0);
      assertEquals("'2014-02-14'", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SqlServerRdbmsSpecifics sqlServerRdbmsSpecifics0 = new SqlServerRdbmsSpecifics();
      Timestamp timestamp0 = new Timestamp(1L);
      String string0 = sqlServerRdbmsSpecifics0.formatParameter(timestamp0);
      assertEquals("'1970-01-01 00:00:00'", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SqlServerRdbmsSpecifics sqlServerRdbmsSpecifics0 = new SqlServerRdbmsSpecifics();
      String string0 = sqlServerRdbmsSpecifics0.formatParameter("java.lang.Object@0000000002");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SqlServerRdbmsSpecifics sqlServerRdbmsSpecifics0 = new SqlServerRdbmsSpecifics();
      String string0 = sqlServerRdbmsSpecifics0.formatParameter((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SqlServerRdbmsSpecifics sqlServerRdbmsSpecifics0 = new SqlServerRdbmsSpecifics();
      String string0 = sqlServerRdbmsSpecifics0.formatParameter(sqlServerRdbmsSpecifics0);
      assertNotNull(string0);
  }
}
