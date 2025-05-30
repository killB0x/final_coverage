/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 09:52:30 GMT 2022
 */

package com.mxw.protocol.response.nonFungibleToken;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mxw.protocol.response.nonFungibleToken.NFTokenBurn;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NFTokenBurn_ESTest extends NFTokenBurn_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn("yLwDCHfD6x", "");
      String string0 = nFTokenBurn0.getSymbol();
      assertEquals("", nFTokenBurn0.getItemID());
      assertEquals("yLwDCHfD6x", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn("", "{2^-s \"z7{sS");
      String string0 = nFTokenBurn0.getSymbol();
      assertEquals("{2^-s \"z7{sS", nFTokenBurn0.getItemID());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn("", (String) null);
      String string0 = nFTokenBurn0.getItemID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn("", "{2^-s \"z7{sS");
      String string0 = nFTokenBurn0.getItemID();
      assertEquals("{2^-s \"z7{sS", string0);
      assertEquals("", nFTokenBurn0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn((String) null, "");
      nFTokenBurn0.setFrom(",u2:QmXTZjlZr");
      String string0 = nFTokenBurn0.getFrom();
      assertEquals(",u2:QmXTZjlZr", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn("", "");
      nFTokenBurn0.setFrom("");
      String string0 = nFTokenBurn0.getFrom();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn((String) null, "");
      String string0 = nFTokenBurn0.getItemID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn((String) null, "");
      String string0 = nFTokenBurn0.getSymbol();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NFTokenBurn nFTokenBurn0 = new NFTokenBurn((String) null, "");
      String string0 = nFTokenBurn0.getFrom();
      assertNull(string0);
  }
}
