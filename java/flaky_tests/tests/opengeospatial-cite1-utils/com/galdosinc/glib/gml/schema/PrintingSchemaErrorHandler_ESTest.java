/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 08:24:46 GMT 2022
 */

package com.galdosinc.glib.gml.schema;

import org.junit.Test;
import static org.junit.Assert.*;
import com.galdosinc.glib.gml.schema.PrintingSchemaErrorHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrintingSchemaErrorHandler_ESTest extends PrintingSchemaErrorHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrintingSchemaErrorHandler printingSchemaErrorHandler0 = new PrintingSchemaErrorHandler();
      assertFalse(printingSchemaErrorHandler0.hasErrors());
      
      printingSchemaErrorHandler0.error("");
      boolean boolean0 = printingSchemaErrorHandler0.hasErrors();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrintingSchemaErrorHandler printingSchemaErrorHandler0 = new PrintingSchemaErrorHandler();
      assertFalse(printingSchemaErrorHandler0.hasErrors());
      
      printingSchemaErrorHandler0.error("W=y,gsh;", "GiPW-:[k\f*9+^", "T!pL");
      assertTrue(printingSchemaErrorHandler0.hasErrors());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrintingSchemaErrorHandler printingSchemaErrorHandler0 = new PrintingSchemaErrorHandler();
      boolean boolean0 = printingSchemaErrorHandler0.hasErrors();
      assertFalse(boolean0);
  }
}
