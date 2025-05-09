/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 11 08:21:22 GMT 2022
 */

package com.galdosinc.glib.gml.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.galdosinc.glib.gml.validator.GmlInstanceValidator;
import javax.xml.parsers.FactoryConfigurationError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GmlInstanceValidator_ESTest extends GmlInstanceValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GmlInstanceValidator gmlInstanceValidator0 = null;
      try {
        gmlInstanceValidator0 = new GmlInstanceValidator();
        fail("Expecting exception: FactoryConfigurationError");
      
      } catch(FactoryConfigurationError e) {
         //
         // Provider com.galdosinc.glib.xml.jaxp.ValidatingDocumentBuilderFactory not found
         //
         verifyException("javax.xml.parsers.FactoryFinder", e);
      }
  }
}
