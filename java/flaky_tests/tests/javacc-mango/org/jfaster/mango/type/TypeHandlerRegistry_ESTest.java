/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:54:12 GMT 2022
 */

package org.jfaster.mango.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.type.TypeHandler;
import org.jfaster.mango.type.TypeHandlerRegistry;
import org.jfaster.mango.util.jdbc.JdbcType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeHandlerRegistry_ESTest extends TypeHandlerRegistry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeHandlerRegistry.register(class0, (TypeHandler<?>) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Date> class0 = Date.class;
      // Undeclared exception!
      try { 
        TypeHandlerRegistry.getTypeHandler(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't get type handle, java type is 'class java.util.Date', jdbc type is 'null'
         //
         verifyException("org.jfaster.mango.type.TypeHandlerRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Date> class0 = Date.class;
      TypeHandler<Date> typeHandler0 = TypeHandlerRegistry.getNullableTypeHandler(class0);
      assertNull(typeHandler0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JdbcType jdbcType0 = JdbcType.LONGVARBINARY;
      // Undeclared exception!
      try { 
        TypeHandlerRegistry.getTypeHandler(class0, jdbcType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't get type handle, java type is 'class java.lang.Object', jdbc type is 'LONGVARBINARY'
         //
         verifyException("org.jfaster.mango.type.TypeHandlerRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Date> class0 = Date.class;
      boolean boolean0 = TypeHandlerRegistry.hasTypeHandler(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      TypeHandler<ChronoLocalDate> typeHandler0 = TypeHandlerRegistry.getNullableTypeHandler(class0);
      assertNull(typeHandler0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      // Undeclared exception!
      try { 
        TypeHandlerRegistry.getTypeHandler(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't get type handle, java type is 'interface java.time.chrono.ChronoLocalDate', jdbc type is 'null'
         //
         verifyException("org.jfaster.mango.type.TypeHandlerRegistry", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = TypeHandlerRegistry.hasTypeHandler(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TypeHandlerRegistry typeHandlerRegistry0 = new TypeHandlerRegistry();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Date> class0 = Date.class;
      JdbcType jdbcType0 = JdbcType.DATALINK;
      TypeHandler<Date> typeHandler0 = TypeHandlerRegistry.getTypeHandler(class0, jdbcType0);
      TypeHandlerRegistry.register(class0, jdbcType0, (TypeHandler<? extends Date>) typeHandler0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Date> class0 = Date.class;
      JdbcType jdbcType0 = JdbcType.BIGINT;
      TypeHandler<Date> typeHandler0 = TypeHandlerRegistry.getNullableTypeHandler(class0, jdbcType0);
      assertNotNull(typeHandler0);
  }
}
