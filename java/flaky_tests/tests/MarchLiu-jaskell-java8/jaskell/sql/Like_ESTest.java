/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 01 12:43:12 GMT 2022
 */

package jaskell.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import jaskell.sql.Like;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Like_ESTest extends Like_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Like like0 = new Like();
      String string0 = like0.operator();
      assertEquals(" LIKE ", string0);
  }
}
