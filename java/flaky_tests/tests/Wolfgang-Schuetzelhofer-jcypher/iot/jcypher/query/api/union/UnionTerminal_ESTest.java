/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 25 22:16:28 GMT 2022
 */

package iot.jcypher.query.api.union;

import org.junit.Test;
import static org.junit.Assert.*;
import iot.jcypher.query.api.union.UnionTerminal;
import iot.jcypher.query.ast.union.UnionExpression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnionTerminal_ESTest extends UnionTerminal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnionExpression unionExpression0 = new UnionExpression();
      UnionTerminal unionTerminal0 = new UnionTerminal(unionExpression0);
  }
}
