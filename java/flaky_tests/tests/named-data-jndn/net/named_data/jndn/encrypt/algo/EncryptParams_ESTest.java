/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 09 00:42:42 GMT 2022
 */

package net.named_data.jndn.encrypt.algo;

import org.junit.Test;
import static org.junit.Assert.*;
import net.named_data.jndn.encrypt.algo.EncryptAlgorithmType;
import net.named_data.jndn.encrypt.algo.EncryptParams;
import net.named_data.jndn.util.Blob;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncryptParams_ESTest extends EncryptParams_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EncryptAlgorithmType encryptAlgorithmType0 = EncryptAlgorithmType.AesEcb;
      EncryptParams encryptParams0 = new EncryptParams(encryptAlgorithmType0);
      EncryptAlgorithmType encryptAlgorithmType1 = encryptParams0.getAlgorithmType();
      assertSame(encryptAlgorithmType1, encryptAlgorithmType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EncryptAlgorithmType encryptAlgorithmType0 = EncryptAlgorithmType.RsaOaep;
      EncryptParams encryptParams0 = new EncryptParams(encryptAlgorithmType0, 0);
      EncryptAlgorithmType encryptAlgorithmType1 = encryptParams0.getAlgorithmType();
      assertEquals(3, encryptAlgorithmType1.getNumericType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EncryptAlgorithmType encryptAlgorithmType0 = EncryptAlgorithmType.RsaOaep;
      EncryptParams encryptParams0 = new EncryptParams(encryptAlgorithmType0, 0);
      EncryptAlgorithmType encryptAlgorithmType1 = EncryptAlgorithmType.NONE;
      encryptParams0.setAlgorithmType(encryptAlgorithmType1);
      EncryptAlgorithmType encryptAlgorithmType2 = encryptParams0.getAlgorithmType();
      assertSame(encryptAlgorithmType2, encryptAlgorithmType1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EncryptAlgorithmType encryptAlgorithmType0 = EncryptAlgorithmType.NONE;
      EncryptParams encryptParams0 = new EncryptParams(encryptAlgorithmType0);
      EncryptParams encryptParams1 = encryptParams0.setInitialVector((Blob) null);
      assertSame(encryptParams1, encryptParams0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EncryptAlgorithmType encryptAlgorithmType0 = EncryptAlgorithmType.RsaOaep;
      EncryptParams encryptParams0 = new EncryptParams(encryptAlgorithmType0, 991);
      assertEquals(EncryptAlgorithmType.RsaOaep, encryptParams0.getAlgorithmType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EncryptAlgorithmType encryptAlgorithmType0 = EncryptAlgorithmType.AesEcb;
      EncryptParams encryptParams0 = new EncryptParams(encryptAlgorithmType0, (-1182));
      Blob blob0 = new Blob("5;TT");
      encryptParams0.setInitialVector(blob0);
      Blob blob1 = encryptParams0.getInitialVector();
      assertFalse(blob1.isNull());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EncryptAlgorithmType encryptAlgorithmType0 = EncryptAlgorithmType.AesEcb;
      EncryptParams encryptParams0 = new EncryptParams(encryptAlgorithmType0);
      Blob blob0 = encryptParams0.getInitialVector();
      assertTrue(blob0.isNull());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EncryptParams encryptParams0 = new EncryptParams((EncryptAlgorithmType) null);
      encryptParams0.getAlgorithmType();
  }
}
