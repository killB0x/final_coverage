/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 17 16:31:03 GMT 2022
 */

package uk.co.develop4.security.codecs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.co.develop4.security.codecs.CodecFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CodecFactory_ESTest extends CodecFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CodecFactory codecFactory0 = new CodecFactory();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        CodecFactory.getCodec("uk.co.develop4.security.codecs.CodecFactory", properties0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }
}
