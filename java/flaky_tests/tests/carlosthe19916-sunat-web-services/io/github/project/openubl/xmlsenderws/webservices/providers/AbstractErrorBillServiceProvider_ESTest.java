/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:16:34 GMT 2022
 */

package io.github.project.openubl.xmlsenderws.webservices.providers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.github.project.openubl.xmlsenderws.webservices.providers.BillServiceCallback;
import io.github.project.openubl.xmlsenderws.webservices.providers.BillServiceModel;
import io.github.project.openubl.xmlsenderws.webservices.providers.errors.Error1033BillServiceProvider;
import io.github.project.openubl.xmlsenderws.webservices.providers.errors.Error2324BillServiceProvider;
import io.github.project.openubl.xmlsenderws.webservices.providers.errors.ErrorExcepcionBillServiceProvider;
import io.github.project.openubl.xmlsenderws.webservices.providers.errors.ErrorObservacionesBillServiceProvider;
import io.github.project.openubl.xmlsenderws.webservices.providers.errors.ErrorRechazoBillServiceProvider;
import io.github.project.openubl.xmlsenderws.webservices.wrappers.ServiceConfig;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractErrorBillServiceProvider_ESTest extends AbstractErrorBillServiceProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(7);
      ErrorExcepcionBillServiceProvider errorExcepcionBillServiceProvider0 = new ErrorExcepcionBillServiceProvider(integer0);
      byte[] byteArray0 = new byte[4];
      ServiceConfig serviceConfig0 = mock(ServiceConfig.class, new ViolatedAssumptionAnswer());
      BillServiceModel billServiceModel0 = errorExcepcionBillServiceProvider0.sendBill("ERROR_CONSULTA9", byteArray0, serviceConfig0);
      assertNull(billServiceModel0.getDescription());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      BillServiceModel billServiceModel0 = new BillServiceModel();
      Error2324BillServiceProvider error2324BillServiceProvider0 = new Error2324BillServiceProvider(integer0, billServiceModel0);
      byte[] byteArray0 = new byte[3];
      billServiceModel0.setCdr(byteArray0);
      ServiceConfig serviceConfig0 = mock(ServiceConfig.class, new ViolatedAssumptionAnswer());
      BillServiceModel billServiceModel1 = error2324BillServiceProvider0.getStatus((String) null, serviceConfig0);
      assertNotSame(billServiceModel0, billServiceModel1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ErrorRechazoBillServiceProvider errorRechazoBillServiceProvider0 = new ErrorRechazoBillServiceProvider((Integer) null);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        errorRechazoBillServiceProvider0.sendBill("", byteArray0, (ServiceConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.github.project.openubl.xmlsenderws.webservices.providers.errors.ErrorRechazoBillServiceProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-254));
      ErrorObservacionesBillServiceProvider errorObservacionesBillServiceProvider0 = new ErrorObservacionesBillServiceProvider(integer0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BillServiceModel billServiceModel0 = errorObservacionesBillServiceProvider0.sendPack("R$@8% N:h", (byte[]) null, (ServiceConfig) null, (Map<String, Object>) hashMap0, (BillServiceCallback) null, (-1L));
      assertNull(billServiceModel0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ErrorObservacionesBillServiceProvider errorObservacionesBillServiceProvider0 = new ErrorObservacionesBillServiceProvider((Integer) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BillServiceModel billServiceModel0 = errorObservacionesBillServiceProvider0.sendSummary((String) null, byteArray0, (ServiceConfig) null, (Map<String, Object>) hashMap0, (BillServiceCallback) null, 1943L);
      assertNull(billServiceModel0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Error2324BillServiceProvider error2324BillServiceProvider0 = new Error2324BillServiceProvider((Integer) null);
      byte[] byteArray0 = new byte[0];
      BillServiceModel billServiceModel0 = error2324BillServiceProvider0.sendBill("El ticket no existe", byteArray0, (ServiceConfig) null);
      assertNull(billServiceModel0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Error1033BillServiceProvider error1033BillServiceProvider0 = new Error1033BillServiceProvider((Integer) null);
      BillServiceModel billServiceModel0 = error1033BillServiceProvider0.sendSummary("", (byte[]) null, (ServiceConfig) null);
      assertNull(billServiceModel0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ErrorExcepcionBillServiceProvider errorExcepcionBillServiceProvider0 = new ErrorExcepcionBillServiceProvider((Integer) null);
      BillServiceModel billServiceModel0 = errorExcepcionBillServiceProvider0.sendPack("", byteArray0, (ServiceConfig) null);
      assertNull(billServiceModel0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ErrorExcepcionBillServiceProvider errorExcepcionBillServiceProvider0 = new ErrorExcepcionBillServiceProvider((Integer) null);
      BillServiceModel billServiceModel0 = errorExcepcionBillServiceProvider0.getStatus("O]*pi2 .*/w", (ServiceConfig) null);
      assertNull(billServiceModel0);
  }
}
