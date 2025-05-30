/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 18:53:45 GMT 2022
 */

package org.apache.commons.codec.language.bm;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.bm.RuleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RuleType_ESTest extends RuleType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RuleType[] ruleTypeArray0 = RuleType.values();
      assertEquals(3, ruleTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RuleType ruleType0 = RuleType.valueOf("EXACT");
      assertEquals(RuleType.EXACT, ruleType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RuleType ruleType0 = RuleType.APPROX;
      String string0 = ruleType0.getName();
      assertEquals("approx", string0);
  }
}
