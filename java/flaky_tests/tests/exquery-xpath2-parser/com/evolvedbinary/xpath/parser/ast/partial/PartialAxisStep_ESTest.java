/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:49:43 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast.partial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.AttributeTest;
import com.evolvedbinary.xpath.parser.ast.Axis;
import com.evolvedbinary.xpath.parser.ast.AxisStep;
import com.evolvedbinary.xpath.parser.ast.PredicateList;
import com.evolvedbinary.xpath.parser.ast.QNameW;
import com.evolvedbinary.xpath.parser.ast.Step;
import com.evolvedbinary.xpath.parser.ast.partial.PartialAxisStep;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PartialAxisStep_ESTest extends PartialAxisStep_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AttributeTest attributeTest0 = new AttributeTest();
      Step step0 = new Step((Axis) null, attributeTest0);
      PartialAxisStep partialAxisStep0 = new PartialAxisStep(step0);
      // Undeclared exception!
      try { 
        partialAxisStep0.describe();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.Step", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Axis axis0 = Axis.NAMESPACE;
      AttributeTest attributeTest0 = new AttributeTest((QNameW) null);
      Step step0 = new Step(axis0, attributeTest0);
      PartialAxisStep partialAxisStep0 = new PartialAxisStep(step0);
      PredicateList predicateList0 = PredicateList.EMPTY;
      AxisStep axisStep0 = partialAxisStep0.complete(predicateList0);
      assertNotNull(axisStep0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PartialAxisStep partialAxisStep0 = new PartialAxisStep((Step) null);
      String string0 = partialAxisStep0.describe();
      assertEquals("AxisStep(null, ?)", string0);
  }
}
