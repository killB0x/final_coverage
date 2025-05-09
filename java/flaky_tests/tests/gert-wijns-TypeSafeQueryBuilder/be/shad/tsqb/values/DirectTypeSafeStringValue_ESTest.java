/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 20 22:42:39 GMT 2022
 */

package be.shad.tsqb.values;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import be.shad.tsqb.query.TypeSafeQuery;
import be.shad.tsqb.query.copy.CopyContext;
import be.shad.tsqb.restrictions.RestrictionOperator;
import be.shad.tsqb.values.DirectTypeSafeStringValue;
import be.shad.tsqb.values.HqlQueryBuilderParamsImpl;
import be.shad.tsqb.values.HqlQueryValueImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DirectTypeSafeStringValue_ESTest extends DirectTypeSafeStringValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, "not exists");
      directTypeSafeStringValue0.setPostfix((String) null);
      HqlQueryBuilderParamsImpl hqlQueryBuilderParamsImpl0 = new HqlQueryBuilderParamsImpl(0, false, false, true, true);
      HqlQueryValueImpl hqlQueryValueImpl0 = directTypeSafeStringValue0.toHqlQueryValue(hqlQueryBuilderParamsImpl0);
      assertEquals(":np0", hqlQueryValueImpl0.getHql());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, "be.shad.tsqb.values.DirectTypeSafeStringValue$1");
      directTypeSafeStringValue0.setPrefix("be.shad.tsqb.values.DirectTypeSafeStringValue$1");
      directTypeSafeStringValue0.getValue();
      assertEquals("be.shad.tsqb.values.DirectTypeSafeStringValue$1", directTypeSafeStringValue0.getPrefix());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, "be.shad.tsqb.values.DirectTypeSafeStringValue$1");
      directTypeSafeStringValue0.setPostfix("7{5IMMal0'@'YkRq+t");
      CopyContext copyContext0 = new CopyContext();
      DirectTypeSafeStringValue directTypeSafeStringValue1 = new DirectTypeSafeStringValue(copyContext0, directTypeSafeStringValue0);
      assertEquals("7{5IMMal0'@'YkRq+t", directTypeSafeStringValue0.getPostfix());
      assertEquals("7{5IMMal0'@'YkRq+t", directTypeSafeStringValue1.getPostfix());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, "2DtIxt7gTc&");
      CopyContext copyContext0 = new CopyContext();
      DirectTypeSafeStringValue directTypeSafeStringValue1 = directTypeSafeStringValue0.setPrefix((String) null);
      DirectTypeSafeStringValue directTypeSafeStringValue2 = (DirectTypeSafeStringValue)directTypeSafeStringValue1.copy(copyContext0);
      assertFalse(directTypeSafeStringValue2.isLower());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      directTypeSafeStringValue0.setLower(true);
      directTypeSafeStringValue0.setUpper(false);
      assertTrue(directTypeSafeStringValue0.isLower());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      directTypeSafeStringValue0.setUpper(true);
      directTypeSafeStringValue0.setPrefix("");
      assertTrue(directTypeSafeStringValue0.isUpper());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, "2DtIxt7gTc&");
      directTypeSafeStringValue0.setLower(true);
      directTypeSafeStringValue0.setPrefix((String) null);
      assertTrue(directTypeSafeStringValue0.isLower());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = directTypeSafeStringValue0.setUpper(true);
      directTypeSafeStringValue1.setPostfix((String) null);
      assertTrue(directTypeSafeStringValue0.isUpper());
      assertFalse(directTypeSafeStringValue0.isLower());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      directTypeSafeStringValue0.setLower(true);
      directTypeSafeStringValue0.setPostfix("M=<K1B}!o44YB}Y");
      assertEquals("M=<K1B}!o44YB}Y", directTypeSafeStringValue0.getPostfix());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = directTypeSafeStringValue0.setUpper(true);
      directTypeSafeStringValue1.setLower(false);
      assertTrue(directTypeSafeStringValue0.isUpper());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = directTypeSafeStringValue0.setUpper(true);
      boolean boolean0 = directTypeSafeStringValue1.isUpper();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, "be.shad.tsqb.values.DirectTypeSafeStringValue$1");
      directTypeSafeStringValue0.setLower(true);
      boolean boolean0 = directTypeSafeStringValue0.isLower();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, "2DtIxt7gTc&");
      directTypeSafeStringValue0.setPrefix((String) null);
      String string0 = directTypeSafeStringValue0.getPrefix();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = directTypeSafeStringValue0.setPrefix("Or");
      String string0 = directTypeSafeStringValue1.getPrefix();
      assertEquals("Or", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = directTypeSafeStringValue0.setPostfix((String) null);
      String string0 = directTypeSafeStringValue1.getPostfix();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null, (String) null);
      directTypeSafeStringValue0.setPostfix("DNkZD\")=]:#24m");
      directTypeSafeStringValue0.getPostfix();
      assertEquals("DNkZD\")=]:#24m", directTypeSafeStringValue0.getPostfix());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      // Undeclared exception!
      try { 
        directTypeSafeStringValue0.getOperator((RestrictionOperator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.DirectTypeSafeStringValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      // Undeclared exception!
      try { 
        directTypeSafeStringValue0.copy((CopyContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.TypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = null;
      try {
        directTypeSafeStringValue1 = new DirectTypeSafeStringValue((CopyContext) null, directTypeSafeStringValue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("be.shad.tsqb.values.TypeSafeValueImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RestrictionOperator restrictionOperator0 = RestrictionOperator.EQUAL;
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      directTypeSafeStringValue0.setPostfix("}\"V2cVLS*v");
      directTypeSafeStringValue0.getOperator(restrictionOperator0);
      assertEquals("}\"V2cVLS*v", directTypeSafeStringValue0.getPostfix());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      RestrictionOperator restrictionOperator0 = RestrictionOperator.EQUAL;
      directTypeSafeStringValue0.setPrefix(">6{Ti2U6p2w]<");
      directTypeSafeStringValue0.getOperator(restrictionOperator0);
      assertEquals(">6{Ti2U6p2w]<", directTypeSafeStringValue0.getPrefix());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      RestrictionOperator restrictionOperator0 = RestrictionOperator.NOT_IN;
      RestrictionOperator restrictionOperator1 = directTypeSafeStringValue0.getOperator(restrictionOperator0);
      assertEquals(RestrictionOperator.NOT_IN, restrictionOperator1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      RestrictionOperator restrictionOperator0 = RestrictionOperator.NOT_EQUAL;
      RestrictionOperator restrictionOperator1 = directTypeSafeStringValue0.getOperator(restrictionOperator0);
      assertEquals(RestrictionOperator.NOT_EQUAL, restrictionOperator1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      RestrictionOperator restrictionOperator0 = RestrictionOperator.EQUAL;
      RestrictionOperator restrictionOperator1 = directTypeSafeStringValue0.getOperator(restrictionOperator0);
      assertEquals(RestrictionOperator.EQUAL, restrictionOperator1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      directTypeSafeStringValue0.setValue("");
      String string0 = directTypeSafeStringValue0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      String string0 = directTypeSafeStringValue0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = directTypeSafeStringValue0.setLower(true);
      directTypeSafeStringValue0.setValue("");
      directTypeSafeStringValue1.getValue();
      assertTrue(directTypeSafeStringValue0.isLower());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      directTypeSafeStringValue0.setUpper(true);
      directTypeSafeStringValue0.setValue("d4?hk1bR3%\"t");
      directTypeSafeStringValue0.getValue();
      assertTrue(directTypeSafeStringValue0.isUpper());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      boolean boolean0 = directTypeSafeStringValue0.isLower();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      boolean boolean0 = directTypeSafeStringValue0.isUpper();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      DirectTypeSafeStringValue directTypeSafeStringValue1 = directTypeSafeStringValue0.setPrefix("Or");
      RestrictionOperator restrictionOperator0 = RestrictionOperator.NOT_EQUAL;
      RestrictionOperator restrictionOperator1 = directTypeSafeStringValue1.getOperator(restrictionOperator0);
      assertEquals("Or", directTypeSafeStringValue0.getPrefix());
      assertEquals(RestrictionOperator.NOT_LIKE, restrictionOperator1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      String string0 = directTypeSafeStringValue0.getPrefix();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DirectTypeSafeStringValue directTypeSafeStringValue0 = new DirectTypeSafeStringValue((TypeSafeQuery) null);
      String string0 = directTypeSafeStringValue0.getPostfix();
      assertEquals("", string0);
  }
}
