/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 10:14:11 GMT 2022
 */

package com.mxw.protocol.response.fungibleToken;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mxw.protocol.response.fungibleToken.FungibleTokenMint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FungibleTokenMint_ESTest extends FungibleTokenMint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint((String) null, "");
      fungibleTokenMint0.setTo("!h:Q[`]Ze9'69@E");
      String string0 = fungibleTokenMint0.getTo();
      assertEquals("!h:Q[`]Ze9'69@E", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint((String) null, "");
      fungibleTokenMint0.setTo("");
      String string0 = fungibleTokenMint0.getTo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint((String) null, "");
      String string0 = fungibleTokenMint0.getSymbol();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint("", "");
      String string0 = fungibleTokenMint0.getSymbol();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint("com.mxw.protocol.response.fungibleToken.FungibleTokenMint", "com.mxw.protocol.response.fungibleToken.FungibleTokenMint");
      fungibleTokenMint0.setOwner("com.mxw.protocol.response.fungibleToken.FungibleTokenMint");
      String string0 = fungibleTokenMint0.getOwner();
      assertEquals("com.mxw.protocol.response.fungibleToken.FungibleTokenMint", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint("!N2=", "!N2=");
      fungibleTokenMint0.setOwner("");
      String string0 = fungibleTokenMint0.getOwner();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint("com.mxw.protocol.response.fungibleToken.FungibleTokenMint", "com.mxw.protocol.response.fungibleToken.FungibleTokenMint");
      String string0 = fungibleTokenMint0.getTo();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint("com.mxw.protocol.response.fungibleToken.FungibleTokenMint", "com.mxw.protocol.response.fungibleToken.FungibleTokenMint");
      String string0 = fungibleTokenMint0.getSymbol();
      assertEquals("com.mxw.protocol.response.fungibleToken.FungibleTokenMint", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FungibleTokenMint fungibleTokenMint0 = new FungibleTokenMint("com.mxw.protocol.response.fungibleToken.FungibleTokenMint", "com.mxw.protocol.response.fungibleToken.FungibleTokenMint");
      String string0 = fungibleTokenMint0.getOwner();
      assertNull(string0);
  }
}
