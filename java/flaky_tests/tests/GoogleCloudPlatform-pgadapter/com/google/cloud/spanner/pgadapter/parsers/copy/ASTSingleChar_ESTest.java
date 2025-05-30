/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 14 01:42:53 GMT 2022
 */

package com.google.cloud.spanner.pgadapter.parsers.copy;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.cloud.spanner.pgadapter.parsers.copy.ASTSingleChar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ASTSingleChar_ESTest extends ASTSingleChar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASTSingleChar aSTSingleChar0 = new ASTSingleChar(0);
      aSTSingleChar0.setChar('3');
      char char0 = aSTSingleChar0.getChar();
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ASTSingleChar aSTSingleChar0 = new ASTSingleChar(0);
      String string0 = aSTSingleChar0.toString();
      assertEquals("Char: \u0000", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASTSingleChar aSTSingleChar0 = new ASTSingleChar(0);
      aSTSingleChar0.setChar('K');
      char char0 = aSTSingleChar0.getChar();
      assertEquals('K', char0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ASTSingleChar aSTSingleChar0 = new ASTSingleChar(0);
      char char0 = aSTSingleChar0.getChar();
      assertEquals('\u0000', char0);
  }
}
