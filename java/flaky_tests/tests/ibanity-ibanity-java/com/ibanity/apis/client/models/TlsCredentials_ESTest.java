/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 03 10:45:26 GMT 2022
 */

package com.ibanity.apis.client.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.ibanity.apis.client.models.TlsCredentials;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TlsCredentials_ESTest extends TlsCredentials_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      TlsCredentials tlsCredentials0 = new TlsCredentials((X509Certificate) null, privateKey0, "Hx4G/+M");
      String string0 = tlsCredentials0.getPrivateKeyPassphrase();
      assertEquals("Hx4G/+M", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      TlsCredentials tlsCredentials0 = new TlsCredentials(x509Certificate0, privateKey0, "");
      String string0 = tlsCredentials0.getPrivateKeyPassphrase();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(privateKey0).toString();
      TlsCredentials tlsCredentials0 = new TlsCredentials(x509Certificate0, privateKey0, "DBV?_#jIc");
      PrivateKey privateKey1 = tlsCredentials0.getPrivateKey();
      assertNull(privateKey1.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.canEqual(tlsCredentials0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.canEqual(tlsCredentials_TlsCredentialsBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      PrivateKey privateKey0 = tlsCredentials0.getPrivateKey();
      assertNull(privateKey0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      X509Certificate x509Certificate0 = tlsCredentials0.getCertificate();
      assertNull(x509Certificate0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      TlsCredentials tlsCredentials0 = new TlsCredentials((X509Certificate) null, privateKey0, (String) null);
      String string0 = tlsCredentials0.getPrivateKeyPassphrase();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      tlsCredentials_TlsCredentialsBuilder0.privateKeyPassphrase("^-2A6l(!W_job{z-");
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.equals(tlsCredentials1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      tlsCredentials_TlsCredentialsBuilder0.privateKeyPassphrase("G;F#YlJ)e");
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.equals(tlsCredentials1);
      assertFalse(tlsCredentials1.equals((Object)tlsCredentials0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      tlsCredentials_TlsCredentialsBuilder0.privateKeyPassphrase("TlsCredentials(certificate=null, privateKey=null, privateKeyPassphrase=null)");
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials1.equals(tlsCredentials0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(privateKey0).toString();
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder1 = tlsCredentials_TlsCredentialsBuilder0.privateKey(privateKey0);
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder1.build();
      boolean boolean0 = tlsCredentials1.equals(tlsCredentials0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(privateKey0).toString();
      tlsCredentials_TlsCredentialsBuilder0.privateKey(privateKey0);
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.equals(tlsCredentials1);
      assertFalse(tlsCredentials1.equals((Object)tlsCredentials0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(privateKey0).toString();
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder1 = tlsCredentials_TlsCredentialsBuilder0.privateKey(privateKey0);
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder1.build();
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder1.build();
      boolean boolean0 = tlsCredentials0.equals(tlsCredentials1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(x509Certificate0).toString();
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder1 = tlsCredentials_TlsCredentialsBuilder0.certificate(x509Certificate0);
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder1.build();
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.equals(tlsCredentials1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(x509Certificate0).toString();
      tlsCredentials_TlsCredentialsBuilder0.certificate(x509Certificate0);
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.equals(tlsCredentials1);
      assertFalse(boolean0);
      assertFalse(tlsCredentials1.equals((Object)tlsCredentials0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(x509Certificate0).toString();
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder1 = tlsCredentials_TlsCredentialsBuilder0.certificate(x509Certificate0);
      TlsCredentials tlsCredentials1 = tlsCredentials_TlsCredentialsBuilder1.build();
      boolean boolean0 = tlsCredentials1.equals(tlsCredentials0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.equals(tlsCredentials_TlsCredentialsBuilder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      boolean boolean0 = tlsCredentials0.equals(tlsCredentials0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      tlsCredentials0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(x509Certificate0).toString();
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(privateKey0).toString();
      TlsCredentials tlsCredentials0 = new TlsCredentials(x509Certificate0, privateKey0, "l$");
      tlsCredentials0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = new TlsCredentials.TlsCredentialsBuilder();
      String string0 = tlsCredentials_TlsCredentialsBuilder0.toString();
      assertEquals("TlsCredentials.TlsCredentialsBuilder(certificate=null, privateKey=null, privateKeyPassphrase=null)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TlsCredentials.TlsCredentialsBuilder tlsCredentials_TlsCredentialsBuilder0 = TlsCredentials.builder();
      TlsCredentials tlsCredentials0 = tlsCredentials_TlsCredentialsBuilder0.build();
      String string0 = tlsCredentials0.toString();
      assertEquals("TlsCredentials(certificate=null, privateKey=null, privateKeyPassphrase=null)", string0);
  }
}
