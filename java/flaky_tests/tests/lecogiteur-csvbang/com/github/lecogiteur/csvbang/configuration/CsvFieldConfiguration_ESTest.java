/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 29 07:55:38 GMT 2022
 */

package com.github.lecogiteur.csvbang.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CsvFieldConfiguration_ESTest extends CsvFieldConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CsvFieldConfiguration csvFieldConfiguration0 = new CsvFieldConfiguration();
      assertFalse(csvFieldConfiguration0.isDeleteFieldIfNull);
      assertEquals((-1), csvFieldConfiguration0.position);
  }
}
