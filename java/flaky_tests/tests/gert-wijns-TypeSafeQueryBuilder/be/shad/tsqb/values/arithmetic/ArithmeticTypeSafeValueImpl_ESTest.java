/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 23:50:30 GMT 2022
 */

package be.shad.tsqb.values.arithmetic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import be.shad.tsqb.query.TypeSafeQuery;
import be.shad.tsqb.query.TypeSafeQueryScopeValidator;
import be.shad.tsqb.query.copy.CopyContext;
import be.shad.tsqb.query.copy.Copyable;
import be.shad.tsqb.values.CaseTypeSafeValue;
import be.shad.tsqb.values.CustomTypeSafeValue;
import be.shad.tsqb.values.DirectTypeSafeValue;
import be.shad.tsqb.values.FunctionTypeSafeValue;
import be.shad.tsqb.values.HqlQueryBuilderParams;
import be.shad.tsqb.values.HqlQueryBuilderParamsImpl;
import be.shad.tsqb.values.NullTypeSafeValue;
import be.shad.tsqb.values.ProjectionTypeSafeValue;
import be.shad.tsqb.values.TypeSafeValue;
import be.shad.tsqb.values.WrappedTypeSafeValue;
import be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValue;
import be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArithmeticTypeSafeValueImpl_ESTest extends ArithmeticTypeSafeValueImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Number> class0 = Number.class;
      FunctionTypeSafeValue<Number> functionTypeSafeValue0 = new FunctionTypeSafeValue<Number>((TypeSafeQuery) null, "%{McE-ESZ.lD+K^>zk}", class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, functionTypeSafeValue0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.subtract((TypeSafeValue<? extends Number>) functionTypeSafeValue0);
      HqlQueryBuilderParamsImpl hqlQueryBuilderParamsImpl0 = new HqlQueryBuilderParamsImpl();
      arithmeticTypeSafeValueImpl0.add((TypeSafeValue<? extends Number>) arithmeticTypeSafeValue0);
      hqlQueryBuilderParamsImpl0.createNamedParameter();
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.toHqlQueryValue(hqlQueryBuilderParamsImpl0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = null;
      try {
        arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, (TypeSafeValue<Number>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.divide((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      CopyContext copyContext0 = new CopyContext();
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[3];
      arithmeticTypeSafeValueArray0[0] = (ArithmeticTypeSafeValue) arithmeticTypeSafeValueImpl1;
      Long long0 = Long.getLong("D%zNM", 1L);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl1.divide((Number) long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.copy((CopyContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.TypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.subtract((TypeSafeValue<? extends Number>) caseTypeSafeValue0);
      assertSame(arithmeticTypeSafeValueImpl0, arithmeticTypeSafeValue0);
      
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.toHqlQueryValue((HqlQueryBuilderParams) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.multiply((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      WrappedTypeSafeValue<Number> wrappedTypeSafeValue0 = new WrappedTypeSafeValue<Number>((TypeSafeQuery) null, "", caseTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, wrappedTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl2 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.multiply((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.add((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      WrappedTypeSafeValue<Number> wrappedTypeSafeValue0 = new WrappedTypeSafeValue<Number>((TypeSafeQuery) null, "-", caseTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, wrappedTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl2 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, arithmeticTypeSafeValueImpl0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl3 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl2);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[1];
      Long.getLong("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl");
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl3.add((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.multiply((TypeSafeValue<? extends Number>) arithmeticTypeSafeValueImpl0);
      assertSame(arithmeticTypeSafeValueImpl0, arithmeticTypeSafeValue0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[2];
      Class<Number> class0 = Number.class;
      NullTypeSafeValue<Number> nullTypeSafeValue0 = new NullTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, nullTypeSafeValue0);
      HqlQueryBuilderParamsImpl hqlQueryBuilderParamsImpl0 = new HqlQueryBuilderParamsImpl(0, false, true, false, false);
      arithmeticTypeSafeValueImpl0.toHqlQueryValue(hqlQueryBuilderParamsImpl0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.multiply((TypeSafeValue<? extends Number>) nullTypeSafeValue0);
      assertSame(arithmeticTypeSafeValue0, arithmeticTypeSafeValueImpl0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      WrappedTypeSafeValue<Number> wrappedTypeSafeValue0 = new WrappedTypeSafeValue<Number>((TypeSafeQuery) null, "-", caseTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, wrappedTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      arithmeticTypeSafeValueImpl1.add((TypeSafeValue<? extends Number>) wrappedTypeSafeValue0);
      Integer integer0 = Integer.getInteger("645Y:hR15y", (-1094));
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.subtract((Number) integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.subtract((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      HqlQueryBuilderParamsImpl hqlQueryBuilderParamsImpl0 = new HqlQueryBuilderParamsImpl();
      arithmeticTypeSafeValueImpl0.toHqlQueryValue(hqlQueryBuilderParamsImpl0);
      assertFalse(hqlQueryBuilderParamsImpl0.isRequiresLiterals());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[9];
      arithmeticTypeSafeValueArray0[0] = (ArithmeticTypeSafeValue) arithmeticTypeSafeValueImpl0;
      arithmeticTypeSafeValueArray0[1] = (ArithmeticTypeSafeValue) arithmeticTypeSafeValueImpl1;
      arithmeticTypeSafeValueArray0[2] = (ArithmeticTypeSafeValue) arithmeticTypeSafeValueImpl1;
      arithmeticTypeSafeValueArray0[3] = (ArithmeticTypeSafeValue) arithmeticTypeSafeValueImpl1;
      arithmeticTypeSafeValueArray0[4] = (ArithmeticTypeSafeValue) arithmeticTypeSafeValueImpl0;
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl1.equals(caseTypeSafeValue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.exceptions.EqualsNotAllowedException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = null;
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = null;
      try {
        arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl((CopyContext) null, arithmeticTypeSafeValueImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.TypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      TypeSafeQueryScopeValidator typeSafeQueryScopeValidator0 = mock(TypeSafeQueryScopeValidator.class, new ViolatedAssumptionAnswer());
      arithmeticTypeSafeValueImpl0.validateContainedInScope(typeSafeQueryScopeValidator0);
      assertNotSame(arithmeticTypeSafeValueImpl0, arithmeticTypeSafeValueImpl1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.subtract((TypeSafeValue<? extends Number>) caseTypeSafeValue0);
      HqlQueryBuilderParamsImpl hqlQueryBuilderParamsImpl0 = new HqlQueryBuilderParamsImpl();
      caseTypeSafeValue0.toHqlQueryValue(hqlQueryBuilderParamsImpl0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue1 = arithmeticTypeSafeValueImpl0.divide((TypeSafeValue<? extends Number>) arithmeticTypeSafeValue0);
      CopyContext copyContext0 = new CopyContext();
      Class<Integer> class1 = Integer.class;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      CustomTypeSafeValue<Integer> customTypeSafeValue0 = new CustomTypeSafeValue<Integer>((TypeSafeQuery) null, class1, "y9{cdE1^Zk-*$tQ@(", linkedList0);
      TypeSafeQueryScopeValidator typeSafeQueryScopeValidator0 = mock(TypeSafeQueryScopeValidator.class, new ViolatedAssumptionAnswer());
      arithmeticTypeSafeValueImpl0.validateContainedInScope(typeSafeQueryScopeValidator0);
      assertSame(arithmeticTypeSafeValueImpl0, arithmeticTypeSafeValue1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      WrappedTypeSafeValue<Number> wrappedTypeSafeValue0 = new WrappedTypeSafeValue<Number>((TypeSafeQuery) null, "-", caseTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, wrappedTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[0];
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl2 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl1);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray1 = new ArithmeticTypeSafeValue[0];
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl1.multiply((TypeSafeValue<? extends Number>) caseTypeSafeValue0, (TypeSafeValue<? extends Number>) caseTypeSafeValue0, arithmeticTypeSafeValueArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[11];
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.multiply((TypeSafeValue<? extends Number>) caseTypeSafeValue0, (TypeSafeValue<? extends Number>) caseTypeSafeValue0, arithmeticTypeSafeValueArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      CopyContext copyContext0 = new CopyContext();
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      caseTypeSafeValue0.is((TypeSafeValue<Number>) arithmeticTypeSafeValueImpl0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = null;
      try {
        arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.subtract((TypeSafeValue<? extends Number>) caseTypeSafeValue0);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[6];
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.add((TypeSafeValue<? extends Number>) arithmeticTypeSafeValue0, (TypeSafeValue<? extends Number>) caseTypeSafeValue0, arithmeticTypeSafeValueArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.add((TypeSafeValue<? extends Number>) caseTypeSafeValue0, (TypeSafeValue<? extends Number>) caseTypeSafeValue0, (ArithmeticTypeSafeValue[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.add((TypeSafeValue<? extends Number>) caseTypeSafeValue0);
      assertSame(arithmeticTypeSafeValueImpl0, arithmeticTypeSafeValue0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.divide((TypeSafeValue<? extends Number>) arithmeticTypeSafeValueImpl0, (TypeSafeValue<? extends Number>) arithmeticTypeSafeValueImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      WrappedTypeSafeValue<Number> wrappedTypeSafeValue0 = new WrappedTypeSafeValue<Number>((TypeSafeQuery) null, "-", caseTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, wrappedTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl1 = new ArithmeticTypeSafeValueImpl(copyContext0, arithmeticTypeSafeValueImpl0);
      arithmeticTypeSafeValueImpl1.add((TypeSafeValue<? extends Number>) wrappedTypeSafeValue0);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[2];
      arithmeticTypeSafeValueArray0[0] = (ArithmeticTypeSafeValue) arithmeticTypeSafeValueImpl0;
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.divide((TypeSafeValue<? extends Number>) arithmeticTypeSafeValueImpl1, (TypeSafeValue<? extends Number>) arithmeticTypeSafeValueImpl1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      CopyContext copyContext0 = new CopyContext();
      Copyable copyable0 = arithmeticTypeSafeValueImpl0.copy(copyContext0);
      assertNotSame(copyable0, arithmeticTypeSafeValueImpl0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.divide((TypeSafeValue<? extends Number>) caseTypeSafeValue0);
      assertSame(arithmeticTypeSafeValueImpl0, arithmeticTypeSafeValue0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CustomTypeSafeValue<Number> customTypeSafeValue0 = new CustomTypeSafeValue<Number>((TypeSafeQuery) null, class0, "dAh*0G|n1UTUk`");
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, customTypeSafeValue0);
      ArithmeticTypeSafeValue arithmeticTypeSafeValue0 = arithmeticTypeSafeValueImpl0.divide((TypeSafeValue<? extends Number>) customTypeSafeValue0);
      CopyContext copyContext0 = new CopyContext();
      arithmeticTypeSafeValueImpl0.copy(copyContext0);
      arithmeticTypeSafeValueImpl0.subtract((TypeSafeValue<? extends Number>) arithmeticTypeSafeValue0);
      CopyContext copyContext1 = new CopyContext();
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.copy(copyContext1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopyContext copyContext0 = new CopyContext();
      Class<Number> class0 = Number.class;
      ProjectionTypeSafeValue<Number> projectionTypeSafeValue0 = new ProjectionTypeSafeValue<Number>((TypeSafeQuery) null, class0, "eGt");
      ProjectionTypeSafeValue<Number> projectionTypeSafeValue1 = new ProjectionTypeSafeValue<Number>(copyContext0, projectionTypeSafeValue0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, projectionTypeSafeValue1);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = null;
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.subtract((TypeSafeValue<? extends Number>) projectionTypeSafeValue1, (TypeSafeValue<? extends Number>) projectionTypeSafeValue0, (ArithmeticTypeSafeValue[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Number> class0 = Number.class;
      CaseTypeSafeValue<Number> caseTypeSafeValue0 = new CaseTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, caseTypeSafeValue0);
      ArithmeticTypeSafeValue[] arithmeticTypeSafeValueArray0 = new ArithmeticTypeSafeValue[13];
      // Undeclared exception!
      try { 
        arithmeticTypeSafeValueImpl0.subtract((TypeSafeValue<? extends Number>) caseTypeSafeValue0, (TypeSafeValue<? extends Number>) caseTypeSafeValue0, arithmeticTypeSafeValueArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.arithmetic.ArithmeticTypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TypeSafeQuery typeSafeQuery0 = null;
      Class<Number> class0 = Number.class;
      DirectTypeSafeValue<Number> directTypeSafeValue0 = new DirectTypeSafeValue<Number>((TypeSafeQuery) null, class0);
      ArithmeticTypeSafeValueImpl arithmeticTypeSafeValueImpl0 = new ArithmeticTypeSafeValueImpl((TypeSafeQuery) null, directTypeSafeValue0);
      String string0 = "4$hr0:.r";
      Class<Integer> class1 = Integer.class;
      int int0 = (-3458);
      boolean boolean0 = false;
      boolean boolean1 = false;
      boolean boolean2 = false;
      try { 
        Integer.valueOf("AbD-%|lP", (-3458));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // radix -3458 less than Character.MIN_RADIX
         //
         verifyException("java.lang.Integer", e);
      }
  }
}
