/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:09:25 GMT 2022
 */

package io.github.project.openubl.xmlsenderws.webservices.providers.errors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.project.openubl.xmlsenderws.webservices.providers.BillServiceModel;
import io.github.project.openubl.xmlsenderws.webservices.providers.ErrorBillServiceProvider;
import io.github.project.openubl.xmlsenderws.webservices.providers.errors.Error2324BillServiceProviderFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Error2324BillServiceProviderFactory_ESTest extends Error2324BillServiceProviderFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Error2324BillServiceProviderFactory error2324BillServiceProviderFactory0 = new Error2324BillServiceProviderFactory();
      SOAPFault sOAPFault0 = mock(SOAPFault.class, new ViolatedAssumptionAnswer());
      doReturn("opw", "3638").when(sOAPFault0).getFaultCode();
      doReturn("opw").when(sOAPFault0).getFaultString();
      SOAPFaultException sOAPFaultException0 = new SOAPFaultException(sOAPFault0);
      boolean boolean0 = error2324BillServiceProviderFactory0.isSupported(sOAPFaultException0);
      assertFalse(boolean0);
      
      boolean boolean1 = error2324BillServiceProviderFactory0.isSupported(sOAPFaultException0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Error2324BillServiceProviderFactory error2324BillServiceProviderFactory0 = new Error2324BillServiceProviderFactory();
      boolean boolean0 = error2324BillServiceProviderFactory0.isSupported(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Error2324BillServiceProviderFactory error2324BillServiceProviderFactory0 = new Error2324BillServiceProviderFactory();
      // Undeclared exception!
      try { 
        error2324BillServiceProviderFactory0.isSupported((SOAPFaultException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.project.openubl.xmlsenderws.webservices.utils.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Error2324BillServiceProviderFactory error2324BillServiceProviderFactory0 = new Error2324BillServiceProviderFactory();
      boolean boolean0 = error2324BillServiceProviderFactory0.isSupported(2324);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Error2324BillServiceProviderFactory error2324BillServiceProviderFactory0 = new Error2324BillServiceProviderFactory();
      boolean boolean0 = error2324BillServiceProviderFactory0.isSupported(2449);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Error2324BillServiceProviderFactory error2324BillServiceProviderFactory0 = new Error2324BillServiceProviderFactory();
      BillServiceModel billServiceModel0 = new BillServiceModel();
      ErrorBillServiceProvider errorBillServiceProvider0 = error2324BillServiceProviderFactory0.create((Integer) null, billServiceModel0);
      assertNotNull(errorBillServiceProvider0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Error2324BillServiceProviderFactory error2324BillServiceProviderFactory0 = new Error2324BillServiceProviderFactory();
      Integer integer0 = Integer.getInteger("JjH8iF[BN", 0);
      ErrorBillServiceProvider errorBillServiceProvider0 = error2324BillServiceProviderFactory0.create(integer0);
      assertNotNull(errorBillServiceProvider0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Error2324BillServiceProviderFactory error2324BillServiceProviderFactory0 = new Error2324BillServiceProviderFactory();
      int int0 = error2324BillServiceProviderFactory0.getPriority();
      assertEquals(1, int0);
  }
}
