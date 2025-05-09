/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 00:38:05 GMT 2022
 */

package org.jfaster.mango.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfaster.mango.type.NClobTypeHandler;
import org.jfaster.mango.util.jdbc.JdbcType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NClobTypeHandler_ESTest extends NClobTypeHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NClobTypeHandler nClobTypeHandler0 = new NClobTypeHandler();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      JdbcType jdbcType0 = JdbcType.BINARY;
      nClobTypeHandler0.setNonNullParameter(preparedStatement0, 0, "", jdbcType0);
      assertEquals(JdbcType.NCLOB, nClobTypeHandler0.getJdbcType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NClobTypeHandler nClobTypeHandler0 = new NClobTypeHandler();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      nClobTypeHandler0.setParameter(preparedStatement0, 0, "T#");
      assertEquals(JdbcType.NCLOB, nClobTypeHandler0.getJdbcType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NClobTypeHandler nClobTypeHandler0 = new NClobTypeHandler();
      Clob clob0 = mock(Clob.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(clob0).getSubString(anyLong() , anyInt());
      doReturn(0L).when(clob0).length();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(clob0).when(resultSet0).getClob(anyInt());
      String string0 = nClobTypeHandler0.getNullableResult(resultSet0, (-278));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NClobTypeHandler nClobTypeHandler0 = new NClobTypeHandler();
      Clob clob0 = mock(Clob.class, new ViolatedAssumptionAnswer());
      doReturn("T#").when(clob0).getSubString(anyLong() , anyInt());
      doReturn(198L).when(clob0).length();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(clob0).when(resultSet0).getClob(anyInt());
      String string0 = nClobTypeHandler0.getNullableResult(resultSet0, 0);
      assertEquals("T#", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NClobTypeHandler nClobTypeHandler0 = new NClobTypeHandler();
      JdbcType jdbcType0 = nClobTypeHandler0.getJdbcType();
      assertEquals(JdbcType.NCLOB, jdbcType0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NClobTypeHandler nClobTypeHandler0 = new NClobTypeHandler();
      // Undeclared exception!
      try { 
        nClobTypeHandler0.getNullableResult((ResultSet) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.type.NClobTypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NClobTypeHandler nClobTypeHandler0 = new NClobTypeHandler();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((Clob) null).when(resultSet0).getClob(anyInt());
      String string0 = nClobTypeHandler0.getNullableResult(resultSet0, (-278));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NClobTypeHandler nClobTypeHandler0 = new NClobTypeHandler();
      JdbcType jdbcType0 = JdbcType.BLOB;
      // Undeclared exception!
      try { 
        nClobTypeHandler0.setNonNullParameter((PreparedStatement) null, (-1011), "org.jfaster.mango.type.NClobTypeHandler", jdbcType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.type.NClobTypeHandler", e);
      }
  }
}
