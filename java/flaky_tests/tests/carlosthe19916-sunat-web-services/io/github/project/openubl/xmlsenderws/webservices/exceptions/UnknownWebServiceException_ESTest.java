/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:21:14 GMT 2022
 */

package io.github.project.openubl.xmlsenderws.webservices.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import io.github.project.openubl.xmlsenderws.webservices.exceptions.UnknownWebServiceException;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnknownWebServiceException_ESTest extends UnknownWebServiceException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SOAPFault sOAPFault0 = mock(SOAPFault.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(sOAPFault0).getFaultString();
      SOAPFaultException sOAPFaultException0 = mock(SOAPFaultException.class, new ViolatedAssumptionAnswer());
      doReturn(sOAPFault0).when(sOAPFaultException0).getFault();
      UnknownWebServiceException unknownWebServiceException0 = new UnknownWebServiceException(sOAPFaultException0);
      assertNull(unknownWebServiceException0.getMessage());
  }
}
