/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 07 08:15:23 GMT 2022
 */

package io.unlaunch.engine;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.unlaunch.engine.AttributeType;
import io.unlaunch.engine.Operator;
import io.unlaunch.engine.UnlaunchValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Operator_ESTest extends Operator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Operator[] operatorArray0 = Operator.values();
      assertEquals(19, operatorArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Operator.valueOf("HAS_ANY_OF");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Operator.startsWith("", (UnlaunchValue) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = Operator.partOf("j*nDr?*<r'Z%|2qT", (UnlaunchValue) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.DATE_TIME;
      boolean boolean0 = Operator.lessThan("", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = Operator.hasAny((String) null, (UnlaunchValue) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.BOOLEAN;
      boolean boolean0 = Operator.greaterThan("STRING", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.BOOLEAN;
      boolean boolean0 = Operator.equals("io.unlaunch.exceptions.UnlaunchAttributeCastException", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Operator.endsWith("BU", (UnlaunchValue) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Operator.contains((String) null, (UnlaunchValue) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Operator.allOf("T", (UnlaunchValue) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Operator.findByKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Operator operator0 = Operator.NOT_STARTS_WITH;
      String string0 = operator0.getKey();
      assertEquals("NSW", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Operator.findByKey("H..|xam;DD5N");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.STRING;
      Operator operator0 = Operator.DOES_NOT_HAVE_ALL_OF;
      boolean boolean0 = operator0.apply("H..|xam;DD5N", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Operator operator0 = Operator.DOES_NOT_HAVE_ANY_OF;
      AttributeType attributeType0 = AttributeType.DATE;
      boolean boolean0 = operator0.apply("NPO", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.NUMBER;
      Operator operator0 = Operator.IS_NOT_PART_OF;
      boolean boolean0 = operator0.apply("DATE", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Operator operator0 = Operator.findByKey("NEW");
      AttributeType attributeType0 = AttributeType.SET;
      boolean boolean0 = operator0.apply("NEW", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Operator operator0 = Operator.NOT_STARTS_WITH;
      AttributeType attributeType0 = AttributeType.DATE;
      boolean boolean0 = operator0.apply(":TG", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Operator operator0 = Operator.NOT_CONTAINS;
      AttributeType attributeType0 = AttributeType.STRING;
      boolean boolean0 = operator0.apply("n0", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.STRING;
      Operator operator0 = Operator.IS_ONE_OF;
      boolean boolean0 = operator0.apply("NAO", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Operator operator0 = Operator.LESS_THAN_OR_EQUALS;
      AttributeType attributeType0 = AttributeType.DATE;
      boolean boolean0 = operator0.apply("}+o:Gs%^z`bIH!Z", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Operator operator0 = Operator.GREATER_THAN_OR_EQUALS;
      AttributeType attributeType0 = AttributeType.BOOLEAN;
      boolean boolean0 = operator0.apply("KYo\"}", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Operator operator0 = Operator.NOT_EQUALS;
      AttributeType attributeType0 = AttributeType.STRING;
      boolean boolean0 = operator0.apply("Y*@/R!|p", (UnlaunchValue) null, attributeType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.DATE;
      Operator operator0 = Operator.IS_PART_OF;
      boolean boolean0 = operator0.apply("zZ@ gwGS9GF'k}", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Operator operator0 = Operator.EQUALS;
      AttributeType attributeType0 = AttributeType.SET;
      boolean boolean0 = operator0.apply("Ft*9=g2DqSWQj", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Operator operator0 = Operator.HAS_ANY_OF;
      AttributeType attributeType0 = AttributeType.SET;
      boolean boolean0 = operator0.apply((String) null, (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Operator operator0 = Operator.HAS_ALL_OF;
      AttributeType attributeType0 = AttributeType.DATE_TIME;
      boolean boolean0 = operator0.apply("GTE", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.STRING;
      Operator operator0 = Operator.LESS_THAN;
      boolean boolean0 = operator0.apply("I{<L6\"nnuAn\"4>ixQ", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.DATE;
      Operator operator0 = Operator.GREATER_THAN;
      boolean boolean0 = operator0.apply("8oy@VKM'*p]9q4[VC", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Operator operator0 = Operator.ENDS_WITH;
      AttributeType attributeType0 = AttributeType.NUMBER;
      boolean boolean0 = operator0.apply("io.unlaunch.engine.UnlaunchBooleanValue", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.DATE_TIME;
      Operator operator0 = Operator.STARTS_WITH;
      boolean boolean0 = operator0.apply("'a\"ez?tAx#=ITh[$WvJ", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AttributeType attributeType0 = AttributeType.DATE_TIME;
      Operator operator0 = Operator.CONTAINS;
      boolean boolean0 = operator0.apply("NPO", (UnlaunchValue) null, attributeType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Operator.getLocalDateTime((UnlaunchValue) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.unlaunch.engine.Operator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Operator.getUserNumber((UnlaunchValue) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Operator.findByKey("HA");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Operator.getUserSet((UnlaunchValue) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.unlaunch.engine.Operator", e);
      }
  }
}
