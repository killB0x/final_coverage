/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 09:21:09 GMT 2022
 */

package com.ibanity.apis.client.webhooks.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibanity.apis.client.webhooks.models.Key;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Key_ESTest extends Key_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Key key0 = new Key();
      key0.setUse("6s0fK8_s[-U(U");
      String string0 = key0.getUse();
      assertEquals("6s0fK8_s[-U(U", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Key key0 = new Key();
      key0.setUse("");
      String string0 = key0.getUse();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Key key0 = new Key();
      key0.setStatus(", n=");
      String string0 = key0.getStatus();
      assertEquals(", n=", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Key key0 = new Key();
      key0.setStatus("");
      String string0 = key0.getStatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Key key0 = new Key();
      key0.setN("mW7M) VE>;mq");
      String string0 = key0.getN();
      assertEquals("mW7M) VE>;mq", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Key key0 = new Key();
      key0.setN("");
      String string0 = key0.getN();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Key key0 = new Key();
      key0.setKty("+o7tX");
      String string0 = key0.getKty();
      assertEquals("+o7tX", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Key key0 = new Key();
      key0.setKty("");
      String string0 = key0.getKty();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Key key0 = new Key();
      key0.setKid("= <");
      String string0 = key0.getKid();
      assertEquals("= <", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Key key0 = new Key();
      key0.setKid("");
      String string0 = key0.getKid();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Key key0 = new Key();
      key0.setE("<+GSYNUHVsNs+");
      String string0 = key0.getE();
      assertEquals("<+GSYNUHVsNs+", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Key key0 = new Key();
      key0.setE("");
      String string0 = key0.getE();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Key key0 = new Key();
      key0.setAlg("Key(alg=null, e=null, kid=null, kty=null, n=null, status=null, use=null)");
      String string0 = key0.getAlg();
      assertEquals("Key(alg=null, e=null, kid=null, kty=null, n=null, status=null, use=null)", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Key key0 = new Key();
      key0.setAlg("");
      String string0 = key0.getAlg();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Key key0 = new Key();
      Object object0 = new Object();
      boolean boolean0 = key0.canEqual(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Key key0 = null;
      try {
        key0 = new Key((Key.KeyBuilder<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibanity.apis.client.webhooks.models.Key$KeyBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Key key0 = new Key();
      String string0 = key0.getKid();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Key key0 = new Key();
      String string0 = key0.getE();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Key key0 = new Key();
      String string0 = key0.getAlg();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Key key0 = new Key();
      String string0 = key0.getUse();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Key key0 = new Key();
      String string0 = key0.getKty();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Key key0 = new Key();
      String string0 = key0.getStatus();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Key key0 = new Key();
      key0.setUse("4FgL {1yJ`#n");
      Key key1 = new Key();
      assertFalse(key1.equals((Object)key0));
      
      key1.setUse("4FgL {1yJ`#n");
      boolean boolean0 = key0.equals(key1);
      assertTrue(key1.equals((Object)key0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      assertTrue(key1.equals((Object)key0));
      
      key1.setUse("<>");
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      assertTrue(key1.equals((Object)key0));
      
      key0.setUse("P@q0]NI-ZEw$&O@uP8dy");
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Key key0 = new Key();
      key0.setStatus("f^k0:");
      Key key1 = new Key();
      assertFalse(key1.equals((Object)key0));
      
      key1.setStatus("f^k0:");
      boolean boolean0 = key1.equals(key0);
      assertTrue(key1.equals((Object)key0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      assertTrue(key1.equals((Object)key0));
      
      key1.setStatus("");
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Key key0 = new Key();
      key0.setStatus("");
      Key key1 = new Key();
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Key key0 = new Key();
      key0.setN("Yz{?");
      Key key1 = new Key();
      assertFalse(key1.equals((Object)key0));
      
      key1.setN("Yz{?");
      boolean boolean0 = key0.equals(key1);
      assertTrue(key1.equals((Object)key0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      assertTrue(key1.equals((Object)key0));
      
      key1.setN("");
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Key key0 = new Key();
      key0.setN("%1^ px}VN)8f~t");
      Key key1 = new Key();
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Key key0 = new Key();
      key0.setKty("");
      Key key1 = new Key();
      assertFalse(key1.equals((Object)key0));
      
      key1.setKty("");
      boolean boolean0 = key0.equals(key1);
      assertTrue(key1.equals((Object)key0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      assertTrue(key1.equals((Object)key0));
      
      key1.setKty(", use=");
      boolean boolean0 = key0.equals(key1);
      assertFalse(key1.equals((Object)key0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Key key0 = new Key();
      key0.setKty("q0FhN>pjf7Gn");
      Key key1 = new Key();
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Key key0 = new Key();
      key0.setKid("");
      Key key1 = new Key();
      assertFalse(key1.equals((Object)key0));
      
      key1.setKid("");
      boolean boolean0 = key1.equals(key0);
      assertTrue(key1.equals((Object)key0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      assertTrue(key1.equals((Object)key0));
      
      key1.setKid("");
      boolean boolean0 = key0.equals(key1);
      assertFalse(key1.equals((Object)key0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Key key0 = new Key();
      key0.setKid("r >|(pItn$b.$R>=|F");
      Key key1 = new Key();
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      key0.setE("nbu2Rt|5oGW[?");
      assertFalse(key0.equals((Object)key1));
      
      key1.setE("nbu2Rt|5oGW[?");
      boolean boolean0 = key1.equals(key0);
      assertTrue(key0.equals((Object)key1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      assertTrue(key1.equals((Object)key0));
      
      key1.setE("b9f7i2P$yEMx");
      boolean boolean0 = key0.equals(key1);
      assertFalse(key1.equals((Object)key0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Key key0 = new Key();
      key0.setE("");
      Key key1 = new Key();
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      key0.setAlg("");
      assertFalse(key0.equals((Object)key1));
      
      key1.setAlg("");
      boolean boolean0 = key0.equals(key1);
      assertTrue(key0.equals((Object)key1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Key key0 = new Key();
      Key key1 = new Key();
      assertTrue(key1.equals((Object)key0));
      
      key1.setAlg("[/;+v/,oI\"");
      boolean boolean0 = key0.equals(key1);
      assertFalse(key1.equals((Object)key0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Key key0 = new Key();
      key0.setAlg("");
      Key key1 = new Key();
      boolean boolean0 = key0.equals(key1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Key key0 = new Key();
      Object object0 = new Object();
      boolean boolean0 = key0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Key key0 = new Key();
      boolean boolean0 = key0.equals(key0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Key key0 = new Key();
      key0.setStatus("");
      key0.hashCode();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Key key0 = new Key();
      key0.setN("FF;J;3w{D-E10%LV");
      key0.hashCode();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Key key0 = new Key();
      key0.setKty(", kid=");
      key0.hashCode();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Key key0 = new Key();
      key0.setKid("");
      key0.hashCode();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Key key0 = new Key();
      key0.setE("");
      key0.hashCode();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Key key0 = new Key();
      key0.setAlg(", status=");
      key0.hashCode();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Key key0 = new Key();
      Key.KeyBuilder<?, ?> key_KeyBuilder0 = key0.toBuilder();
      assertNotNull(key_KeyBuilder0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Key key0 = new Key();
      boolean boolean0 = key0.canEqual(key0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Key key0 = new Key();
      key0.setUse("Keyval+=");
      key0.hashCode();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Key.KeyBuilder<?, ?> key_KeyBuilder0 = Key.builder();
      Key key0 = new Key(key_KeyBuilder0);
      String string0 = key0.getN();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Key key0 = new Key();
      String string0 = key0.toString();
      assertEquals("Key(alg=null, e=null, kid=null, kty=null, n=null, status=null, use=null)", string0);
  }
}
