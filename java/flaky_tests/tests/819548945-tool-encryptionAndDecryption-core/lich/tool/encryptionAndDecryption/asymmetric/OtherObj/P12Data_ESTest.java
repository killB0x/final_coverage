/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 24 18:00:23 GMT 2022
 */

package lich.tool.encryptionAndDecryption.asymmetric.OtherObj;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class P12Data_ESTest extends P12Data_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      Certificate[] certificateArray0 = new Certificate[4];
      P12Data p12Data0 = new P12Data(certificate0, privateKey0, certificateArray0);
      p12Data0.setPrivateKey((PrivateKey) null);
      PrivateKey privateKey1 = p12Data0.getPrivateKey();
      assertNull(privateKey1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      Certificate[] certificateArray0 = new Certificate[4];
      P12Data p12Data0 = new P12Data(certificate0, privateKey0, certificateArray0);
      Certificate[] certificateArray1 = p12Data0.getCertificateChain();
      assertSame(certificateArray1, certificateArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      Certificate[] certificateArray0 = new Certificate[0];
      P12Data p12Data0 = new P12Data(certificate0, privateKey0, certificateArray0);
      Certificate[] certificateArray1 = p12Data0.getCertificateChain();
      assertSame(certificateArray0, certificateArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      Certificate[] certificateArray0 = new Certificate[5];
      P12Data p12Data0 = new P12Data((Certificate) null, privateKey0, certificateArray0);
      Certificate certificate0 = p12Data0.getCert();
      assertNull(certificate0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      P12Data p12Data0 = new P12Data(certificate0, privateKey0, (Certificate[]) null);
      Certificate certificate1 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      p12Data0.setCert(certificate1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(certificate0).toString();
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      P12Data p12Data0 = new P12Data(certificate0, privateKey0, (Certificate[]) null);
      Certificate certificate1 = p12Data0.getCert();
      assertSame(certificate1, certificate0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      P12Data p12Data0 = new P12Data(certificate0, privateKey0, (Certificate[]) null);
      p12Data0.setCertificateChain((Certificate[]) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      P12Data p12Data0 = new P12Data(certificate0, privateKey0, (Certificate[]) null);
      Certificate[] certificateArray0 = p12Data0.getCertificateChain();
      assertNull(certificateArray0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(privateKey0).toString();
      Certificate[] certificateArray0 = new Certificate[4];
      P12Data p12Data0 = new P12Data(certificate0, privateKey0, certificateArray0);
      PrivateKey privateKey1 = p12Data0.getPrivateKey();
      assertNull(privateKey1.getFormat());
  }
}
