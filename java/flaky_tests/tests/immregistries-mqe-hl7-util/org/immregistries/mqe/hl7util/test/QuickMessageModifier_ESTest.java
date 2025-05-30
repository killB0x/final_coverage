/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 11:18:47 GMT 2022
 */

package org.immregistries.mqe.hl7util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.immregistries.mqe.hl7util.model.Hl7Location;
import org.immregistries.mqe.hl7util.test.QuickMessageModifier;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuickMessageModifier_ESTest extends QuickMessageModifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuickMessageModifier quickMessageModifier0 = QuickMessageModifier.INSTANCE;
      // Undeclared exception!
      try { 
        quickMessageModifier0.changeMessage("INSTANCE", (Hl7Location) null, ")_\"-}'OPj3z");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/immregistries/mqe/hl7util/parser/HL7MessageMap
         //
         verifyException("org.immregistries.mqe.hl7util.parser.MessageParserHL7", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuickMessageModifier quickMessageModifier0 = QuickMessageModifier.INSTANCE;
      // Undeclared exception!
      try { 
        quickMessageModifier0.changeMessage("Contact Person's Address - Street Address", "Contact Person's Address - Street Address", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.immregistries.mqe.hl7util.model.Hl7Location", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuickMessageModifier[] quickMessageModifierArray0 = QuickMessageModifier.values();
      assertEquals(1, quickMessageModifierArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuickMessageModifier quickMessageModifier0 = QuickMessageModifier.valueOf("INSTANCE");
      assertEquals(QuickMessageModifier.INSTANCE, quickMessageModifier0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuickMessageModifier quickMessageModifier0 = QuickMessageModifier.INSTANCE;
      // Undeclared exception!
      try { 
        quickMessageModifier0.changeMessage("(]k)7zHcmI@&,^6T#m", "", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("org.immregistries.mqe.hl7util.model.Hl7Location", e);
      }
  }
}
