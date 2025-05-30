/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 13:10:20 GMT 2022
 */

package org.jfaster.mango.binding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfaster.mango.binding.BindingParameter;
import org.jfaster.mango.binding.BindingParameterInvoker;
import org.jfaster.mango.binding.BoundSql;
import org.jfaster.mango.binding.DefaultInvocationContext;
import org.jfaster.mango.binding.TransferableBindingParameterInvoker;
import org.jfaster.mango.type.NStringTypeHandler;
import org.jfaster.mango.util.jdbc.JdbcType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultInvocationContext_ESTest extends DefaultInvocationContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.addParameter("[]", (Object) null);
      List<Object> list0 = defaultInvocationContext0.getParameterValues();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.setGlobalTable("e");
      String string0 = defaultInvocationContext0.getGlobalTable();
      assertEquals("e", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.setGlobalTable("");
      String string0 = defaultInvocationContext0.getGlobalTable();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      // Undeclared exception!
      try { 
        defaultInvocationContext0.setBindingValue((BindingParameterInvoker) null, "' is null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.binding.DefaultInvocationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      // Undeclared exception!
      try { 
        defaultInvocationContext0.getNullableBindingValue((BindingParameterInvoker) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.binding.DefaultInvocationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      // Undeclared exception!
      try { 
        defaultInvocationContext0.getBindingValue((BindingParameterInvoker) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.binding.DefaultInvocationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      Class<Float> class0 = Float.TYPE;
      JdbcType jdbcType0 = JdbcType.SQLXML;
      BindingParameter bindingParameter0 = BindingParameter.create((String) null, (String) null, jdbcType0);
      TransferableBindingParameterInvoker transferableBindingParameterInvoker0 = TransferableBindingParameterInvoker.create(class0, bindingParameter0);
      defaultInvocationContext0.setBindingValue(transferableBindingParameterInvoker0, bindingParameter0);
      BindingParameter bindingParameter1 = (BindingParameter)defaultInvocationContext0.getNullableBindingValue(transferableBindingParameterInvoker0);
      assertNull(bindingParameter1.getPropertyName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      Class<Integer> class0 = Integer.TYPE;
      JdbcType jdbcType0 = JdbcType.JAVA_OBJECT;
      BindingParameter bindingParameter0 = new BindingParameter("K G}&dX*Ly_ 5r&Ie(", (String) null, jdbcType0);
      defaultInvocationContext0.addParameter((String) null, (Object) null);
      TransferableBindingParameterInvoker transferableBindingParameterInvoker0 = TransferableBindingParameterInvoker.create(class0, bindingParameter0);
      // Undeclared exception!
      try { 
        defaultInvocationContext0.getNullableBindingValue(transferableBindingParameterInvoker0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Parameter ':K G}&dX*Ly_ 5r&Ie(' not found, available root parameters are [:null]
         //
         verifyException("org.jfaster.mango.binding.DefaultInvocationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.writeToSqlBuffer("WODy-#$<g");
      defaultInvocationContext0.trim("WODy-#$<g");
      assertNull(defaultInvocationContext0.getGlobalTable());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.trim("");
      assertNull(defaultInvocationContext0.getGlobalTable());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.trim("'");
      assertNull(defaultInvocationContext0.getGlobalTable());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.addParameter("", "");
      JdbcType jdbcType0 = JdbcType.DISTINCT;
      BindingParameter bindingParameter0 = BindingParameter.create("", "", jdbcType0);
      Class<Short> class0 = Short.TYPE;
      TransferableBindingParameterInvoker transferableBindingParameterInvoker0 = TransferableBindingParameterInvoker.create(class0, bindingParameter0);
      defaultInvocationContext0.getNullableBindingValue(transferableBindingParameterInvoker0);
      Object object0 = defaultInvocationContext0.getBindingValue(transferableBindingParameterInvoker0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      JdbcType jdbcType0 = JdbcType.SQLXML;
      defaultInvocationContext0.addParameter((String) null, (Object) null);
      BindingParameter bindingParameter0 = BindingParameter.create((String) null, (String) null, jdbcType0);
      Class<Long> class0 = Long.TYPE;
      TransferableBindingParameterInvoker transferableBindingParameterInvoker0 = TransferableBindingParameterInvoker.create(class0, bindingParameter0);
      // Undeclared exception!
      try { 
        defaultInvocationContext0.getBindingValue(transferableBindingParameterInvoker0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Parameter ':null' need a non-null value
         //
         verifyException("org.jfaster.mango.binding.DefaultInvocationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      defaultInvocationContext0.writeToSqlBuffer("' need a non-null value");
      defaultInvocationContext0.trim("'");
      assertNull(defaultInvocationContext0.getGlobalTable());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      String string0 = defaultInvocationContext0.getGlobalTable();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      NStringTypeHandler nStringTypeHandler0 = new NStringTypeHandler();
      defaultInvocationContext0.appendToArgs((Object) null, nStringTypeHandler0);
      assertNull(defaultInvocationContext0.getGlobalTable());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      Class<Integer> class0 = Integer.TYPE;
      JdbcType jdbcType0 = JdbcType.CLOB;
      BindingParameter bindingParameter0 = new BindingParameter((String) null, (String) null, jdbcType0);
      TransferableBindingParameterInvoker transferableBindingParameterInvoker0 = TransferableBindingParameterInvoker.create(class0, bindingParameter0);
      defaultInvocationContext0.setBindingValue(transferableBindingParameterInvoker0, (Object) null);
      Object object0 = defaultInvocationContext0.getNullableBindingValue(transferableBindingParameterInvoker0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      List<Object> list0 = defaultInvocationContext0.getParameterValues();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      BoundSql boundSql0 = defaultInvocationContext0.getBoundSql();
      assertEquals("", boundSql0.getSql());
  }
}
