/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 10 23:25:07 GMT 2022
 */

package info.michaelwittig.javaq.query.type.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import info.michaelwittig.javaq.query.type.Type;
import info.michaelwittig.javaq.query.type.ValueFactory;
import info.michaelwittig.javaq.query.type.impl.TypeDateTime;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeDateTime_ESTest extends TypeDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TypeDateTime typeDateTime0 = TypeDateTime.get();
      ValueFactory<Date, Type<Date>> valueFactory0 = typeDateTime0.geValueFactory();
      assertNotNull(valueFactory0);
  }
}
