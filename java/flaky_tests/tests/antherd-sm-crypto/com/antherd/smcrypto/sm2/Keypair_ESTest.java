/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 15:42:39 GMT 2022
 */

package com.antherd.smcrypto.sm2;

import org.junit.Test;
import static org.junit.Assert.*;
import com.antherd.smcrypto.sm2.Keypair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Keypair_ESTest extends Keypair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Keypair keypair0 = new Keypair((String) null, (String) null);
      keypair0.setPublicKey("");
      String string0 = keypair0.toString();
      assertEquals("Keypair{privateKey='null', publicKey=''}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Keypair keypair0 = new Keypair("$LvMLG!%SE9j<f", "");
      assertEquals("", keypair0.getPublicKey());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Keypair keypair0 = new Keypair((String) null, (String) null);
      keypair0.setPublicKey("*}X");
      String string0 = keypair0.getPublicKey();
      assertEquals("*}X", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Keypair keypair0 = new Keypair();
      keypair0.setPublicKey("");
      String string0 = keypair0.getPublicKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Keypair keypair0 = new Keypair();
      keypair0.setPrivateKey("Keypair{privateKey='");
      String string0 = keypair0.getPrivateKey();
      assertEquals("Keypair{privateKey='", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Keypair keypair0 = new Keypair((String) null, (String) null);
      keypair0.setPrivateKey("");
      String string0 = keypair0.getPrivateKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Keypair keypair0 = new Keypair((String) null, (String) null);
      String string0 = keypair0.getPrivateKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Keypair keypair0 = new Keypair();
      String string0 = keypair0.getPublicKey();
      assertNull(string0);
  }
}
