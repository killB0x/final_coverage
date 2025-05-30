/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 06 18:19:16 GMT 2022
 */

package service.sunat.gob.pe.billconsultservice;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import service.sunat.gob.pe.billconsultservice.GetStatusCdr;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GetStatusCdr_ESTest extends GetStatusCdr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      getStatusCdr0.setTipoComprobante("GOfE|lWw]Xn!;}%.");
      String string0 = getStatusCdr0.getTipoComprobante();
      assertEquals("GOfE|lWw]Xn!;}%.", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      getStatusCdr0.setSerieComprobante("<");
      String string0 = getStatusCdr0.getSerieComprobante();
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      getStatusCdr0.setSerieComprobante("");
      String string0 = getStatusCdr0.getSerieComprobante();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      getStatusCdr0.rucComprobante = "vwu~SaX9&^<Iym)e";
      String string0 = getStatusCdr0.getRucComprobante();
      assertEquals("vwu~SaX9&^<Iym)e", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      Integer integer0 = Integer.getInteger("", 0);
      getStatusCdr0.setNumeroComprobante(integer0);
      Integer integer1 = getStatusCdr0.getNumeroComprobante();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      Integer integer0 = Integer.valueOf(1);
      getStatusCdr0.numeroComprobante = integer0;
      Integer integer1 = getStatusCdr0.getNumeroComprobante();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      Integer integer0 = Integer.valueOf((-1728));
      getStatusCdr0.setNumeroComprobante(integer0);
      Integer integer1 = getStatusCdr0.getNumeroComprobante();
      assertEquals((-1728), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      Integer integer0 = getStatusCdr0.getNumeroComprobante();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      String string0 = getStatusCdr0.getRucComprobante();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      getStatusCdr0.setTipoComprobante("");
      String string0 = getStatusCdr0.getTipoComprobante();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      getStatusCdr0.setRucComprobante("");
      String string0 = getStatusCdr0.getRucComprobante();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      String string0 = getStatusCdr0.getTipoComprobante();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GetStatusCdr getStatusCdr0 = new GetStatusCdr();
      String string0 = getStatusCdr0.getSerieComprobante();
      assertNull(string0);
  }
}
