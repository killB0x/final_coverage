/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 19 21:50:20 GMT 2022
 */

package io.github.josevjunior.simplejdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.josevjunior.simplejdbc.ArrayRowMapper;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.rowset.RowSetMetaDataImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArrayRowMapper_ESTest extends ArrayRowMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayRowMapper arrayRowMapper0 = new ArrayRowMapper();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(resultSet0).getObject(anyInt());
      ResultSet resultSet1 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      arrayRowMapper0.map(resultSet1, rowSetMetaDataImpl0);
      RowSetMetaDataImpl rowSetMetaDataImpl1 = new RowSetMetaDataImpl();
      rowSetMetaDataImpl1.setColumnCount(3385);
      rowSetMetaDataImpl1.isDefinitelyWritable(3385);
      rowSetMetaDataImpl1.setSigned(711, false);
      arrayRowMapper0.map(resultSet0, rowSetMetaDataImpl1);
      ResultSet resultSet2 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(resultSet2).getObject(anyInt());
      arrayRowMapper0.map(resultSet2, rowSetMetaDataImpl1);
      ResultSet resultSet3 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(resultSet3).getObject(anyInt());
      // Undeclared exception!
      arrayRowMapper0.map(resultSet3, rowSetMetaDataImpl1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayRowMapper arrayRowMapper0 = new ArrayRowMapper();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      arrayRowMapper0.map(resultSet0, rowSetMetaDataImpl0);
      ResultSet resultSet1 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(resultSet1).getObject(anyInt());
      RowSetMetaDataImpl rowSetMetaDataImpl1 = new RowSetMetaDataImpl();
      rowSetMetaDataImpl1.setColumnCount(370);
      Object[] objectArray0 = arrayRowMapper0.map(resultSet1, rowSetMetaDataImpl1);
      assertEquals(370, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      rowSetMetaDataImpl0.setColumnCount(4897);
      ArrayRowMapper arrayRowMapper0 = new ArrayRowMapper();
      // Undeclared exception!
      try { 
        arrayRowMapper0.map((ResultSet) null, rowSetMetaDataImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.josevjunior.simplejdbc.ArrayRowMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayRowMapper arrayRowMapper0 = new ArrayRowMapper();
      // Undeclared exception!
      try { 
        arrayRowMapper0.map((ResultSet) null, (ResultSetMetaData) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayRowMapper arrayRowMapper0 = new ArrayRowMapper();
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      Object[] objectArray0 = arrayRowMapper0.map((ResultSet) null, rowSetMetaDataImpl0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayRowMapper arrayRowMapper0 = new ArrayRowMapper();
      ResultSet resultSet0 = null;
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      arrayRowMapper0.map((ResultSet) null, rowSetMetaDataImpl0);
      RowSetMetaDataImpl rowSetMetaDataImpl1 = new RowSetMetaDataImpl();
      int int0 = (-420);
      try { 
        rowSetMetaDataImpl1.isCaseSensitive((-420));
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Invalid column index :-420
         //
         verifyException("javax.sql.rowset.RowSetMetaDataImpl", e);
      }
  }
}
