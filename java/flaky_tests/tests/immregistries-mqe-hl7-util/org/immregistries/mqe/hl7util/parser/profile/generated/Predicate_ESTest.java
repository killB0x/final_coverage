/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 11:17:12 GMT 2022
 */

package org.immregistries.mqe.hl7util.parser.profile.generated;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.immregistries.mqe.hl7util.parser.profile.generated.Predicate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Predicate_ESTest extends Predicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate predicate0 = new Predicate();
      predicate0.englishDescription = null;
      predicate0.englishDescription = ">R;$";
      String string0 = predicate0.getEnglishDescription();
      assertEquals(">R;$", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate predicate0 = new Predicate();
      predicate0.setEnglishDescription("");
      String string0 = predicate0.getEnglishDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Predicate predicate0 = new Predicate();
      String string0 = predicate0.getEnglishDescription();
      assertNull(string0);
  }
}
