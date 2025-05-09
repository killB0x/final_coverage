/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:56:42 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast.partial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.evolvedbinary.xpath.parser.ast.AnyKindTest;
import com.evolvedbinary.xpath.parser.ast.ElementTest;
import com.evolvedbinary.xpath.parser.ast.OccurrenceIndicator;
import com.evolvedbinary.xpath.parser.ast.QNameW;
import com.evolvedbinary.xpath.parser.ast.SchemaElementTest;
import com.evolvedbinary.xpath.parser.ast.SequenceType;
import com.evolvedbinary.xpath.parser.ast.partial.PartialSequenceType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PartialSequenceType_ESTest extends PartialSequenceType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SchemaElementTest schemaElementTest0 = new SchemaElementTest((QNameW) null);
      PartialSequenceType partialSequenceType0 = new PartialSequenceType(schemaElementTest0);
      // Undeclared exception!
      try { 
        partialSequenceType0.describe();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.evolvedbinary.xpath.parser.ast.SchemaElementTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QNameW qNameW0 = new QNameW("Either.right value on Left", "Either.right value on Left");
      ElementTest elementTest0 = new ElementTest(qNameW0);
      PartialSequenceType partialSequenceType0 = new PartialSequenceType(elementTest0);
      OccurrenceIndicator occurrenceIndicator0 = OccurrenceIndicator.ZERO_OR_MORE;
      SequenceType sequenceType0 = partialSequenceType0.complete(occurrenceIndicator0);
      assertNotNull(sequenceType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AnyKindTest anyKindTest0 = AnyKindTest.instance();
      PartialSequenceType partialSequenceType0 = new PartialSequenceType(anyKindTest0);
      String string0 = partialSequenceType0.describe();
      assertEquals("SequenceType(AST_node(), ?)", string0);
  }
}
