/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 07:58:34 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.AnyKindTest;
import com.evolvedbinary.xpath.parser.ast.AttributeTest;
import com.evolvedbinary.xpath.parser.ast.Axis;
import com.evolvedbinary.xpath.parser.ast.ElementTest;
import com.evolvedbinary.xpath.parser.ast.KindTest;
import com.evolvedbinary.xpath.parser.ast.NodeTest;
import com.evolvedbinary.xpath.parser.ast.PITest;
import com.evolvedbinary.xpath.parser.ast.QNameW;
import com.evolvedbinary.xpath.parser.ast.SchemaAttributeTest;
import com.evolvedbinary.xpath.parser.ast.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Step_ESTest extends Step_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Axis axis0 = Axis.CHILD;
      Step step0 = new Step(axis0, (NodeTest) null);
      NodeTest nodeTest0 = step0.getNodeTest();
      assertNull(nodeTest0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Axis axis0 = Axis.SELF;
      ElementTest elementTest0 = new ElementTest();
      Step step0 = new Step(axis0, elementTest0);
      Axis axis1 = step0.getAxis();
      assertEquals(Axis.Direction.SELF, axis1.getDirection());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Axis axis0 = Axis.SELF;
      ElementTest elementTest0 = new ElementTest();
      Step step0 = new Step(axis0, elementTest0);
      String string0 = step0.describe();
      assertEquals("Step(self::AST_element())", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Axis axis0 = Axis.DESCENDANT;
      Step step0 = new Step(axis0, (NodeTest) null);
      // Undeclared exception!
      try { 
        step0.equals(step0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.Step", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Axis axis0 = Axis.SELF;
      ElementTest elementTest0 = new ElementTest();
      Step step0 = new Step(axis0, elementTest0);
      AnyKindTest anyKindTest0 = AnyKindTest.instance();
      Step step1 = new Step(axis0, anyKindTest0);
      boolean boolean0 = step0.equals(step1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Axis axis0 = Axis.ATTRIBUTE;
      PITest pITest0 = new PITest();
      Step step0 = new Step(axis0, pITest0);
      Axis axis1 = Axis.FOLLOWING_SIBLING;
      Step step1 = new Step(axis1, pITest0);
      boolean boolean0 = step0.equals(step1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Axis axis0 = Axis.SELF;
      ElementTest elementTest0 = new ElementTest();
      Step step0 = new Step(axis0, elementTest0);
      Object object0 = new Object();
      boolean boolean0 = step0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Axis axis0 = Axis.SELF;
      ElementTest elementTest0 = new ElementTest();
      Step step0 = new Step(axis0, elementTest0);
      boolean boolean0 = step0.equals(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Axis axis0 = Axis.CHILD;
      AttributeTest attributeTest0 = new AttributeTest();
      Step step0 = new Step(axis0, attributeTest0);
      boolean boolean0 = step0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Axis axis0 = Axis.SELF;
      ElementTest elementTest0 = new ElementTest();
      Step step0 = new Step(axis0, elementTest0);
      ElementTest elementTest1 = (ElementTest)step0.getNodeTest();
      assertEquals(KindTest.Kind.ELEMENT, elementTest1.getKind());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QNameW qNameW0 = new QNameW("No such axis: '", "No such axis: '");
      SchemaAttributeTest schemaAttributeTest0 = new SchemaAttributeTest(qNameW0);
      Step step0 = new Step((Axis) null, schemaAttributeTest0);
      Axis axis0 = step0.getAxis();
      assertNull(axis0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeTest attributeTest0 = new AttributeTest();
      Step step0 = new Step((Axis) null, attributeTest0);
      // Undeclared exception!
      try { 
        step0.describe();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.Step", e);
      }
  }
}
