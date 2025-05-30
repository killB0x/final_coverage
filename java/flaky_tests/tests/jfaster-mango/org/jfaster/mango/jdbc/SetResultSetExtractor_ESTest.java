/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 00:45:39 GMT 2022
 */

package org.jfaster.mango.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfaster.mango.jdbc.HashSetSupplier;
import org.jfaster.mango.jdbc.SetResultSetExtractor;
import org.jfaster.mango.mapper.BeanPropertyRowMapper;
import org.jfaster.mango.mapper.SingleColumnRowMapper;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SetResultSetExtractor_ESTest extends SetResultSetExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashSetSupplier hashSetSupplier0 = new HashSetSupplier();
      Class<Integer> class0 = Integer.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanPropertyRowMapper<Integer> beanPropertyRowMapper0 = new BeanPropertyRowMapper<Integer>(class0, hashMap0, true);
      SetResultSetExtractor<Integer> setResultSetExtractor0 = new SetResultSetExtractor<Integer>(hashSetSupplier0, beanPropertyRowMapper0);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(resultSet0).next();
      // Undeclared exception!
      try { 
        setResultSetExtractor0.extractData(resultSet0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not instantiate bean class [java.lang.Integer]: Is it an abstract class?
         //
         verifyException("org.jfaster.mango.util.reflect.Reflection", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashSetSupplier hashSetSupplier0 = new HashSetSupplier();
      Class<Object> class0 = Object.class;
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(true, false).when(resultSet0).next();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanPropertyRowMapper<Object> beanPropertyRowMapper0 = new BeanPropertyRowMapper<Object>(class0, hashMap0, true);
      SetResultSetExtractor<Object> setResultSetExtractor0 = new SetResultSetExtractor<Object>(hashSetSupplier0, beanPropertyRowMapper0);
      Set<Object> set0 = setResultSetExtractor0.extractData(resultSet0);
      assertFalse(set0.contains(true));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashSetSupplier hashSetSupplier0 = new HashSetSupplier();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Class<String> class0 = String.class;
      BeanPropertyRowMapper<String> beanPropertyRowMapper0 = new BeanPropertyRowMapper<String>(class0, hashMap0, false);
      SetResultSetExtractor<String> setResultSetExtractor0 = new SetResultSetExtractor<String>(hashSetSupplier0, beanPropertyRowMapper0);
      // Undeclared exception!
      try { 
        setResultSetExtractor0.extractData((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.jdbc.SetResultSetExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashSetSupplier hashSetSupplier0 = new HashSetSupplier();
      Class<Object> class0 = Object.class;
      SingleColumnRowMapper<Object> singleColumnRowMapper0 = new SingleColumnRowMapper<Object>(class0);
      SetResultSetExtractor<Object> setResultSetExtractor0 = new SetResultSetExtractor<Object>(hashSetSupplier0, singleColumnRowMapper0);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(true).when(resultSet0).next();
      // Undeclared exception!
      try { 
        setResultSetExtractor0.extractData(resultSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashSetSupplier hashSetSupplier0 = new HashSetSupplier();
      Class<Integer> class0 = Integer.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanPropertyRowMapper<Integer> beanPropertyRowMapper0 = new BeanPropertyRowMapper<Integer>(class0, hashMap0, false);
      SetResultSetExtractor<Integer> setResultSetExtractor0 = new SetResultSetExtractor<Integer>(hashSetSupplier0, beanPropertyRowMapper0);
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(resultSet0).next();
      Set<Integer> set0 = setResultSetExtractor0.extractData(resultSet0);
      assertTrue(set0.isEmpty());
  }
}
