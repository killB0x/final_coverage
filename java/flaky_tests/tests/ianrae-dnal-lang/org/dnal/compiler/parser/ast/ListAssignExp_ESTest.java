/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 18 04:31:17 GMT 2022
 */

package org.dnal.compiler.parser.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import org.dnal.compiler.parser.ast.Exp;
import org.dnal.compiler.parser.ast.ListAssignExp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ListAssignExp_ESTest extends ListAssignExp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Exp> linkedList0 = new LinkedList<Exp>();
      ListAssignExp listAssignExp0 = new ListAssignExp(linkedList0);
      String string0 = listAssignExp0.strValue();
      assertEquals("??", string0);
  }
}
