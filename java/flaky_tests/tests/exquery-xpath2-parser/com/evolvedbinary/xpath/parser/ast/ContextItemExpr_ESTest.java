/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 08:51:02 GMT 2022
 */

package com.evolvedbinary.xpath.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import com.evolvedbinary.xpath.parser.ast.ContextItemExpr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContextItemExpr_ESTest extends ContextItemExpr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextItemExpr contextItemExpr0 = ContextItemExpr.instance();
      String string0 = contextItemExpr0.describe();
      assertEquals("ContextItemExpr", string0);
  }
}
