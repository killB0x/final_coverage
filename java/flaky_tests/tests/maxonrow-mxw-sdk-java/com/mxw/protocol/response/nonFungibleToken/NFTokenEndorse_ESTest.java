/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 04 10:06:53 GMT 2022
 */

package com.mxw.protocol.response.nonFungibleToken;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NFTokenEndorse_ESTest extends NFTokenEndorse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse("com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse", "com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse", "");
      String string0 = nFTokenEndorse0.getSymbol();
      assertEquals("com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse", nFTokenEndorse0.getItemID());
      assertEquals("", nFTokenEndorse0.getMetadata());
      assertEquals("com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse("", (String) null, "gOnU:Nv*TU)");
      String string0 = nFTokenEndorse0.getSymbol();
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals("gOnU:Nv*TU)", nFTokenEndorse0.getMetadata());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse("com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse", "com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse", "");
      String string0 = nFTokenEndorse0.getMetadata();
      assertEquals("com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse", nFTokenEndorse0.getSymbol());
      assertEquals("", string0);
      assertEquals("com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse", nFTokenEndorse0.getItemID());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse("", (String) null, "gOnU:Nv*TU)");
      String string0 = nFTokenEndorse0.getItemID();
      assertEquals("gOnU:Nv*TU)", nFTokenEndorse0.getMetadata());
      assertNull(string0);
      assertEquals("", nFTokenEndorse0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse("", "", "");
      String string0 = nFTokenEndorse0.getItemID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse("LqhH1", "<M?QZUZK/hS:@J", "LqhH1");
      nFTokenEndorse0.setFrom("LWh");
      nFTokenEndorse0.getFrom();
      assertEquals("LqhH1", nFTokenEndorse0.getMetadata());
      assertEquals("<M?QZUZK/hS:@J", nFTokenEndorse0.getItemID());
      assertEquals("LqhH1", nFTokenEndorse0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse("", (String) null, "gOnU:Nv*TU)");
      nFTokenEndorse0.setFrom("");
      nFTokenEndorse0.getFrom();
      assertEquals("gOnU:Nv*TU)", nFTokenEndorse0.getMetadata());
      assertEquals("", nFTokenEndorse0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse((String) null, "?ZteFvo;VXoS", (String) null);
      String string0 = nFTokenEndorse0.getItemID();
      assertEquals("?ZteFvo;VXoS", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse((String) null, "?ZteFvo;VXoS", (String) null);
      nFTokenEndorse0.setMetadata("?ZteFvo;VXoS");
      String string0 = nFTokenEndorse0.getMetadata();
      assertEquals("?ZteFvo;VXoS", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse((String) null, "?ZteFvo;VXoS", (String) null);
      String string0 = nFTokenEndorse0.getMetadata();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse((String) null, "?ZteFvo;VXoS", (String) null);
      String string0 = nFTokenEndorse0.getSymbol();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NFTokenEndorse nFTokenEndorse0 = new NFTokenEndorse((String) null, "?ZteFvo;VXoS", (String) null);
      String string0 = nFTokenEndorse0.getFrom();
      assertNull(string0);
  }
}
