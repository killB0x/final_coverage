/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 02:55:20 GMT 2022
 */

package com.ctc.wstx.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ctc.wstx.util.DefaultXmlSymbolTable;
import com.ctc.wstx.util.SymbolTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultXmlSymbolTable_ESTest extends DefaultXmlSymbolTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = DefaultXmlSymbolTable.getXmlSymbol();
      assertEquals("xml", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultXmlSymbolTable defaultXmlSymbolTable0 = new DefaultXmlSymbolTable();
      assertEquals("xml", defaultXmlSymbolTable0.getXmlSymbol());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SymbolTable symbolTable0 = DefaultXmlSymbolTable.getInstance();
      assertEquals(2, symbolTable0.version());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = DefaultXmlSymbolTable.getXmlnsSymbol();
      assertEquals("xmlns", string0);
  }
}
