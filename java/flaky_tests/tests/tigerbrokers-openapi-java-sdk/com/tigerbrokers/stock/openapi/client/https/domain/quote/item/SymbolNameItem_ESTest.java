/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 21 05:40:11 GMT 2022
 */

package com.tigerbrokers.stock.openapi.client.https.domain.quote.item;

import org.junit.Test;
import static org.junit.Assert.*;
import com.tigerbrokers.stock.openapi.client.https.domain.quote.item.SymbolNameItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SymbolNameItem_ESTest extends SymbolNameItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SymbolNameItem symbolNameItem0 = new SymbolNameItem();
      symbolNameItem0.setSymbol("");
      String string0 = symbolNameItem0.getSymbol();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SymbolNameItem symbolNameItem0 = new SymbolNameItem();
      symbolNameItem0.setName("");
      String string0 = symbolNameItem0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SymbolNameItem symbolNameItem0 = new SymbolNameItem();
      String string0 = symbolNameItem0.toString();
      assertEquals("SymbolNameItem{symbol='null', name='null'}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SymbolNameItem symbolNameItem0 = new SymbolNameItem();
      symbolNameItem0.setName("\"$qnAF=jf");
      String string0 = symbolNameItem0.getName();
      assertEquals("\"$qnAF=jf", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SymbolNameItem symbolNameItem0 = new SymbolNameItem();
      symbolNameItem0.setSymbol("X");
      String string0 = symbolNameItem0.getSymbol();
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SymbolNameItem symbolNameItem0 = new SymbolNameItem();
      String string0 = symbolNameItem0.getSymbol();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SymbolNameItem symbolNameItem0 = new SymbolNameItem();
      String string0 = symbolNameItem0.getName();
      assertNull(string0);
  }
}
