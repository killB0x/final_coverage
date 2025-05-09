/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 22:40:05 GMT 2022
 */

package org.jfaster.mango.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLNonTransientException;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransactionRollbackException;
import java.sql.SQLTransientConnectionException;
import java.sql.SQLTransientException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.jfaster.mango.jdbc.SQLExceptionSubclassTranslator;
import org.jfaster.mango.jdbc.exception.DataAccessException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SQLExceptionSubclassTranslator_ESTest extends SQLExceptionSubclassTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      MockThrowable mockThrowable0 = new MockThrowable();
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException((String) null, mockThrowable0);
      SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException(sQLTransientConnectionException0);
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate("caused by: ", sQLRecoverableException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException("'_\"1L%zF;RqHm(]#N", "org.jfaster.mango.jdbc.SQLExceptionSubclassTranslator", (-1));
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate("", sQLNonTransientException0);
      assertNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("fDRAL7dsB$");
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.translate("fDRAL7dsB$", sQLSyntaxErrorException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLDataException sQLDataException0 = new SQLDataException("org.jfaster.mango.jdbc.SQLExceptionSubclassTranslator", "23e$", 0);
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException(sQLDataException0);
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate((String) null, sQLInvalidAuthorizationSpecException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException();
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate("", sQLIntegrityConstraintViolationException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException("I,^t=NnN0.", "I,^t=NnN0.");
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate("I,^t=NnN0.", sQLFeatureNotSupportedException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLDataException sQLDataException0 = new SQLDataException("=Dk\u0006QFL\u0004?+29u", "X?Q0j");
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate("", sQLDataException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException();
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate((String) null, sQLNonTransientConnectionException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLTransientException sQLTransientException0 = new SQLTransientException("v>E-rtF_%cI", "org.jfaster.mango.jdbc.SQLExceptionSubclassTranslator");
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate("v>E-rtF_%cI", sQLTransientException0);
      assertNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException();
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException((String) null, sQLNonTransientConnectionException0);
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate(";NB?tD=;E~", sQLTransientConnectionException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException((String) null, "", (-1654));
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException((String) null, sQLSyntaxErrorException0);
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate((String) null, sQLTimeoutException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException((String) null, "%h>");
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate((String) null, sQLTransactionRollbackException0);
      assertNotNull(dataAccessException0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SQLExceptionSubclassTranslator sQLExceptionSubclassTranslator0 = new SQLExceptionSubclassTranslator();
      DataAccessException dataAccessException0 = sQLExceptionSubclassTranslator0.doTranslate("w", (SQLException) null);
      assertNull(dataAccessException0);
  }
}
