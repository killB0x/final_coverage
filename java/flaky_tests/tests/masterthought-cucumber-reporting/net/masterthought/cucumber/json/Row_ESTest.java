/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 00:16:51 GMT 2022
 */

package net.masterthought.cucumber.json;

import org.junit.Test;
import static org.junit.Assert.*;
import net.masterthought.cucumber.json.Row;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Row_ESTest extends Row_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Row row0 = new Row();
      String[] stringArray0 = row0.getCells();
      assertEquals(0, stringArray0.length);
  }
}
