/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 05 14:03:26 GMT 2022
 */

package org.jfaster.mango.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfaster.mango.binding.BindingParameter;
import org.jfaster.mango.binding.BindingParameterInvoker;
import org.jfaster.mango.binding.DefaultInvocationContext;
import org.jfaster.mango.parser.ASTJDBCParameter;
import org.jfaster.mango.parser.Parser;
import org.jfaster.mango.parser.visitor.InterablePropertyCollectVisitor;
import org.jfaster.mango.parser.visitor.ParameterExpandVisitor;
import org.jfaster.mango.type.TypeHandler;
import org.jfaster.mango.util.jdbc.JdbcType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ASTJDBCParameter_ESTest extends ASTJDBCParameter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JdbcType jdbcType0 = JdbcType.LONGVARCHAR;
      BindingParameter bindingParameter0 = BindingParameter.create("", "", jdbcType0);
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(1);
      aSTJDBCParameter0.setBindingParameter(bindingParameter0);
      String string0 = aSTJDBCParameter0.toString();
      assertEquals("Block{fullName=:, parameterName=, propertyName=}", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(2147483645);
      InterablePropertyCollectVisitor interablePropertyCollectVisitor0 = InterablePropertyCollectVisitor.INSTANCE;
      Object object0 = aSTJDBCParameter0.jjtAccept(interablePropertyCollectVisitor0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(2147483645);
      InterablePropertyCollectVisitor interablePropertyCollectVisitor0 = InterablePropertyCollectVisitor.INSTANCE;
      Object object0 = aSTJDBCParameter0.jjtAccept(interablePropertyCollectVisitor0, interablePropertyCollectVisitor0);
      assertSame(interablePropertyCollectVisitor0, object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser("RIW");
      JdbcType jdbcType0 = JdbcType.UNDEFINED;
      BindingParameter bindingParameter0 = BindingParameter.create((String) null, "swx:|&>,xb&", jdbcType0);
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(parser0, 1990);
      aSTJDBCParameter0.setBindingParameter(bindingParameter0);
      BindingParameter bindingParameter1 = aSTJDBCParameter0.getBindingParameter();
      assertEquals(JdbcType.UNDEFINED, bindingParameter1.getJdbcType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(339);
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 339 out of bounds for length 37
         //
         verifyException("org.jfaster.mango.parser.SimpleNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(59);
      ParameterExpandVisitor parameterExpandVisitor0 = ParameterExpandVisitor.INSTANCE;
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.jjtAccept(parameterExpandVisitor0, parameterExpandVisitor0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.jfaster.mango.parser.visitor.ParameterExpandVisitor cannot be cast to class org.jfaster.mango.binding.ParameterContext (org.jfaster.mango.parser.visitor.ParameterExpandVisitor and org.jfaster.mango.binding.ParameterContext are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @51ac1ac4)
         //
         verifyException("org.jfaster.mango.parser.visitor.ParameterExpandVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(1396);
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.init((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = new Parser("RIW");
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(parser0, 1990);
      BindingParameter bindingParameter0 = aSTJDBCParameter0.getBindingParameter();
      assertNull(bindingParameter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(0);
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.getFullName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.ASTJDBCParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = new Parser("RIW");
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(parser0, 1990);
      DefaultInvocationContext defaultInvocationContext0 = DefaultInvocationContext.create();
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.render(defaultInvocationContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // invoker must set
         //
         verifyException("org.jfaster.mango.parser.ASTJDBCParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter((-1));
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.init(":0");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(0);
      TypeHandler<Object> typeHandler0 = (TypeHandler<Object>) mock(TypeHandler.class, new ViolatedAssumptionAnswer());
      aSTJDBCParameter0.setTypeHandler(typeHandler0);
      assertEquals(0, aSTJDBCParameter0.jjtGetNumChildren());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(487);
      ParameterExpandVisitor parameterExpandVisitor0 = ParameterExpandVisitor.INSTANCE;
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.jjtAccept(parameterExpandVisitor0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.visitor.ParameterExpandVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter((Parser) null, 4);
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.init("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't compile string ''
         //
         verifyException("org.jfaster.mango.parser.ASTJDBCParameter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter((-251));
      aSTJDBCParameter0.setBindingParameterInvoker((BindingParameterInvoker) null);
      assertEquals(0, aSTJDBCParameter0.jjtGetNumChildren());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASTJDBCParameter aSTJDBCParameter0 = new ASTJDBCParameter(1);
      // Undeclared exception!
      try { 
        aSTJDBCParameter0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfaster.mango.parser.ASTJDBCParameter", e);
      }
  }
}
