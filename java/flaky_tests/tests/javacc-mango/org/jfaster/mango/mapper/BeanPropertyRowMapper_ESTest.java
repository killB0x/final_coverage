/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:15:41 GMT 2022
 */

package org.jfaster.mango.mapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfaster.mango.invoker.TransferablePropertyInvoker;
import org.jfaster.mango.mapper.BeanPropertyRowMapper;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BeanPropertyRowMapper_ESTest extends BeanPropertyRowMapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<TransferablePropertyInvoker> class0 = TransferablePropertyInvoker.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanPropertyRowMapper<TransferablePropertyInvoker> beanPropertyRowMapper0 = new BeanPropertyRowMapper<TransferablePropertyInvoker>(class0, hashMap0, false);
      beanPropertyRowMapper0.initialize(class0, hashMap0, false);
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Class<TransferablePropertyInvoker> class0 = TransferablePropertyInvoker.class;
      BeanPropertyRowMapper<TransferablePropertyInvoker> beanPropertyRowMapper0 = new BeanPropertyRowMapper<TransferablePropertyInvoker>(class0, hashMap0, true);
      // Undeclared exception!
      try { 
        beanPropertyRowMapper0.mapRow((ResultSet) null, 291);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not instantiate bean class [org.jfaster.mango.invoker.TransferablePropertyInvoker]: Is it an abstract class?
         //
         verifyException("org.jfaster.mango.util.reflect.Reflection", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Class<String> class0 = String.class;
      BeanPropertyRowMapper<String> beanPropertyRowMapper0 = new BeanPropertyRowMapper<String>(class0, hashMap0, true);
      // Undeclared exception!
      try { 
        beanPropertyRowMapper0.mapRow((ResultSet) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.util.jdbc.ResultSetWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Class<TransferablePropertyInvoker> class0 = TransferablePropertyInvoker.class;
      BeanPropertyRowMapper<TransferablePropertyInvoker> beanPropertyRowMapper0 = new BeanPropertyRowMapper<TransferablePropertyInvoker>(class0, hashMap0, false);
      // Undeclared exception!
      try { 
        beanPropertyRowMapper0.initialize(class0, (Map<String, String>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.mapper.BeanPropertyRowMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BeanPropertyRowMapper<Object> beanPropertyRowMapper0 = null;
      try {
        beanPropertyRowMapper0 = new BeanPropertyRowMapper<Object>(class0, (Map<String, String>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.mapper.BeanPropertyRowMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Class<String> class0 = String.class;
      BeanPropertyRowMapper<String> beanPropertyRowMapper0 = new BeanPropertyRowMapper<String>(class0, hashMap0, true);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(305).when(resultSetMetaData0).getColumnCount();
      doReturn("L^gUj", "[*`2Y", "IN$er~", "' of type ", "_qS\"+pbt(-\"vj/Ei-or").when(resultSetMetaData0).getColumnLabel(anyInt());
      doReturn((-1122), (-2659), (-1685), (-2659), (-4505)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      // Undeclared exception!
      try { 
        beanPropertyRowMapper0.mapRow(resultSet0, 295);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to map column 'L^gUj' to any property of 'class java.lang.String'
         //
         verifyException("org.jfaster.mango.mapper.BeanPropertyRowMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Object> class0 = Object.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("L^gUj", "L^gUj");
      BeanPropertyRowMapper<Object> beanPropertyRowMapper0 = new BeanPropertyRowMapper<Object>(class0, hashMap0, true);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.putIfAbsent("org.jfaster.mango.type.NStringTypeHandler", "Io#k}4[!jsrG/$");
      Class<String> class0 = String.class;
      BeanPropertyRowMapper<String> beanPropertyRowMapper0 = new BeanPropertyRowMapper<String>(class0, hashMap0, false);
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(305).when(resultSetMetaData0).getColumnCount();
      doReturn("Io#k}4[!jsrG/$", "Io#k}4[!jsrG/$", "Io#k}4[!jsrG/$", "Io#k}4[!jsrG/$", "Io#k}4[!jsrG/$").when(resultSetMetaData0).getColumnLabel(anyInt());
      doReturn((-1745), 305, (-1745), 305, 305).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      String string0 = beanPropertyRowMapper0.mapRow(resultSet0, (-1745));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<Object> class0 = Object.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BeanPropertyRowMapper<Object> beanPropertyRowMapper0 = new BeanPropertyRowMapper<Object>(class0, hashMap0, false);
      Class<Object> class1 = beanPropertyRowMapper0.getMappedClass();
      assertFalse(class1.isArray());
  }
}
