/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:05:21 GMT 2022
 */

package io.github.project.openubl.xmlsenderws.webservices.providers.errors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import io.github.project.openubl.xmlsenderws.webservices.providers.BillServiceModel;
import io.github.project.openubl.xmlsenderws.webservices.providers.errors.Error2324BillServiceProvider;
import io.github.project.openubl.xmlsenderws.webservices.wrappers.ServiceConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Error2324BillServiceProvider_ESTest extends Error2324BillServiceProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      BillServiceModel billServiceModel0 = new BillServiceModel();
      Error2324BillServiceProvider error2324BillServiceProvider0 = new Error2324BillServiceProvider(integer0, billServiceModel0);
      byte[] byteArray0 = new byte[2];
      billServiceModel0.setCdr(byteArray0);
      ServiceConfig serviceConfig0 = mock(ServiceConfig.class, new ViolatedAssumptionAnswer());
      BillServiceModel billServiceModel1 = error2324BillServiceProvider0.getStatus("", serviceConfig0);
      assertNotSame(billServiceModel1, billServiceModel0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(1936);
      Error2324BillServiceProvider error2324BillServiceProvider0 = new Error2324BillServiceProvider(integer0);
      BillServiceModel billServiceModel0 = error2324BillServiceProvider0.getStatus("Au1F", (ServiceConfig) null);
      assertNull(billServiceModel0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      BillServiceModel billServiceModel0 = new BillServiceModel();
      Error2324BillServiceProvider error2324BillServiceProvider0 = new Error2324BillServiceProvider(integer0, billServiceModel0);
      ServiceConfig serviceConfig0 = mock(ServiceConfig.class, new ViolatedAssumptionAnswer());
      BillServiceModel billServiceModel1 = error2324BillServiceProvider0.getStatus("GPn|k^=z^$yGA", serviceConfig0);
      assertNull(billServiceModel1);
  }
}
