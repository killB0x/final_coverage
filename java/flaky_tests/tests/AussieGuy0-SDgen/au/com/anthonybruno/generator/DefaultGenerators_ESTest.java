/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 05:36:53 GMT 2022
 */

package au.com.anthonybruno.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import au.com.anthonybruno.generator.DefaultGenerators;
import au.com.anthonybruno.generator.Generator;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultGenerators_ESTest extends DefaultGenerators_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Date> class0 = Date.class;
      Generator<?> generator0 = DefaultGenerators.get(class0);
      assertNotNull(generator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultGenerators defaultGenerators0 = new DefaultGenerators();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Generator<?> generator0 = DefaultGenerators.get(class0);
      assertNull(generator0);
  }
}
