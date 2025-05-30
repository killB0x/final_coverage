/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:27:15 GMT 2022
 */

package service.sunat.gob.pe.billvalidservice;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.bind.JAXBElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import service.sunat.gob.pe.billvalidservice.ObjectFactory;
import service.sunat.gob.pe.billvalidservice.StatusResponse;
import service.sunat.gob.pe.billvalidservice.ValidaCDPcriterios;
import service.sunat.gob.pe.billvalidservice.ValidaCDPcriteriosResponse;
import service.sunat.gob.pe.billvalidservice.VerificaCPEarchivo;
import service.sunat.gob.pe.billvalidservice.VerificaCPEarchivoResponse;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ObjectFactory_ESTest extends ObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ValidaCDPcriterios validaCDPcriterios0 = new ValidaCDPcriterios();
      JAXBElement<ValidaCDPcriterios> jAXBElement0 = objectFactory0.createValidaCDPcriterios(validaCDPcriterios0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      StatusResponse statusResponse0 = objectFactory0.createStatusResponse();
      assertNull(statusResponse0.getStatusMessage());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ValidaCDPcriteriosResponse validaCDPcriteriosResponse0 = objectFactory0.createValidaCDPcriteriosResponse();
      assertNotNull(validaCDPcriteriosResponse0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      VerificaCPEarchivoResponse verificaCPEarchivoResponse0 = new VerificaCPEarchivoResponse();
      JAXBElement<VerificaCPEarchivoResponse> jAXBElement0 = objectFactory0.createVerificaCPEarchivoResponse(verificaCPEarchivoResponse0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      VerificaCPEarchivoResponse verificaCPEarchivoResponse0 = objectFactory0.createVerificaCPEarchivoResponse();
      assertNotNull(verificaCPEarchivoResponse0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      VerificaCPEarchivo verificaCPEarchivo0 = objectFactory0.createVerificaCPEarchivo();
      JAXBElement<VerificaCPEarchivo> jAXBElement0 = objectFactory0.createVerificaCPEarchivo(verificaCPEarchivo0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ValidaCDPcriteriosResponse validaCDPcriteriosResponse0 = new ValidaCDPcriteriosResponse();
      JAXBElement<ValidaCDPcriteriosResponse> jAXBElement0 = objectFactory0.createValidaCDPcriteriosResponse(validaCDPcriteriosResponse0);
      assertNotNull(jAXBElement0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectFactory objectFactory0 = new ObjectFactory();
      ValidaCDPcriterios validaCDPcriterios0 = objectFactory0.createValidaCDPcriterios();
      assertNull(validaCDPcriterios0.getImporteTotal());
  }
}
