/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 02 04:48:04 GMT 2022
 */

package net.sf.javaanpr.intelligence.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import net.sf.javaanpr.intelligence.parser.Parser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Parser parser0 = null;
      try {
        parser0 = new Parser();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // /home/user/src/main/resources/dtd/syntax.dtd (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }
}
