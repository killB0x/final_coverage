/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 23:29:02 GMT 2022
 */

package info.michaelwittig.javaq.query.column.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import info.michaelwittig.javaq.query.column.impl.SymbolColumn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SymbolColumn_ESTest extends SymbolColumn_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SymbolColumn symbolColumn0 = new SymbolColumn((String) null);
      assertNull(symbolColumn0.getName());
  }
}
