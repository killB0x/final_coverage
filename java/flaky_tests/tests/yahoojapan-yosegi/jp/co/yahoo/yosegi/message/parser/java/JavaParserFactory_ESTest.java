/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 26 00:29:24 GMT 2022
 */

package jp.co.yahoo.yosegi.message.parser.java;

import org.junit.Test;
import static org.junit.Assert.*;
import jp.co.yahoo.yosegi.message.parser.IParser;
import jp.co.yahoo.yosegi.message.parser.java.JavaParserFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaParserFactory_ESTest extends JavaParserFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      IParser iParser0 = JavaParserFactory.get(object0);
      assertFalse(iParser0.isArray());
  }
}
